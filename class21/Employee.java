package class21;

public class Employee {
    String name;
    int salary=30000;
    int holiday=10;
    void printSalary(){
        System.out.println(salary);
    }
void printHoliday(){
    System.out.println(holiday);
}}
class OfficeBoy extends Employee{
}
class Manager extends Employee{
void printSalary(){
    System.out.println((salary*4)+200000);
}}