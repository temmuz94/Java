package class15;

public class MethodReverse1 { String reverseStr1(String input){
    return new StringBuilder(input).reverse().toString();
}

    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
