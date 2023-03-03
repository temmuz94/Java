package class18;

public class ConstructerDonkey {//Default Constructor
    String name;
    int age;

    void print() {
        System.out.println("Donkeys name is " + name + " and donkeys age is " + age);
    }

    ConstructerDonkey(String donName, int donAge) {
        name = donName;
        age = donAge;


    }
}