package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ProjectBase.PageBase;

public class Login extends PageBase {
    public String expectedSrc;

    By Login = By.className("ico-login");
    By Email = By.name("Email");
    By Password = By.name("Password");
    By LoginButton = By.className("login-button");
    By imgElement = By.xpath("//img[@src='expectedSrc']");

    public Login(WebDriver driver) {
        super(driver);
    }

    public void PressOnLogin() {
        ClickOnElement(Login);
    }

    public void EnterEmail(String email) {
        EnterText(Email, email);
    }

    public void EnterPassword(String password) {
        EnterText(Password, password);
    }

    public void PressOnLoginButton() {
        ClickOnElement(LoginButton);
    }

    public void ProcessIsSuccess() {
        System.out.println("The login process is successfully");
    }
    public void ProcessIsNotSuccess() {
        System.out.println("The login process is not success");
    }

}
