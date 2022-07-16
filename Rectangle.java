package oopLab2;

public class Rectangle implements  IShape {

	double height;
	double width;
	
	
	public Rectangle(double height,double width) {
		this.height =height;
		this.width =width;
	}
	
	@Override
	public double calculateArea() {
		
		return this.height*this.width;
	}; 
	
	@Override
	public double calculatePerimieter() {
		
		return (2*this.width)+(2*this.height); 
	};
	
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void drawShape(String shape) {
		
		System.out.println("This is "+shape+" Shape." );
	}


	
	

	
}
