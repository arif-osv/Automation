package parallel;

import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; //New imports to read XLSX format

//import com.github.javafaker.Faker;

import org.apache.poi.xssf.usermodel.XSSFSheet; //New imports to read XLSX format
import org.apache.poi.ss.usermodel.*;
import java.util.Iterator;
import java.util.Random;
public class Updatexlsx {  
       public static void main(String[] args) throws IOException {
		
		
        	//public void updateEmpdata() throws IOException
        	//{
        //	Faker faker = new Faker();
                //Read Excel document first
                FileInputStream input_document = new FileInputStream(new File("C:\\Users\\Varuna\\Desktop\\payroll_sheet.xlsx"));
                // convert it into a POI object
                XSSFWorkbook my_xlsx_workbook = new XSSFWorkbook(input_document); 
                // Read excel sheet that needs to be updated
                XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);
                // declare a Cell object
                Random rnd = new Random();
                int number = rnd.nextInt(999999);

                Cell cell = null; 
                // Access the cell first to update the value
                cell = my_worksheet.getRow(3).getCell(3);
                // Get current value and reduce 5 from it
                 cell.setCellValue(rnd.nextInt(999999));

                 
                 
                 
                 
                 
                 
                 
                 my_worksheet.getRow(4).getCell(3).setCellValue(rnd.nextInt(9999));
                 my_worksheet.getRow(5).getCell(3).setCellValue(rnd.nextInt(9999));
                 my_worksheet.getRow(6).getCell(3).setCellValue(rnd.nextInt(9999));
                 my_worksheet.getRow(7).getCell(3).setCellValue(rnd.nextInt(9999));

                 my_worksheet.getRow(8).getCell(3).setCellValue(rnd.nextInt(9999));
                 my_worksheet.getRow(9).getCell(3).setCellValue(rnd.nextInt(9999));
                 
                //important to close InputStream
                input_document.close();
                //Open FileOutputStream to write updates
                FileOutputStream output_file =new FileOutputStream(new File("C:\\Users\\Varuna\\Desktop\\payroll_sheet.xlsx"));
                //write changes
                my_xlsx_workbook.write(output_file);
                //close the stream
                output_file.close(); 
                System.out.println("close");
        	} 
        }

