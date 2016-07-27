package shapes;

public class Circle extends Shape
{
	
	Circle(double radius) {
		super(radius, radius);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	private double radius;
	
/*	public void setDiameter(double diameter){
		
		this.diameter=diameter;
	}
	
	public void setRadius (double radius){
		this.radius=radius;
	}
	*/
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return Math.PI*Math.pow(radius,2);
		
	}
	
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	
}

