package wyle_shapes;


public class Circle implements Shape{
	private double radius;
	
	public Circle(double r){
		radius = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*2*radius;
	}
	
	
}
