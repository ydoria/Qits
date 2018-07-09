package quipux.definition;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quipux.steps.OtrosSteps;


public class OtrosDefinition {
	
	@Steps
	OtrosSteps otrosSteps;

	@Given("^usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control$")
	public void usuario_realizo_el_previo_logueo_en_la_aplicación_seleccionar_la_opción_investigación_y_control() throws Throwable {
		otrosSteps.menuinvestigacionexpedientesotros();
	}
	
	@When("^seleccione opción \"([^\"]*)\"$")
	public void seleccione_opción(String tiporentainvestigacionotros) throws Throwable {
		otrosSteps.tiporentainvestigacionotros(tiporentainvestigacionotros);
	}
	
	@When("^proceso \"([^\"]*)\"$")
	public void proceso(String procesoinvestigacionotros) throws Throwable {
		if (!procesoinvestigacionotros.equals("")) {
			otrosSteps.procesoinvestigacionotros(procesoinvestigacionotros);
		}	
	}

	@When("^seleccione criterios de búsqueda \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void seleccione_criterios_de_búsqueda_and_and(String criteriodebusquedaotros, String tipoidentificacionotros, String numeroidentificacionotros) throws Throwable {
		if ((!criteriodebusquedaotros.equals("")) && (!tipoidentificacionotros.equals("")) && (!numeroidentificacionotros.equals(""))) {
			otrosSteps.criteriodebusquedaotros(criteriodebusquedaotros);
			otrosSteps.tipoidentificacionotros(tipoidentificacionotros);
			otrosSteps.numeroidentificacionotros(numeroidentificacionotros);	
			otrosSteps.botonbuscar();
		}
	}
	
	@Then("^bandeja Investigación de bienes se encuentre cargada proceso cámara de comercio$")
	public void bandeja_Investigación_de_bienes_se_encuentre_cargada_proceso_cámara_de_comercio(List<String> controlinvestigacioncc) throws Throwable {
		otrosSteps.investigaciondebienescc(controlinvestigacioncc);
	}
	
	@Then("^bandeja Investigación de bienes se encuentre cargada proceso cifin$")
	public void bandeja_Investigación_de_bienes_se_encuentre_cargada_proceso_cifin(List<String> controlinvestigacioncifin) throws Throwable {
		otrosSteps.investigaciondebienescifin(controlinvestigacioncifin);
	}
	
	@Then("^bandeja Investigación de bienes se encuentre cargada proceso fosyga$")
	public void bandeja_Investigación_de_bienes_se_encuentre_cargada_proceso_fosyga(List<String> controlinvestigacionfosyga) throws Throwable {
		otrosSteps.investigaciondebienesfosyga(controlinvestigacionfosyga);
	}
	
	@Then("^bandeja Investigación de bienes se encuentre cargada proceso runt$")
	public void bandeja_Investigación_de_bienes_se_encuentre_cargada_proceso_runt(List<String> controlinvestigacionrunt) throws Throwable {
		otrosSteps.investigaciondebienesrunt(controlinvestigacionrunt);
	}



}
