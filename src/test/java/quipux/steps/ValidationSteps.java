package quipux.steps;
//para la construcción de los pasos es necesaria la definición de objetos en .pageobjects.
import net.thucydides.core.annotations.Step;
import quipux.pageobjects.QitsLoginPage;

public class ValidationSteps {
	//se realiza el llamado de las clases donde se encuentran definidos los objetos.	
	QitsLoginPage qitsLoginPage;
	
	@Step
	public void abrir_aplicativo() {
		qitsLoginPage.open();
	}
	@Step
	public void digita_usuario(String strUsuario) {
		qitsLoginPage.usuario(strUsuario);
	}
	@Step
	public void digita_contrasena(String strPass) {
		qitsLoginPage.password(strPass);
	}
	@Step
	public void boton_login() {
		qitsLoginPage.boton_login();
	}
	@Step
	public void Valida(String mensaje) {
		qitsLoginPage.lblbienvenido(mensaje);
	}

}
