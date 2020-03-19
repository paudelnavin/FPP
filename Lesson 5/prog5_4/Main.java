package prog5_4;

public class Main {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 7), new Circle(3) };
		// compute areas
		for (ClosedCurve cc : objects) {
			System.out.println(cc.getName()+" : "+ cc.computeArea()+"\n");

		}
		polygonCalc();
	}

	private static void polygonCalc() {
		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 7) };
		for (Polygon cc : objects) {
			System.out.println(cc.getName()+" : \nSide : "+ cc.getNumberOfSides() + "\nPerimeter " + cc.computePerimeter()+"\n");
		}
	}
}