package object;

public class StockDetailsPantaloons {
	public static void main(String[] args) {
		Pantaloons stock1 = new Pantaloons();
			stock1.model=" Kurti";
			stock1.color=" Red";
			stock1.size = "L";
			stock1.price = 799;
			stock1.inStock = true;
			stock1.discount = 49.29f;
		Pantaloons stock2 = new Pantaloons();
			stock2.model=" Kurti";
			stock2.color=" Black ";
			stock2.size = "M";
			stock2.price = 899;
			stock2.inStock = true;
			stock2.discount = 90.29f;
		Pantaloons stock3 = new Pantaloons();
			stock3.model=" Kurti";
			stock3.color=" Yellow ";
			stock3.size = "S";
			stock3.price = 999;
			stock3.inStock = true;
			stock3.discount = 100.02f;
		System.out.println( " The net price of " +stock1.color +stock1.model+ " is " +stock1.sub() + " Available size " +stock1.size);
		System.out.println( " The net price of " +stock2.color +stock2.model+ " is " +stock2.sub() + " Available size " +stock2.size);
		System.out.println( " The net price of " +stock3.color +stock3.model+ " is " +stock3.sub() + " Available size " +stock3.size);
	}

}
