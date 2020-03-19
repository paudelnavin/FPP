package prog5_4;

public class Rectangle extends ClosedCurve implements Polygon{

	double length = 0, width = 0;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}
	public String getName() {
		return Type.RECTANGLE.toString();
	}
}
