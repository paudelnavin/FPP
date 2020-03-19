package prog5_2;

public class Rectangle extends ClosedCurve {

	double length = 0, width = 0;
	private String name="Rectangle";

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
