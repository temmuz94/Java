package class29.class28;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntrySetDemo {
    public static void main(String[] args) {


                Set<Entry> entry=new LinkedHashSet<>();
                entry.add(new Entry(1,"Nezir"));
                entry.add(new Entry(2,"temmuz"));
                entry.add(new Entry(3,"hasan"));
                entry.add(new Entry(4,"cengiz"));
                entry.add(new Entry(5,"yagmur"));
                entry.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entry.toString());
    }

    }

