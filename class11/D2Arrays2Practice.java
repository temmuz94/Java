package class11;

public class D2Arrays2Practice {
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {

            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <=4 ; i++) {

            for (int j = 0; j <4-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
