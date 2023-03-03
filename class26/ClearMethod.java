package class26;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("temmuz");
        names.add("osman");
        names.add("cengiz");
        names.add("yamur");
        names.add("merve");
        System.out.println(names);
        names.clear();
        System.out.println(names);
        System.out.println(names.size());
    }
}
