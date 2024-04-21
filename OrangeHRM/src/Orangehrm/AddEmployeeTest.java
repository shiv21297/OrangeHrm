package Orangehrm;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.AddEmployeePage;
import ObjectRepository.LoginPage;
import ObjectRepository.PIMPage;
import ObjectRepository.WelcomePage;

public class AddEmployeeTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsernameTextField().sendKeys("Admin");
		loginPage.getPasswordTextField().sendKeys("admin123");
		loginPage.getLoginButton().click();

		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getPimlink().click();

		PIMPage pimPage = new PIMPage(driver);
		pimPage.getAddEmployeelink().click();

		AddEmployeePage addEmployeePage = new AddEmployeePage(driver);

		addEmployeePage.getFirstNamelink().sendKeys("shiv");
		addEmployeePage.getMiddleNamelink().sendKeys("s");
		addEmployeePage.getLastNamelink().sendKeys("shiv");
//		addEmployeePage.getTogglebutton().click();
//		addEmployeePage.getUsernamelink().sendKeys("Shiv21");
//		addEmployeePage.getPasswordlink().sendKeys("Shiv@1997");
//		addEmployeePage.getConfirmpasswordlink().sendKeys("Shiv@1997");
		
		addEmployeePage.getAddImageLink().sendKeys("C:\\Users\\hp\\OneDrive\\Pictures\\Camera Roll\\IMG_8757.jpg");
		File file = new File("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Cover letter.pdf");
		String path = file.getAbsolutePath();
		Thread.sleep(5000);
		addEmployeePage.getSavebutton().click();
	}
}
