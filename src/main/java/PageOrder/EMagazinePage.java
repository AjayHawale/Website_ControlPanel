package PageOrder;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMagazinePage {
	WebDriver driver;

	@FindBy(xpath = "//div[text()='E-Magazine']")
	WebElement MagazineMod;
	@FindBy(xpath = "//span[text()='ADD MAGAZINES']")
	WebElement AddMagazineBtn;

	@FindBy(xpath = "//input[@id='title']")
	WebElement MagzTitleField;
	@FindBy(xpath = "//input[@id='date']")
	WebElement CalenderField;
	@FindBy(xpath = "//div[text()='Feb']")
	WebElement CalenderMonth;
	@FindBy(xpath = "//span[text()='Upload cover image']")
	WebElement UploadCoverImgBtn;
	@FindBy(xpath = "//span[text()='Upload Magazine File']")
	WebElement UploadMagzPdfBtn;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement AddBtn;

	@FindBy(xpath = "(//div[@class='editBtn'])[1]")
	WebElement EditBtn; // MagzTitleField.clear + sendkeys
	@FindBy(xpath = "//button[@type='submit']/span[text()='Save Changes']")
	WebElement SaveChangesBtn;

	@FindBy(xpath = "(//div[@class='deleteBtn'])[1]")
	WebElement deleteBtn;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default modelDeleteBtn']")
	WebElement ConfirmDelBtn;

	@FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[2]")
	WebElement PaginationForward;
	@FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[1]")
	WebElement PaginationBack;

	public EMagazinePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void MagazineMod() throws InterruptedException {
		MagazineMod.click();
		Thread.sleep(2000);
		AddMagazineBtn.click();
	}

	public void magazineName() throws InterruptedException {
		// random string of length 8 composed of alphabetic characters
		String title = RandomStringUtils.randomAlphabetic(5);
		System.out.println("The New E-Magazine Created  is .. " + title);
		driver.findElement(By.xpath("//*[@placeholder='enter title ']")).sendKeys("NewMagazine" + title);
		Thread.sleep(2000);
		CalenderField.click();
		Thread.sleep(2000);
		CalenderMonth.click();

	}

	public void uploadFile() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement uploadCoverImg = driver.findElement(By.xpath("//span[text()='Upload cover image']"));
		act.moveToElement(uploadCoverImg).click().perform();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Brigosha_Guest\\Desktop\\EventPic.jpg");
		System.out.println("Magazine Cover image is  gets uploaded..");
		Thread.sleep(5000);
		WebElement EventImages = driver.findElement(By.xpath("//span[text()='Upload Magazine File']"));
		act.moveToElement(EventImages).click().perform();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Brigosha_Guest\\Downloads\\ResumeBrigosha.pdf");

		System.out.println("Magazine pdf file is uploaded..");

		Thread.sleep(3000);
		AddBtn.click();
		Thread.sleep(1000);
		System.out.println("Magazine uploaded successfully .");

	}

	public void editMagazine() throws InterruptedException {
		EditBtn.click();
		Thread.sleep(3000);
		MagzTitleField.clear();
		Thread.sleep(3000);
		MagzTitleField.sendKeys("New Title Added");
		System.out.println("Magazine Edit is done..");
	}

	public void DeleteMagazine() throws InterruptedException {
		deleteBtn.click();
		Thread.sleep(2000);
		ConfirmDelBtn.click();
		System.out.println("Magazine deleted successfully");
	}

	public void Nextpagination() throws InterruptedException {

		WebElement NextPaginationBtn = driver.findElement(By.xpath("(//button[@class='ant-pagination-item-link'])[2]"));

		for (int i = 0; i <= 2; i++) {
			NextPaginationBtn.click();
		}

		System.out.println("Forward Pagination working fine in magazines page");

	}

	public void Backpagination() throws InterruptedException {

		WebElement BackwardsPaginationBtn = driver
				.findElement(By.xpath("(//button[@class='ant-pagination-item-link'])[1]"));

		for (int i = 0; i <= 2; i++) {
			BackwardsPaginationBtn.click();
		}


	}

	private void uploadfile(String string) {
		// TODO Auto-generated method stub

	}

}