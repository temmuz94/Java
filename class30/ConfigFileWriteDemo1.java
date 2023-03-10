package class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {
        String path="Files/newtest.properties";
        FileOutputStream fileOutputStream =new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Merve","Temmuz");
        System.out.println(properties.get("Merve"));
        properties.store(fileOutputStream,"mission accomplished");
        System.out.println(properties.contains("Temmuz"));


    }
}
