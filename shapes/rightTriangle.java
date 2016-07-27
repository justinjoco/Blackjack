package shapes;

public class rightTriangle extends Shape{

	rightTriangle(double x, double y, double z) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.legA=super.x;
		this.legB=super.y;
		this.hypotenuse=z;
	}
	private double legA,legB,hypotenuse;
	double getArea(){
		return (legA*legB)/2;
	}
	
	double getPerimeter(){
	return legA+legB+hypotenuse;
	}


}

