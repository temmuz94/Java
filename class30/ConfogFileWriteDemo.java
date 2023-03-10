package class30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfogFileWriteDemo {
    public static void main(String[] args) throws IOException {
     String path="Files/test.properties";
        FileOutputStream fileOutputStream =new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Name","Temmuz");
        properties.store(fileOutputStream,"A new name has been added");

    }
}
