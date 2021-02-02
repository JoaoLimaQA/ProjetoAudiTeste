package Ze_Delivery.suite;

import Ze_Delivery.testes.CadastradoZeTest;
import Ze_Delivery.testes.HomeTest;
import Ze_Delivery.testes.LoginTest;
import Ze_Delivery.testes.ProdutosTest;
import core.BaseTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        LoginTest.class,
        CadastradoZeTest.class,
        ProdutosTest.class
       // HomeTest.class
})


public class Runner extends BaseTest {
}