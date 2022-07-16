package oopLab2;

public class Triangle implements IShape {

	
	double height;
	double base;
	
	public Triangle(double height,double base) {
		this.height = height;
		this.base   = base;
	}
	
	
	@Override
	public double calculateArea() {
		return (this.height*this.base)/2;
	}

	@Override
	public double calculatePerimieter() {
		return (height+base)+Math.sqrt(height*height+base*base);
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
