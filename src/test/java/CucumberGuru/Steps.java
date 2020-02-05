package CucumberGuru;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
	WebDriver driver;			
	
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }		
    private String customercd="";
    @When("^Create new customer$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	driver.findElement(By.xpath(".//input[@name=\"uid\"]")).sendKeys("mngr242453");							
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("Amuryby");
        driver.findElement(By.xpath(".//input[@name='btnLogin']")).click();	
        
        //Create new Customer
        driver.findElement(By.xpath(".//input[@name='name']")).sendKeys("testing");
        driver.findElement(By.xpath(".//input[@name='dob']")).sendKeys("01011990");
        driver.findElement(By.xpath(".//input[@name='addr']")).sendKeys("tran hung dao");
        driver.findElement(By.xpath(".//input[@name='city']")).sendKeys("hcm");
        driver.findElement(By.xpath(".//input[@name='state']")).sendKeys("quan 1");
        driver.findElement(By.xpath(".//input[@name='pinno']")).sendKeys("123456");
        driver.findElement(By.xpath(".//input[@name='telephoneno']")).sendKeys("023659636");
        driver.findElement(By.xpath(".//input[@name='emailid']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("12345678");
        driver.findElement(By.xpath(".//input[@name='sub']")).click();	           						
    }		

    @Then("^Check new customer$")					
    public void Check_new_customer() throws Throwable 
    {			
    if (driver.findElement(By.xpath("//table[@name=\"account\"]")).isDisplayed())   //if the tablle options is not displayed
    	System.out.println("Create new customer successfully"); 
    
    }		
   
    @When("^Create new account$")					
    public void Create_new_account() throws Throwable 							
    {	//Create new account
    	customercd = (driver.findElement(By.xpath("//table[@name=\"customer\"]//tr[4]//td[2]"))).getText();	     
        driver.findElement(By.xpath(".//input[@name='cusid']")).sendKeys(customercd);
        driver.findElement(By.xpath(".//input[@name='inideposit']")).sendKeys("1234567");
        driver.findElement(By.xpath(".//input[@name='account']")).click();	      						
    }		

    private String accountcd="";
    
    @Then("^Check new account$")					
    public void check_create_new_account() throws Throwable 							
    {	
    	
    	if (driver.findElement(By.xpath("//table[@name=\"account\"]")).isDisplayed())   //if the tablle options is not displayed
    	    	System.out.println("create new account successfully"); 
       				
    }	
    
    @When("^Create deposit$")					
    public void Create_deposit() throws Throwable 							
    {			      
        //Create new Customer
    	accountcd = (driver.findElement(By.xpath("//table[@name=\"account\"]//tr[4]//td[2]"))).getText();	
        driver.findElement(By.xpath(".//input[@name='accountno']")).sendKeys(accountcd);
        driver.findElement(By.xpath(".//input[@name='ammount']")).sendKeys("30000000");
        driver.findElement(By.xpath(".//input[@name='desc']")).sendKeys("deposit testing");
        driver.findElement(By.xpath(".//input[@name='AccSubmit']")).click();
             						
    }		

    @Then("^Check deposit$")					
    public void check_deposit() throws Throwable 							
    {			
       //check submit deposit	
    	if (driver.findElement(By.xpath("//table[@name=\"deposit\"]")).isDisplayed())   //if the tablle options is not displayed
    	System.out.println("Submit deposit successfully"); 
    }		
}