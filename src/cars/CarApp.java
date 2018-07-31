package cars;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userMake;
		String userModel;
		int userYear;
		double userPrice;

		ArrayList<Car> carList = new ArrayList<>();

		System.out.println("How many cars do you want to enter? ");
		int userNum = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < userNum; i++) {
			System.out.println("Please enter the make, model, year, and price: ");
			userMake = Validator.getString(scan, "Make: ");
			userModel = Validator.getString(scan, "Model: ");
			userYear = Validator.getInt(scan, "Year: ");
			userPrice = Validator.getDouble(scan, "Price: ");
			Car newCar = new Car(userMake, userModel, userYear, userPrice);

			carList.add(newCar);

		}

		for (int i = 0; i < carList.size(); i++) {

			System.out.println("Car " + (i + 1) + ": " + carList.get(i));
		}

		String choice = "";
		int sel = -1;
		carList.add(new UsedCar("Ford", "Taurus", 1995, 3456.89, 150990.75));
		carList.add(new UsedCar("Chevrolet", "Malibu", 2006, 4356.89, 85457.42));
		carList.add(new UsedCar("Toyota", "Camry", 2010, 6543.89, 64522.95));
		carList.add(new Car("Chrysler", "300C", 2018, 29000.0));
		carList.add(new Car("Honda", "Civic", 2018, 18500.0));
		carList.add(new Car("Toyota", "Prius", 2018, 23500.00));

		display(carList);
		while (true) {
			System.out.println("Select a car: ");
			sel = scan.nextInt();
			if (sel > 0 && sel < carList.size()) {
				break;
			}
			System.out.println("Please enter a valid number!");
		}
		System.out.println("Would you like to buy the car? (y/n) ");
		choice = scan.next();
		if (choice.equalsIgnoreCase("y")) {
			carList.remove(carList.get(sel - 1));
		}
		display(carList);
	}

	public static void display(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + cars.get(i));
		}
	}

}
