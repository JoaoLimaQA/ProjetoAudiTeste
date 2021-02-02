package Ze_Delivery.testes;

import core.BaseTest;
import Ze_Delivery.pages.HomePage;
import Ze_Delivery.pages.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Estrategia onde os teste devem ser executado em sequencia, uma esteria onde um depende do outro.
public class LoginTest extends BaseTest {
    private AndroidDriver<MobileElement> driver;

    HomePage home = new HomePage(driver);
    LoginPage login = new LoginPage(driver);
    CadastradoZeTest c = new CadastradoZeTest();



    @Test
    public void t01_loginEmailESenhaAusentes() {
        home.jaPossuoContaEntrar();
        login.setEmail("");
        login.setPassword("");
        login.entrar();

        assertEquals(" Opa, precisamos do seu email ", login.getMsgEmailVazio());
        assertEquals(" Opa, precisamos da sua senha ", login.getMsgSenhaVazio());

    }

    @Test
    public void t02_loginSemSenha() {
        home.jaPossuoContaEntrar();
        login.setEmail("teste@login.com");
        login.setPassword("");
        login.entrar();
        assertEquals(" Opa, precisamos da sua senha ", login.getMsgSenhaVazio());
    }

    @Test
    public void t03_loginSemEmail() {
        home.jaPossuoContaEntrar();
        login.setEmail("");
        login.setPassword("123psw");
        login.entrar();
        assertEquals(" Opa, precisamos do seu email ", login.getMsgEmailVazio());
    }

    @Test
    public void t04_loginEmailInvalido() {
        home.jaPossuoContaEntrar();
        login.setEmail("test.gmail.com");
        login.setPassword("123psw");
        login.entrar();

        assertEquals(" Opa isso não parece com um email valido ", login.getMsgEmailInvalido());
    }

    @Test
    public void t05_LoginPage_sucesso() {
        home.jaPossuoContaEntrar();
        login.setEmail("test_quality@gmail.com.br");
        login.setPassword("123pws@X");
        login.entrar();
        assertTrue(login.elementoEstaVisivel("Inserir endereço com número"));
    }
    @Test
    public void testLoginCompleto() throws InterruptedException {
        Thread.sleep(3000);
        c.testInserirLocalizacao();
        c.address.setComplemento("test complemento");
        c.address.notComplemento();
        c.address.casa();
        c.address.trabalho();
        c.address.continuar();
        login.verProdutos();

    }
}