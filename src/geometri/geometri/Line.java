package geometri;
import java.awt.Color;
import java.awt.Graphics;

public class Line extends GeoForm {
	private int x2;
	private int y2;
	
	/**
	 * 
	 * Constructor
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
		place(x1,y1);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		try{
			place(f1.getX(),f1.getY());
		}catch(IllegalPositionException e){
			System.out.println("Error"); //
		}
	}

	public int getArea() {
		return 0;
	}

	@Override
	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return (int) Math.round(Math.abs(x2-getX()));
	}

	@Override
	public int getHeight() {
		return (int) Math.round(Math.abs(y2-getY()));
	}

	@Override
	public int getPerimeter() {
		return (int) Math.round(Math.sqrt(Math.pow(getHeight(),2)*Math.pow(getWidth(),2)));
	}
}
