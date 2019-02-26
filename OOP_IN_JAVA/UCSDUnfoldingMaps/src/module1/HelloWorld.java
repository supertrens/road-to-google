package module1;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;


/** HelloWorld
  * An application with two maps side-by-side zoomed in on different locations.
  * Author: UC San Diego Coursera Intermediate Programming team
  * @author Your name here
  * Date: July 17, 2015
  * */
public class HelloWorld extends PApplet
{

	/** This is where to find the local tiles, for working without an Internet connection */
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	// IF YOU ARE WORKING OFFLINE: Change the value of this variable to true
	private static final boolean offline = false;
	
	/** The map we use to display our home town: La Jolla, CA */
	UnfoldingMap map1;
	
	/** The map you will use to display your home town */ 
	UnfoldingMap map2;

	static public void main(String args[]) {
		PApplet.main(new String[]{"module1.HelloWorld"});
	}

	public void setup() {
		size(800, 600, P2D);  // Set up the Applet window to be 800x600
		                      // The OPENGL argument indicates to use the 
		                      // Processing library's 2D drawing
		                      // You'll learn more about processing in Module 3

		// This sets the background color for the Applet.  
		this.background(86, 98, 112);
		
		// Select a map provider
		AbstractMapProvider provider = new Microsoft.AerialProvider();

		// Set a zoom level
		int zoomLevel = 7;
		
		if (offline) {
			provider = new MBTilesMapProvider(mbTilesString);
			// 3 is the maximum zoom level for working offline
			zoomLevel = 3;
		}
		

		map1 = new UnfoldingMap(this, 50, 50, 350, 500, provider);
		map2 = new UnfoldingMap(this, 400, 50, 350, 500, provider);


		// 32.9 (latitude) and -117.2 (longitude)
		map1.zoomAndPanTo(zoomLevel, new Location(32.9f, -117.2f));
		map2.zoomAndPanTo(zoomLevel, new Location(24.7f, 120.9f));


		// This line makes the maps interactive
		MapUtils.createDefaultEventDispatcher(this, map1);
		MapUtils.createDefaultEventDispatcher(this, map2);

	}

	/** Draw the Applet window.  */
	public void draw() {
		map1.draw();
		map2.draw();
	}

	
}
