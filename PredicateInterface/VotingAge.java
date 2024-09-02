package FunctionalInterfaces.PredicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Voters {
    String name;
    int age;

    public Voters(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return age+" : "+name;
    }
}
public class VotingAge {
    public static void main(String[] args) {
        ArrayList<Voters> l = new ArrayList<>();
        l.add(new Voters("Angad",24));
        l.add(new Voters("Ravi",14));
        l.add(new Voters("Anil",18));
        l.add(new Voters("Ganesh",27));
        l.add(new Voters("Siddhu",22));
        l.add(new Voters("Digvijay",23));

        System.out.println(l+"\nEligible for voting: ");
        Predicate<Voters> p = i -> i.age>18;
        for (Voters n : l) {
            if (p.test(n))
            System.out.println(n.age+" : "+n.name);
        }
    }
}
