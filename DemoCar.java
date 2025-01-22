
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		
		car.Sample();
		System.out.println("Mileage: "+ car.getMileage());
		car.setCompanyName("Totoro");
		car.setModelName("orolla");
		car.setYear(2015);
		System.out.println();
		System.out.println("Updated Car Details:");
		car.Sample();
		car.setYear(0);
		car.setCompanyName(null);
		car.setModelName(null);
		
		
		
	}

}
