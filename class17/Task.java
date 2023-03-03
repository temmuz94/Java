package class17;

public class Task {
    public static void main(String[] args) {
        System.out.println(getOnlyVowels("java"));
    }

       private static String getOnlyVowels(String inputStr){//put static for the use in main
            return inputStr.replaceAll("[^AEIOUYaeiouy]","");

        }
    }

