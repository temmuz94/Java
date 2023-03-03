package class17;

public class Student {
    String id;
    String name;
    int age;
    double weight;

    Student(String sId,String sName,int sAge,double sWeight){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;


    }
void info(){
    System.out.println("Student Id is "+id+" Student name is "+name+" Student age is "+age+" Student weight is "+weight+" lbs");
}

}
