package shapes;

public class mainTest {

	public static void main(String[] args){
		Shape R = new Rectangle(5,4);
		Shape C = new Circle(5);
		Shape T = new rightTriangle(3,4,5);
		System.out.println("Shape area = "+R.getArea());
		System.out.println("Shape perimeter ="+R.getPerimeter());
		
		System.out.println("Circle area = "+C.getArea());
		System.out.println("Circle perimeter ="+C.getPerimeter());
		
		System.out.println("Triangle area = "+T.getArea());
		System.out.println("Triangle perimeter ="+T.getPerimeter());
	}
}
