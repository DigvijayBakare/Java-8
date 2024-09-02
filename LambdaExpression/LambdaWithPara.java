package LambdaExpression;

@FunctionalInterface
interface ParaString {
    String reverse(String str);
}
public class LambdaWithPara {
    public static void main(String[] args) {
        // declare the reference to the interface and assign the lambda expression
        ParaString p = (str) -> {
            String result = "";
            for (int i=str.length()-1; i>=0; i--)
                result += str.charAt(i);
            return result;
        };

        // call method of the interface
        System.out.println("Reversed String using lambda: "+p.reverse("Java"));
    }
}
