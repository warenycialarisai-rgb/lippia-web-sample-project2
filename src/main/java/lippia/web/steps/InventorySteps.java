package lippia.web.steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.InventoryServices;
import lippia.web.services.LoginServices;

public class InventorySteps {

    @Then("^el usuario es redirigido al home$")
    public void Home() {
        InventoryServices.verificarHomePage();
    }
    @And("^existe en el inventario el producto (.*)$")
    public void verificarProducto(String nombreProducto) {
        InventoryServices.verificarProducto(nombreProducto);
    }
    @When("^el usuario agrega \"([^\"]*)\" al carrito$")
    public void Click(String productName) {
        InventoryServices.clickBotonAddToCart(productName);
    }
    @Then("^el usuario visualiza que el contador del carrito muestra el número (.*)$")
    public void verificarCantidadCarrito(int numEsperado) {
     InventoryServices.verificarCantidadCarrito(numEsperado);
    }
    @When("^el usuario elimina \"([^\"]*)\" del carrito$")
    public void removerProducto(String nombre) {
       InventoryServices.removerProducto(nombre);
    }
    @Then("^el usuario visualiza que el contador del carrito esta vacio$")
    public void verificarCarritoVacio() {
        InventoryServices.verificarCarritoVacio();
    }


}
