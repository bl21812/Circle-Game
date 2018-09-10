
public class Square extends Shape {

  private double height;
  private double width;
  
  public Square(double height, double width, double x, double y) {
    super(x, y);
    this.height = height;
    this.width = width;
    setBoundingBoxSize((int)(Math.round(width)), (int)(Math.round(height)));
  }
  
  public double getArea() {
    return (height*width);
  }
  
  public double getHeight() {
    return height;
  }
  
  public double getWidth() {
    return width;
  }
  
  public void setHeight(double height) {
    this.height = height;
    setBoundingBoxSize((int)(Math.round(width)), (int)(Math.round(height)));
  }
  
  public void setWidth(double width) {
    this.width = width;
    setBoundingBoxSize((int)(Math.round(width)), (int)(Math.round(height)));
  }
  
  private void setBoundingBoxSize(int width, int height) {
	  super.getBoundingBox().setSize(width, height);
  }
	  
}
