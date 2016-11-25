package geometri;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GeoForm implements GeometricalForm {
	private final Color c;
	private final int width;
	private final int height;
	private int x;
	private int y;

	/**
	 * {@inheritDoc}
	 */
	public int compareTo(GeometricalForm f) {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	public Color getColor() {
		return c;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * {@inheritDoc}
	 */
	public void move(int dx, int dy) throws IllegalPositionException {
		//this.x = this.x + dx;
		//this.y = this.y + dy;
		//kolla exception

	}

	/**
	 * {@inheritDoc}
	 */
	public void place(int x, int y) throws IllegalPositionException {
		this.x = x;
		this.y = y;

	}
	
	
	
	/**
	 * Constructor
	 * Place a geometrical form at (x,y)-coordinates
	 * @param x The x-coordinate of the shape
	 * @param y The y-coordinate of the shape
	 * @param width The width of the shape
	 * @param height The height of the shape
	 * @param c	The color of the shape
	 */
	public GeoForm(int x, int y, int width, int height, Color c) throws IllegalPositionException {
		this.width=width;
		this.height=height;
		this.c=c;
		place(x,y);
		/*try {place(x,y);
		}catch(IllegalPositionException e){
			System.out.println("Out of bounds");
		}*/ //Do we catch it here?
	}

	/**
	 * Constructor.
	 * Place a geometrical form at coordinates of another geometrical form
	 * @param f The geometrical form with the position at which the form will be placed
	 * @param width The width of the form
	 * @param height The height of the form
	 * @param c The color of the form
	 */
	public GeoForm(GeometricalForm f, int width, int height, Color c) {
		this.width=width;
		this.height=height;
		this.c=c;
		try{place(f.getX(),f.getY());
		}catch(IllegalPositionException e){
			System.out.println("Whaddup");
		}
	}
	
	
	

	/**
	 * Indicates whether an Object is identical to this one with respect to 
	 * area, perimeter and color as well as type.
	 * Some geometrical forms of different classes can equate 
	 * if certain properties are equal.
	 * @param obj the reference object with which to compare.
	 * @return true if the objects are identical, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		return true;
	}

	/**
	 * Returns a hash code value for the Geometrical Form.
	 * @return a hash code value
	 */
	@Override
	public int hashCode() {
		return 0;
	}

}
