package class7;

import java.util.Scanner;

public class whileRecap {
    public static void main(String[] args) {
        boolean cond=true;
        Scanner s=new Scanner(System.in);
        int n=15;
        while (cond){
            System.out.println("Please enter a number between 10 to 20");
            int u= s.nextInt();
            if(u>n){
                System.out.println("You entered number is greater");


        } else if (u<n) {
                System.out.println("you entered smaller number");

            }else {
                System.out.println("you won");
                cond=false;
        }
}}}
