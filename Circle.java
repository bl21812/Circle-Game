class Circle extends Shape {

  double radius;

  public Circle(double radius, double x, double y) {
    super(x, y);
    this.radius = radius;
  }
  
  public double getArea() {
    return ((Math.pow(radius,2)) * Math.PI));
  }

}
