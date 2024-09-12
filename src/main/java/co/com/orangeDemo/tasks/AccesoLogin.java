package co.com.orangeDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.orangeDemo.userinterfaces.LoginPage.*;

public class AccesoLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue("Admin").into(INPUT_USERNAME),
            Enter.theValue("admin123").into(INPUT_PASSWORD),
            Click.on(BUTTON_LOGIN)
    );


    }
    public static AccesoLogin login() {
        return new AccesoLogin();
    }



}
