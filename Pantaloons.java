package object;

public class Pantaloons {
	String model;
	String color;
	String size;
	float price;
	boolean inStock;
	float discount;
	float netPrice;
public float sub(){
	return price-discount;
}
}
