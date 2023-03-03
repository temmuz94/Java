package class24;

public class MovAbleTester {
    public static void main(String[] args) {
        WashAble w[]={new SmartWatch(),new Phone(),new Inverter(),new Inverter()};
        for(WashAble x:w){
            x.wash();

        }
    }
}
