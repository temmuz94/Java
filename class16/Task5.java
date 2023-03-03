package class16;

public class Task5 {

    int primeOrNot(int x) {
        boolean flag = false;
        for (int i = 2; i <= x / 2; ++i) {
            // condition for nonprime number
            if (x % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(x + " is a prime number.");
        else
            System.out.println(x + " is not a prime number.");
    return x;}}