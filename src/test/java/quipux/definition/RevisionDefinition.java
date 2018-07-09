package quipux.definition;
//cada método mapea con unos métodos en la clase .steps

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quipux.steps.RevisionSteps;

public class RevisionDefinition {
//se realiza el llamado de la clase donde se encuentran definidos los métodos con los pasos o acciones a realizar.	
	@Steps
	RevisionSteps revisionSteps;
//@PendienteRevisión
//@Devueltos
//@PendienteCorreción
	@Given("^el usuario realizo el previo logueo en la aplicación, seleccionar la opción revisar expedientes$")
	public void el_usuario_realizo_el_previo_logueo_en_la_aplicación_seleccionar_la_opción_revisar_expedientes() throws Throwable {
		revisionSteps.menurevisarexpediente();
	}
//@PendienteRevisión
//@Devueltos
//@PendienteCorreción
	@When("^usuario seleccione opción de búsqueda \"([^\"]*)\"$")
	public void usuario_seleccione_opción_de_búsqueda(String tiporenta) throws Throwable {
		revisionSteps.tiporenta(tiporenta);
	}
//@PendienteRevisión	
//@Devueltos	
	@When("^seleccionar proceso \"([^\"]*)\"$")
	public void seleccionar_proceso(String proceso) throws Throwable {
		if (!proceso.equals("")) {
			revisionSteps.proceso(proceso);
			revisionSteps.botonbuscar();	
		}
	}
//@PendienteCorreción	
	@When("^seleccionar proceso \"([^\"]*)\" and \"([^\"]*)\"$")
	public void  seleccionar_proceso_and(String proceso, String procesoanterior) throws Throwable {
		if (!proceso.equals("") && (!procesoanterior.equals(""))) {
			revisionSteps.proceso(proceso);
			revisionSteps.procesoanterior(procesoanterior);		
			revisionSteps.botonbuscar();	
		}
	}
//@PendienteRevisión
	@When("^bandeja pendiente revisión se encuentre cargada \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void bandeja_pendiente_revisión_se_encuentre_cargada_and(String estado, String observaciones, String tipomotivo, String globoinformativo) throws Throwable {
		revisionSteps.bandejatotalelement(estado, observaciones, tipomotivo, globoinformativo);
	}
//@Devueltos	
	@When("^bandeja devueltos se encuentre cargada \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void bandeja_devueltos_se_encuentre_cargada_and_and_and(String estado, String observaciones, String tipomotivo, String globoinformativo) throws Throwable {
		revisionSteps.bandejatotalelementdevueltos(estado, observaciones, tipomotivo, globoinformativo);
	}
//@PendienteCorreción
	@When("^bandeja pendiente corrección se encuentre cargada \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void bandeja_pendiente_corrección_se_encuentre_cargada_and_and_and_and(String estado, String autoaclaratorio, String observaciones, String tipomotivo, String globoinformativo) throws Throwable {
		revisionSteps.bandejatotalelementpendientecorreccion(estado, autoaclaratorio, observaciones, tipomotivo, globoinformativo);
	}	
}
