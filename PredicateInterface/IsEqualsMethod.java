package FunctionalInterfaces.PredicateInterface;

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class IsEqualsMethod {
    String name,role;
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    IsEqualsMethod(String name, String role) {
        this.name = name;
        this.role = role;
    }
    @Override
    public String toString() {
        return "User name: "+name+", Role: "+role;
    }
    public static void main(String[] args) {
        List<IsEqualsMethod> user = new ArrayList<>();
        user.add(new IsEqualsMethod("John","admin"));
        user.add(new IsEqualsMethod("Peter","member"));
        List admin = process(user, (IsEqualsMethod is) -> is.getRole().equals("admin"));
        System.out.println(admin);
    }
    public static List<IsEqualsMethod> process(List<IsEqualsMethod> user,Predicate<IsEqualsMethod> p) {
        List<IsEqualsMethod> result = new ArrayList<>();
        for (IsEqualsMethod is : user){
            if (p.test(is)) {
                result.add(is);
            }
        }
        return result;
    }
}
