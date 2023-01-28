package calss3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scannernumbers2
{
    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);




        int number1, number2, number3;
        System.out.println("Please enter 3 numbers");
        number1=xyz.nextInt();
        number2=xyz.nextInt();
        number3=xyz.nextInt();

        if(number1>number2 && number1>number3){
            System.out.println("Number is the largest "+number1);
        }if(number2>number1 && number2>number3){
            System.out.println("Number 2 is largest "+number2);

        }if(number3>number1 && number3>number2){
            System.out.println("Number 3 is largest "+number3);
        }





    }
}
