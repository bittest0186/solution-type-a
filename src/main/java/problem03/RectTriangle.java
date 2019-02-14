package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
	}

	@Override
	public double getArea() {
		System.out.println("");
		
		double area = (width+height)/2;
		
		return area;
	}

	@Override
	public double getPerimeter() {
		
		double perimeter = (width+height);
		
		return perimeter;
	}
}
