package class20;

public class MethodOverload {
    void add(int num1, int num2, int i){
        System.out.println(num1+num2+i);
    }
void  add(int num1,double num2){
    System.out.println(num1+num2);
}
void add(double num2,int num1){
    System.out.println(num1+num2);
}
}

