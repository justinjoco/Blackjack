package shapes;

public class Rectangle extends Shape{
	Rectangle(double x, double y) {
		super(x, y);
	    width=super.x;
	    length=super.y;
		// TODO Auto-generated constructor stub
	}

	private double width, length;
	
	double getArea(){
		return width*length;
	}
	
	double getPerimeter(){
		return 2*width+2*length;
	}

}


