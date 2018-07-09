package quipux.steps;
//para la construcción de los pasos es necesaria la definición de objetos en .pageobjects.
import java.util.List;

import net.thucydides.core.annotations.Step;
import quipux.pageobjects.QitsEstudioPage;
import quipux.pageobjects.QitsSupernotariadoPage;

public class SupernotariadoSteps {
//se realiza el llamado de las clases donde se encuentran definidos los objetos.	
	QitsSupernotariadoPage qitsSupernotariadoPage;
	QitsEstudioPage qitsEstudioPage;
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
	@Step
	public void menuinvestigacionexpedientes() {
		qitsSupernotariadoPage.MenuInvestigacionExpedientes();
	}
//@EstudioTitulosSinBien	
//@EstudioTitulosConBien
	@Step
	public void tiporentainvestigacion(String tiporentainvestigacion) {
		qitsSupernotariadoPage.tipo_renta_investigacion(tiporentainvestigacion);
	}
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
	@Step
	public void procesoinvestigacion(String procesoinvestigacion) {
		qitsSupernotariadoPage.proceso_investigacion(procesoinvestigacion);
	}
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
	@Step
	public void criteriodebusqueda(String criteriodebusqueda) {
		qitsSupernotariadoPage.criterio_de_busqueda(criteriodebusqueda);
	}
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
	@Step
	public void tipoidentificacion(String tipoidentificacion) {
		qitsSupernotariadoPage.tipo_identificacion(tipoidentificacion);
	}
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
	@Step
	public void numeroidentificacion(String numeroidentificacion) {
		qitsSupernotariadoPage.numero_identificacion(numeroidentificacion);
	}
//@EstudioTitulosSinBien
//@EstudioTitulosConBien
	@Step
	public void botonbuscar() {
		qitsSupernotariadoPage.boton_buscar();
	}
	@Step
	public void investigaciondebienes(List<String> controlinvestigacion) throws Throwable {
		qitsSupernotariadoPage.investigacion_de_bienes(controlinvestigacion);
	}
//@EstudioTitulosSinBien
	@Step
	public void estudiodetitulos(List<String> estudiodetitulos) throws Throwable {
		qitsEstudioPage.estudio_de_titulos(estudiodetitulos);
	}
//@EstudioTitulosConBien
	@Step
	public void estudiodetitulosbienaembargar(List<String> estudiodetitulosbienaembargar) throws Throwable {
		qitsEstudioPage.estudio_de_titulos_bien_a_embargar(estudiodetitulosbienaembargar);
	}
//@EstudioTitulosDevolver
	@Step
	public void estudiodetitulosdevolverexpedientes(List<String> estudiodetitulosdevolverexpedientes) throws Throwable {
		qitsEstudioPage.estudio_de_titulos_devolver_expedientes(estudiodetitulosdevolverexpedientes);
	}
}
