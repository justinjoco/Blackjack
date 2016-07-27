package shapes;

public class rightTriangle extends Shape{

	rightTriangle(double x, double y, double z) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.base=super.x;
		this.height=super.y;
		this.hypotenuse=z;
	}
	private double base,height,hypotenuse;
	double getArea(){
		return (base*height)/2;
	}
	
	double getPerimeter(){
	return base+height+hypotenuse;
	}


}

