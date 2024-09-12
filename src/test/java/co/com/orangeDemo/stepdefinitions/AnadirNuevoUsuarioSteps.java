package co.com.orangeDemo.stepdefinitions;

import co.com.orangeDemo.tasks.AccesoLogin;
import co.com.orangeDemo.tasks.Recruitment;
import co.com.orangeDemo.userinterfaces.LoginPage;
import co.com.orangeDemo.userinterfaces.RecruitmentPage;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import net.serenitybdd.screenplay.questions.Text;

public class AnadirNuevoUsuarioSteps {

    @Managed(driver= "chrome")
    private WebDriver navegador;
    private Actor actor= Actor.named("Global");
    private LoginPage loginPage= new LoginPage();
    private RecruitmentPage recruitmentPage = new RecruitmentPage();


    @Given("^un reclutador ingresa a la plataforma y se dirige al modulo Recruitment$")
    public void unReclutadorIngresaALaPlataformaYSeDirigeAlModuloRecruitment() {
        actor.can(BrowseTheWeb.with(navegador));
        navegador.manage().window().maximize();
        actor.wasAbleTo(Open.browserOn(loginPage),
        AccesoLogin.login()

        );
    }

    @When("^Se anade un usuario y se realiza el proceso de contratacion$")
    public void seAnadeUnUsuarioYSeRealizaElProcesoDeContratacion() {
        actor.wasAbleTo(
                Recruitment.recruitment()
        );
    }

    @Then("^Se valida que los datos de la persona correspondan a los diligenciados en los formularios$")
    public void seValidaQueLosDatosDeLaPersonaCorrespondanALosDiligenciadosEnLosFormularios() {
        String vacancyEsperada ="Payroll Administrator";
        String Firstnameesperado = "juanDeprueba p d";
        String VacanteActual = Text.of(RecruitmentPage.INPUT_VACANCY_HIRIN).viewedBy(actor).resolve();
        assertThat("La vacante esperada es correcta", VacanteActual, equalTo(vacancyEsperada));
        String NommbreCompleto = Text.of(RecruitmentPage.INPUT_NAME_FULL).viewedBy(actor).resolve();
        assertThat("El nombre completo es correcto", NommbreCompleto, equalTo(Firstnameesperado));
        String StatusHired =Text.of(RecruitmentPage.STATUS_HIRIN).viewedBy(actor).resolve();
        assertThat("El nombre completo es correcto", StatusHired, equalTo(StatusHired));
    }

}
