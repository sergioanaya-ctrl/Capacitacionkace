package StepDefinitions;

import com.kace.practica.Interacciones.LoginInteractions;
import com.kace.practica.Modelos.LoginModel;
import com.kace.practica.Tareas.LoginTask;
import com.kace.practica.Utilidades.Datoslogin;
import com.kace.practica.Utilidades.Url;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.kace.practica.Interfaces.LoginPage.*;

@NoArgsConstructor
public class LoginStep {

    @Managed(driver = "chrome")

    private ChromeDriver driver;

    private final Actor actor = Actor.named("Usuario");

    Url url = new Url();
    LoginModel model= Datoslogin.datoslogin();



    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }
    @Given("Ingresamos a la url de kace")
    public void ingresarkace(){
        actor.wasAbleTo(Open.browserOn(url));
    }

    @When("Ingresamos usuario")
    public void ingresamosUsuario() throws InterruptedException {

        actor.attemptsTo(
                Enter.theValue(model.getUsuario()).into(Nombre_Usuario)
        );
        Thread.sleep(3000);
    }

    @And("Damos clic en el boton next")
    public void damosClicEnElBotonNext() {
        actor.attemptsTo(Click.on(Boton_Next));
    }

    @And("ingresamos contrasena")
    public void ingresamosContrasena() throws InterruptedException {

        actor.attemptsTo(LoginInteractions.datos(model));
      //  actor.attemptsTo(
        //        Enter.theValue(model.getPassword()).into(Contrasena)
        //);
        Thread.sleep(3000);
    }

    @And("Damos clic en el boton continuar")
    public void damosClicEnElBotonContinuar() throws InterruptedException {
    actor.attemptsTo(Click.on(Boton_continue));

    Thread.sleep(5000);

    }

    @Then("Validamos que estemos dentro que kace")
    public void validamosQueEstemosDentroQueKace() {
    }

    @When("Ingresamos usuario {string}")
    public void ingresamosUsuario(String arg0) throws InterruptedException {
        actor.attemptsTo(Enter.theValue(arg0).into(Nombre_Usuario));
        Thread.sleep(3000);
    }

    @And("ingresamos contrasena {string}")
    public void ingresamosContrasena(String arg0) {
        actor.attemptsTo(Enter.theValue(arg0).into(Contrasena));
    }

    @When("Ingresamos usuario y contrasena")
    public void ingresamosUsuarioYContrasena() throws InterruptedException {
        actor.attemptsTo(LoginTask.datos1(model));
        //actor.attemptsTo(LoginInteractions.datos(model));
        Thread.sleep(8000);
    }
}
