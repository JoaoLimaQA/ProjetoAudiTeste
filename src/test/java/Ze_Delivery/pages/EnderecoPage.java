package Ze_Delivery.pages;

import core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static core.Conexao.getDriver;

    public class EnderecoPage extends BasePage {
    private AndroidDriver<MobileElement> driver;
    private By complement = new MobileBy.ByAccessibilityId("complement-input");
    private By notComplement = new MobileBy.ByAccessibilityId("not-own-complemnt");
    private By btnCasa = new MobileBy.ByAccessibilityId("home-button");
    private By btnTrabalho = new MobileBy.ByAccessibilityId("work-button");
    private By btnOutros = new MobileBy.ByAccessibilityId("others-button");
    private By setOutros = new MobileBy.ByAccessibilityId("other-place-name-input");
    private By btnContinuar = new MobileBy.ByAccessibilityId("continue");
    private By btnConfirmar = By.xpath("//*[@text='CONFIRMAR']");
    public EnderecoPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void setComplemento(String Complemento){
        getDriver().findElement(complement).sendKeys(Complemento);
    }
    public void notComplemento(){
        getDriver().findElement(notComplement).click();
    }
    public void casa(){
        getDriver().findElement(btnCasa).click();
    }
    public void trabalho(){
        getDriver().findElement(btnTrabalho).click();
    }
    public void outros(String detalhes){
        getDriver().findElement(btnOutros).click();
        getDriver().findElement(setOutros).sendKeys(detalhes);
    }
    public void confirmar(){
        getDriver().findElement(btnConfirmar).click();
    }
    public void continuar(){
        getDriver().findElement(btnContinuar).click();
    }

}
