package class29.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> n = new ArrayList<>();
        n.add(2.2);
        n.add(4.5);
       /* n.add(6.2);
        n.add(8.8);
        n.add(10.9);
        n.add(9.1);*/
        n.removeIf(y -> y>9);
        System.out.println(n);
       Iterator<Double> iterator=n.iterator();
        System.out.println(n);
        System.out.println(iterator.hasNext());//gives us if has element or not
        System.out.println(iterator.next());
        System.out.println(iterator.next());//move it next element
        System.out.println(iterator.hasNext());
       // System.out.println(iterator.next());//error cuz there is no more next element
       while (iterator.hasNext()){
          double num=iterator.next();
          if(num>1){
              iterator.remove();

          }


       }

        }

    }
