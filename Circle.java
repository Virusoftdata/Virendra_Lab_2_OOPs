package oopLab2;

public class Circle implements IShape  {

	double radius;
	final double pi = 3.14;
	
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return this.pi*this.radius*this.radius;
	}

	@Override
	public double calculatePerimieter() {
		return 2*this.pi*this.radius;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void drawShape(String shape) {
		
		System.out.println("This is "+shape+" Shape." );
	}

	

}
