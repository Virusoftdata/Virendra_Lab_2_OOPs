package oopLab2;

public interface IShape {	
	
	Render render = new Render();
	public double calculateArea();
	public double calculatePerimieter();
	public void drawShape();
	public void drawShape(String shape);
	
}

