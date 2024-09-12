package co.com.orangeDemo.Config;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetTheStages {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
