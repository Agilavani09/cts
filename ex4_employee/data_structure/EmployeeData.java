package data_structure;

public class EmployeeData {
	int employeeId;
    String name;
    String position;
    double salary;

    public EmployeeData(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: ₹" + salary);
    }
}
