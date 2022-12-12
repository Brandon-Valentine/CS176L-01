package edu.monmouth;

public class Circle extends ShapeException implements Shape{
private int radius=0;	
public Circle(int radius)throws ShapeException {
	setRadius(radius);
	 new ShapeException("radius of"+radius+"id invalid");
}
public void setRadius(int radius)throws ShapeException {
	if (radius>0) {
		this.radius=radius;
		return;
	}
	throw new ShapeException("radius of"+radius+"id invalid");
}
public int getRadius(){
	return radius;
	
}
@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}
	@Override
	public double area() {
		double pi=Math.PI; 
		double r= getRadius();
		double area=pi*r*r;
		return area;
	}

}
