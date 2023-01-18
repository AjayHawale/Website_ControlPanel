package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WeGetInTouch {
WebDriver driver;


public WeGetInTouch(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



}
