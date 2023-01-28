package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers= new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
