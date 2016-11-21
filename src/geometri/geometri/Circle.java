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
}
