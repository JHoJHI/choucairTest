package co.com.orangeDemo.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com")
public class LoginPage extends PageObject {

    public static final Target INPUT_USERNAME= Target.the("Input para ingresar el usuario").located(By.name("username"));
    public static final Target INPUT_PASSWORD= Target.the("Input para ingresar la contraseña").located(By.name("password"));
    public static final Target BUTTON_LOGIN= Target.the("Botón para dar click al login").located(By.xpath("//button[contains(@class, 'orangehrm-login-button')]"));
}
