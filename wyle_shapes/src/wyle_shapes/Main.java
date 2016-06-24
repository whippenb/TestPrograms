package wyle_shapes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(3,4,5);
		System.out.println("The area of rect is " + tri.getArea() + " and the perimeter is " + tri.getPerimeter());
		Circle circ = new Circle(4.5);
		System.out.println("The area of rect is " + circ.getArea() + " and the perimeter is " + circ.getPerimeter());
		Rectangle rect = new Rectangle(3,4.2);
		System.out.println("The area of rect is " + rect.getArea() + " and the perimeter is " + rect.getPerimeter());
	}

}
