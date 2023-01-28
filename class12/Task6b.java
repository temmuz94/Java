package class12;

public class Task6b { public static void main(String[] args) {
    String [][] countries={{"USA", "Canada",},{"Germany","UK"},{"Iran","Syria"}};
   int count=0;
    for (int i = 0; i < countries.length; i++) {
        for (int j = 0; j < countries[i].length; j++) {
            System.out.println(countries[i][j]);
            count++;

        }
        System.out.println();
    }System.out.println("Total :"+count);}}