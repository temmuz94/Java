package class16;

public class StudentTest {
    public static void main(String[] args) {
Students s=new Students();
s.name="temmuz";
s.id="1234";
s.numberOfStudents=2;
        s.numberOfStudents++;

        Students s1=new Students();
        s1.name="temmuz";
        s1.id="1234";
        s1.numberOfStudents=2;
      s1.numberOfStudents++;
        System.out.println(s.numberOfStudents);
        System.out.println(s1.numberOfStudents);




    }
}
