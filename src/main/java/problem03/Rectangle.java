package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		System.out.println("");
	}

	
	





	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public double getArea() {
		
		double area = width * height;
		
		return area;
	}

	@Override
	public double getPerimeter() {
		
		double perimeter = 2 * (width+height);
		
		return perimeter;
	}
}