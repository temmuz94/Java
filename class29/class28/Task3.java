package class29.class28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("hili");
        words.add("lolo");
        words.removeIf(x-> x.endsWith("i"));
        System.out.println(words);
    }
}
