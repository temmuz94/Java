package class19;

class Parent {
    String name;
    static String lastName;
    Parent(){
        System.out.println("I am a parent class constructor");
    }

    public static void main(String[] args) {
        Parent p=new Parent();
    }
public void hello(){
    System.out.println("public method -> hello from the parent class");
}
protected static void bye(){
    System.out.println("projected method -> bye from the parent class");
}
private void money(){
    System.out.println("private method -> bye from the parent class");
}
}
