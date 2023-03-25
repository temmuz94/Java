package class26;

import java.util.ArrayList;

public class AL2 {
    public static void main(String[] args) {

        ArrayList<String> names =new ArrayList<>();
        names.add("temmuz");
        names.add("merve");
        names.add("yagmur");
        names.add("chris");
        names.add("kristen");
        names.add("daniela");
        System.out.println(names.contains("temmuz"));//
names.remove("kristen");//removes kristen index from the names
        System.out.println(names);
        System.out.println(names.size());
        names.set(3,"emre");
        System.out.println(names);
        System.out.println("index of temmuz is "+names.indexOf("temmuz"));//names.indexOf(""); Shows number of index you ask

    }
}
//add(Object o)
//
//    add(int index, Object o)
//
//    remove(Object o)
//
//    remove(int index)
//
//    set(int index, Object o)
//
//    int indexOf(Object o)
//
//    Object get(int index)
//
//    int size()
//
//    boolean contains(Object o)
//
//    clear()