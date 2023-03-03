package class24;
interface WashAble{
     void wash();}

 class SmartWatch implements WashAble{
     public void  wash(){

    System.out.println("i am IP65 Rated you can wash me");}

}
class Phone implements WashAble{
      public void wash(){
        System.out.println("i am IP65 Rated you can wash me");
    }
void turnOn(){
    System.out.println("Press the power button to turn me on");
}
}
 class Inverter implements WashAble{
    public void wash(){
        System.out.println("i am IP65 Rated you can wash me");
    }
}