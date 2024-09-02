package Practice.Stream;

/*  Write a program to find three employee those having highest salary. */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeNew {
    private int id;
    private String name;
    private double salary;

    public EmployeeNew(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeNew{id=" + id + ", name='" + name + '\'' + ", salary=" + salary + "}";
    }
}

public class HighestSalary {
    public static void main(String[] args) {
        List<EmployeeNew> emp = Arrays.asList(new EmployeeNew(1, "John", 75000.0),
                new EmployeeNew(2, "Alice", 80000.0), new EmployeeNew(3, "Bob", 70000.0),
                new EmployeeNew(4, "Eva", 90000.0), new EmployeeNew(5, "Mike", 85000.0));
        System.out.println("Original list of all employees: ");
        emp.forEach(System.out::println);

        List<EmployeeNew> topThree = emp.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).
                limit(3).collect(Collectors.toList());
        System.out.println("\nTop three highest salaried employees: ");
        topThree.forEach(System.out::println);

        // Fetch all employees having salary less than second highest.
        List<EmployeeNew> lessThanSecond = emp.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).
                skip(2).collect(Collectors.toList());
        System.out.println("\nThe list of all employees having salary less than second highest: ");
        lessThanSecond.forEach(System.out::println);

        // How to find nth highest salary from an EmployeeNew object?
        int n = 3;
        List<EmployeeNew> nthHighest = emp.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).
                distinct().skip(n - 1).limit(1).collect(Collectors.toList());
        if (!nthHighest.isEmpty()) {
            System.out.println("\nThe " + n + "th highest salaried employee: ");
            nthHighest.forEach(System.out::println);
        } else System.out.println("\nThere are not enough unique salaries to find the " + n + "th highest salary.");

    }
}
