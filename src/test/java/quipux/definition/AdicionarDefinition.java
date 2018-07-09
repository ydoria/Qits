package quipux.definition;
//cada método mapea con unos métodos en la clase .steps 
/*el archivo de definición de pasos almacena la asignación entre cada paso del escenario
definido en el archivo de características con un código de función para ser ejecutado.*/

import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quipux.steps.AdicionarSteps;


public class AdicionarDefinition {
//se realiza el llamado de la clase donde se encuentran definidos los métodos con los pasos o acciones a realizar. 
	@Steps
	AdicionarSteps adicionarSteps;
//@CrearPersonaNatural
//@CrearPersonaJurídica
//@AdicionarExpediente
	@Given("^el usuario realizo el previo logueo en la aplicación, seleccionar la opción adicionar expedientes$")
	public void el_usuario_realizo_el_previo_logueo_en_la_aplicación_seleccionar_la_opción_adicionar_expedientes() throws Throwable {
		adicionarSteps.menuadicionarexpedientes();
	}
//@CrearPersonaNatural
//@CrearPersonaJurídica
//@AdicionarExpediente
	@When("^usuario seleccione tipo de identificación \"([^\"]*)\"$")
	public void usuario_seleccione_tipo_de_identificación(String tipoidentificacion) throws Throwable {
		adicionarSteps.tipoidentificacion(tipoidentificacion);
	}
//@CrearPersonaNatural
//@CrearPersonaJurídica
//@AdicionarExpediente
	@When("^digite Nro\\. identificación \"([^\"]*)\"$")
	public void digite_Nro_identificación(String numeroidentificacion) throws Throwable {
		adicionarSteps.numeroidentificacion(numeroidentificacion);
	}
//@CrearPersonaNatural
	@When("^haga clic en el botón buscar \"([^\"]*)\"$")
	public void haga_clic_en_el_botón_buscar(String existe) throws  Throwable {
		adicionarSteps.botonbuscarPersona(existe);
	}
//@CrearPersonaJurídica	
	@When("^haga clic en el botón buscar juridica \"([^\"]*)\"$")
	public void haga_clic_en_el_botón_buscar_juridica(String existe) throws Throwable {
		adicionarSteps.botonbuscarJuridica(existe);
	}
//@AdicionarExpediente	
	@When("^haga clic en el botón buscar$")
	public void haga_clic_en_el_botón_buscar() throws  Throwable {
		adicionarSteps.botonbuscar();
	}
//@CrearPersonaNatural	
	@When("^persona natural no existe$")
	public void persona_natural_no_existe(List<String> datos) throws Throwable {
		adicionarSteps.personanaturalnoexite(datos);
	}
//@CrearPersonaJurídica	
	@When("^persona jurídica no existe$")
	public void persona_jurídica_no_existe(List<String> datosjuridica) throws Throwable {
		adicionarSteps.personajuridicanoexiste(datosjuridica);
	}
//@AdicionarExpediente	
	@When("^persona existe$")
	public void persona_existe(List<String> adicionar) throws Throwable {
		adicionarSteps.personaexiste(adicionar);
	}
}
