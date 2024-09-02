package Practice.Examples;

// print largest among the three numbers using ternary operator

public class TernaryEx1 {
    public static void main(String[] args) {
        // declare three numbers and print them
        int a=10, b=20, c=30, result, res;
        System.out.println("The numbers are:\nA = "+a+"\tB = "+b+"\tC = "+c);

        // use ternary operator for finding largest number
        result = ((a>b)?(a>c)? a: c:(b>c)?b:c);
        System.out.println("Maximum number is "+result);

        //
        res = ((a<b)?(a<c)? a:(b<c)?b:(c<a)?c:a:b);
        System.out.println(res);
    }
}
