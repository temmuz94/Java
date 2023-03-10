package class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntryMap {
    public static void main(String[] args) {

        Map<String, Double> fruits = new HashMap<>();

        fruits.put("Mandarin", 12.4);

        fruits.put("Banana", 4.9);

        fruits.put("Cucumber", 5.0);

        fruits.put("Strawberry", 4.99);

        fruits.put("Orange", 2.85);

        // print only those elements which contains the letter a or e in their name and prices are more than 8 dollars.
      /*  for (Map.Entry<String, Double> entry : fruits.entrySet()) {

            String key = entry.getKey();

            Double value = entry.getValue();

            if ((key.contains("a") || key.contains("e")) && value > 8.0) {

                System.out.println(key + " : " + value); */
      /*var entrySet=fruits.entrySet();
        for (var entry:entrySet){
            String key= entry.getKey();
            if((key.contains("a")||key.contains("e"))&& entry.getValue()>8){
                //multiple and, or gets wrong output make sure use extra bracket
                System.out.println(key+" "+entry.getValue());*/
        fruits.entrySet().removeIf(entry -> ((entry.getKey().contains("a")) || entry.getKey().contains("e")) && entry.getValue() > 8.0);

        fruits.forEach((key, value) -> System.out.println(key + " : " + value));






    }
        }














