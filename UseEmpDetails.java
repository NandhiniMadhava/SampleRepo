package object;

public class UseEmpDetails {
	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.empName = " Nandhini";
		emp1.empId= 704944;
		emp1.mobileNo= 8220389902l;
		emp1.doj= "21.05.2019";
		emp1.exp= 3;
		emp1.salary= 60000;
		emp1.pf= 1892.23f;
		emp1.tax= emp1.findTax(5);
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.empName = " Swetha";
		emp2.empId= 704978;
		emp2.mobileNo= 9750915195l;
		emp2.doj= "21.09.2021";
		emp2.exp= 4;
		emp2.salary= 70000;
		emp2.pf= 1952.32f;
		emp2.tax= emp2.findTax(10);
		EmployeeDetails emp3 = new EmployeeDetails();
		emp3.empName = " Madhavan ";
		emp3.empId= 704458;
		emp3.mobileNo= 1234567891l;
		emp3.doj= "22.09.2020";
		emp3.exp= 2;
		emp3.salary= 45000;
		emp3.pf= 1320.21f;
		emp3.tax= emp3.findTax(15);
		EmployeeDetails emp4 = new EmployeeDetails();
		emp4.empName = " Santhi ";
		emp4.empId= 705978;
		emp4.mobileNo= 9874562132l;
		emp4.doj= "20.08.2021";
		emp4.exp= 1;
		emp4.salary= 40000;
		emp4.pf= 1410.46f;
		emp4.tax= emp4.findTax(16);
		EmployeeDetails emp5 = new EmployeeDetails();
		emp5.empName = " Pravartiga";
		emp5.empId= 707858;
		emp5.mobileNo= 98754723512l;
		emp5.doj= "20.01.2017";
		emp5.exp= 5;
		emp5.salary= 400000;
		emp5.pf= 2568.00f;
		emp5.tax= emp5.findTax(18);
		emp1.print();
		emp2.print();
		
	}

}
