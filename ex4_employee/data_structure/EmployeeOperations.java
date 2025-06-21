package data_structure;

public class EmployeeOperations {
	private EmployeeData[] employees;
    private int size = 0;

    public EmployeeOperations(int capacity) {
        employees = new EmployeeData[capacity];
    }

   
    public void addEmployee(EmployeeData emp) {
        if (size < employees.length) {
            employees[size++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Array full. Cannot add more employees.");
        }
    }

    public void searchEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == empId) {
                System.out.print("Employee found: ");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }

    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("Employee List:");
        for (int i = 0; i < size; i++) {
            employees[i].display();
        }
    }

    public void deleteEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == empId) {
                // Shift elements left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
