package company;

public class Manager extends Employee {
	public void set(){
		employeeName="Joy";
		department="Entertainment";
	}
	public void print(){
		System.out.println("Employee name "+ employeeName);
		System.out.println("Deparment "+ department);
	}

}
