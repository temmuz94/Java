import java.util.Scanner;

public class calss82 {
    public static void main(String[] args) {
        Scanner fetch=new Scanner(System.in);
        System.out.println("Please Enter the number");
        int x=fetch.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(i+" "); // print prints the numbers on the same line +" " adds space after each number
        }
        System.out.println();
    }
}
