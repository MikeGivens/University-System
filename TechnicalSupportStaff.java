public class TechnicalSupportStaff extends Employee {

	protected String technicalArea;

	public TechnicalSupportStaff(String fName, String lName, String ta, boolean hp, double ms, double hr) {

		super(fName, lName, ms, hp, hr);
		technicalArea = ta;

	}

	public void view() {
		
		super.view();
		System.out.println("Technical Area: " + technicalArea);
	}

}
