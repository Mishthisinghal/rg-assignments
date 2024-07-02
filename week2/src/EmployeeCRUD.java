import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeCRUD {
    private List<Employee> employees;

    public EmployeeCRUD() {
        employees = new ArrayList<>();
    }

    // Create
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Read
    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Optional<Employee> getEmployeeById(int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst();
    }

    // Update
    public boolean updateEmployee(int id, Employee updatedEmployee) {
        Optional<Employee> employeeOpt = getEmployeeById(id);
        if (employeeOpt.isPresent()) {
            Employee employee = employeeOpt.get();
            employee.setName(updatedEmployee.getName());
            employee.setDepartment(updatedEmployee.getDepartment());
            return true;
        }
        return false;
    }

    // Delete
    public boolean deleteEmployee(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }

    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        // Add Employees
        Employee emp1 = new Employee(1, "Mishthi Singhal", "Engineering");
        Employee emp2 = new Employee(2, "Jane Smith", "Marketing");

        employeeCRUD.addEmployee(emp1);
        employeeCRUD.addEmployee(emp2);


        // Read All Employees
        System.out.println("All Employees: " + employeeCRUD.getAllEmployees());

        // Read Employee by ID
        System.out.println("Employee with ID 1: " + employeeCRUD.getEmployeeById(1).orElse(null));

        // Update Employee
        Employee updatedEmp1 = new Employee(1, "Ms Mishthi Singhal", "Software Engineering");
        employeeCRUD.updateEmployee(1, updatedEmp1);
        System.out.println("Updated Employee with ID 1: " + employeeCRUD.getEmployeeById(1).orElse(null));

        // Delete Employee
        employeeCRUD.deleteEmployee(2);
        System.out.println("All Employees after deletion: " + employeeCRUD.getAllEmployees());
    }
}

