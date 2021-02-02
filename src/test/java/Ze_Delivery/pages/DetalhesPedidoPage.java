package Ze_Delivery.pages;

import core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DetalhesPedidoPage extends BasePage {
    private AndroidDriver<MobileElement>driver;


    public DetalhesPedidoPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
}
