package class23;

public class Computer {
    int RAM;
    int hardDisc;
    String OS;
    void playVideos(){
        System.out.println("Video is playing");
    }void browserWebsite(){
        System.out.println("Surf on the internet");
    }

}class Apple extends Computer{
    void playVideos(){
        System.out.println("Playing the video on QuickTime Player");

    }void browserWebsite(){
        System.out.println("Surfing internet on Safari Browser");
    }void editVideos(){
        System.out.println("Editing videos on I-movies");
    }void installingApp(){
        System.out.println("Installing applications on App Store");
    }

}class Dell extends Computer{
    void playVideos(){
        System.out.println("Playing videos on Windows Media Player");

    }void browserWebsite(){
        System.out.println("Surfing internet on Google Chrome");
    }void installingApp(){
        System.out.println("Installing applications on Windows Store");
    }

}
