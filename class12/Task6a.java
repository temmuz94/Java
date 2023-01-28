package class12;

public class Task6a { public static void main(String[] args) {
    String[][] countries = {{"USA", "Canada",}, {"Germany", "UK"}, {"Iran", "Syria"}};
    for (int i = 0; i < countries.length; i++) {
        for (int j = 0; j < countries[i].length; j++) {
            System.out.println(countries[i][j]);
        }
    }
}}