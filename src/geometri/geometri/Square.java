package geometri;

import java.awt.Graphics;
import java.awt.Color;

public class Square extends GeoForm {

	/**
	 * {@inheritDoc}
	 * The area of the square is calculated as its
	 * side to the power of 2.
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
	 * The perimeter of the square is calculated
	 * by taking its side times four.
	 */
	public int getPerimeter() {
		return 0;
	}
	
	
	/**
	 * Constructor
	 * @param x The x-coordinate of the square
	 * @param y The y-coordinate of the square
	 * @param side The side of the square
	 * @param c The color of the square
	 * @throws IllegalPositionException
	 */
	public Square(int x, int y, int side, Color c) throws IllegalPositionException {
		super(x,y,side,side,c);
	}
	
	/**
	 * Constructor
	 * @param f The GeometricalForm containing the position of the square
	 * @param side The side of the square
	 * @param c The color of the square
	 */
	public Square(GeometricalForm f, int side, Color c) {
		super(f,side,side,c);
	}
	
}