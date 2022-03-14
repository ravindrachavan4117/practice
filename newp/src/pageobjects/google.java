package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.*;

@Page(title = "google", summary = "", relativeUrl = "", connection = "Ui")
public class google {
	WebDriver driver;

	public google(WebDriver driver) {
		this.driver = driver;
	}

	public String readToast() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='forceVisualMessageQueue']//div/span")));
		String msg = driver.findElement(By.xpath("//div[@class='forceVisualMessageQueue']//div/span")).getText();
////div[@class='forceVisualMessageQueue']
		return msg;
	}

	@TextType()
	@FindBy(xpath = "//input[@name='q']")
	public WebElement global_search;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Gmail']")
	public WebElement gmail;

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Account \"AccTestDemo\" was saved.']")
	public WebElement hi;

}
