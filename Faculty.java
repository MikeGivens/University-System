

public class Faculty extends Employee {

	protected String department;
	protected String researchArea;

	public Faculty(String fName, String lName, String dep, String res, boolean hp, double ms, double hr) {
		super(fName, lName, ms, hp, hr);

		department = dep;
		researchArea = res;

	}

	public void view() {

		super.view();
		System.out.println("Department: " + department);
		System.out.println("Research Area: " + researchArea);
		
	}

}