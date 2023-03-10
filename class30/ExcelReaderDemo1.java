package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        String path="Files/new.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        System.out.println(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);//all numbers are treated as doubles in Excel
        System.out.println(cell);
        System.out.println(row.getCell(1));



    }
}
