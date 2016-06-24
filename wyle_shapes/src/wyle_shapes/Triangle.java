package wyle_shapes;

public class Triangle implements Shape{
	private double base;
	private double sideb;
	private double sidec;
	
	public Triangle(double a, double b, double c){
		base=a;
		sideb=b;
		sidec=c;
	}
	
	@Override
	public double getArea(){
		return Math.sqrt((this.getPerimeter()/2)*(this.getPerimeter()/2-base)*(this.getPerimeter()/2-sideb)*(this.getPerimeter()/2-sidec));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return base+sideb+sidec;
	}
}
