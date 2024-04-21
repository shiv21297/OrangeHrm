package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {

	public PersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstName")
	private WebElement firstNameLink;
	@FindBy(name = "middleName")
	private WebElement middleNameLink;
	@FindBy(name = "lastName")
	private WebElement lastNameLink;
	@FindBy(linkText = "Employee Id")
	private WebElement EmployeeLink;
	@FindBy(linkText = "Other Id")
	private WebElement otherIdLink;

	public WebElement getFirstNameLink() {
		return firstNameLink;
	}

	public WebElement getMiddleNameLink() {
		return middleNameLink;
	}

	public WebElement getLastNameLink() {
		return lastNameLink;
	}

	public WebElement getEmployeeLink() {
		return EmployeeLink;
	}

	public WebElement getOtherIdLink() {
		return otherIdLink;
	}
}
