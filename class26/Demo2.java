package class26;

public class Demo2 {

    public static boolean searchName(String[] names, String targetName) {
        for (String name : names) {
            if (name.equals(targetName)) {
                return true;
            }
        }
        return false;
    }}



