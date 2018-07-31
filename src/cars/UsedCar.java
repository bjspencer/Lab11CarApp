package cars;

public class UsedCar extends Car {
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	private double mileage;

	public UsedCar() {
		super();
		setMileage(0);
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		setMileage(mileage);
	}

	@Override
	public String toString() {
		//return "(Used) Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: "
				//+ getPrice() + ", Mileage: " + mileage + "";
		
		return String.format("(Used) " + getMake() + "\t" + getModel() + "\t\t " +  getYear() + "\t\t" + "$" + getPrice() + "\t\t" + getMileage() + " miles");
	}
}