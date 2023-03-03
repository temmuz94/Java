package class23;

public class ComputerTest {
    public static void main(String[] args) {
        Computer []c={new Apple(),new Dell()};
        for (Computer x:c){
            x.browserWebsite();
            x.playVideos();
            Apple a=new Apple();
            a.installingApp();
            if(x instanceof Apple){
            Apple apple=(Apple)x;
            apple.installingApp();
            apple.editVideos();

        }
    }
}}
