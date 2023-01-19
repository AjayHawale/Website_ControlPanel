package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeGetInTouch {
	WebDriver driver;

	@FindBy(xpath = "(//a[@href='/get-in-touch'])[1]")
	WebElement GetInTouchMod;

	@FindBy(xpath = "//div[@class='ant-row ant-row-center']")
	WebElement LocHeader;

	@FindBy(xpath = "//div[@class='sc-fnykZs ekakDV heading']")
	WebElement LocCardsHeading; // print all office heading

	@FindBy(xpath = "//input[@id='basic_name']")
	WebElement NameField; // scroll upto

	@FindBy(xpath = "//input[@id='basic_email']")
	WebElement MailField;

	@FindBy(xpath = "//input[@class='form-control ']")
	WebElement PhoneNumField;

	@FindBy(xpath = "//textarea[@id='basic_message']")
	WebElement MsgField;
	
	@FindBy (xpath="//button[@type='submit']/span[text()='SUBMIT']")
	WebElement SubmitBtn;

	public WeGetInTouch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FillingFomGIT() {
		
	}

}
