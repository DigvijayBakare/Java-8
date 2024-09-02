package FunctionalInterfaces.ConsumerInterface;

import java.util.function.*;

class StudentMarks {
    String name;
    int marks;
    StudentMarks(String name, int marks) {
        this.name =  name;
        this.marks = marks;
    }
}
public class ConsumerTest1 {
    public static void main(String[] args) {
        Function<StudentMarks,String> f = s -> {
            int mar = s.marks;
            String grade ="";
            if (mar >= 80) grade = "A[Distinction]";
            else if (mar >= 60) grade = "B[First class]";
            else if (mar >= 50) grade = "C[Second class]";
            else if (mar >= 35) grade = "D[Third class]";
            else grade = "E[Failed]";
            return grade;
        };
        Predicate<StudentMarks> p = s -> s.marks >= 60;
        Consumer<StudentMarks> c = s -> {
            System.out.println("Student name: "+s.name);
            System.out.println("Student marks: "+s.marks);
            System.out.println("Student grade: "+f.apply(s));
            System.out.println();
        };
        StudentMarks[] s = {
                new StudentMarks("Durga",100),
                new StudentMarks("Sunny",65),
                new StudentMarks("Angad",55),
                new StudentMarks("Rohit",45),
                new StudentMarks("Gagan",30),
                new StudentMarks("Zebra",35),
        };
        for (StudentMarks s1 : s) {
            if (p.test(s1)){
                c.accept(s1);
            }
        }
    }
}
