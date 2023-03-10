package class30;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ExcelReaderDemo3 {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, String>row1=new LinkedHashMap<>();
        row1.put("Name","Temmuz");
        row1.put("Age","33");
        row1.put("City","Waldwick");
        row1.put("Salary","120000");
        LinkedHashMap<String, String>row2=new LinkedHashMap<>();
        row2.put("Name","Merve");
        row2.put("age","29");
        row2.put("city","Waldwick");
        row2.put("Salary","145000");

        List<Map<String, String>> allRows=new ArrayList();
        allRows.add(row1);
        allRows.add(row2);
        System.out.println(allRows);
}}

