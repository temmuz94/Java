package class29.class28;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashSetsDemo4 {
    public static void main(String[] args) {
        HashMap<String,Integer> groceries=new HashMap<>();
        groceries.put("egg",12);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        LinkedHashMap<String,Integer> a=new LinkedHashMap<>();
        System.out.println(groceries.get("egg"));



    }
}
