package quipux.definition;
//cada método mapea con unos métodos en la clase .steps
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quipux.steps.ValidationSteps;

public class ValidationDefinition {
//se realiza el llamado de la clase donde se encuentran definidos los métodos con los pasos o acciones a realizar.		
	@Steps
	ValidationSteps validationSteps;
	
	@Given("^el usuario está en la página de inicio de sesión$")
	public void el_usuario_está_en_la_página_de_inicio_de_sesión() throws Throwable {
		validationSteps.abrir_aplicativo();
	}

	@When("^usuario ingrese nombre de usuario \"([^\"]*)\"$")
	public void usuario_ingrese_nombre_de_usuario(String strUsuario) throws Throwable {
		validationSteps.digita_usuario(strUsuario);
	}

	@When("^usuario ingrese la contraseña \"([^\"]*)\"$")
	public void usuario_ingrese_la_contraseña(String strPass) throws Throwable {
		validationSteps.digita_contrasena(strPass);
	}

	@When("^haga clic en el botón de inicio$")
	public void haga_clic_en_el_botón_de_inicio() throws Throwable {
		validationSteps.boton_login();
	}

	@Then("^el usuario debe iniciar sesión con éxito \"([^\"]*)\"$")
	public void el_usuario_debe_iniciar_sesión_con_éxito(String mensaje) throws Throwable {
		validationSteps.Valida(mensaje);
	}
	
}
