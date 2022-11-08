package object;

public class UseCalculatorMethod {
	public static void main(String[] args) {
		MethodCalculator cal=new MethodCalculator();
		cal.num1=10;
		cal.num2=15;
		MethodCalculator cal1= new MethodCalculator();
		System.out.println(cal1.add2(10,20)+15);
	}

}
