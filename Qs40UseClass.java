package object;

public class Qs40UseClass {
	public static void main(String[] args) {
		Qs40 e1 = new Qs40();
		e1.employeeId=704944;
		e1.employeeName=" Nandhini";
		e1.dateOfBirth="25.08.1993";
		e1.mobileNo= 8220389902l;
		Qs40 e2 = new Qs40();
		e2.employeeId=707844;
		e2.employeeName=" Swetha";
		e2.dateOfBirth="16.03.1999";
		e2.mobileNo= 8220384452l;
		Qs40 e3 = new Qs40();
		e3.employeeId=778944;
		e3.employeeName=" Pravi";
		e3.dateOfBirth="10.01.1992";
		e3.mobileNo= 8145698902l;
	System.out.println(" Employee 1 mobile number is " +e1.addCountryCode());
	System.out.println(" Employee 2 mobile number is " +e2.addCountryCode());
	System.out.println(" Employee 3 mobile number is " +e3.addCountryCode());
		
	}

}
