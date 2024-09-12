package co.com.orangeDemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage extends PageObject {

    public static final Target BUTTON_RECRUITMENT= Target.the("Button para modulo Recruitment").located(By.xpath("//li[@class='oxd-main-menu-item-wrapper']//a[@href='/web/index.php/recruitment/viewRecruitmentModule' and contains(@class, 'oxd-main-menu-item')]"));
    public static final Target BUTTON_ADD= Target.the("Boton para añadir").located(By.xpath("//button[contains(@class, 'oxd-button--secondary') and .//i[contains(@class, 'bi-plus')]]"));
    public static final Target INPUT_FIRST_NAME= Target.the("Campo para diligenciar nombre ").located(By.name("firstName"));
    public static final Target INPUT_MIDDLE_NAME= Target.the("Campo para diligenciar segundo nombre").located(By.name("middleName"));
    public static final Target INPUT_LAST_NAME= Target.the("Campo paradiligenciar apellido").located(By.name("lastName"));
    public static final Target SELECT_VACANCY= Target.the("Campo para seleccionar vacante").located(By.xpath("//div[contains(@class, 'oxd-select-text-input') and text()='-- Select --']"));
    public static final Target SELEC_VACDOS= Target.the("Campo para seleccionar vacante").located(By.xpath("//div[contains(@class, 'oxd-select-text-input') and text()='Payroll Administrator']"));
    public static final Target SELEC_TRES= Target.the("Campo para seleccionar vacante").located(By.xpath("//div[contains(@class, 'oxd-select-text-input') and text()='Junior Account Assistant']"));

    public static final Target INPUT_UPLOAD_DOC= Target.the("Campo para seleccionar payroll vacante").located(By.xpath("//input[@type='file']"));
    public static final Target INPUT_EMAIL= Target.the("Campo para diligenciar email").located(By.xpath("//div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div//input[@class='oxd-input oxd-input--active']"));
    public static final Target INPUT_CONTACT_NUMBER= Target.the("Campo para diligenciar el numero").located(By.xpath("//label[contains(@class, 'oxd-label') and contains(text(), 'Contact')]/following::input[1]"));
    public static final Target BUTTON_SAVE= Target.the("Boton guardar").located(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--secondary') and contains(@class, 'orangehrm-left-space')]"));
    public static final Target BUTTON_SHORLIST= Target.the("Boton Shorlist").located(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--success')]"));
    public static final Target SPINNER_LOAD = Target.the("loader").located(By.className("oxd-loading-spinner"));
    public static final Target BUTTON_SCHEDULE_INTERVIEW = Target.the("Boton scheduleinterview").located(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--success')]"));
    public static final Target INPUT_INTERVIEW_TITLE = Target.the("campo Interview Title").located(By.xpath("//label[text()='Interview Title' or text()='Título de la Entrevista']/following::input[1]"));
    public static final Target INPUT_INTERVIEWER_TITLE = Target.the("Campo Interviewer title").located(By.xpath("//label[text()='Interviewer']/following::input[1]"));
    public static final Target DATE = Target.the("Campo Date").located(By.xpath("//label[contains(text(), 'Date') or contains(text(), 'Fecha')]/following::input[1]"));
    public static final Target BUTTON_MARK_INTERVIEW_PASSED= Target.the("Boton Mark Interview passed").located(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--success')]"));
    public static final Target BUTTON_OFFER_JOB=Target.the("Boton offer job").located(By.xpath("//button[text()=' Offer Job ']"));
    public static final Target BUTTON_HIRE= Target.the("Boton Hire").located(By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--success')]"));
    public static final Target INPUT_VACANCY_HIRIN = Target.the("Campo para diligenciar nombre").located(By.xpath("//label[text()='Vacancy']/following::p[@class='oxd-text oxd-text--p']"));
    public static  final Target INPUT_NAME_FULL = Target.the("full name campo").located(By.xpath("//label[text()='Name']/following::p[@class='oxd-text oxd-text--p']"));
    public static final Target STATUS_HIRIN= Target.the("Status target").located(By.cssSelector(".orangehrm-recruitment-status .oxd-text.oxd-text--subtitle-2"));
}
