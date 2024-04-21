package Orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsernameTextField().sendKeys("Admin");
		loginPage.getPasswordTextField().sendKeys("admin123");
		loginPage.getLoginButton().click();

	}
}
