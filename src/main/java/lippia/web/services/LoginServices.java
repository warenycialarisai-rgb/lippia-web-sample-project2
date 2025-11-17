package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
//import junit.framework.Assert;
import lippia.web.constants.GoogleConstants;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;


import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginServices extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void completarUsuarioContrasena(){
        setInput(LoginConstants.INPUT_USER_XPATH,"standard_user");
        setInput(LoginConstants.INPUT_PASSWORD_XPATH,"secret_sauce");
    }
    public static void completarUsernameYPasswordParametros(String usuario, String password) {
        setInput(LoginConstants.INPUT_USER_XPATH,usuario);
        setInput(LoginConstants.INPUT_PASSWORD_XPATH,password);
    }
    public static void clickBotonLogin(){
        click(LoginConstants.BUTTON_LOGIN_XPATH);
    }

    public static void verificarMensaje(String mensaje) {
        String mensajeReal = getText(LoginConstants.MENSAJE_LOGIN_XPATH);
        Assert.assertEquals(mensajeReal, mensaje, "El mensaje de error no coincide con el esperado");
    }

}








