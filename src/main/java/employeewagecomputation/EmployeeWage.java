package employeewagecomputation;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("----------Welcome to Employee Wage Computation-----------");

		// UC1 - Employee Attendances
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}

}
