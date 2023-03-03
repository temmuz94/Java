package class29.class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo6 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Shah");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "temmuz");
        Collection<String> values = studentsMap.values();
        System.out.println(values);
        Set<Integer> key = studentsMap.keySet();
        key.removeIf(x -> x > 2);
        values.removeIf(x -> x.contains("i"));
        System.out.println(studentsMap);


        Set<Map.Entry<Integer, String>> entrySet = studentsMap.entrySet();//stores both keys and values
        for (Map.Entry<Integer, String> integerStringEntry : entrySet) {
            System.out.println(integerStringEntry.getKey());
            System.out.println(integerStringEntry.getValue());
            System.out.println(integerStringEntry.getValue()+" "+integerStringEntry.getKey());
            entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));//removes both keys and values were asked
        }
    }}
