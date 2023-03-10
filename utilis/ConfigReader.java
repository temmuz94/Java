package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read() throws IOException {
        String path="Files/config.properties";//Location of the file which we want to read the data
        FileInputStream fileInputStream=new FileInputStream(path);//Class that help us navigate to that file is stored
        Properties properties=new Properties();//Class will assist us to read and write data to.properties
        properties.load(fileInputStream);//Loads all the data from fle inside the above object of properties
        return properties;
    }
}
