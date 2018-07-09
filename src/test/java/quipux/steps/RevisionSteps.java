package quipux.steps;
//para la construcción de los pasos es necesaria la definición de objetos en .pageobjects.

import net.thucydides.core.annotations.Step;
import quipux.pageobjects.QitsRevisionPage;


public class RevisionSteps {
//se realiza el llamado de las clases donde se encuentran definidos los objetos.	
	QitsRevisionPage qitsRevisionPage;
//@PendienteRevisión	
//@Devueltos
//@PendienteCorreción
	@Step
	public void menurevisarexpediente() {
		qitsRevisionPage.MenuRevisarExpedientes();
	}
//@PendienteRevisión	
//@Devueltos
//@PendienteCorreción
	@Step
	public void tiporenta(String tiporenta){
		qitsRevisionPage.tipo_renta(tiporenta);
	}
//@PendienteRevisión
//@Devueltos
//@PendienteCorreción
	@Step
	public void proceso(String proceso){
		qitsRevisionPage.proceso(proceso);
	}
//@PendienteCorreción	
	@Step
	public void procesoanterior(String procesoanterior){
		qitsRevisionPage.procesoanterior(procesoanterior);
	}
//@PendienteRevisión
//@Devueltos
//@PendienteCorreción
	@Step
	public void botonbuscar(){
		qitsRevisionPage.boton_buscar();
	}
//@PendienteRevisión	
	@Step
	public void bandejatotalelement(String estado, String observaciones, String tipomotivo, String globoinformativo) throws Throwable{
		qitsRevisionPage.bandeja_total_element(estado, observaciones, tipomotivo, globoinformativo);
	}
//@Devueltos	
	@Step
	public void bandejatotalelementdevueltos(String estado, String observaciones, String tipomotivo, String globoinformativo) throws Throwable{
		qitsRevisionPage.bandeja_total_element_devueltos(estado, observaciones, tipomotivo, globoinformativo);
	}
//@PendienteCorreción	
	@Step
	public void bandejatotalelementpendientecorreccion(String estado, String autoaclaratorio, String observaciones, String tipomotivo, String globoinformativo) throws Throwable{
		qitsRevisionPage.bandeja_total_element_pendiente_correccion(estado, autoaclaratorio, observaciones, tipomotivo, globoinformativo);
	}
}
