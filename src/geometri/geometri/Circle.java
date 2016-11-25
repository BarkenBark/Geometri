package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GeoForm {
	
	/**
	 * {@inheritDoc}
	 * The area of a circle is calculated by pi*(diameter/2)^2
	 */
	public int getArea() {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	public void fill(Graphics g) {
		
	}

	/**
	 * {@inheritDoc}
	 * The perimeter is calculated by taking pi*diameter
	 */
	public int getPerimeter() {
		return 0;
	}
	
	
	
	/**
	 * Constructor. Places a circle at (x,y)-coordinates.
	 * @param x The x-position of the circle.
	 * @param y The y-position of the circle.
	 * @param diameter The Diameter of the circle.
	 * @param c	The color of the circle.
	 */
	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {
		super(x,y,diameter,diameter,c);
	}
	
	/**
	 * Constructor. Places a circle at the coordinates of the form.
	 * @param f Geometrical Form at which the circle is placed.
	 * @param diameter The diameter of the circle.
	 * @param c The color of the circle.
	 */
	public Circle(GeometricalForm f, int diameter, Color c) {
		super(f,diameter,diameter,c);
	}
	
}