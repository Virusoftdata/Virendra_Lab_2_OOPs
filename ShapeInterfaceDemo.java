package oopLab2;

public class ShapeInterfaceDemo {

	public static void main(String[] args) {
		
		Rectangle recatangle = new Rectangle(34,20);	
		recatangle.drawShape("Rectangle");
		recatangle.render.draw("Red");
		System.out.println("Area : " + recatangle.calculateArea());
		System.out.println("Perimeter : " + recatangle.calculatePerimieter());
		
		
		Square square = new Square(20);	
		square.drawShape("Square");
		square.render.draw("Red");
		System.out.println("Area : " + square.calculateArea());
		System.out.println("Perimeter : " + square.calculatePerimieter());
		
		Circle circle = new Circle(4);	
		circle.drawShape("Circle");
		circle.render.draw("Red");
		System.out.println("Area : " + circle.calculateArea());
		System.out.println("Perimeter : " + circle.calculatePerimieter());
		
		
		Triangle triangle = new Triangle(10,20);	
		triangle.drawShape("Triangle");
		triangle.render.draw("Red");
		System.out.println("Area : " + triangle.calculateArea());
		System.out.println("Perimeter : " + triangle.calculatePerimieter());
		
		
		
			
	}
}
