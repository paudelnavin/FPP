package prog5_2;

public class Circle extends ClosedCurve {
	double radius;
	private String name="Circle";
	public Circle(Double radius){
		this(radius.doubleValue());
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}