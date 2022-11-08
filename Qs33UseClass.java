package object;

public class Qs33UseClass {
	public static void main(String[] args) {
		Qs33 s1= new Qs33();
		s1.name="Siva";
		s1.id=234;
		s1.age=14;
		s1.class1="IX";
		s1.attendancePercentage=75;
		Qs33 s2= new Qs33();
		s2.name="Mani";
		s2.id=236;
		s2.age=15;
		s2.class1="X";
		s2.attendancePercentage=80;
		Qs33 s3= new Qs33();
		s3.name="Valli";
		s3.id=237;
		s3.age=13;
		s3.class1="VIII";
		s3.attendancePercentage=90;
		System.out.println(" No. of days present by Student1 is " +s1.findNoOfWorkingDays());
		System.out.println(" No. of days present by Student1 is " +s2.findNoOfWorkingDays());
		System.out.println(" No. of days present by Student1 is " +s3.findNoOfWorkingDays());
		
	}

}
