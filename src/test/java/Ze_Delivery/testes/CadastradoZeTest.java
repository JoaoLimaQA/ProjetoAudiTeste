package Ze_Delivery.testes;

import core.BaseTest;
import Ze_Delivery.pages.*;
import utils.Gerar_Cpf_Cnpj;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;

public class CadastradoZeTest extends BaseTest {
    private AndroidDriver<MobileElement> driver;
    LoginPage login = new LoginPage(driver);
    HomePage home = new HomePage(driver);
    CadastroZePage cads = new CadastroZePage(driver);
    LocalizacaoPage local = new LocalizacaoPage(driver);
    EnderecoPage address = new EnderecoPage(driver);
    Gerar_Cpf_Cnpj gerador = new Gerar_Cpf_Cnpj();

    @Test
    public void tesDeveRealizarCadastro_sucesso() throws InterruptedException {
    	home.esperar(3000);
        home.criarUmaConta();
        cads.setNome_E_SobreNome("rodrigo teste");
        cads.setEmail("test_quality@gmail.com.br");
        cads.setSenha("123pws@X");
        cads.scrollDown();
        cads.setCpf(gerador.cpf(false));
        cads.setTelefone("11951254825");
        cads.informeIdade();
        cads.esperar(3000);
        cads.selecionarIdadeAleatoria();
        cads.confirmaIdade();

    }


    
    public void testInserirLocalizacao() {
         login.loginPage_sucesso();
         local.inserirEndereco("Rua Guaruja, 300  vale do sol");
    }
    
    public void testinserirEndereco() throws InterruptedException {
        Thread.sleep(3000);
        testInserirLocalizacao();
        address.setComplemento("test complemento");
        address.notComplemento();
        address.casa();
        address.trabalho();
        address.outros("AP bloco 2b");
        address.confirmar();
        address.continuar();

        }
     

    }


