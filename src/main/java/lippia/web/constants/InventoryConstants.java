package lippia.web.constants;

public class InventoryConstants {


    public static final String TITULO_HOME_XPATH = "xpath://span[contains(text(),'Products')]";

    public static final String NOMBRE_PRODUCTO_XPATH = "xpath://div[contains(text(),'%s')]";

    public static final String BUTTON_ADDTOCART_XPATH = "xpath://button[contains(@id,'add-to-cart-%s')]";

    public static final String BUTTON_REMOVE_XPATH =  "xpath://button[contains(@id,'remove-%s')]";

    public static final String CART_BADGE_XPATH = "xpath://span[@data-test='shopping-cart-badge']";

}
