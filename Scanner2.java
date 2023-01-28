import java.util.Scanner;

public class Scanner2 {


    public static void main(String[] args) {


      Scanner input=new Scanner(System.in);
        System.out.println("Whats is ur name");
        String name=input.nextLine();
        System.out.println("Please enter your age?");
        int age=input.nextInt();
        System.out.println("You are "+age+ "Years old");
        System.out.println("Are you hungry");
        boolean hungry=input.nextBoolean();
        System.out.println("Enter your gender");
        char gender=input.next().charAt(0);
      System.out.println("Your gender is "+gender);
      input.close();

    }
}
