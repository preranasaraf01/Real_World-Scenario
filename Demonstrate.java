package Inheritance;

public class Demonstrate {

	public static void main(String[] args) {

		Vehicle V = new Car("Red", "model", "make", 2010, 2, "Auto");
		Truck T = new Truck("Black", "make", 2019, "model-10", "Midium", 5);
		V.display();
		V.start();
		T.display();
		T.start();
		
		ElectricCar EC = new ElectricCar("Blue", "make", 1990, "model", 3, "Auto", 20, 100);
		GasolineCar GC = new GasolineCar("White", "make", 2018, "Totota", 4, "Manual",13, 12);
		EC.display();
		EC.start();
		GC.display();
		GC.start();
	}
}
