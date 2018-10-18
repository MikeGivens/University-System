
abstract public class Employee {
	protected String firstName;
	protected String lastName;
	protected double monthly_salary;
	protected boolean hourlyPaid;
	protected double hourlyRate;

	public Employee(String fn, String ln, double ms, boolean hp, double hr) {
		firstName = fn;
		lastName = ln;
		monthly_salary = ms;
		hourlyPaid = hp;
		hourlyRate = hr;
	}

	public void view() {
		System.out.println();
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		if (hourlyPaid)
			System.out.println("Hourly Rate:" + hourlyRate);
		else
			System.out.println("Monthly Salary:" + monthly_salary);
	}
}
