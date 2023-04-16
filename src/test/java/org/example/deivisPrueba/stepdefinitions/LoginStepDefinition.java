package org.example.deivisPrueba.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.deivisPrueba.pageobjects.LoginPage;

public class LoginStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} visita la pagina Swag Labs")
    public void queDeivisVisitaLaPaginaSwagLabs(String nombreActor) {
        OnStage.theActor(nombreActor).wasAbleTo(
                Open.browserOn(new LoginPage())
        );
    }

    @When("ingreso con mis credenciales")
    public void ingresoConMisCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(

        );
    }

    @Then("logro acceder, visualizando el texto {string}")
    public void logroAccederVisualizandoElTexto(String string) {

    }
}
