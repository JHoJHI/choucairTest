package co.com.orangeDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.File;
import java.nio.file.Path;
import java.util.Random;

import static co.com.orangeDemo.userinterfaces.RecruitmentPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class Recruitment implements Task {

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        Path fileToUpload = new File("D:\\IdeaProjects\\ChoucairProject\\src\\test\\resources\\Files\\Confirmación de la Orden.pdf").toPath();
        actor.attemptsTo(
                Click.on(BUTTON_RECRUITMENT),
                Click.on(BUTTON_ADD),
                Enter.theValue("juanDeprueba").into(INPUT_FIRST_NAME),
                Enter.theValue("p").into(INPUT_MIDDLE_NAME),
                Enter.theValue("d").into(INPUT_LAST_NAME),
                Click.on(SELECT_VACANCY),
                Hit.the(ARROW_DOWN).into(SELECT_VACANCY),
                Click.on(INPUT_CONTACT_NUMBER),
                Click.on(SELEC_TRES),
                Hit.the(ARROW_DOWN).into(SELEC_TRES),
                Hit.the(ENTER).into(SELEC_VACDOS),
                Click.on(INPUT_CONTACT_NUMBER),
                Enter.theValue("t231as123123@gmail.com").into(INPUT_EMAIL),
                Enter.theValue("31812213123").into(INPUT_CONTACT_NUMBER),
                Upload.theFile(fileToUpload).to(INPUT_UPLOAD_DOC),
                Scroll.to(BUTTON_SAVE),
                Click.on(BUTTON_SAVE),
                WaitUntil.the(BUTTON_SHORLIST, isPresent()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_SHORLIST),
                WaitUntil.the(BUTTON_SAVE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_SAVE),
                WaitUntil.the(BUTTON_SCHEDULE_INTERVIEW, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_SCHEDULE_INTERVIEW),
                Scroll.to(INPUT_INTERVIEW_TITLE),
                Enter.theValue("textoprueba").into(INPUT_INTERVIEW_TITLE),
                Enter.theValue("R").into(INPUT_INTERVIEWER_TITLE),
                esperar(5000),
                Hit.the(ARROW_DOWN).into(INPUT_INTERVIEWER_TITLE),
                Hit.the(ENTER).into(INPUT_INTERVIEWER_TITLE),
                Enter.theValue("2024-11-09").into(DATE),
                Scroll.to(BUTTON_SAVE),
                Click.on(BUTTON_SAVE),
                WaitUntil.the(BUTTON_MARK_INTERVIEW_PASSED, isPresent()).forNoMoreThan(40).seconds(),
                Click.on(BUTTON_MARK_INTERVIEW_PASSED),
                Scroll.to(BUTTON_SAVE),
                Click.on(BUTTON_SAVE),
                WaitUntil.the(BUTTON_OFFER_JOB, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BUTTON_OFFER_JOB),
                WaitUntil.the(BUTTON_SAVE, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BUTTON_SAVE),
                WaitUntil.the(BUTTON_HIRE, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BUTTON_HIRE),
                WaitUntil.the(BUTTON_SAVE, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BUTTON_SAVE),
                esperar(10000)

        );

    }

    public static Recruitment recruitment(){
        return new Recruitment();
    }

    public static Performable esperar(int tiempoEnMilisegundos) {
        return Task.where("{0} espera " + tiempoEnMilisegundos + " milisegundos",
                actor -> {
                    try {
                        Thread.sleep(tiempoEnMilisegundos);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
        );
    }

}
