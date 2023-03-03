package class29.class28;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashSetDemo7 {/*Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Map<String, String> countryMap = new TreeMap<>();
        countryMap.put("Turkiye", "Ankara");
        countryMap.put("United States of America", "Washington DC");
        countryMap.put("France", "Paris");

        /*for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
            System.out.println(countryMap.toString());

            System.out.println(" ");*///instead of this use var

        var entrySet=countryMap.entrySet();
        for (var entry:entrySet){
            System.out.println(entry.getValue()+" "+entry.getKey());





        }

    }
}
