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
    background(255);

    webImage = loadImage(imageUrl, "jpeg");
    webImage.resize(0 , SCREEN_HEIGHT);

    // 0,0 means I need to have the top left corner of the image at x=0 , y=0
    image(webImage , 0, 0); // display image

    size(SCREEN_WIDTH, SCREEN_HEIGHT);

  }

  public void draw() {
    int [] color = sunColorSec(second()); //calculate color code

    fill(color[0], color[1], color[2]);

    // width and height are dynamic value about the canvas size
    ellipse(width/4, height/5, width/4 , height/4);
  }

  public int[] sunColorSec(float seconds)
  {
    int[] rgb = new int[3];

    // scale the brigthness of the yellow based on the current seconds. 30 sec is black.
    // 0 sec is bright yellow.
    float diffFrom30 = Math.abs(30-seconds);


    float ratio = diffFrom30 / 30;
    rgb[0] = (int) (255 * ratio);
    rgb[1] = (int) (255 * ratio);
    rgb[2] = 0;

    return rgb;


  }
}
