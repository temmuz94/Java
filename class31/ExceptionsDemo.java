package class31;

import utilis.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("lolo1");
        System.out.println("lolo2");

        System.out.println("lolo3");
        try {
            ExcelReader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
