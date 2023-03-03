package class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Dog");
        words.add("SLa");
        words.add("Sponge Bob");
        words.add("Scheiße");



        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.endsWith("a")) {
                iterator.remove();


        }


    }System.out.println(words);
    }}

