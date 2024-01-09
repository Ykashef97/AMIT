package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class Search extends Pages.PageBase {

    By Keyword = By.className("search-box-text");
    By SearchButton = By.xpath("//button[@type='submit']");
    By ItemBoxClass = By.className("item-box");
    By ProductTitleClass = By.className("product-title");
    List<String>  verfiedBoxes =new ArrayList<>();
    By Sku = By.xpath("//span[@id='sku-36']");
    By Product = By.className("search-text");
    public Search(WebDriver driver) {
        super(driver);
    }

    public void EnterKeyword(String  search) {
        EnterText(Keyword,search);
    }
    public void PressOnSearchBar(){
        ClickOnElement(SearchButton);
    }
    public void loop_over_the_results_and_verify(){
         List<WebElement> itemList = driver.findElements(ItemBoxClass);
         for (WebElement item : itemList) {
             WebElement Link = item.findElement(ProductTitleClass).findElement(By.tagName("a"));
             if (Link.getText().toLowerCase().contains("nike"))
             // this keywords need to be tested book, laptop, nike
             {
                 verfiedBoxes.add(Link.getText());
             }
        }
        checkIfNext();

        System.out.println("verfiedBoxes length:" + verfiedBoxes.size());
    }

    public void checkIfNext(){
        try {
            WebElement link = driver.findElement(By.className("next-page")).findElement(By.tagName("a"));
            driver.navigate().to(link.getAttribute("href"));
            loop_over_the_results_and_verify();
        }catch (Exception e) {

        }

    }
    public String GetSkuText(){
      return  driver.findElement(Sku).getText();
    }
    public void PressOnProduct(){ClickOnElement(Product);}

}
