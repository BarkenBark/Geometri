package geometri;

import java.awt.Graphics;
import java.awt.Color;

/**
 * A rectangle for plotting a JFrame
 * The rectangle is defined by its width and height, and its position
 * @author Oscar Bark & Jesper Larsson
 */
public class Rectangle extends GeoForm {
	
	/**
	 * {@inheritDoc} 
	 * The area of the rectangle is the product of its width and height.
	 */
	public int getArea() {
		return this.getWidth() * this.getHeight();
	}


	/** 
	 * Fill the area of the rectangle at the position of the 
	 * rectangle with the color of the rectangle.
	 *
	 * @param g A graphic pen to draw with. 
	 */
	public void fill(Graphics g) {
		g.setColor(this.getColor());
		g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}

	/**
	 * {@inheritDoc} The perimeter of a rectangle 
	 * is calculated by taking 2*width + 2*height
	 */
	public int getPerimeter() {
		return 2*this.getWidth() + 2*this.getHeight();
	}

	/**
	 * Checks whether the rectangle is square 
	 * @return true if a square, false otherwise
	 */
	private boolean isSquare() {
		return (this.getWidth() == this.getHeight());
	}
	
	

	/**
	 * Constructor.
	 * Places a rectangle at (x,y)-coordinates
	 * @param x The x-coordinate of the rectangle
	 * @param y The y-coordinate of the rectangle
	 * @param width The width of the rectangle
	 * @param height The height of the rectangle
	 * @param c	The color of the rectangle
	 */
	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {
		super(x, y, width, height, c);
	}

	/**
	 * Constructor.
	 * Places a rectangle at coordinates of another Geometrical Form
	 * @param x The x-coordinate of the rectangle
	 * @param y The y-coordinate of the rectangle
	 * @param width The width of the rectangle
	 * @param height The height of the rectangle
	 * @param c	The color of the rectangle
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c) {
		super(f,width,height,c);

	}
	
}
