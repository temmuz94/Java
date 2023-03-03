package class19;

public class User {
    String name;
    double number;
    User(String name,long number){
        this.name=name;
        this.number=number;
    }}
    class UserInfo extends User{
        String address;
        UserInfo(String name,long number,String address){
            super(name, number);
            this.address=address;


        }
    void userDetails(){
        System.out.println("User name is "+name+" and user number is "+number+" user address is "+address);
    }
}
