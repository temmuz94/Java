package class14;

public class Task {
    public static void main(String[] args) {
        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");
        for(String word:arr){
        StringBuilder st=new StringBuilder(word);
        st.reverse();
        System.out.print(st);
        System.out.print(" ");

        //for(String word:arr){// easy way to convert and print reverse
          //  System.out.println(new StringBuilder(word).reverse())+" ");

        }
    }}

