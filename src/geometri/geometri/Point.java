package geometri;
import java.awt.Color;
import java.awt.Graphics;

public class Point extends GeoForm {

	/**
	 * Area is not defined for a point, 
	 * thus this method returns 0.
	 */
	public int getArea() {
		return 0;
	}

	/**
	 * Fills one pixel with the color 
	 * of the form at the position of the form.
	 */
	public void fill(Graphics g) {
		g.setColor(this.getColor());
		g.drawLine(this.getX(),this.getY(),this.getX(),this.getY());	
	}

	/** 
	 * Perimeter is not defined for a point,
	 * thus this method returns 0.
	 */
	public int getPerimeter() {
		return 0;
	}
	
	
	
	/**
	 * Construcor.
	 * Place a point at (x,y)-coordinates
	 * @param x The x-coordinate of the point
	 * @param y The y-coordinate of the point
	 * @param c	The color of the point
	 */
	public Point(int x, int y, Color c) throws IllegalPositionException {
		super(x,y,0,0,c);
	}
	
	/**
	 * Construcor.
	 * Place a point at coordinates of 
	 * @param x The x-coordinate of the point
	 * @param y The y-coordinate of the point
	 * @param c	The color of the point
	 */
	public Point(GeometricalForm f, Color c) {
		super(f,0,0,c);
	}
	
}
