/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ShapeRange.
 * 
 */
@CoInterface(guid="{000C031D-0000-0000-C000-000000000046}")
public interface ShapeRange extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(1)  public IDispatch getParent() throws ComException;
  @DeclDISPID(2)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public Shape Item(final Object Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(10)  public void Align(final MsoAlignCmd AlignCmd, final MsoTriState RelativeTo) throws ComException;
  @DeclDISPID(11)  public void Apply() throws ComException;
  @DeclDISPID(12)  public void Delete() throws ComException;
  @DeclDISPID(13)  public void Distribute(final MsoDistributeCmd DistributeCmd, final MsoTriState RelativeTo) throws ComException;
  @DeclDISPID(14)  public ShapeRange Duplicate() throws ComException;
  @DeclDISPID(15)  public void Flip(final MsoFlipCmd FlipCmd) throws ComException;
  @DeclDISPID(16)  public void IncrementLeft(final Float Increment) throws ComException;
  @DeclDISPID(17)  public void IncrementRotation(final Float Increment) throws ComException;
  @DeclDISPID(18)  public void IncrementTop(final Float Increment) throws ComException;
  @DeclDISPID(19)  public Shape Group() throws ComException;
  @DeclDISPID(20)  public void PickUp() throws ComException;
  @DeclDISPID(21)  public Shape Regroup() throws ComException;
  @DeclDISPID(22)  public void RerouteConnections() throws ComException;
  @DeclDISPID(23)  public void ScaleHeight(final Float Factor, final MsoTriState RelativeToOriginalSize, final MsoScaleFrom fScale) throws ComException;
  @DeclDISPID(24)  public void ScaleWidth(final Float Factor, final MsoTriState RelativeToOriginalSize, final MsoScaleFrom fScale) throws ComException;
  @DeclDISPID(25)  public void Select(final Object Replace) throws ComException;
  @DeclDISPID(26)  public void SetShapesDefaultProperties() throws ComException;
  @DeclDISPID(27)  public ShapeRange Ungroup() throws ComException;
  @DeclDISPID(28)  public void ZOrder(final MsoZOrderCmd ZOrderCmd) throws ComException;
  @DeclDISPID(100)  public Adjustments getAdjustments() throws ComException;
  @DeclDISPID(101)  public MsoAutoShapeType getAutoShapeType() throws ComException;
  @DeclDISPID(101)  public void setAutoShapeType(final MsoAutoShapeType value) throws ComException;
  @DeclDISPID(102)  public MsoBlackWhiteMode getBlackWhiteMode() throws ComException;
  @DeclDISPID(102)  public void setBlackWhiteMode(final MsoBlackWhiteMode value) throws ComException;
  @DeclDISPID(103)  public CalloutFormat getCallout() throws ComException;
  @DeclDISPID(104)  public Integer getConnectionSiteCount() throws ComException;
  @DeclDISPID(105)  public MsoTriState getConnector() throws ComException;
  @DeclDISPID(106)  public ConnectorFormat getConnectorFormat() throws ComException;
  @DeclDISPID(107)  public FillFormat getFill() throws ComException;
  @DeclDISPID(108)  public GroupShapes getGroupItems() throws ComException;
  @DeclDISPID(109)  public Float getHeight() throws ComException;
  @DeclDISPID(109)  public void setHeight(final Float value) throws ComException;
  @DeclDISPID(110)  public MsoTriState getHorizontalFlip() throws ComException;
  @DeclDISPID(111)  public Float getLeft() throws ComException;
  @DeclDISPID(111)  public void setLeft(final Float value) throws ComException;
  @DeclDISPID(112)  public LineFormat getLine() throws ComException;
  @DeclDISPID(113)  public MsoTriState getLockAspectRatio() throws ComException;
  @DeclDISPID(113)  public void setLockAspectRatio(final MsoTriState value) throws ComException;
  @DeclDISPID(115)  public String getName() throws ComException;
  @DeclDISPID(115)  public void setName(final String value) throws ComException;
  @DeclDISPID(116)  public ShapeNodes getNodes() throws ComException;
  @DeclDISPID(117)  public Float getRotation() throws ComException;
  @DeclDISPID(117)  public void setRotation(final Float value) throws ComException;
  @DeclDISPID(118)  public PictureFormat getPictureFormat() throws ComException;
  @DeclDISPID(119)  public ShadowFormat getShadow() throws ComException;
  @DeclDISPID(120)  public TextEffectFormat getTextEffect() throws ComException;
  @DeclDISPID(121)  public TextFrame getTextFrame() throws ComException;
  @DeclDISPID(122)  public ThreeDFormat getThreeD() throws ComException;
  @DeclDISPID(123)  public Float getTop() throws ComException;
  @DeclDISPID(123)  public void setTop(final Float value) throws ComException;
  @DeclDISPID(124)  public MsoShapeType getType() throws ComException;
  @DeclDISPID(125)  public MsoTriState getVerticalFlip() throws ComException;
  @DeclDISPID(126)  public Object getVertices() throws ComException;
  @DeclDISPID(127)  public MsoTriState getVisible() throws ComException;
  @DeclDISPID(127)  public void setVisible(final MsoTriState value) throws ComException;
  @DeclDISPID(128)  public Float getWidth() throws ComException;
  @DeclDISPID(128)  public void setWidth(final Float value) throws ComException;
  @DeclDISPID(129)  public Integer getZOrderPosition() throws ComException;
  @DeclDISPID(130)  public Script getScript() throws ComException;
  @DeclDISPID(131)  public String getAlternativeText() throws ComException;
  @DeclDISPID(131)  public void setAlternativeText(final String value) throws ComException;
  @DeclDISPID(136)  public MsoTriState getChild() throws ComException;
  @DeclDISPID(137)  public Shape getParentGroup() throws ComException;
  @DeclDISPID(139)  public Integer getId() throws ComException;
  @DeclDISPID(145)  public TextFrame2 getTextFrame2() throws ComException;
  @DeclDISPID(146)  public void Cut() throws ComException;
  @DeclDISPID(147)  public void Copy() throws ComException;
  @DeclDISPID(148)  public MsoTriState getHasChart() throws ComException;
  @DeclDISPID(149)  public IMsoChart getChart() throws ComException;
  @DeclDISPID(150)  public MsoShapeStyleIndex getShapeStyle() throws ComException;
  @DeclDISPID(150)  public void setShapeStyle(final MsoShapeStyleIndex value) throws ComException;
  @DeclDISPID(151)  public MsoBackgroundStyleIndex getBackgroundStyle() throws ComException;
  @DeclDISPID(151)  public void setBackgroundStyle(final MsoBackgroundStyleIndex value) throws ComException;
  @DeclDISPID(152)  public SoftEdgeFormat getSoftEdge() throws ComException;
  @DeclDISPID(153)  public GlowFormat getGlow() throws ComException;
  @DeclDISPID(154)  public ReflectionFormat getReflection() throws ComException;
  @DeclDISPID(155)  public String getTitle() throws ComException;
  @DeclDISPID(155)  public void setTitle(final String value) throws ComException;
  @DeclDISPID(156)  public void MergeShapes(final MsoMergeCmd MergeCmd, final Shape PrimaryShape) throws ComException;
}
