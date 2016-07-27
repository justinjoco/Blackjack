
package shapes; 
2 
 
3 public class Circle extends Shape 
4 { 
5 	 
6 	Circle(double radius) { 
7 		super(radius, radius); 
8 		this.radius=radius; 
9 		// TODO Auto-generated constructor stub 
10 	} 
11 
 
12 	private double radius; 
13 	 
14 /*	public void setDiameter(double diameter){ 
15 		 
16 		this.diameter=diameter; 
17 	} 
18 	 
19 	public void setRadius (double radius){ 
20 		this.radius=radius; 
21 	} 
22 	*/ 
23 	public double getRadius(){ 
24 		return radius; 
25 	} 
26 	public double getArea(){ 
27 		return Math.PI*Math.pow(radius,2); 
28 		 
29 	} 
30 	 
31 	public double getPerimeter(){ 
32 		return 2*Math.PI*radius; 
33 	} 
34 	 
35 } 
 





Contact GitHub
 API
 Training
 Shop
 Blog
 About
   © 2016 GitHub, Inc.
 Terms
 Privacy
 Security
