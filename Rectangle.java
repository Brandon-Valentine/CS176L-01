package edu.monmouth;

public class Rectangle extends ShapeException implements Shape  {
	private int width;
	private int length;
public Rectangle(int length, int width)throws ShapeException{
	setWidth(width);
	setLength(length);

		
	}
	
		
public int getWidth() {
	return width;	
}
public void setWidth(int width)throws ShapeException{
	if(width>0) {
		this.width=width;}
		}

public int getLength(){
	return length;
	}
public void setLength(int length)throws ShapeException{
	if(length<0) {
		length=0;}
	else {
		this.length=length;}
	
}
@Override
public String toString() {
	return "Rectangle [width=" + width + ", length=" + length + "]";
}
@Override
public double area() {
	double area=length*width;
	return area;
	
}}
	

