import java.awt.Rectangle;


abstract class Shape {

	private double x;
			
	private double y;
	
	Rectangle BoundingBox = new Rectangle(0, 0, 0, 0); 
	
	public Shape(double x, double y) {
		
		this.x = x;
		this.y = y;
		
		BoundingBox.x = (int)Math.round(this.x);
		BoundingBox.y = (int)Math.round(this.y);
		
	}
	
	public void setX(double x) {
		
		this.x = x;
		BoundingBox.x = (int)Math.round(this.x);
	}
	
	public void setY(double y) {
		
		this.y = y;
		BoundingBox.y = (int)Math.round(this.y);
				
	}
	
	public abstract double getArea();
	
	public double getX() {
		
		return this.x;
		
	}
	
	public double getY() {
		
		return this.y;
	}
	
}
