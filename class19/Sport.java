package class19;

public class Sport {
    String name;
    String country;

    Sport(String name, String country) {
        this.name = name;
        this.country = country;

    }

    public void display() {
        System.out.println(name+" is played in " + country);
    }
}
class Cricket extends Sport {
    String helmet;
    Cricket(String name, String country,String helmet) {
        super(name, country);
        this.helmet=helmet;

    }
}
class Soccer extends Sport{
    String jersey;
    String ball;
    Soccer(String name,String country,String jersey){
        super(name, country);
        this.jersey=jersey;

    }
    void displaySoccer(){
        System.out.println(country+" has "+jersey+" color jersey ");
    }
}