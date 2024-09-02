package Streams.Collectors;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Student {
    String name;
    int id;
    String subject;
    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        System.out.println("Original List:\n" + studentList);

        // Methods of Streams.Collectors class:
        // 1) Streams.Collectors.toList() -> Collecting top 3 performing students into List
        List<Student> topThreeStudents = studentList.stream().sorted(Comparator.comparingDouble(Student :: getPercentage).reversed()).limit(3).collect(Collectors.toList());
        System.out.println("\nTop three students are: \n" + topThreeStudents);

        // 2) Streams.Collectors.toSet() -> Collecting subjects offered into Set.
        Set<String> subjects = studentList.stream().map(Student :: getSubject).collect(Collectors.toSet());
        System.out.println("\nSet of subjects: " + subjects);

        // 3) Streams.Collectors.toMap() -> Collecting name and percentage of each student into a Map
        Map<String, Double> nameAndPercentage = studentList.stream().collect(Collectors.toMap(Student :: getName, Student :: getPercentage));
        System.out.println("\nStudents name and their percentage:\n" + nameAndPercentage);

        // 4) Streams.Collectors.toCollection() -> Collecting first 3 students into LinkedList
        LinkedList<Student> listStudent = studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList :: new));
        System.out.println("\nLinked-List of students: \n" + listStudent);

        // 5) Streams.Collectors.joining() -> Collecting the names of all students joined as a string
        String joinedName = studentList.stream().map(Student :: getName).collect(Collectors.joining());
        System.out.println("\nList of all the students: " + joinedName);

        // 6) Streams.Collectors.counting() ->  Counting number of students.
        Long studentNum = studentList.stream().collect(Collectors.counting());
        System.out.println("\nNumber of student: " + studentNum);

        // 7) Streams.Collectors.maxBy() -> Collecting highest percentage.
        Optional<Double> highestMarks = studentList.stream().map(Student :: getPercentage).max(Comparator.naturalOrder());
        System.out.println("\nHighest percentage: " + highestMarks.get());

        // 8) Streams.Collectors.minBy() -> Collecting lowest percentage.
        Optional<Double> lowestPercentage = studentList.stream().map(Student :: getPercentage).min(Comparator.naturalOrder());
        System.out.println("\nLowest percentage: " + lowestPercentage.get());

        // 9) summingInt(), summingLong(), summingDouble() -> Collecting sum of percentages
        Double sum = studentList.stream().collect(Collectors.summingDouble(Student :: getPercentage));
        System.out.println("\nSum of all percentage: " + sum);

        // 10) averagingInt(), averagingLong(), averagingDouble() -> Collecting average percentage
        Double average = studentList.stream().collect(Collectors.averagingDouble(Student :: getPercentage));
        System.out.println("\nAverage of all percentage: " + average);

        // 11) summarizingInt(), summarizingLong(), summarizingDouble() ->  Extracting highest, lowest and average of percentage of students
        DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student :: getPercentage));
        System.out.println("\nHighest percentage: "+studentStats.getMax()+"\nLowest percentage: "+studentStats.getMin()+"\nAverage percentage: "+studentStats.getAverage());

        // 12) Streams.Collectors.groupingBy() -> Grouping the students by subject
        Map<String, List<Student>> groupingBySubjects = studentList.stream().collect(Collectors.groupingBy(Student :: getSubject));
        System.out.println("\nGroups based on subjects:\n"+ groupingBySubjects);

        // 13) Streams.Collectors.partitioningBy() -> Partitioning the students who got above 80.0% from who don’t.
        Map<Boolean, List<Student>> partitioning = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));
        System.out.println("\nStudents partitioned by 80%: " + partitioning);

        // 14) Streams.Collectors.collectingAndThen() -> Collecting first three students into List and making it unmodifiable
        List<Student> unmodifiable = studentList.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(), Collections :: unmodifiableList));
        System.out.println("\nUnmodifiable list of students: " + unmodifiable);

        /*unmodifiable.add(new Student("Rahul",25,"Economics",80));
        System.out.println(unmodifiable);*/
    }
}