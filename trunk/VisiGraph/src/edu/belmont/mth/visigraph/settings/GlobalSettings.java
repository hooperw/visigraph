/**
 * GlobalSettings.java
 */
package edu.belmont.mth.visigraph.settings;

import java.awt.*;
import edu.belmont.mth.visigraph.models.functions.*;
import edu.belmont.mth.visigraph.models.generators.*;

/**
 * @author Cameron Behar
 * 
 */
public class GlobalSettings
{
	public static final String					 applicationName							= "VisiGraph";
	
	public static final String					 defaultGraphName							= "Untitled";
	
	public static final Color					 defaultGraphBackgroundFill					= new Color(250, 250, 250);
	public static final Color					 defaultSelectionBoxFill					= new Color(150, 150, 255, 100);
	public static final Color					 defaultSelectionBoxLine					= new Color(150, 150, 255, 200);
	
	public static final Color					 defaultVertexLine							= Color.black;
	
	public static final Color					 defaultDraggingEdgeLine					= Color.lightGray;
	public static final Color					 defaultEdgeHandleFill						= Color.lightGray;
	
	public static final Color					 defaultSelectedVertexFill					= new Color(0, 0, 255, 75);
	public static final Color					 defaultSelectedVertexLine					= Color.blue;
	
	public static final Color					 defaultSelectedEdgeLine					= Color.blue;
	public static final Color					 defaultSelectedEdgeHandleFill				= Color.blue;
	
	public static final double					 defaultDirectedEdgeArrowRatio				= 4.0;
	
	public static final Color					 defaultCaptionTextDisplayColor				= Color.black;
	public static final Color					 defaultSelectedCaptionTextDisplayColor		= Color.blue;
	
	// Initialized with black, gray, and 6 colors--past 6 hues with no saturation or brightness difference, some of the colors become difficult to distinguish.
	public static final Color[]					 defaultElementColors						= new Color[] { Color.black, new Color(185, 122, 27), Color.getHSBColor(0, .95f, .95f), Color.getHSBColor(1/6f, .95f, .95f), Color.getHSBColor(2/6f, .95f, .95f), Color.getHSBColor(3/6f, .95f, .95f), Color.getHSBColor(4/6f, .95f, .95f), Color.getHSBColor(5/6f, .95f, .95f) };
	public static final Color					 defaultUncoloredElementFill				= new Color(193, 193, 193);
	
	public static final boolean					 defaultShowEdgeHandles						= true;
	public static final boolean					 defaultShowEdgeWeights						= false;
	public static final boolean					 defaultShowEdgeLabels						= false;
	public static final boolean					 defaultShowVertexWeights					= false;
	public static final boolean					 defaultShowVertexLabels					= true;
	public static final boolean					 defaultShowCaptions						= true;
	public static final boolean					 defaultShowCaptionHandles					= true;
	public static final boolean					 defaultShowCaptionEditors					= true;
	
	public static final boolean					 defaultUseAntiAliasing						= true;
	public static final boolean					 defaultUsePureStroke						= true;
	public static final boolean					 drawBicubicInterpolation					= true;
	
	public static final double					 defaultEdgeWeight							= 1.0;
	public static final int						 defaultEdgeColor							= -1;
	public static final String					 defaultEdgePrefix							= "e";
	public static final boolean					 defaultEdgeIsSelected						= false;
	public static final double					 defaultEdgeThickness						= 1.0;
	public static final double					 defaultEdgeHandleRadiusRatio				= 1.5;
	public static final double					 defaultEdgeHandleClickMargin				= 2.5;
	
	public static final double					 defaultVertexWeight						= 1.0;
	public static final int						 defaultVertexColor							= -1;
	public static final String					 defaultVertexPrefix						= "v";
	public static final boolean					 defaultVertexIsSelected					= false;
	public static final double					 defaultVertexRadius						= 5.0;
	public static final double					 defaultVertexClickMargin					= 2.5;
	
	public static final String					 defaultCaptionText							= "";
	public static final Integer					 defaultCaptionFontSize						= 11;
	public static final boolean					 defaultCaptionIsSelected					= false;
	public static final double					 defaultCaptionHandleClickMargin			= 2.5;
	public static final double					 defaultCaptionEditorClickMargin			= 2.5;
	
	public static final double					 defaultEdgeSnapMarginRatio					= 0.05;
	public static final double					 defaultAreCloseDistance					= 0.01;
	
	public static final double					 defaultArrangeCircleRadiusMultiplier		= 10.0;
	public static final double					 defaultArrangeGridSpacing					= 100.0;
	
	public static final double					 defaultAutoArrangeAttractiveForce			= 0.0000001;
	public static final double					 defaultAutoArrangeRepulsiveForce			= -80.0;
	public static final double					 defaultAutoArrangeDecelerationFactor		= 1.1;
	
	public static final double					 defaultZoomInFactor						= 1.2;
	public static final double					 defaultZoomOutFactor						= 0.8;
	public static final double					 defaultMaximumZoomFactor					= 2.0;
	
	public static final double					 defaultZoomGraphPadding					= 20.0;
	
	public static final double					 defaultArrowKeyIncrement					= 50.0;
	public static final double					 defaultScrollIncrementZoom					= 0.1;
	
	public static final int						 defaultMainWindowWidth						= 1000;
	public static final int						 defaultMainWindowHeight					= 700;
	public static final int						 defaultGraphWindowWidth					= 640;
	public static final int						 defaultGraphWindowHeight					= 480;
	
	public static final int						 defaultCascadeWindowOffset					= 15;
	
	public static final double					 defaultLoopDiameter						= 50.0;
	
	public static final int						 defaultPaintToolMenuDelay					= 750;

	public static final double					 defaultPanDecelerationFactor				= -5.0;
	
	public static final GraphGeneratorBase[] 	 allGraphGenerators							= new GraphGeneratorBase[] { new EmptyGraphGenerator(), new CycleGraphGenerator(), new CompleteGraphGenerator(), new CompleteBipartiteGraphGenerator(), new SymmetricTreeGraphGenerator(), new CartesianProductOfCompleteBipartiteGraphAndCycleGeneratorScott(), new CartesianProductOfCompleteBipartiteGraphAndCycleGeneratorBehar() };
	public static final FunctionBase[]		 	 allFunctions								= new FunctionBase[] { new CountEdgesFunction(), new CountVertexesFunction(), new CountCrossingsFunction(), new IsEulerianFunction(), new IsConnectedFunction() };
}
