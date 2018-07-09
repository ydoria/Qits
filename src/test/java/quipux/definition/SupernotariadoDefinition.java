package quipux.definition;
//cada método mapea con unos métodos en la clase .steps 
import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quipux.steps.SupernotariadoSteps;

public class SupernotariadoDefinition {
//se realiza el llamado de la clase donde se encuentran definidos los métodos con los pasos o acciones a realizar.	
	@Steps
	SupernotariadoSteps supernotariadoSteps;
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
//@EstudioTitulosDevolver
	@Given("^el usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control$")
	public void el_usuario_realizo_el_previo_logueo_en_la_aplicación_seleccionar_la_opción_investigación_y_control() throws Throwable {
		supernotariadoSteps.menuinvestigacionexpedientes();
	}
//@EstudioTitulosSinBien	
//@EstudioTitulosConBien
//@EstudioTitulosDevolver
	@When("^usuario seleccione opción \"([^\"]*)\"$")
	public void usuario_seleccione_opción(String tiporentainvestigacion) throws Throwable {
		supernotariadoSteps.tiporentainvestigacion(tiporentainvestigacion);
	}
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
//@EstudioTitulosDevolver
	@When("^seleccione proceso \"([^\"]*)\"$")
	public void seleccione_proceso(String procesoinvestigacion) throws Throwable {
		if (!procesoinvestigacion.equals("")) {
			supernotariadoSteps.procesoinvestigacion(procesoinvestigacion);
			}
	}	
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
//@EstudioTitulosDevolver
	@When("^criterios de búsqueda \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void criterios_de_búsqueda_and_and(String criteriodebusqueda, String tipoidentificacion, String numeroidentificacion) throws Throwable {
		if ((!criteriodebusqueda.equals("")) && (!tipoidentificacion.equals("")) && (!numeroidentificacion.equals(""))) {
			supernotariadoSteps.criteriodebusqueda(criteriodebusqueda);
			supernotariadoSteps.tipoidentificacion(tipoidentificacion);
			supernotariadoSteps.numeroidentificacion(numeroidentificacion);	
			supernotariadoSteps.botonbuscar();
		}
	}
	
	@Then("^bandeja investigación de bienes se encuentre cargada$")
	public void bandeja_investigación_de_bienes_se_encuentre_cargada(List<String> controlinvestigacion) throws Throwable {
		supernotariadoSteps.investigaciondebienes(controlinvestigacion);
	}
	
//@EstudioTitulosSinBien
	@Then("^bandeja estudio de titulos se encuentre cargada$")
	public void bandeja_estudio_de_titulos_se_encuentre_cargada(List<String> estudiodetitulos) throws Throwable {
		supernotariadoSteps.estudiodetitulos(estudiodetitulos);
	}

//@EstudioTitulosConBien
	@Then("^bandeja estudio de titulos se encuentre cargada y seleccione un bien a embargar$")
	public void bandeja_estudio_de_titulos_se_encuentre_cargada_y_seleccione_un_bien_a_embargar(List<String> estudiodetitulosbienaembargar) throws Throwable {
		supernotariadoSteps.estudiodetitulosbienaembargar(estudiodetitulosbienaembargar);
	}

//@EstudioTitulosDevolver
	@Then("^bandeja estudio de títulos se encuentre cargada y se desee devolver los expedientes$")
	public void bandeja_estudio_de_títulos_se_encuentre_cargada_y_se_desee_devolver_los_expedientes(List<String> estudiodetitulosdevolverexpedientes) throws Throwable {
		supernotariadoSteps.estudiodetitulosdevolverexpedientes(estudiodetitulosdevolverexpedientes);
	}

}
