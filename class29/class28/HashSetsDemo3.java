package class29.class28;

import java.util.*;

public class HashSetsDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(10);
        n.add(24);
        n.add(10);
        Set<Integer> x = new LinkedHashSet<>(n);

        n.clear();
       n.addAll(x);
        System.out.println(n);
    }
}
