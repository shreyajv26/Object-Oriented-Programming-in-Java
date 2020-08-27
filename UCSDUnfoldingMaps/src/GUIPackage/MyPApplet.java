package GUIPackage;

//https://www.processing.org/reference/
//unfoldingmaps.org/javadoc
//http://docs.oracle.com/javase/8/docs/api

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
	PImage img;
	
	public void setup() {
		size(400,400);
		background(255);	//color of backround
		stroke(0);			//color of stroke
		img = loadImage("");
		img.resize(0, height);
		image(img,0,0);
	}
	
	public void draw() {
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/5, height/5);
	}
	
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		float difffrom30 = Math.abs(30-seconds);
		float ratio = difffrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;			//blue is 0 for yellor color
		return rgb;
	}
	
	public static void main(String[] args) {
		
	}
}
