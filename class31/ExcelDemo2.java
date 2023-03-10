package class31;

import utilis.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> excelData= ExcelReader.read();
        for (Map<String, String> excelDatum : excelData) {
            for (var entry : excelDatum.entrySet()) {//for(Map.Entry<String> enry.row.enrySe())
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("************");

            }
        }

        }
