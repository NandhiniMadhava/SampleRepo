package object;

public class Qs37UseClass {
	public static void main(String[] args) {
		Qs37 ac1 = new Qs37();
		ac1.brand= " Blue star";
		ac1.price= 33500;
		ac1.noOfWings=3;
		ac1.isQuality= true;
		Qs37 ac2 = new Qs37();
		ac2.brand= " Blue star";
		ac2.price= 30000;
		ac2.noOfWings=3;
		ac2.isQuality= true;
		Qs37 ac3 = new Qs37();
		ac3.brand= " Blue star";
		ac3.price= 45500;
		ac3.noOfWings=3;
		ac3.isQuality= true;
		ac1.print();
		ac2.print();
		ac3.print();
	}

}
