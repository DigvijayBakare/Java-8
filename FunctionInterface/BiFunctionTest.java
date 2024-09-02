package FunctionalInterfaces.FunctionInterface;

import java.util.function.*;
import java.util.ArrayList;

class Emp {
    String name;
    int eno;
    Emp(int eno, String name) {
        this.name = name;
        this.eno = eno;
    }
}
public class BiFunctionTest {
    public static void main(String[] args) {
        ArrayList<Emp> l = new ArrayList<>();
        BiFunction<Integer,String,Emp> bf = (eno, name) -> new Emp(eno, name);

        l.add(bf.apply(1250,"Durga"));
        l.add(bf.apply(3412,"Naresh"));
        l.add(bf.apply(2543,"Suresh"));
        l.add(bf.apply(5656,"Angad"));
        l.add(bf.apply(1325,"Mahesh"));
        l.add(bf.apply(1234,"Param"));

        for (Emp e : l) {
            System.out.println("Employee number: "+e.eno+"\nEmployee name: "+e.name+"\n");
        }
    }
}
