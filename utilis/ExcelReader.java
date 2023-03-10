package utilis;

;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

     public static List<Map<String, String>> read() throws IOException {
         String path="Files/Book1.xlsx";
         FileInputStream fileInputStream=new FileInputStream(path);
         XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
         Sheet sheet2=xssfWorkbook.getSheet("Sheet1");
         List<Map< String, String>> excelData=new ArrayList<>();
         Row row0=sheet2.getRow(0);
         for (int i = 1; i <sheet2.getPhysicalNumberOfRows(); i++) {
             Row row= sheet2.getRow(i);
             LinkedHashMap<String, String> rowMap=new LinkedHashMap<>(); //u can use var instead of LinkedHashMap<String, String>
             for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                 rowMap.put(row0.getCell(j).toString(),row.getCell(j).toString());
             }excelData.add(rowMap);
         }return excelData;
     }

    }

