package object;

public class EmployeeDetails {
	String empName;
	int empId;
	long mobileNo;
	String doj;
	int exp;
	float salary;
	float pf;
	float netSalary;
	float tax;

public float findTax(int tax) {
	return salary*tax/100;
}
public float findNetSalary() {
	return (salary-pf)-tax;
}
public void print() {
	System.out.println(" Net Salary of employee" +empName +" is Rs." +findNetSalary() +" (tax deduction)" +tax + "/n" +" Net Salary of employee" +empName +" is Rs." +findNetSalary() +" (tax deduction)" +tax + "\n"
	+" Net Salary of employee" +empName +"is Rs." +findNetSalary() +" (tax deduction)" +tax + "\n" + " Net Salary of employee" +empName +"is Rs."+findNetSalary()  +" (tax deduction)"+tax + "\n"+
" Net Salary of employee " +empName +" is Rs." +findNetSalary() +" (tax deduction)" +tax);
}
}
