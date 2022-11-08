package object;

public class Qs32UseClass {
	public static void main(String[] args) {
		Qs32 p1 = new Qs32();
		p1.brand="Rorito";
		p1.price1=10;
		p1.isBluecolor= true;
		p1.tipWidth= 0.5f;
		Qs32 p2 = new Qs32();
		p2.brand="Reynolds";
		p2.price2=20;
		p2.isBluecolor= true;
		p2.tipWidth= 0.7f;
		Qs32 p3 = new Qs32();
		p3.brand="Rorito";
		p3.price3=10;
		p3.isBluecolor= true;
		p3.tipWidth= 0.5f;
		int average=(p1.price1+p2.price2+p3.price3)/3;
		System.out.println(" Average price is " +average);
	}

}
