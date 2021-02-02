package Ze_Delivery.pages;

import core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static core.Conexao.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage extends BasePage {
    private AndroidDriver<MobileElement> driver;
    HomePage home = new  HomePage(driver);
    private By getEmail = By.xpath("//*[@text='E-mail']");
    private By getPassword = By.xpath("//*[@text='Senha']");
    private By btnEntrar = new MobileBy.ByAccessibilityId("enter");
    private By btnVerProdutos = new MobileBy.ByAccessibilityId("see-products");
    private By emailAusente = By.xpath("//*[@text=' Opa, precisamos do seu email ']");
    private By senhaAusente = By.xpath("//*[@text=' Opa, precisamos da sua senha ']");
    private By emailInvalido = By.xpath("//*[@text=' Opa isso não parece com um email valido ']");
    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void setEmail(String email){
        getDriver().findElement(getEmail).sendKeys(email);
    }
    public void setPassword(String senha){
        getDriver().findElement(getPassword).sendKeys(senha);
    }
    public void entrar(){
        getDriver().findElement(btnEntrar).click();
    }
    public void verProdutos(){
        esperarElementoVisivel("VER PRODUTOS DISPONÍVEIS");
        getDriver().findElement(btnVerProdutos).click();
    }
    public String getMsgEmailVazio(){
        return getDriver().findElement(emailAusente).getText();
    }
    public String getMsgEmailInvalido(){
        return getDriver().findElement(emailInvalido).getText();
    }
    public String getMsgSenhaVazio(){
        return getDriver().findElement(senhaAusente).getText();
    }


    public void loginPage_sucesso(){
        home.jaPossuoContaEntrar();
        setEmail("test_quality@gmail.com.br");
        setPassword("123pws@X");
        entrar();
        assertTrue(elementoEstaVisivel("Inserir endereço com número"));

    }
}
