package Practice.Collection;

// sorting the list of employees using Comparator by using lambda expression

import java.util.ArrayList;
import java.util.Collections;

class EmployeeTest {
    String name;
    int eNo;
    EmployeeTest(String name, int eNo) {
        this.name = name;
        this.eNo = eNo;
    }
    @Override
    public String toString() {
        return eNo+" : "+name;
    }
}
public class Employee {
    public static void main(String[] args) {
        ArrayList<EmployeeTest> l = new ArrayList<>();
        l.add(new EmployeeTest("Durga",122545));
        l.add(new EmployeeTest("Ravi",524631));
        l.add(new EmployeeTest("Nil",253344));
        l.add(new EmployeeTest("Shree",546327));
        l.add(new EmployeeTest("Mahesh",853215));
        l.add(new EmployeeTest("Veer",859617));

        System.out.println("Original list: "+l);

        // for ascending order of eNo and name it is taking like an inbuilt function so sorted it in reverse order
        Collections.sort(l,(e1,e2) -> e2.eNo- e1.eNo);          // reverse order of eNo
        System.out.println("After sorting the list reverse of eNo: "+l);

        Collections.sort(l,(e1,e2) -> e2.name.compareTo(e1.name));      // reverse order of name
        System.out.println("After sorting the list reverse of name: "+l);
    }
}
