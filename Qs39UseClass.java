package object;

public class Qs39UseClass {
	public static void main(String[] args) {
		Qs39 s1 = new Qs39();
		s1.studentName="Nandhini";
		s1.studentAge=12;
		s1.studentMobileNo= 8220389902l;
		s1.classSection= 'A';
		s1.marksPercentage=85;
		Qs39 s2 = new Qs39();
		s2.studentName="Swetha";
		s2.studentAge=14;
		s2.studentMobileNo= 8220389902l;
		s2.classSection= 'B';
		s2.marksPercentage=90;
		Qs39 s3 = new Qs39();
		s3.studentName="Pravi";
		s3.studentAge=16;
		s3.studentMobileNo= 8220389902l;
		s3.classSection= 'C';
		s3.marksPercentage=95;
		s1.print();
		s2.print();
		s3.print();
	}

}
