package prog5_4;

public class Circle extends ClosedCurve implements Polygon {
	double radius;

	public Circle(Double radius) {
		this(radius.doubleValue());
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	double computeArea() {
		return (Math.PI * radius * radius);
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getName() {
		return Type.CIRCLE.toString();
	}
}