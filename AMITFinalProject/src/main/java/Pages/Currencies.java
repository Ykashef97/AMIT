package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Currencies extends ProjectBase.PageBase {
By CustomerCurrency = By.id("customerCurrency");
    public Currencies (WebDriver driver) {super(driver);}

    public void SelectCurrency (){
        Select select = new Select(driver.findElement(CustomerCurrency));
        select.selectByVisibleText("Euro");
    }
}
