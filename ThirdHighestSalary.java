
import java.util.*;
import java.util.stream.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class ThirdHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 60000),
                new Employee(3, "Charlie", 55000),
                new Employee(4, "David", 70000),
                new Employee(5, "Eve", 65000),
                new Employee(6, "Frank", 70000) // duplicate highest
        );

        // Find the 3rd highest salary
        Double thirdHighest = employees.stream()
                .map(Employee::getSalary)              // take salaries
                .distinct()                            // remove duplicates
                .sorted(Comparator.reverseOrder())     // sort in descending order
                .skip(2)                               // skip first 2 (highest & 2nd highest)
                .findFirst()                           // take the 3rd
                .orElse(null);

        System.out.println("3rd Highest Salary = " + thirdHighest);
    }
}
