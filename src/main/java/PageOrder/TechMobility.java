package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TechMobility {
WebDriver driver;



public TechMobility(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
