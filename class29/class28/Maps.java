package class29.class28;

import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> countryMap = new TreeMap<>();
        countryMap.put("Turkiye", "Ankara");
        countryMap.put("United States of America", "Washington DC");
        countryMap.put("France", "Paris");
        var values=countryMap.values();
        for (String s : values) {
            System.out.println( s);

        }
    }
}
