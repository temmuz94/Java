package class31;

import class30.ConfigFileWriteDemo1;
import utilis.ConfigReader;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderRemo {
    public static void main(String[] args) throws IOException {
        Properties properties=ConfigReader.read();
        System.out.println(properties.getProperty("user"));
    }
}
