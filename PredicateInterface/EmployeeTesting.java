package FunctionalInterfaces.PredicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp {
    String name;
    double salary;

    public Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class EmployeeTesting {
    public static void main(String[] args) {
        ArrayList<Emp> l = new ArrayList<>();
        l.add(new Emp("Angad",10000));
        l.add(new Emp("Suraj",12000));
        l.add(new Emp("Niraj",8000));
        l.add(new Emp("Shree",18000));
        l.add(new Emp("Mahesh",15000));
        l.add(new Emp("Veer",4000));

        Predicate<Emp> p = e -> e.salary>10000;
        for (Emp e1 : l) {
            if (p.test(e1)) {
                System.out.println(e1.name+" : "+e1.salary);
            }
        }
    }
}
