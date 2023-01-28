package class7;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a number");
            number=s.nextInt();
        } while (number != 5);
    }
}
