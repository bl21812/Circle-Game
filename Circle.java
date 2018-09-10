
public class Circle extends Shape {

	private double radius;

    public Circle(double radius, double x, double y) {
    	super(x, y);
	    this.radius = radius;
	    setBoundingBoxSize((int)(Math.round(radius*2)), (int)(Math.round(radius*2)));
    }
	  
    public double getArea() {
    	return ((Math.pow(radius,2)) * Math.PI);
    }
    
    public void setRadius(double radius) {
    	this.radius = radius;
    	setBoundingBoxSize((int)(Math.round(radius*2)), (int)(Math.round(radius*2)));
    }
    
    public double getRadius() {
    	return radius;
    }
    
    private void setBoundingBoxSize(int width, int height) {
    	super.getBoundingBox().setSize(width, height);
    }
    
}
