package playground;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.utils.MapUtils;
import de.fhpotsdam.unfolding.providers.*;

public class LifeExpectation extends PApplet{
  UnfoldingMap map;

  static public void main(String args[]) {
    PApplet.main(new String[]{"playground.LifeExpectation"});
  }

  public void setup() {
    size(800, 600, OPENGL);

    map = new UnfoldingMap(this, 50, 50, 700,500, new OpenStreetMap.OpenStreetMapProvider());

    MapUtils.createDefaultEventDispatcher(this, map);
  }

  public void draw(){
    map.draw();
  }

}
