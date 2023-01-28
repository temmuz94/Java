package class4;

public class NestIfDemo6 {

    public static void main(String[] args){
        int money=1000;
        String day="Sunday";
        boolean mood=false;

        if(money>1100){
            if (mood) {
                System.out.println("Lets go shopping");
            }else{
                System.out.println("yalarun");
            }
        }else {
            System.out.println("fuck ma life");
        }


    }
}
