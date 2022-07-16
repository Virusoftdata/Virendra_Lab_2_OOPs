package oopLab2;

public class Square extends Rectangle{

	
	
	public Square(double side) {
		super(side, side);	
	}
	
	@Override
	public double calculateArea() {
		
		return super.height*super.width;
	};
	
	@Override
	public void drawShape(String shape) {
		
		System.out.println("This is"+shape+" Shape." );
	}

	
		
	
}
