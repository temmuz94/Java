package class18;

public class CarThis {

    String make;
    String model;
    int year;
    String color;
    String special;
    CarThis(String make,String model, int year,String color,String special){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.special=special;

    }

    void print(){// this is a method not a constructor
        System.out.println(make+" "+model+" "+year+" "+color+" "+special);
    }
}
