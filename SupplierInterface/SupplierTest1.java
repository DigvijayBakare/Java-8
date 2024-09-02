package FunctionalInterfaces.SupplierInterface;

import java.util.function.*;
import java.util.Date;

public class SupplierTest1 {
    public static void main(String[] args) {
        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());

        // otp generation using supplier functional interface
        Supplier<String> s2 = () -> {
            String otp = "";
            for (int i=0; i<6; i++) {
                otp += (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("OTP: "+s2.get());
    }
}
