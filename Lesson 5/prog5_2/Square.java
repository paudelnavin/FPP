package prog5_2;


public class Square extends ClosedCurve {
	double side;
	private String name="Square";
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}