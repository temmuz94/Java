package class29;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double>fruit=new HashMap<>();
        fruit.put("Fuji Apple",0.5);
        fruit.put("Banana",1.5);
        fruit.put("Ananas",5.5);
        fruit.put("Golden Apple",0.5);
       fruit.put(null,null);
        System.out.println(fruit);


    }
}
