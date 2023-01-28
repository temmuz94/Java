package VeryImportant;

import java.util.Scanner;

public class numBersVERYIMPORTANT {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int num1 = xyz.nextInt();
        int num2 = xyz.nextInt();
        int num3 = xyz.nextInt();
        if (num1 > num2) {
            if ((num1 > num3) && (num2 > num3)) {
                System.out.println("The largest number is " + num1);
            }System.out.println("The largest number is " + num3);
        System.out.println("The largest number is " + num2);
    }else {
            System.out.println("The largest number is " + num3);


        }}}