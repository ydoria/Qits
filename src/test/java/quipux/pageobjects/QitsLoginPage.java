package quipux.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://softtest.quipux.com/qxcobrocoactivo")
//clase QitsLoginPage con la definición de los objetos.
public class QitsLoginPage extends PageObject {
	
//Campo usuario
	@FindBy(xpath="//INPUT[@id='username']")
	public WebElementFacade txtUsername;
//Campo contraseña
	@FindBy(xpath="//INPUT[@id='password']")
	public WebElementFacade txtPassword;
//Botón 
	@FindBy(xpath="//INPUT[@class='botonSuccessful']")
	public WebElementFacade btnIniciarSesión;
//Validación
	@FindBy(xpath="(//TD)[2]")
	public WebElementFacade lblbienvenido;

	//método que me permite digitar el usuario 
	public void usuario(String strUsuario) {
		txtUsername.and().type(strUsuario);
	}
	//método que me permite digitar la contraseña
	public void password(String strPasword) {
		txtPassword.and().type(strPasword);
	}	
	//método que me permite dar clic en inciar sesión
	public void boton_login() {
		btnIniciarSesión.click();
		waitFor(2).seconds();
	}
	//método que me permite validar el mensaje bienvenido cuando se inicia sesión con éxito
	public void lblbienvenido(String mensaje) {
		assertThat(lblbienvenido.getText(), containsString(mensaje));
	}

}
