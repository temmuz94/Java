package class32;public class ExceptionsDemo {
    public static void main(String[] args) {

            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Line 3");
            System.out.println("Line 4");
            System.out.println("Line 5");
            System.out.println("Line 6");

            try {
                System.out.println(10/0); // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + (e));


            System.out.println("Line 7");
            System.out.println(10/0);
            System.out.println("Line 9");
        }
        System.out.println("6");


    }}

