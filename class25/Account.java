package class25;

public class Account {
   private double balance;
    private String accountNumber;
    private String type;
   private String accountTitle;
   public void setBalance(double balance){//sanitizing the input meaning checking the values b4 we can assign them
       if(balance<0){
           System.out.println("Negative balance make a deposit immediately");
       }else {
           this.balance = this.balance + balance;

       }}
public void setAccountNumber(String accountNumber) {
   if(accountNumber.length()!=16){
       System.out.println("Wrong Account Number");
   }else this.accountNumber=accountNumber;
}public String getAccountNumber(){
       return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountTitle(){
       return accountTitle;
   }

    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }



}
class AccountTester{
    public static void main(String[] args) {
        Account a=new Account(-1000,"121KADASADAS","Checking","Timmy");

        System.out.println(a.getAccountTitle());
    }
}

