package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Dashboard")
	private WebElement dashboardlink;
	@FindBy(linkText = "PIM")
	private WebElement pimlink;

	public WebElement getPimlink() {
		return pimlink;
	}

	@FindBy(linkText = "My Info")
	private WebElement myInfolink;

	public WebElement getDashboardlink() {
		return dashboardlink;
	}

	public WebElement getMyInfolink() {
		return myInfolink;
	}
}
