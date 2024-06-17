package excelLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		File file=new File(System.getProperty("user.dir")+"/employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		
		String data=sheet.getRow(0).getCell(0).toString();
		System.out.println(data);
		
		
		int r=sheet.getLastRowNum();
		int c=sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<=r;i++)
		{
			
			for(int j=0;j<c;j++)
			{
				if(sheet.getRow(i).getCell(j).toString().equals("4.0"))
				{
				//System.out.print(sheet.getRow(i).getCell(j).toString()+"\t\t\t");
					System.out.println(sheet.getRow(i).getCell(2).toString()+" is emp salary");
					System.out.println(sheet.getRow(i).getCell(4).toString()+" is emp dept");
					
				}
			}
			System.out.println();
		}
		
//		for(int j=0;j<c;j++)
//		{
//			System.out.print(sheet.getRow(4).getCell(j).toString()+"\t\t\t");
//		}
//		System.out.println();
//		for(int j=0;j<r;j++)
//		{
//			
//			System.out.println(sheet.getRow(j).getCell(4).toString()+"\t\t\t");
//		}
		
		
		
	}

}
