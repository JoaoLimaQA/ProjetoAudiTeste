package Ze_Delivery.pages;

import core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static core.Conexao.getDriver;

public class HomePage extends BasePage {
    private AndroidDriver<MobileElement> driver;
    BasePage base = new BasePage(driver);

    public HomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    private By jaPossuo  = By.xpath("//*[@text='Já possui uma conta? Entrar']");
    private By criarDepois = By.xpath("//*[@text='Criar conta depois']");
    private By logarFacebook = By.xpath("//*[@text='ENTRAR COM FACEBOOK']");
    private By createCount = By.xpath("//*[@text='CRIAR UMA CONTA']");

    public void FazerLoginComFaceBook() {
        getDriver().findElement(logarFacebook).click();
    }

    public void criarUmaConta() {
        getDriver().findElement(createCount).click();
    }

    public void jaPossuoContaEntrar() {
        esperarElementoVisivel("Já possui uma conta? Entrar");
        getDriver().findElement(jaPossuo).click();

    }

    public void criarContaDepois() {
        getDriver().findElement(criarDepois).click();

    }




}
