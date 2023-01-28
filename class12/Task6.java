package class12;

public class Task6 {
    public static void main(String[] args) {
        String [][] countries={{"USA", "Canada",},{"Germany","UK"},{"Iran","Syria"}};
        for (String[] country : countries)
            for (int j = 0; j < country.length; j++) {
                System.out.println(country[j]);
            }
        {

        }
    }
}
