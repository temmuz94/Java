package class10;

public class ArrayDemo {
    public static void main(String[] args) {
int [] arr={1,2,3,4,5};
        System.out.println((arr[4])+(arr[3]));
        System.out.println("");
        System.out.println(arr[1]);
        System.out.println("");
        for (int i =0; i < arr.length ; i++) {
            System.out.println(arr[i]);
            System.out.println("");
        }
        for (int number:arr) {
            System.out.println(number);

        }
    }
}
