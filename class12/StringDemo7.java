package class12;

public class StringDemo7 {
    public static void main(String[] args) {
      String str="java";
        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("va"));//shows where it stars
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+ " has the index "+i);

        }



    }
}
