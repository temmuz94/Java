package class18;

public class TestBankAccountInheritance {
    public static void main(String[] args) {
        BankAccountInheritance ba=new BankAccountInheritance();
        ba.accountNumber=1254234242L;
        ba.money=2000;
        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("-------------------- creating an obj from CheckingAccount Class------------");

        CheckingAccount c=new CheckingAccount();//sub classes cant use others sub classes only can use parent classes
        c.accountNumber=2323;
        c.money=23224l;
        c.interest=29;
        c.transfer();
        System.out.println(c.money);
        System.out.println("------ Creating an obj from SavingAccount CLass");
        SavingAccount sa=new SavingAccount();
        sa.accountNumber=232424l;

    }
}
