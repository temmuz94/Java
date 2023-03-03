package class18;

public class ConstructorChain {
    ConstructorChain(){
        System.out.println("i am non argument constructor");
    }
    ConstructorChain(String str){
        this();
        System.out.println(str);

    }
    ConstructorChain(int n){
        this("hello");
        System.out.println("This is constructor with int parameter");
    }

    public static void main(String[] args) {
        ConstructorChain c=new ConstructorChain(10);
        System.out.println("-----------------------End of the code------------------------------------");
    }
}
