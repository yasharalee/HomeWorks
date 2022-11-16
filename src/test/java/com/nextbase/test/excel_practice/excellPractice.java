package com.nextbase.test.excel_practice;

import com.nextbase.test.utilities.ConfigReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class excellPractice {
    public static void main(String[] args) {
        String xlsxPath = ConfigReader.getProperty("excelPath");

        XSSFSheet sheet = null;

        {
            try {
                FileInputStream file = new FileInputStream(xlsxPath);
                XSSFWorkbook wb = new XSSFWorkbook(file);
                sheet = wb.getSheet("credentials");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (Row each : sheet) {
            Iterator<Cell> cell = each.iterator();

            while (cell.hasNext()){
                System.out.print(cell.next()+" ");
            }
            System.out.println();
        }


    }
}
