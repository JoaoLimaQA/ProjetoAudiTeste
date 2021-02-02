package Ze_Delivery.pages;

import core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static core.Conexao.getDriver;

public class LocalizacaoPage extends BasePage {
    private AndroidDriver<MobileElement> driver;

    private By localization = new MobileBy.ByAccessibilityId("address input");
    private By myAddress = By.xpath("//*[@text='Rua Guarujá, 300']");
    public LocalizacaoPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void inserirEndereco(String address){
        getDriver().findElement(localization).sendKeys(address);
        getDriver().findElement(myAddress).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
