package org.example.deivisPrueba.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    public static final Target CAMPO_NOMBRE = Target.the("CAMPO NOMBRE")
            .located(By.id("user-name"));
    public static final Target CAMPO_PASSWORD = Target.the("CAMPO PASSWORD")
            .locatedBy("#password");
    public static final Target BOTON_LOGIN = Target.the("BOTON LOGIN")
            .locatedBy("#login-button");
}
