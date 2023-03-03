package class21;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("animals can speak");
    }
    void eat(){
        System.out.println("animals can eat");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meaaww");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("howhow");
    }
}
class TestAnimal{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
        Animal a=new Animal();
        a.speak();
        Dog d=new Dog();
        d.speak();
    }
}