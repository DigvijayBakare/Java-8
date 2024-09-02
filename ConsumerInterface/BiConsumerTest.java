package FunctionalInterfaces.ConsumerInterface;


import java.util.function.*;
import java.util.ArrayList;

class EmpNew {
    String name;
    double salary;
    EmpNew(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class BiConsumerTest {
    public static void main(String[] args) {
        ArrayList<EmpNew> l = new ArrayList<>();
        populate(l);
        BiConsumer<EmpNew,Double> bc = (e,d) -> e.salary += d;
        for (EmpNew e : l) {
            bc.accept(e,5000.00);
        }
        for (EmpNew e : l) {
            System.out.println("Employee name: "+e.name+"\nEmployee salary: "+e.salary+"\n");
        }
    }
    public static void populate(ArrayList<EmpNew> l) {

        l.add(new EmpNew("Durga",1250));
        l.add(new EmpNew("Naresh", 3412));
        l.add(new EmpNew("Suresh", 2543));
        l.add(new EmpNew("Angad", 5656));
        l.add(new EmpNew("Mahesh", 1325));
        l.add(new EmpNew("Param", 1234));
    }
}

