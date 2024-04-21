package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[class='oxd-icon-button oxd-main-menu-button']")
	private WebElement addImageLink;
	@FindBy(name = "firstName")
	private WebElement firstNamelink;
	@FindBy(name = "middleName")
	private WebElement middleNamelink;
	@FindBy(name = "lastName")
	private WebElement lastNamelink;
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement togglebutton;

	@FindBy(css = "[class='oxd-input oxd-input--active oxd-input--error']")
	private WebElement usernamelink;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordlink;
	@FindBy(xpath = "//label[.='Confirm Password']")
	private WebElement confirmpasswordlink;
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement savebutton;

	public WebElement getAddImageLink() {
		return addImageLink;
	}

	public WebElement getFirstNamelink() {
		return firstNamelink;
	}

	public WebElement getMiddleNamelink() {
		return middleNamelink;
	}

	public WebElement getLastNamelink() {
		return lastNamelink;
	}

	public WebElement getTogglebutton() {
		return togglebutton;
	}

	public WebElement getUsernamelink() {
		return usernamelink;
	}

	public WebElement getPasswordlink() {
		return passwordlink;
	}

	public WebElement getConfirmpasswordlink() {
		return confirmpasswordlink;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

}
