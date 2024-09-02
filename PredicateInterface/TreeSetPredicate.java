package FunctionalInterfaces.PredicateInterface;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.function.Predicate;

class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    @Override
    public String toString() {
        return roll+" : "+name;
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class TreeSetPredicate {
    public static void main(String[] args) {
        Student s1 = new Student("Anil",103);
        Student s2 = new Student("Veer",180);
        Student s3 = new Student("Ravi",154);
        Student s4 = new Student("Babu",137);
        Student s5 = new Student("Suraj",102);
        Student s6 = new Student("Nil",164);

        TreeSet<Student> t = new TreeSet<>(new StudentComparator());
        t.add(s1);t.add(s4);t.add(s3);t.add(s6);t.add(s2);t.add(s5);
        System.out.println("TreeSet: "+t);

        Predicate<String> p1 = s -> s.length() == 4;
        Predicate<Integer> p2 = i -> i%2 == 0 && i > 150;

        for (Student st : t) {
            if (p1.test(st.name) && p2.test(st.roll)) {
                System.out.println(st.name+" : "+st.roll);
            }
        }
    }
}
