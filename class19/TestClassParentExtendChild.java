package class19;

public class TestClassParentExtendChild extends Parent{
    public static void main(String[] args) {
        TestClassParentExtendChild cd=new TestClassParentExtendChild();
        cd.hello();
        cd.bye();
        Parent.bye();
        TestClassParentExtendChild.bye();
        cd.name="temmuz";
        TestClassParentExtendChild.lastName="gokcen";//static can only accesible within class name on it

    }
}
