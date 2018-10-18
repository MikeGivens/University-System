
import java.util.*;

public class School {

	private String schoolName;
	private ArrayList<Student> students;
	private ArrayList<Employee> employees;

	public School(String name) {

		schoolName = name;
		students = new ArrayList();
		employees = new ArrayList();

	}

	public void addstudent(Student s) {
		students.add(s);
	}

	public void addemployee(Employee e) {
		employees.add(e);
	}

	public void displaySchoolInfo() {
		System.out.println("\t\t" + schoolName);
		System.out.println("\t\t\t =============");

		for (int i = 0; i < students.size(); i++)
			students.get(i).viewStudent();

		for (int i = 0; i < employees.size(); i++)
			employees.get(i).view();

	}
}