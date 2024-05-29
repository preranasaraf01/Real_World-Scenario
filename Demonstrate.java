package Inheritance;

public class Demonstrate {

	public static void main(String[] args) {
//		 Vehicle myCar = new ElectricCar("Red", "Model S", 2021, "Tesla", 4, "Automatic", 100, 396);
//	        Vehicle myTruck = new Truck("Black", "F-150", 2020, "Ford", "Large", 13000);
//
//	        myCar.display();
//	        myTruck.display();
//
//	        // Demonstrating polymorphism
//	        Vehicle[] vehicles = {
//	            new ElectricCar("Blue", "Leaf", 2022, "Nissan", 4, "Automatic", 40, 150),
//	            new GasolineCar("White", "Corolla", 2019, "Toyota", 4, "Manual", 13, 32)
//	        };
//
//	        for (Vehicle v : vehicles) {
//	            v.display();
//	        }
		Vehicle V = new Car("Red", "model", "make", 2010, 2, "Auto");
		Truck T = new Truck("Black", "make", 2019, "model-10", "Midium", 5);
		V.display();
		V.start();
		T.display();
		T.start();
		
		ElectricCar EC = new ElectricCar("Blue", "make", 1990, "model", 3, "Auto", 20, 100);
		GasolineCar GC = new GasolineCar(null, null, 0, null, 0, null, 0, 0);
		EC.display();
		EC.start();
		GC.display();
		GC.start();
	}
}
