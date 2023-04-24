package stepDefinition;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import commerceform.utilities.Dropdowns;
import commerceform.utilities.Highlight;
import commerceform.utilities.Screenshots;
import commerceform.utilities.Staticwaits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pom.Apparelmodule;
import pom.Jewelry;
import pom.Loginpage;
import pom.Pageobjectmodel;



public class StepDefinition {
	
WebDriver driver =null;

@Given("open the browser")
public void open_the_browser() throws IOException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver = new ChromeDriver();
//headless
//ChromeOptions options = new ChromeOptions();
//	options.addArguments("headless");
//driver = new ChromeDriver(options);
}

@When("user enter the url {string}")
public void user_enter_the_url(String string) throws IOException{
	driver.get("https://demo.nopcommerce.com");
	driver.manage().window().maximize();
	Screenshots.capture(driver);
}

@Then("click on the Register")
public void click_on_the_register() throws IOException{
	Highlight h = new Highlight(driver);
	h.high();
	Screenshots.capture(driver);
	Pageobjectmodel rp=new Pageobjectmodel(driver);
    rp.Register();
	Screenshots.capture(driver);
}

@When("click on the Gender")
public void click_on_the_gender() throws IOException{
	Pageobjectmodel rp=new Pageobjectmodel(driver);
	 rp.gender();
	 Screenshots.capture(driver);
	
}

@Then("Enter a Firstname  {string}")
public void enter_a_firstname(String string) throws Exception{
	Pageobjectmodel rp=new Pageobjectmodel(driver);
	 rp.firstname(string);
	 Screenshots.capture(driver);
}

@When("enter a Lastname {string}")
public void enter_a_lastname(String string) throws IOException{
	Pageobjectmodel rp=new Pageobjectmodel(driver);
	 rp.lastname(string);
	 Screenshots.capture(driver);

}
@Then("enter a dob {string}")
public void enter_a_dob(String string) throws IOException{
	Dropdowns e = new Dropdowns(driver);
	e.dof();
	Staticwaits. staticShortWait();
	e.mon();
	Staticwaits. staticShortWait();
	e.year();
	 Screenshots.capture(driver);
	 Staticwaits. staticShortWait();
}

@Then("Enter a Email {string}")
public void enter_a_email(String string) throws IOException{
	Pageobjectmodel rp=new Pageobjectmodel(driver);
	 rp.mail(string);
	 rp.cname(null);
	 Screenshots.capture(driver);
}

@When("enter the Password\"<password>\"")
public void enter_the_password_password1() throws IOException{
	Pageobjectmodel rp=new Pageobjectmodel(driver);
	 rp.password(null);
	 Screenshots.capture(driver);
}

@Then("Enter a  ConfirmPassword {string}")
public void enter_a_confirm_password(String string) throws IOException{
	Pageobjectmodel rp=new Pageobjectmodel(driver);
	 rp.confirmpassword(null);
	 Screenshots.capture(driver);
	 
}

@When("click on a Register button")
public void click_on_a_register_button() throws IOException{
	Pageobjectmodel rp=new Pageobjectmodel(driver);
	 rp.Registerbutton();
	 Screenshots.capture(driver);
}

@Then("click on the Login")
public void click_on_the_login() throws IOException{
	
Loginpage rp=new Loginpage(driver);
rp.login();
Staticwaits. staticShortWait();
Highlight h1 = new Highlight(driver);
h1.high1();
Screenshots.capture(driver);
Staticwaits. staticShortWait();
}

@When("enter the email\"<email>\"")
public void enter_the_email_email() throws IOException{
Loginpage rp=new Loginpage(driver);
rp.loginEmail(null);
Screenshots.capture(driver);
Staticwaits. staticShortWait();

}

@When("enter the password\"<password>\"")
public void enter_the_password_password() throws IOException{
Loginpage rp=new Loginpage(driver);
rp.loginP(null);
Screenshots.capture(driver);
Staticwaits. staticShortWait();
}

@Then("click on the login button")
public void click_on_the_login_button() throws IOException{
Loginpage rp=new Loginpage(driver);
rp.log();
Screenshots.capture(driver);
Staticwaits. staticShortWait();
	
Apparelmodule r = new Apparelmodule(driver);
	r.app();
	Screenshots.capture(driver);
	Staticwaits. staticShortWait();
	Highlight h2 = new Highlight(driver);
    h2.high3();
    Screenshots.capture(driver);
    Staticwaits. staticShortWait();
   r.app1();
   Staticwaits. staticShortWait();

	Jewelry click = new Jewelry(driver);
	click.jew();
	Staticwaits. staticShortWait();
	click.cart();
	
	
	
	
	
	
	
	
	
	
	
	
	//click.shopping();
	//click.shop();
	//
	//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();
	//headless
	//ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
	//driver = new ChromeDriver(options);
	
	
	
	
}



}

