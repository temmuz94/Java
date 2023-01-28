package class14;

public class Task1a {
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");
         for (int i = str.length()-1; i >=0 ; i--) {System.out.print(str.charAt(i)); }
        System.out.println(" ");}}