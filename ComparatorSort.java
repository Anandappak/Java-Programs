
public class EmployeeSortDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Ravi", 55000, new Date(120, 5, 20))); // 2020-06-20
        employees.add(new Employee(1, "Anita", 75000, new Date(119, 2, 15))); // 2019-03-15
        employees.add(new Employee(2, "Suresh", 55000, new Date(121, 8, 10))); // 2021-09-10

        // 1. Sort by Salary
        employees.sort(Comparator.comparing(Employee::getSalary));
        System.out.println("Sorted by Salary:");
        employees.forEach(System.out::println);

        // 2. Sort by Name
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        // 3. Sort by Salary, then Name (tie-breaker)
        employees.sort(
            Comparator.comparing(Employee::getSalary)
                      .thenComparing(Employee::getName)
        );
        System.out.println("\nSorted by Salary then Name:");
        employees.forEach(System.out::println);

        // 4. Sort by Joining Date (Newest first)
        employees.sort(
            Comparator.comparing(Employee::getJoiningDate).reversed()
        );
        System.out.println("\nSorted by Joining Date (Newest first):");
        employees.forEach(System.out::println);
    }
}
