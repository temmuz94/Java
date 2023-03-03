package class15;

import java.util.Scanner;

public class TaskMethodTest { String createEmail(String x,String y,String z){
    return x+y+"@"+z+".com";
}
    public static void main(String[] args) {
        TaskMethod m=new TaskMethod();
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your user name,last name and email type");
String meme= scan.nextLine();
String meme1= scan.nextLine();
String meme4= scan.nextLine();

        System.out.println(m.createEmail(meme,meme1,meme4));
}}
