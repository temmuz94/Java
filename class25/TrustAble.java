package class25;

public interface TrustAble {
    int age=10;//Constants
    String color="Yellow";
    int trust();
    static void method1(){
        System.out.println("hello");
    }
}class Bank implements TrustAble{

    @Override
    public int trust() {
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(TrustAble.age);

    }}