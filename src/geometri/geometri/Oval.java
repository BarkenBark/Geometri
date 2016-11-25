package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends GeoForm {

	/**
	 * {@inheritDoc}
	 * The area is calculated by taking pi*width*height
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
	 * The perimeter is calculated by taking the approximation
	 * 2*pi*sqrt((width^2+height^2)/2)
	 */
	public int getPerimeter() {
		return 0;
		
	}
	
	/**
	 * Checks if the oval is a circle
	 * @return true if the oval is a cricle, false otherwise
	 */
	private boolean isCircle() {
		return true;
	}
	

	
	/**
	 * Constructor. 
	 * Places an oval at (x,y)-coordinates.
	 * @param x x-position of the Oval	
	 * @param y y-position of the Oval
	 * @param width	Width of the encapsulating rectangle of the oval
	 * @param height Height of the encapsulating rectangle of the oval
	 * @param c Color of the oval
	 * @throws IllegalPositionException
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {
		super(x,y,width,height,c);
	}
	
	/**
	 * Constructor. Places an oval at coordinates of a Geometrical Form.
	 * @param f Geometrical Form at which the oval is placed.
	 * @param width	Width of the encapsulating rectangle of the oval
	 * @param height Height of the encapsulating rectangle of the oval
	 * @param c Color of the oval
	 */
	public Oval(GeometricalForm f, int width, int height, Color c) {
		super(f,width,height,c);
	}

}
