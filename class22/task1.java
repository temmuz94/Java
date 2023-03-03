package class22;

public class task1 {




    double balance;
    double interest;

    public task1(double balance,double interest) {
        this.balance=balance;
        this.interest=interest;
        }



    void calculate(){
        System.out.println("Interest "+(balance*interest)/100);}
class Visa extends task1{
    public Visa(double balance,double interest){
        super(balance,interest);
    }

}public  class Amex extends task1{


        public Amex(double balance,double interest) {

            super(balance, interest);
        }
    public void calculate(){
        System.out.println("Interest "+(balance*interest/100)+30);
    }
}public static void main(String[] args) {
        task1 t = new task1(1090, 12);
        t.calculate();
        task1 t1 = new task1(1090, 12);
        t.calculate();



    }}
