import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExecution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	DataDriven dataset = new DataDriven();
		//PracticeColum dataset = new PracticeColum();
		//Coloum dataset = new Coloum();
		
		ArrayList<String> data = dataset.GetData("Add Profile");
		//ArrayList<String> data = dataset.GetData("Value2","TestCase2");
		
		//System.out.println("ghg");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

		*/
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");

	    //Create an object of ReadGuru99ExcelFile class

	    Coloum objExcelFile = new Coloum();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";

	    //Call read file method of the class to read data

	    Object [][] data = objExcelFile.datalist(filePath,"DemoData.xlsx","TestData2");
	    
	    
	    for (int i=0; i<6; i++)
	    {
	    	for(int j=0; j<2; j++)
	    	{
	    		if(j==0) {
	    		driver.findElement(By.xpath("//input[@id='username']")).sendKeys((data[i][j]).toString()); }
	    		
	    		if(j==1) {
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys((data[i][j]).toString());}
	    		

	    	}		
	    	driver.findElement(By.xpath("//input[@id='Login']")).click();
	    }

	}

}
