import java.util.*;

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

public class ThirdHighestSalaryWithoutStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 60000),
                new Employee(3, "Charlie", 55000),
                new Employee(4, "David", 70000),
                new Employee(5, "Eve", 65000),
                new Employee(6, "Frank", 70000) // duplicate highest
        );

        // Collect salaries
        Set<Double> salarySet = new HashSet<>();
        for (Employee emp : employees) {
            salarySet.add(emp.getSalary());
        }

        // Convert to list and sort in descending order
        List<Double> salaryList = new ArrayList<>(salarySet);
        Collections.sort(salaryList, Collections.reverseOrder());

        Double thirdHighest = null;
        if (salaryList.size() >= 3) {
            thirdHighest = salaryList.get(2); // index 2 = 3rd element
        }

        System.out.println("3rd Highest Salary = " + thirdHighest);
    }
}

