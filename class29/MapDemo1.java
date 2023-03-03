package class29;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(7,"temmuz");
        m.put(2,"merve");
        System.out.println(m);
        System.out.println(m.get(7));//gets key of element
        System.out.println(m.size());
        System.out.println(m.containsKey(2));//checks key boolean
        System.out.println(m.containsValue("temmuz"));//checks boolean
        m.replace(7,"yagmur");
        System.out.println(m);
        m.remove("merve");//removes data
        m.remove(2);


    }
}
