package object;

public class Qs33 {
	String name;
	int id;
	int age;
	String class1;
	int attendancePercentage;
	int totalWorkingdays=240;
public int findNoOfWorkingDays() {
	return (totalWorkingdays*attendancePercentage)/100;
}
}
