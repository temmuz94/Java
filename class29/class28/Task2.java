package class29.class28;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> car=new ArrayList<>();
        car.add("BMW");
        car.add("Benz");
        car.add("Audi");
        System.out.println(car);
        for (String s : car) {
            System.out.println(s);
            
        }
        for (int i = 0; i <car.size() ; i++) {
            String cars=car.get(i);
            System.out.println(cars);

        }
    }
}
