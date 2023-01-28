package class6;

public class SwtichCaseDemo {
    public static void main(String[] args) {

        String country="USA";
        switch (country.toLowerCase()) {// converst the text to the lowercase USA = usa//
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
        }

    }
}
