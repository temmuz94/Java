package class29;

import java.util.HashSet;
import java.util.Set;

public class HashSetSet {



    }class Student {
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    private String name;
    private int studentID;

    public String getName() {
        return name;
    }
    public int getID(){
        return studentID;
    }
    public static void main(String[] args) {
        Set<Student> obj = new HashSet<>();
        obj.add(new Student("temmuz",12324423));
        obj.add(new Student("yagmur",12235343));
        obj.add(new Student("merve",123435423));
        for (Student student : obj) {
            System.out.println(student.getName()+" : "+student.studentID);


        }



    }}