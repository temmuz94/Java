package class18;

public class ThisConstructor {
    int a;
    int b;
    ThisConstructor(int a,int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        ThisConstructor t=new ThisConstructor(10,20);
        System.out.println(t.a);
    }
    }



