package quipux.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import quipux.pageobjects.QitsOtrosPage;


public class OtrosSteps {

	QitsOtrosPage qitsOtrosPage;
	
	@Step
	public void menuinvestigacionexpedientesotros() {
		qitsOtrosPage.MenuInvestigacionExpedientesOtros();
	}
	
	@Step
	public void tiporentainvestigacionotros(String tiporentainvestigacionotros) {
		qitsOtrosPage.tipo_renta_investigacion_otros(tiporentainvestigacionotros);
	}
	
	@Step
	public void procesoinvestigacionotros(String procesoinvestigacionotros) {
		qitsOtrosPage.proceso_investigacion_otros(procesoinvestigacionotros);
	}
	
	@Step
	public void criteriodebusquedaotros(String criteriodebusquedaotros) {
		qitsOtrosPage.criterio_de_busqueda_otros(criteriodebusquedaotros);
	}
	
	@Step
	public void tipoidentificacionotros(String tipoidentificacionotros) {
		qitsOtrosPage.tipo_identificacion_otros(tipoidentificacionotros);
	}
	
	@Step
	public void numeroidentificacionotros(String numeroidentificacionotros) {
		qitsOtrosPage.numero_identificacion_otros(numeroidentificacionotros);
	}
	@Step
	public void botonbuscar() {
		qitsOtrosPage.boton_buscar();
	}
	
	@Step
	public void investigaciondebienescc(List<String> controlinvestigacioncc) throws Throwable {
		qitsOtrosPage.investigacion_de_bienes_CC(controlinvestigacioncc);
	}
	
	@Step
	public void investigaciondebienescifin(List<String> controlinvestigacioncifin) throws Throwable {
		qitsOtrosPage.investigacion_de_bienes_Cifin(controlinvestigacioncifin);
	}
	
	@Step
	public void investigaciondebienesfosyga(List<String> controlinvestigacionfosyga) throws Throwable {
		qitsOtrosPage.investigacion_de_bienes_Fosyga(controlinvestigacionfosyga);
	}
	
	@Step
	public void investigaciondebienesrunt(List<String> controlinvestigacionrunt) throws Throwable {
		qitsOtrosPage.investigacion_de_bienes_Runt(controlinvestigacionrunt);
	}
}
