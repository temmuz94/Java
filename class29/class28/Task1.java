package class29.class28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("hasan");
        names.add("merve");
        names.add("temmuz");
        System.out.println(names.isEmpty());
        if(names.contains("temmuz")){
            System.out.println("yes there is a name");
            System.out.println(names.contains("temmuz"));
            System.out.println(names.size());
            System.out.println(names);
        }
    }

}
