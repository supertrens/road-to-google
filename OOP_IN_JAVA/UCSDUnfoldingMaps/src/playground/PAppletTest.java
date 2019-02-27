package playground;

import processing.core.*;

public class PAppletTest extends PApplet {

  // PApplet needs the module name as argument
  static public void main(String args[]) {
    PApplet.main(new String[]{"playground.PAppletTest"});
  }

  PImage webImage;

  final int SCREEN_WIDTH = 600;
  final int SCREEN_HEIGHT = 600;

  public void setup() {
    String imageUrl = "https://images.unsplash.com/photo-1488590528505-98d2b5aba04b";
    webImage = loadImage(imageUrl, "jpeg");
    webImage.resize(0 , SCREEN_HEIGHT);

    size(SCREEN_WIDTH, SCREEN_HEIGHT);

  }

  public void draw() {
    System.out.println("running");

    background(0);

    // 0,0 means I need to have the top left corner of the image at x=0 , y=0
    image(webImage , 0, 0);

    fill(255,209,0);
    // width and height are dynamic value about the canvas size
    ellipse(width/4, height/5, width/4 , height/4);
  }
}
