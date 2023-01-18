package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeTeams {
WebDriver driver;

@FindBy(xpath="(//a[@href='/teams'])[1]")
WebElement TeamsModule;

@FindBy(xpath="(//a[@href='/join-us'])[3]")
WebElement JoinUsBtn;// is enabled. click . back

@FindBy (xpath="//div[@class='sc-fLlhyt jCYhGy']")
WebElement LinkInCards;

@FindBy(xpath="(//span[@class='anticon anticon-linkedin'])[1]")
WebElement BSLinkLn;  // click & back













public WeTeams(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void EnterTeamsMod() {
	TeamsModule.click();
	System.out.println("Enter in Teams Module.");
}

public void JoinUsbt() {
boolean e=	JoinUsBtn.isEnabled();
	System.out.println("Join Us button is clickable-"+e);
	JoinUsBtn.click();
	
}



}
