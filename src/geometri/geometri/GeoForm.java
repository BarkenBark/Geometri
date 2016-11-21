package geometri;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GeoForm implements GeometricalForm {
	private Color c;
	private int x;
	private int y;

	public abstract int getArea();

	public int compareTo(GeometricalForm f) {
		int a_Area = this.getArea(); 
		int a_Perimeter = this.getPerimeter();
		int b_Area = f.getArea();
		int b_Perimeter = f.getPerimeter();
		return 0; 
	}

	public abstract void fill(Graphics g);

	public Color getColor() {
		// TODO Auto-generated method stub
		return c;
	}

	public abstract int getWidth();

	public abstract int getHeight();

	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public void move(int dx, int dy) throws IllegalPositionException {
		//this.x = this.x + dx;
		//this.y = this.y + dy;
		//kolla exception
		
	}

	public abstract int getPerimeter();

	public void place(int x, int y) throws IllegalPositionException {
		// TODO Auto-generated method stub

	}
	
}
