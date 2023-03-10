package class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/new.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");
        int rowSize= sheet1.getPhysicalNumberOfRows();


        for (int i = 0; i <rowSize ; i++) {
            Row row=sheet1.getRow(i);
            int cellSize=row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellSize; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();


        }

    }
}
