package Ze_Delivery.testes;

import org.apache.tools.ant.taskdefs.Concat;
import org.junit.Assert;
import org.junit.Test;

import core.BasePage;
import core.BaseTest;
import core.Conexao;
import Ze_Delivery.pages.LoginPage;
import Ze_Delivery.pages.ProdutosPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProdutosTest  extends BaseTest {
    AndroidDriver<MobileElement>driver;
    BasePage base = new BasePage(driver);
    ProdutosPage produtos = new ProdutosPage(driver);
    LoginTest loginT = new LoginTest();
    LoginPage loginP = new LoginPage(driver);
    

@Test
    public void selecionarSkoll_AsConsagradasTest() throws InterruptedException {
                                    // consagradas = Brahma,Skol,Budweiser,Antarctica,Original
    loginT.testLoginCompleto();    // prestigiadas = Stella Artois, Beck's,Bohemia,Colorado
    produtos.categoriaCerveja();
    produtos.esperar(2000);
    produtos.asConsagradas("Original");
    produtos.esperarElementoVisivel("Voltar");
    base.esperar(2000);
    base.scroll(0.8,0.4);
    produtos.original_300ml();
    Assert.assertTrue(base.elementoEstaVisivel("ADICIONAR (1)"));
    produtos.addCarrinho();


   }
}
