package data_structure;

public class AppEmployee {
	public static void main(String[] args) {
        EmployeeOperations empOps = new EmployeeOperations(5);

        empOps.addEmployee(new EmployeeData(1, "Alice", "Manager", 75000));
        empOps.addEmployee(new EmployeeData(2, "Bob", "Developer", 55000));
        empOps.addEmployee(new EmployeeData(3, "Charlie", "HR", 48000));

        empOps.traverseEmployees();

        empOps.searchEmployee(2);
        empOps.deleteEmployee(1);
        
        empOps.traverseEmployees();
    }
}
