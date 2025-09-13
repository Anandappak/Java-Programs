//GroupByDepartmentWithoutStream
import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class GroupByDepartmentWithoutStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR"),
                new Employee(2, "Bob", "IT"),
                new Employee(3, "Charlie", "Finance"),
                new Employee(4, "David", "IT"),
                new Employee(5, "Eve", "HR"),
                new Employee(6, "Frank", "Finance")
        );

        // Group employees by department without streams
        Map<String, List<Employee>> employeesByDept = new HashMap<>();

        for (Employee emp : employees) {
            String dept = emp.getDepartment();
            // If department is not in map, add it
            if (!employeesByDept.containsKey(dept)) {
                employeesByDept.put(dept, new ArrayList<>());
            }
            // Add employee to the list for that department
            employeesByDept.get(dept).add(emp);
        }

        // Print result
        for (Map.Entry<String, List<Employee>> entry : employeesByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Employee emp : entry.getValue()) {
                System.out.println(emp);
            }
            System.out.println();
        }
    }
}
