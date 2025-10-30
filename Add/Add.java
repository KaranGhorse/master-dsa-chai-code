package Add;
import java.math.BigInteger;

public class Add {
     public String addStrings(String num1, String num2) {
        // num1: String, a string representation of a non-negative integer
        // num2: String, a string representation of a non-negative integer
        // Return the sum of num1 and num2 as a string

        BigInteger  a = new BigInteger(num1);
        BigInteger  b = new BigInteger(num2);
        return a.add(b).toString();
    }

    public static void main(String[] args) {
        Add p = new Add();
        System.out.println(p.addStrings("12345678901234567890","98765432109876543210"));
    }
}
