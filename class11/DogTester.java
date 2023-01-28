package class11;

import java.util.Scanner;

public class DogTester {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        DogOOP x=new DogOOP();
x.bark();
x.height="2";
x.eat();
x.sleep();
x.name();
x.age();
        System.out.println(x.age);
    }
}
