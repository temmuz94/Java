package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {/*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map*/

    public static void main(String[] args) {


    Map<Integer, String> building=new HashMap<>();
    building.put(1,"Riot Gaming");
    building.put(2,"Rockstar Games");
    building.put(3,"Sony Gaming");
    building.put(4,"XBOX");
    building.put(5,"PlayStation");
    building.put(6,"Steam");
    building.put(7,"League of Legends");
    building.put(4,"Korean Airlines");
        System.out.println(building.size());
        building.remove(7);
        System.out.println(building);


        Set<Integer> allKeys=building.keySet();
        System.out.println(allKeys);

        /*for (Integer allKey : allKeys) {
            System.out.println(allKey);*/




        }



}
