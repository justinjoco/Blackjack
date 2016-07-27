package shapes;
import java.lang.Math;

public class Shape {

	Shape(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	double x, y;
	double area;
	double perimeter;
	
	double getArea(){
		return x*y;
	}
	
	double getPerimeter(){
		return 2*x+2*y;
	}
}

