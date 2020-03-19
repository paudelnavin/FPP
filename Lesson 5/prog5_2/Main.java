package prog5_2;

public class Main {
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.printf("The are of this %s is %,.2f \n",cc.getName(), cc.computeArea());
			
		}
    
	}
}
