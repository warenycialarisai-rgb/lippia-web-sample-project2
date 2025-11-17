package lippia.web.steps;

import com.crowdar.core.PageSteps;
import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.GoogleHomeService;
import lippia.web.services.LoginServices;

public class loginSteps extends PageSteps {


    @Given("^el usuario esta en la pantalla de login de Swag Labs$")
    public void login() {
        LoginServices.navegarWeb();
    }

    @When("^el usuario ingresa username con (.*) y password con (.*)")
    public void credencialesConParametros(String usuario, String password) {
        LoginServices.completarUsernameYPasswordParametros(usuario, password);
    }
   @When("^el usuario ingresa username y password$")
    public static void completarUsernameYPassword() {
       LoginServices.completarUsuarioContrasena();
    }

    @When("^el usuario hace click en el boton Login$")
    public void click() {
        LoginServices.clickBotonLogin();
    }

    @Then("el usuario ve el mensaje de {string}")
    public void mensajeError(String mensaje) {
        LoginServices.verificarMensaje(mensaje);
    }







}