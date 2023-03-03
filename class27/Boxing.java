package class27;

public class Boxing {
    public static void main(String[] args) {
        Integer integer=new Integer(23);
        int number=integer;//autoboxing
        int number2=integer.intValue();//unboxing

        double d=12.3f;
        Double wrapperD=new Double(d);//boxing
        Double wrapperP=d;//autoboxing

    }
}
