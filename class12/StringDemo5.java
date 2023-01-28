package class12;

public class StringDemo5 {
    public static void main(String[] args) {
        String str="  t e m     m  u   z    ";
        System.out.println(str.trim());
String str1="      tem   m  uz         ";
        System.out.println(str1);

        String name="Merve";
        boolean name1=name.startsWith("t");
        String name2="Yagmur";
        boolean name3=name2.endsWith("r");
        System.out.println(name1);
        System.out.println(name3);
        System.out.println(name.toLowerCase().startsWith("y"));
        System.out.println(name2.contains("Yag"));
    }
}
