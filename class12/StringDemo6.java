package class12;

public class StringDemo6 {
    public static void main(String[] args) {
String str="abcdef 23124 */+*";
int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                count++;
            } else if (Character.isAlphabetic(i)) ;




        } System.out.println("Total alphabetic characters are in str :"+count);

    }
}
