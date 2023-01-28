package VeryImportant;

public class TwoDArray1 {
    public static void main(String[] args) {
        int [][] arr={{1,2},{3,4},{5,6}};

        for (int[] mem:arr){
            for(int lol:mem){
                if(lol%2==0)
                System.out.print(lol+" ");

            }
            System.out.println();

        }
    }
}
