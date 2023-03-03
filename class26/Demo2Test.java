package class26;

public class Demo2Test {  public static boolean searchName(String[] names, String targetName) {
    for (String name : names) {
        if (name.equals(targetName)) {
            return true;
        }
    }
    return false;
}}
  class demo2Test2{
      public static void main(String[] args) {
          Demo2Test dd=new Demo2Test();
          String[] names = {"Alice", "Bob", "Charlie", "David"};
          String targetName = "Charlie";
          boolean found = dd.searchName(names, targetName);
          System.out.println(found); // prints true





      }
  }






