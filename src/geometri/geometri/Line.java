package geometri;

import java.awt.Graphics;

public class Line extends GeoForm {

	/**
	 * Area is not defined for a line, thus
	 * this method returns 0.
	 * @return 0
	 */
	public int getArea() {
		return 0;
	}

	/**
	 * Fills a line of thickness one pixel 
	 * at the given position with the given color
	 */
	public void fill(Graphics g) {
			
	}

	/**
	 * {@inheritDoc}
	 * The perimeter of a line is simply the length of the line, 
	 * given by pythagoras theorm: l=sqrt((x2-x1)^2+(y2-y1)^2)
	 */
	public int getPerimeter() {
		return 0;
	}
	
	
	/**
	 * Constructor. 
	 * Place a straight line starting at (x1,y1)-coordinates,
	 * ending at (x2,y2)-coordinates.
	 * @param x1 The starting x-position of the line
	 * @param y1 The starting y-position of the line
	 * @param x2 The ending x-position of the line
	 * @param y2 The ending y-position of the line
	 * @param c	Color of the line
	 * @throws IllegalPositionException
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
		
	}
	
	/**
	 * Constructor.
	 * Place a line starting at the coordinates of Geometrical Form f1, 
	 * ending at the coordinates of Geometrical Form f2.
	 * @param f1 The object at the starting position.
	 * @param f2 The object at the ending position.
	 * @param c The color of the line.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
		
	}
	
	/**
	 * Returns the tilt of the line in degrees.
	 * @return the tilt of the line in degrees.
	 */
	private double getTilt() {
		return 0;
	}
	
	
	/**
	 * Checks if another object equates with respect to type, 
	 * as well as starting and ending position.
	 * @return true if obj is a line with same starting and ending coordinates.
	 */
	@Override
	public boolean equals(Object obj) {
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		
	}
}
