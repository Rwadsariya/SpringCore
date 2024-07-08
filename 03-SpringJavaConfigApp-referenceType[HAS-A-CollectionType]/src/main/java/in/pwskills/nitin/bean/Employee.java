package in.pwskills.nitin.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// primitive variable
	private int eid;
	private float salary;

	// collection variable
	private List<String> friends;
	private Set<String> phoneNumbers;
	private Map<String, String> acountNumbers;

	public Employee() {
		System.out.println("Employee object created using zero params..");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, String> getAcountNumbers() {
		return acountNumbers;
	}

	public void setAcountNumbers(Map<String, String> acountNumbers) {
		this.acountNumbers = acountNumbers;
	}

	static {
		System.out.println("Employee.class file is loading...");
	}

	//constructor
//	public Employee(int eid, float salary, List<String> friends, Set<String> phoneNumbers,
//			Map<String, String> acountNumbers) {
//		System.out.println("Employee:: using param constructor...");
//		this.eid = eid;
//		this.salary = salary;
//		this.friends = friends;
//		this.phoneNumbers = phoneNumbers;
//		this.acountNumbers = acountNumbers;
//	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", friends=" + friends + ", phoneNumbers=" + phoneNumbers
				+ ", acountNumbers=" + acountNumbers + "]";
	}

}
