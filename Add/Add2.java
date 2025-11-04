package Add;

public class Add2 {
     public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();

        // Loop until both strings are processed or carry is left
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);

            i--;
            j--;
        }

        // Reverse because we added from last to first
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Add2 p = new Add2();
        System.out.println(p.addStrings("12345678901234567890","98765432109876543210"));
        
    }
}
