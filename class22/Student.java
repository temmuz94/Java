package class22;

public class Student {/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism*/
void money(){
    System.out.println("students spends their whole money in first day of month");
}void iq(){
        System.out.println("low");
    }void gender(){
        System.out.println("mostly male");
    }
}class SyntaxStudent extends Student{
    @Override
    void money() {
        System.out.println("Syntax students are rich");
    }@Override void gender(){
        System.out.println("most of the Syntax students are male");
    }
}class CollegeStudent extends Student{
    @Override
    void money() {
        System.out.println("Most college students families are rich af");
    }@Override void iq(){
        System.out.println("college students got average iq level");
    }
}class SchoolStudent extends Student{
    @Override
    void money() {
        System.out.println("School students are poor");
    }@Override void iq(){
        System.out.println("school students iq levels are low");
}}
