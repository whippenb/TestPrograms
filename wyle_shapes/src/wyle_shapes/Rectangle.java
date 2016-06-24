package wyle_shapes;

public class Rectangle implements Shape {
	private double height;
	private double width;
	
	public Rectangle(double h, double w){
		height = h;
		width = w;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*width+2*height;
	}

}
