package class18;

public class BankAccountInheritance {//parent or super class, base class

    long accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit");
    }

}
class CheckingAccount extends BankAccountInheritance{//child or sub , derived class

    double interest;
    void transfer(){
        System.out.println("transfer methods from CheckingAccount class");
    }}
    class SavingAccount extends BankAccountInheritance{
        double profit;
        void takeProfit(){
            System.out.println("Profit method from SavingAccount class");
        }

    }
