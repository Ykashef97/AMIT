package Pages;

import ProjectBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register extends PageBase {

    By RegisterPage = By.className("ico-register");
    By Gender = By.id("gender-male");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By Day = By.name("DateOfBirthDay");
    By Month = By.name("DateOfBirthMonth");
    By Year = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");
    By ContinueProcess = By.className("continue-button");

    public Register(WebDriver driver) {super(driver);}

    public void OpenRegisterPage (){ClickOnElement(RegisterPage);}
    public void SelectGender (){ClickOnElement(Gender);}
    public void EnterFirstName (String Frist){EnterText(FirstName,Frist);}
    public void EnterLastName (String Last){EnterText(LastName,Last);}
    public void SelectDay(){
        Select select = new Select(driver.findElement(Day));
        select.selectByIndex(1);
    }
    public void SelectMonth(){
        Select select = new Select(driver.findElement(Month));
        select.selectByIndex(1);
    }
    public void SelectYear (){
        Select select = new Select(driver.findElement(Year));
        select.selectByIndex(2);
    }
    public void EnterEmail(String E_mail){
        EnterText(Email,E_mail);
    }
    public void EnterPassword(String password){
        EnterText(Password,password);
    }
    public void EnterConfirmPassword(String confirmpassword){
        EnterText(ConfirmPassword,confirmpassword);
    }
    public void PressOnRegisterButton (){
        ClickOnElement(RegisterButton);
    }
    public void PressOnContinueButton(){
        ClickOnElement(ContinueProcess);
    }
}
