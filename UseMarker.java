package object;

public class UseMarker {
	public static void main(String[] args) {
		Marker marker1= new Marker();
		marker1.color="Red";
		marker1.price=12;
		marker1.brand="Luxol";
		marker1.material="Plastic";
		marker1.isPermanent= false;
		marker1.print();
		Marker marker2= new Marker();
		marker2.color="Red";
		marker2.price=12;
		marker2.brand="Luxol";
		marker2.material="Plastic";
		marker2.isPermanent= false;
		marker2.print();
		if(marker1.isPermanent == true && marker2.isPermanent == true)
		{
			System.out.println("its permanent");
		}
		else {
			System.out.println("Not permanent");
		}
}
}