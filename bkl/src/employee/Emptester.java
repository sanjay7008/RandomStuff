package employee;

import java.util.Arrays;
import java.util.Scanner;
import static employee.employeeQUALIFICATION.*;
public class Emptester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		Employeee e = new Employeee(CEO, "suvijay");
		System.out.println(e);
		System.out.println("enter employee qual and name");
		
		Employeee e1 = new Employeee(employeeQUALIFICATION.valueOf(scan.next()),scan.next());
		
		System.out.println(e1);
		System.out.println(Arrays.toString(employeeQUALIFICATION.values()));
	}

}
