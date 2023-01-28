package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        Scanner xxx=new Scanner(System.in);
        System.out.println("What is the day today?");

        String day= xxx.nextLine();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No Class");

        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
            System.out.println("Java Class");
        } else if (day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual Testing");

        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("Review");

        }else {
            System.out.println("Wrong day entered");
        }


    }
}

