package class12;

public class StringDemo2 {
    public static void main(String[] args) {

        String firstName="Temmuz";
        String lastName="Gokcen";
        System.out.println(firstName + lastName);// most widely used
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(firstName.concat(" "+lastName));
    }
}
