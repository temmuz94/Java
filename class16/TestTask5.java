package class16;

import java.util.Scanner;

public class TestTask5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Task5 t=new Task5();
        System.out.println("Please enter a number");
        int y=scan.nextInt();
        t.primeOrNot(y);
    }
}
