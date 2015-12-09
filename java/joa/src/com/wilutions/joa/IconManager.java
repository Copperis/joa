package com.wilutions.joa;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.JoaDll;
import com.wilutions.mslib.office.IRibbonControl;

/**
 * Loads icons from the JAR and creates IPictureDisp objects.
 *
 */
public class IconManager {

	private final Map<String, Dispatch> map = new HashMap<String, Dispatch>();
	private final Class<?> forClass;

	/**
	 * Constructor.
	 * 
	 * @param forClass
	 *            This class defines the JAR and the package from where the
	 *            icons are loaded.
	 */
	public IconManager(Class<?> forClass) {
		assert forClass != null;
		this.forClass = forClass;
	}

	/**
	 * Constructor.
	 * 
	 * @param obj
	 *            The object's class defines the JAR and the package from where
	 *            the icons are loaded.
	 */
	public IconManager(Object obj) {
		assert obj != null;
		this.forClass = obj.getClass();
	}

	/**
	 * Returns an IPictureDisp object for the given icon file name.
	 * 
	 * @param forClass
	 *            This class defines the JAR and the package from where the
	 *            icons are loaded.
	 * @param fileName
	 *            Icon file name
	 * @return IPictureDisp object.
	 */
	public static Dispatch get(Class<?> forClass, String fileName) {
		assert forClass != null;
		assert fileName != null && fileName.length() != 0;
		Dispatch pic = null;
		try {
			byte[] image = OfficeAddinUtil.getResourceAsBytes(forClass, fileName);
			String contentType = fileName;
			int p = contentType.lastIndexOf('.');
			if (p >= 0) {
				contentType = contentType.substring(p);
			}
			pic = createIPictureDisp(image, contentType);
		}
		catch (IOException e) {
			throw new NullPointerException(e.toString());
		}
		return pic;
	}

	/**
	 * Returns an IPictureDisp object for the given icon file name.
	 * 
	 * @param fileName
	 *            Icon file name
	 * @return IPictureDisp object.
	 */
	public synchronized Dispatch get(String fileName) {
		assert fileName != null && fileName.length() != 0;

		Dispatch pic = null;
		String key = (forClass.getName() + "/" + fileName);
		pic = map.get(key);
		if (pic == null) {
			if (fileName.startsWith(".")) {
				pic = getFileTypeIcon(fileName);
			}
			else {
				pic = get(forClass, fileName);
			}
			map.put(key, pic);
		}
		return pic;
	}

	/**
	 * Returns an IPictureDisp object for the ribbon control. The icon file name
	 * is found in the "tag" element of the control.
	 * 
	 * @param ribbonControl
	 *            Ribbon control
	 * @return IPictureDisp object.
	 */
	public Dispatch getIconByTag(IRibbonControl ribbonControl) {
		String fileName = ribbonControl.getTag();
		return get(fileName);
	}

	/**
	 * Create an IPictureDisp object.
	 * 
	 * @param image
	 *            Image bytes
	 * @param contentType
	 *            Optional: content type or file extension (starting with dot).
	 * @return IPictureDisp object.
	 * @throws ComException
	 */
	public static Dispatch createIPictureDisp(byte[] image, String contentType) throws ComException {
		assert image != null && image.length != 0;
		return (Dispatch) JoaDll.nativeCreateIPictureDisp(image);
	}

	/**
	 * Get small icon for given file extension.
	 * 
	 * @param ext
	 *            file extension (with or without leading dot).
	 * @return IPictureDisp for file icon.
	 */
	public synchronized Dispatch getFileTypeIcon(String ext) {
		Dispatch disp = null;

		ext = getFileExt(ext);
		File file = null;

		try {
			file = File.createTempFile("joa", ext);
			FileSystemView view = FileSystemView.getFileSystemView();
			javax.swing.Icon jswingIcon = view.getSystemIcon(file);

			BufferedImage bufferedImage = new BufferedImage(jswingIcon.getIconWidth(), jswingIcon.getIconHeight(),
					BufferedImage.TYPE_INT_ARGB);
			jswingIcon.paintIcon(null, bufferedImage.getGraphics(), 0, 0);

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(bufferedImage, "png", baos);
			baos.flush();

			byte[] bytes = baos.toByteArray();
			disp = createIPictureDisp(bytes, "");

			baos.close();
		}
		catch (Exception e) {
		}
		finally {
			if (file != null) {
				file.delete();
			}
		}
		return disp;
	}

	private static String getFileExt(String fname) {
		String ext = ".";
		int p = fname.lastIndexOf('.');
		if (p >= 0) {
			ext = fname.substring(p);
		}
		else {
			ext = "." + fname;
		}
		return ext.toLowerCase();
	}

}
