package class23;

public abstract class Animal1 {
    abstract void speak();
    void color(){
        System.out.println("lele");
    }
}class Dog1 extends Animal1{

    @Override
    void speak() {
        System.out.println("wuff wuff");
    }
}class Cat1 extends Animal1{
    @Override
    void speak() {
        System.out.println("meow");
    }
}
