package class27;

import java.util.ArrayList;

public class LinkedListvsArrayList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
       ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0, "Test Data");


        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}