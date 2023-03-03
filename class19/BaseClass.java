package class19;

public class BaseClass {
    String name="Temmuz";
    void hello(){
        System.out.println("Hello methods from the BaseClass");
    }
}
class Child extends BaseClass{
    String name="Merve";
    void hello(){
        System.out.println("Hello method from child class");
    }
    void callMeBaby(){
        System.out.println(name);
        System.out.println(super.name);
    }
void callingParrentMethod(){
        hello();
        super.hello();
}
}