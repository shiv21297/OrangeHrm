package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

	public MyInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Personal Details")
	private WebElement personaldetailslink;

	public WebElement getPersonaldetailslink() {
		return personaldetailslink;
	}

}
