package class13;

public class SplitDemo {
    public static void main(String[] args) {
        String str="I love Merve.She is so cute.I wanna marry with her";
        String [] strArr=str.split("[.]");//splits all dots and makes it an array
        System.out.println(strArr.length);
        System.out.println(strArr[2]);
    }
}
