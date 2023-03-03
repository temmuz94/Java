package class16;

public class Task3 {

        void ispalindrome(String x) {
            StringBuilder xy = new StringBuilder(x);
            xy.reverse();
            String reversedx = toString();
            if (x.equals(reversedx)) {
                System.out.println(xy + "is palindrome");
            } else System.out.println(xy +" is not palindrome");

        }}

