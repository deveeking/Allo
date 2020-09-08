import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends MainPage {
    private WebElement searchBox;

    @Test
    public void searchGoodsEng() throws InterruptedException {
        searchBox = searchSearchBox();
        searchBox.sendKeys("Apple" + Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/apple-store/");
    }


    @Test
    public void searchGoodsRus() throws InterruptedException {
        searchBox = searchSearchBox();
        searchBox.sendKeys("Айфон" + Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://allo.ua/ua/products/mobile/proizvoditel-apple/");
    }
}