package class22;

public class StudentTest {
    public static void main(String[] args) {
        Student x[]={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student y:x){
            y.money();
            y.iq();
            y.gender();


        }
    }
}
