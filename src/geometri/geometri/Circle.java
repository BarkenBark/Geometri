package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GeoForm {
	private int diameter;
	
	/**
	 * Constructor
	 *
	 */
	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {
		this.diameter = diameter;
		place(x,y);	
	}

	public Circle(GeometricalForm f, int diameter, Color c){
		this.diameter = diameter;
		try{
			place(f.getX(),f.getY());
		}catch (IllegalPositionException e){
			System.out.println("Error constructing circle");
		}
		
	}
	
	public int getArea() {
		return (int) Math.round(Math.pow(diameter/2, 2)*Math.PI);
	}

	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public int getWidth() {
		return diameter;
	}

	public int getHeight() {
		return diameter;
	}

	public int getPerimeter() {
		return (int) Math.round(diameter*Math.PI);
	}
	
	
}