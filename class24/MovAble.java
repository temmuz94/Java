package class24;

public interface MovAble {
    void move();
} interface Ownable{
    void own();

}
class Car implements MovAble,Ownable{//multiple inheritance in interface

    @Override
    public void move() {
        System.out.println("i can move");

    }

    @Override
    public void own() {

    }
}
class Dog implements MovAble{

    @Override
    public void move() {
        System.out.println("I can move");

    }
}