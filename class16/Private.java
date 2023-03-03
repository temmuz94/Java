package class16;

public class Private {

        private double bankbalance=125000;//very important info
    public String name="Temmuz";//public access level
    String adress="70 Waldwick Ave.";//default access level

    public static void main(String[] args) {
        Private p=new Private();
        System.out.println(p.bankbalance);
        System.out.println(p.adress);

    }
    }



