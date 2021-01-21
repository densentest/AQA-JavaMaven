package com.academy.telesens.Lesson11.Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo {
    public static void main(String[] args) {
        String path1 = "C:\\Users\\denys.sennikov\\Downloads\\dataForAQA\\demo.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path1);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell1 = row.getCell(0);
            Cell cell2 = row.getCell(1);
            fileInputStream.close();
            workbook.close();

            System.out.println(cell1.getStringCellValue() + " " + cell2.getStringCellValue());
        } catch (IOException e){
            System.out.println(e);
        }



    }
}
