package quipux.steps;
//para la construcción de los pasos es necesaria la definición de objetos en .pageobjects.

import java.util.List;

import net.thucydides.core.annotations.Step;
import quipux.pageobjects.QitsAdicionarPage;
import quipux.pageobjects.QitsJuridicaPage;
import quipux.pageobjects.QitsPersonaPage;

public class AdicionarSteps {
//se realiza el llamado de las clases donde se encuentran definidos los objetos.
	QitsPersonaPage qitsPersonaPage;
	QitsJuridicaPage qitsJuridicaPage;
	QitsAdicionarPage qitsAdicionarPage;
//@CrearPersonaNatural	
//@CrearPersonaJurídica
//@AdicionarExpediente
	@Step
	public void menuadicionarexpedientes() {
		qitsPersonaPage.MenuAdicionarExpedientes();
	}
//@CrearPersonaNatural	
//@CrearPersonaJurídica
//@AdicionarExpediente
	@Step
	public void tipoidentificacion(String tipoidentificacion){
		qitsPersonaPage.tipo_identificacion(tipoidentificacion);
	}
//@CrearPersonaNatural	
//@CrearPersonaJurídica
//@AdicionarExpediente
	@Step
	public void numeroidentificacion(String numeroidentificacion){
		qitsPersonaPage.numero_identificacion(numeroidentificacion);
	}
//@CrearPersonaNatural	
	@Step
	public void botonbuscarPersona(String existe){
		qitsPersonaPage.boton_buscar(existe);
	}
//@CrearPersonaJurídica	
	@Step
	public void botonbuscarJuridica(String existe){
		qitsJuridicaPage.boton_buscar_juridica(existe);
	}
//@AdicionarExpediente		
	@Step
	public void botonbuscar(){
		qitsAdicionarPage.boton_buscar_Persona();
	}
//@CrearPersonaNatural	
	@Step
	public void personanaturalnoexite(List<String> datos) {
		qitsPersonaPage.persona_natural_no_existe(datos);
	}
//@CrearPersonaJurídica		
	@Step
	public void personajuridicanoexiste(List<String> datosjuridica) {
		qitsJuridicaPage.persona_juridica_no_existe(datosjuridica);
	}
//@AdicionarExpediente		
	@Step
	public void personaexiste(List<String> adicionar) throws Throwable {
		qitsAdicionarPage.persona_existe(adicionar);
		
	}
}
