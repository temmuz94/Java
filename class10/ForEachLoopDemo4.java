package class10;

public class ForEachLoopDemo4 {
    public static void main(String[] args) {
        int[] arr={10,13,20,25,45,50};
        //We can not update the elements in for each loop beacuse we dont have access to the index!
        for (int x:arr);
    }
}
