package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.InventoryConstants;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class InventoryServices extends ActionManager {

    public static void verificarHomePage() {
        Assert.assertTrue(isPresent(InventoryConstants.TITULO_HOME_XPATH), "No se encuentra el elemento en la home page");
    }
    public static void verificarProducto(String nombreProducto) {
        String xpath = String.format(InventoryConstants.NOMBRE_PRODUCTO_XPATH, nombreProducto);
        Assert.assertTrue(isPresent(xpath), "No se encuentra el producto: " + nombreProducto);
    }
    public static void clickBotonAddToCart(String productName){
        String normalizedName = productName.toLowerCase().replace(" ", "-");
        String finalXpath = String.format(InventoryConstants.BUTTON_ADDTOCART_XPATH, normalizedName);
        System.out.println("xpath generado: " + finalXpath);
        click(finalXpath);
    }
    public static void verificarCantidadCarrito(int numEsperado) {
        String valorCarrito = getText(InventoryConstants.CART_BADGE_XPATH);
        int actual = Integer.parseInt(valorCarrito);

        Assert.assertEquals(actual, numEsperado, "No se agrego el producto al carrito");
    }
    public static void removerProducto(String nombre) {
        String normalizedName = nombre.toLowerCase().replace(" ", "-");
        String finalXpath = String.format(InventoryConstants.BUTTON_REMOVE_XPATH, normalizedName);
        click(finalXpath);
    }
    public static void verificarCarritoVacio( ){
        Assert.assertFalse(isPresent(InventoryConstants.CART_BADGE_XPATH), "El carrito todavia muestra un numero y deberia estar vacio"
        );
    }


}
