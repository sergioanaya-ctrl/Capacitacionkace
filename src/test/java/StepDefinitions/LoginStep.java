package StepDefinitions;

import com.kace.practica.Utilidades.Url;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {

    @Managed(driver = "chrome")

    private ChromeDriver driver;

    private final Actor actor = Actor.named("Usuario");

    Url url = new Url();
    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }
    @Given("Ingresamos a la url de kace")
    public void ingresarkace(){
        actor.wasAbleTo(Open.browserOn(url));
    }

    @When("Ingresamos usuario")
    public void ingresamosUsuario() {
    }

    @And("Damos clic en el boton next")
    public void damosClicEnElBotonNext() {
        
    }

    @And("ingresamos contrasena")
    public void ingresamosContrasena() {
        
    }

    @And("Damos clic en el boton continuar")
    public void damosClicEnElBotonContinuar() {


    }

    @Then("Validamos que estemos dentro que kace")
    public void validamosQueEstemosDentroQueKace() {
    }
}
