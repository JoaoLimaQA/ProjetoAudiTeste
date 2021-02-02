package Ze_Delivery.pages;

import core.BasePage;
import core.Conexao;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static core.Conexao.getDriver;

public class ProdutosPage extends BasePage {
    private AndroidDriver<MobileElement>driver;



    private By unidBrahma = new MobileBy.ByAccessibilityId("Brahma-product-card");
    private By menuCervejas = new MobileBy.ByAccessibilityId("category-menu-Cervejas");
    private By piriguetinhaOriginal = By.xpath("//*[contains(@text,'R$ 3,')]");
    private By adicionar = By.xpath("//*[@text='ADICIONAR (1)']");


    public ProdutosPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }


    public void original_300ml(){
        getDriver().findElement(piriguetinhaOriginal).click();
    }


   public void asConsagradas(String marca ){
       if (marca == "Antarctica") {
        esperar(3000);
        swipeAsConsagradas(0.9, 0.1);
        MobileElement cerveja = getDriver().findElement(By.xpath("//*[contains(@content-desc,'image-brand-" + marca + "')]"));
        cerveja.click();
       } else if (marca == "Original")   {
           esperar(4000);
           swipeAsConsagradas(0.9,0.1);
           MobileElement cerveja = getDriver().findElement(By.xpath("//*[contains(@content-desc,'image-brand-" + marca + "')]"));
           cerveja.click();
       }else{
           getDriver().findElement(By.xpath("//*[contains(@content-desc,'image-brand-" + marca + "')]")).click();
       }
                  }


    public void asPrestigiadas(String marca ){
        if (marca == "Bohemia") {
            esperar(5000);
            swipeAsPrestigiadas(0.9, 0.1);
            MobileElement cerveja = getDriver().findElement(By.xpath("//*[contains(@content-desc,'image-brand-" + marca + "')]"));
            cerveja.click();
        } else if (marca == "Colorado")   {
            esperar(5000);
            swipeAsPrestigiadas(0.9,0.1);
            MobileElement cerveja = getDriver().findElement(By.xpath("//*[contains(@content-desc,'image-brand-" + marca + "')]"));
            cerveja.click();
        }else{
            getDriver().findElement(By.xpath("//*[contains(@content-desc,'image-brand-" + marca + "')]")).click();
        }
    }



    public void uniBrahma(){
        getDriver().findElement(unidBrahma).click();
    }
    public void categoriaCerveja(){
        getDriver().findElement(menuCervejas).click();
    }
    public void addCarrinho(){
        getDriver().findElement(adicionar).click();

    }



    public void swipeAsPrestigiadas(double inicio, double fim) {
        Dimension size = Conexao.getDriver().manage().window().getSize();
        int y = size.height / 2 + 400;

        int start_x = (int) (size.width * inicio);
        int end_x = (int) (size.width * fim);

        new TouchAction(Conexao.getDriver())
                .press(start_x, y)
                .waitAction(Duration.ofMillis(1000))
                .moveTo(end_x, y)
                .release()
                .perform();

    }
    public void     swipeAsConsagradas(double inicio, double fim) {
        Dimension size = Conexao.getDriver().manage().window().getSize();
        int y = size.height / 2;

        int start_x = (int) (size.width * inicio);
        int end_x = (int) (size.width * fim);

        new TouchAction(Conexao.getDriver())
                .press(start_x, y)
                .waitAction(Duration.ofMillis(1000))
                .moveTo(end_x, y)
                .release()
                .perform();

    }
}
