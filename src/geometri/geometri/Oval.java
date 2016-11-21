package geometri;
import java.awt.Color;
import java.awt.Graphics;

public class Oval extends GeoForm {
	private int width;
	private int height;


	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		this.width = width;
		this.height = height;
	}
	
	public Oval(GeometricalForm f, int width, int height, Color c){
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return (int) Math.round(Math.PI*width*height);
	}

	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getPerimeter() {
		return (int) Math.round(Math.PI*3*(width+height)-Math.sqrt((3*width+height)*(width*3*height)));
		// Approximation of perimeter
	}
}
