package object;

public class UseCar {
public static void main(String[] args) {
	Car car1 = new Car();
		car1.brand = " BMW ";
		car1.manufactureYear = 2022;
		car1.color = " White";
		car1.price = 11100000;
		car1.fuelType= " Petrol";
		car1.isAutomatic= true;
	Car car2 = new Car();
		car2.brand = " Benz";
		car2.manufactureYear = 2021;
		car2.color = "Black";
		car2.price= 2500000;
		car2.fuelType="Diesel";
		car2.isAutomatic = false;
	Car car3 = new Car();
		car3.brand = " Audi ";
		car3.manufactureYear = 2020;
		car3.color = "Red";
		car3.price=1800000;
		car3.fuelType= " Diesel";
		car3.isAutomatic= true;
	System.out.println(" Brands available_1"+car1.brand + " Model "+car1.manufactureYear);
	System.out.println(" Brands available_2"+car2.brand + " Model "+car2.manufactureYear);
	System.out.println(" Brands available_3"+car3.brand + " Model "+car3.manufactureYear);
}
}
