package pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class LoginDemoAutusingExcel {
	
 	WebDriver driver;
	
 	
  @Test
  public void f() {
	  
	 
	  
	  LoginPage obj = new LoginPage(driver);
		obj.typeUsername("sheet1.getRow(0).getCell(0).getStringCellValue()");
		obj.typePwd("");
		obj.clickSubmit();
		System.out.println(driver.getTitle());
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	  
	File src = new File("C:\\Users\\training_c2d.02.12\\Desktop\\geckodriver-master\\data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis) ;
		//HSSFWorkbook - for xls file
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
  }

  @AfterClass
  public void afterClass() {
  }

}
