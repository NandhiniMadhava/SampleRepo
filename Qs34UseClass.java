package object;

public class Qs34UseClass {
	public static void main(String[]args) {
		Qs34 ach1 = new Qs34();
		ach1.name= "Nandhini";
		ach1.age=28;
		ach1.gender='F';
		ach1.accountNumber=12345678912365l;
		ach1.monthlyIncome=50000;
		ach1.savingsPercentage=18;
		Qs34 ach2 = new Qs34();
		ach2.name= "Savithri";
		ach2.age=25;
		ach2.gender='F';
		ach2.accountNumber=12345678912365l;
		ach2.monthlyIncome=20000;
		ach2.savingsPercentage=20;
		Qs34 ach3 = new Qs34();
		ach3.name= "Kamban";
		ach3.age=30;
		ach3.gender='F';
		ach3.accountNumber=12345678912365l;
		ach3.monthlyIncome=30000;
		ach3.savingsPercentage=10;
	System.out.println("Saving of account holder1 = "+ach1.findSavings());
	System.out.println("Saving of account holder2 = "+ach2.findSavings());
	System.out.println("Saving of account holder3 = "+ach3.findSavings());
	}

}
