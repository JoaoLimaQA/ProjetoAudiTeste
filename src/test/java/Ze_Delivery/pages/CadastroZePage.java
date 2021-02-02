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
import java.util.Random;

import static core.Conexao.*;

public class CadastroZePage extends BasePage {
    private AndroidDriver<MobileElement> driver;

    private By getFullName = By.xpath("//*[@text='Nome e sobrenome']");
    private By getEmail = new MobileBy.ByAccessibilityId("email address");
    private By getPassword = new MobileBy.ByAccessibilityId("password");
    private By getCpf = new MobileBy.ByAccessibilityId("document");
    private By getTelefone = new MobileBy.ByAccessibilityId("phone number");
    private By getIdade = By.xpath("//*[@text='Idade']");
    private By btnConfirmaIdade = By.xpath("//*[@text='Confirmar Idade']");
    private String fullName;

    public CadastroZePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void setNome_E_SobreNome(String fullName){
        this.fullName = fullName;
        getDriver().findElement(getFullName).sendKeys(fullName);
    }
    public void setEmail(String email){
        getDriver().findElement(getEmail).sendKeys(email);
    }
    public void setSenha(String senha){
        getDriver().findElement(getPassword).sendKeys(senha);
    }
    public void setCpf(String cpf){
        getDriver().findElement(getCpf).sendKeys(cpf);
    }
    public void setTelefone(String tel){
        getDriver().findElement(getTelefone).sendKeys(tel);
    }
    public void informeIdade(){
        getDriver().findElement(getIdade).click();

    }


    public void selecionarIdadeAleatoria() {
        Dimension size = Conexao.getDriver().manage().window().getSize();int x = size.width / 2;
                double valor = Math.random();
                int start_y = (int) (size.height * 0.8);
                int end_y = (int) (size.height * valor);
                System.out.println(valor);
                new TouchAction(Conexao.getDriver())
                        .press(x, start_y)
                        .waitAction(Duration.ofMillis(500))
                        .moveTo(x, end_y)
                        .release()
                        .perform();
            MobileElement age = getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc='scroll-selected-weekday']"));
            System.out.println(age.getText());
            age.getText();
        }




    public void confirmaIdade(){
        getDriver().findElement(btnConfirmaIdade).click();
    }
}
