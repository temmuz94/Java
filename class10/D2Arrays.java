package class10;

public class D2Arrays {
    public static void main(String[] args) {
        String[][] amTrak=new String[3][3];
        String []cabin0={"Temmuz","Merve"};
        String []cabin1={"Yagmur","Hanife"};
        String []cabin2={"Asya","Aygun"};

        amTrak[0]=cabin0;
        amTrak[1]=cabin1;
        amTrak[2]=cabin2;
        System.out.println(amTrak[1][1]);


    }
}
