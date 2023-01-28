package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="asaDAdsf023231-2e32";
        System.out.println(str.replaceAll("[A-Z]","*"));//replace all uppercase a to z to *
        System.out.println(str.replaceAll("[a-l]","*"));//replace all lowercases a to l to *
        System.out.println(str.replaceAll("[0-2]","4"));
        System.out.println(str.replaceAll("[0-2]","-"));
        System.out.println(str.replaceAll("[A-Za-z]","+"));
        System.out.println(str.replaceAll("[A-Za-z0-7]","+"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","X"));//^not replace those only replaces special characters
        System.out.println(str.replaceAll("[A-Z0-9]",""));//deletes from our code
        System.out.println(str.replaceAll("[^A-Z0-9a-z]",""));//deletes special characters from the code



    }
}
