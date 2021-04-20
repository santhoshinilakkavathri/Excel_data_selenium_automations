import java.io.File;  
import java.io.FileInputStream;  
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class XLSXReaderExample  
{  
public static void main(String[] args)   
{   

 System.setProperty("webdriver.chrome.driver","path");
File file = new File("C:\\demo\\employee.xlsx");   
FileInputStream fis = new FileInputStream(file);   
XSSFWorkbook wb = new XSSFWorkbook(fis);   
XSSFSheet sheet = wb.getSheetAt(0);     

int rows= sheet.getLastRoeNum();
int cols=sheet.getRow(1).getLastCellNum();
WebDriver driver=new ChromeDriver();
driver.get("https://www.bankofamerica.com");
for(int r=0;r<=rows;r++0)
{
  XSSFRow row=sheet.getRow(r);
  for(int c=0;c<clos;c++)
  {
    XSSFCell cell=row.getCell(c);
    driver.findElement(By.xapth("path of element").sendKeys(cell.getStringCellValue()));
}
}

}  
}  