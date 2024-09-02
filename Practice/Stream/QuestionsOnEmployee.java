package Practice.Stream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.*;
import java.util.stream.Collectors;

public class QuestionsOnEmployee {

    public static void main(String[] args) throws IOException {
        List<Employee> receivedList = null;

        // client server that receives the list of employees for the main server
        try (Socket socket = new Socket("localhost", 12345)) {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            receivedList = (List<Employee>) in.readObject();
            System.out.println("Received list: " + receivedList);
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // How many male and female employees are there in the organization?
        assert receivedList != null;
        Map<String, Long> npOfMaleAndFemale = receivedList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("\nNumber of male and female employees in the organisation: " + npOfMaleAndFemale);

        // Print the name of all departments in the organization?
        System.out.println("\nDepartments in an organisation: ");
        receivedList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        // What is the average age of male and female employees?
        Map<String, Double> age = receivedList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("\nAverage age of male and female employee: " + age);

        // Get the details of highest paid employee in the organization?
        Optional<Employee> details = receivedList.stream().max(Comparator.comparingDouble(Employee::getSalary));

        Employee highestPaidEmployee = details.get();
        System.out.println("\nDetails Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : " + highestPaidEmployee.getId());
        System.out.println("Name : " + highestPaidEmployee.getName());
        System.out.println("Age : " + highestPaidEmployee.getAge());
        System.out.println("Gender : " + highestPaidEmployee.getGender());
        System.out.println("Department : " + highestPaidEmployee.getDepartment());
        System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());
        System.out.println("Salary : " + highestPaidEmployee.getSalary());

        // Get the names of all employees who have joined after 2015?
        System.out.println("\nEmployees joined after 2015: ");
        receivedList.stream().filter(y -> y.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        // for getting all data of those employees
//        receivedList.stream().filter(y -> y.getYearOfJoining() > 2015).forEach(System.out::println);

        // Count the number of employees in each department?
        System.out.println("\nNumber of employees in each department are as follows: ");
        Map<String, Long> countEmployee = receivedList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = countEmployee.entrySet();
        for (Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // What is the average salary of each department?
        System.out.println("\nAverage salary of each department: ");
        Map<String, Double> salaryD = receivedList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> setEntry = salaryD.entrySet();
        for (Map.Entry<String, Double> entry : setEntry) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the details of youngest male employee in the product development department?
        Optional<Employee> youngEmployee = receivedList.stream().filter(a -> Objects.equals(a.getGender(), "Male") && Objects.equals(a.getDepartment(), "Product Development")).min(Comparator.comparingInt(Employee::getAge));
        Employee youngestMaleEmployeeInProductDevelopment = youngEmployee.get();

        System.out.println("\nDetails Of Youngest Male Employee In Product Development");
        System.out.println("----------------------------------------------");
        System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());
        System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());
        System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());
        System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
        System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());

        // Who has the most working experience in the organization?
        Optional<Employee> experienced = receivedList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        Employee seniorMostEmployee = experienced.get();

        System.out.println("Senior Most Employee Details :");
        System.out.println("----------------------------");
        System.out.println("ID : " + seniorMostEmployee.getId());
        System.out.println("Name : " + seniorMostEmployee.getName());
        System.out.println("Age : " + seniorMostEmployee.getAge());
        System.out.println("Gender : " + seniorMostEmployee.getGender());
        System.out.println("Age : " + seniorMostEmployee.getDepartment());
        System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());
        System.out.println("Salary : " + seniorMostEmployee.getSalary());

        // How many male and female employees are there in the sales and marketing team?
        Map<String, Long> salesAndMarketing = receivedList.stream().filter(d -> Objects.equals(d.getDepartment(), "Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("\nNumber of male and female employees in the sales and marketing team: " + salesAndMarketing);

        // What is the average salary of male and female employees?
        Map<String, Double> averageSalary = receivedList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("\nThe average salary of male and female employees: " + averageSalary);

        // List down the names of all employees in each department?
        Map<String, List<Employee>> employeeNames = receivedList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> allEmployees = employeeNames.entrySet();
        for (Map.Entry<String, List<Employee>> entry : allEmployees) {
            System.out.println("\n--------------------------------------");
            System.out.println("Employees In " + entry.getKey() + " : ");
            System.out.println("--------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

        // What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics salaryAverage = receivedList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("\nThe average salary of whole organization: " + salaryAverage.getAverage() +
                "\nThe total salary of whole organization: " + salaryAverage.getSum());

        // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> ageSeparation = receivedList.stream().collect(Collectors.partitioningBy(a -> a.getAge() > 25));
        Set<Map.Entry<Boolean, List<Employee>>> employeeAge = ageSeparation.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : employeeAge) {
            System.out.println("----------------------------");
            if (entry.getKey()) {
                System.out.println("\nEmployees older than 25 years :");
            } else {
                System.out.println("\nEmployees younger than or equal to 25 years :");
            }
            System.out.println("----------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

        // Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldestEmployee = receivedList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldEmployee = oldestEmployee.get();
        System.out.println("\nName : "+oldEmployee.getName());
        System.out.println("Age : "+oldEmployee.getAge());
        System.out.println("Department : "+oldEmployee.getDepartment());
    }
}
