package FunctionalInterfaces.PredicateInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

class HashVoters {
    String name;
    int age;

    public HashVoters(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return age+" : "+name;
    }
}
public class HashMapCheck {
    public static void main(String[] args) {
        HashMap<HashVoters,Integer> l = new HashMap<>();
        l.put(new HashVoters("Angad",24),100);
        l.put(new HashVoters("Ravi",14),100);
        l.put(new HashVoters("Anil",18),100);
        l.put(new HashVoters("Ganesh",27),100);
        l.put(new HashVoters("Siddhu",22),100);
        l.put(new HashVoters("Digvijay",23),100);

        System.out.println(l+"\nEligible for voting: ");

        Predicate<Integer> p = i -> i>18;

        for (Map.Entry<HashVoters,Integer> n : l.entrySet()) {
            String name = String.valueOf(n.getKey());

            if (p.test(Integer.valueOf(name.substring(0,2))))
                System.out.println(n);
        }
    }
}