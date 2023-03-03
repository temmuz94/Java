package class23;

public class Animal {
    void speak(){
        System.out.println("Animals speaks");
    }
    void eat(){
        System.out.println("Animals eats");
    }
}class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("Cats eats cauliflower");
    }

    @Override
    void speak() {
        System.out.println("Cats says meow");

    }
}class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Dogs says woff");

    } void eat() {
        System.out.println("Dogs eats drones");
}class Bird extends Animal{
    @Override
    void speak() {
        System.out.println("Bird says xiaq");
    } void eat() {
            System.out.println("Birds eats chocolate");
}}}
