# Excel_data_selenium_automations
Apache POI uses certain terms to work with Microsoft Excel. Let’s get familiar with these before we go into the details of the code.

**Term: Details**
Workbook:	A workbook represents a Microsoft Excel file. It can be used for creating and maintaining the spreadsheet. A workbook may contain many sheets.
Sheet:	A sheet refers to a page in a Microsoft Excel file that contains the number of rows and columns.
Row	A :row represents a collection of cells, which is used to represent a row in the spreadsheet.
Cell:	A cell is indicated by a row and column combination. Data entered by a user is stored in a cell. Data can be of the type such as string, numeric value, or formula.
API: Application Programming Interface. This is the set of “commands” you use to manipulate WebDriver.
Library: A code module which contains the APIs and the code necessary to implement them. Libraries are specific to each language binding, eg .jar files for Java, .dll files for .NET, etc.
Driver: Responsible for controlling the actual browser. Most drivers are created by the browser vendors themselves. Drivers are generally executable modules that run on the system with the browser itself, not on the system executing the test suite. (Although those may be the same system.) NOTE: Some people refer to the drivers as proxies.
**Adding Executables to your PATH**
Most drivers require an extra executable for Selenium to communicate with the browser. You can manually specify where the executable lives before starting WebDriver, but this can make your tests less portable as the executables will need to be in the same place on every machine, or include the executable within your test code repository.
**Locating one element**
One of the most fundamental techniques to learn when using WebDriver is how to find elements on the page. WebDriver offers a number of built-in selector types, amongst them finding an element by its ID attribute
**CODE**
WebDriver driver = new FirefoxDriver();

driver.get("http://www.google.com");

// Get search box element from webElement 'q' using Find Element
WebElement searchBox = driver.findElement(By.name("q"));

searchBox.sendKeys("webdriver");
