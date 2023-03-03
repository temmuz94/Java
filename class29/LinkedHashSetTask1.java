package class29;

import java.util.LinkedHashSet;

public class LinkedHashSetTask1 {
    public static void main(String[] args) {
        LinkedHashSet<String>c=new LinkedHashSet<>();
        c.add("New York City");
        c.add("Antalya");
        c.add("Helsinki");
        c.removeIf(x-> x.startsWith("A")||x.startsWith("a"));//Removes if starts with a or A
        System.out.println(c);
    }
}
