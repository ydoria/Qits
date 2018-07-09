package quipux.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import java.util.List;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//clase QitsEstudioPage con la definición de los objetos.
public class QitsEstudioPage extends PageObject {
	
//Botón procesar 
	@FindBy(xpath="//*[@id='formInvestigacionControl:tableEstudioTitulos:0:idProcesarExpedienteEstudioTitulos']/span")
	public WebElementFacade btnprocesar;
//Pestaña invetigación de bienes
	@FindBy(xpath="//*[@id=\"formInvestigacionControl:tabView\"]/ul/li[3]/a")
	public WebElementFacade btninvetigaciondebienes;
//CargarMP
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idBtnContinuarCarteraEstudioTitulo']/span")
	public WebElementFacade btncargarmp;
//CargarMPSi
	@FindBy(xpath="//*[@id='formInvestigacionControl:idBtnSaveConfirmationCargaMP']/span")
	public WebElementFacade btncargarmpsi;
//CargarMP sin dirección
	@FindBy(xpath="//*[@id='formInvestigacionControl:idBtnSaveConfirmationMpCarga']/span")
	public WebElementFacade btncargarmpsindireccion;
//CargarMP con dirección
	@FindBy(xpath="//*[@id='formInvestigacionControl:idBtnCancelConfirmationMpCarga']/span")
	public WebElementFacade btncargarmpcondireccion;
//CargarMP seleccionar
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idFileUploadCargarMandamiento']/div[1]/span")
	public WebElementFacade btnseleccionararchivo;
//CargarMP subir archivo
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idFileUploadCargarMandamiento']/div[1]/button[1]/span[2]")
	public WebElementFacade btnsubirarchivo;
//CargarMP subir archivo
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idBtnSaveAnexos']/span")
	public WebElementFacade btnguardar;
//Globo informativo 
	@FindBy(xpath="//*[@id='formInvestigacionControl:growl_container']/div/div/div[2]/span")
	public WebElementFacade lblgloboinformativo;
//Vista previa
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idBtnContinuarCarteraEstudioTitulo2']/span")
	public WebElementFacade btnvistaprevia;
//Vista previa
	@FindBy(xpath="//*[@id='dialogAnexo']/div[1]/a/span")
	public WebElementFacade btnvistapreviacerrar;
//Mandamiento
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idBtnContinuarCarteraEstudioTitulo3']/span")
	public WebElementFacade btnmandamiento;
//Mandamiento si
	@FindBy(xpath="//*[@id='formInvestigacionControl:idBtnSaveConfirmationTitularDeuda']/span")
	public WebElementFacade btnmandamientosi;
//Mandamiento sin dirección
	@FindBy(xpath="//*[@id='formInvestigacionControl:idBtnSaveConfirmationMpSinDireccion']/span")
	public WebElementFacade btnmandamientosindireccion;
//Mandamiento con dirección
	@FindBy(xpath="//*[@id='formInvestigacionControl:idBtnCancelConfirmationMpSinDireccion']/span")
	public WebElementFacade btnmandamientocondireccion;
//Pestaña Expediente
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView']/ul/li[2]/a")
	public WebElementFacade btnpestañaexpediente;
//Cantidad Expedientes
	@FindBy(xpath="//*[contains(text(),'Cantidad expedientes')]/../span[2]")
	public WebElementFacade lblcantidadexpedientes;
//Botón devolver
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:tableExpedientes:0:idBtnDevolverExpediente']/span")
	public WebElementFacade btndevolver;
//Tipo motivo
	@FindBy(xpath="//*[@id='formDialogDevolucion:tipoMotivoDev']")
	public WebElementFacade cmbtipomotivo;
//Observaciones
	@FindBy(xpath="//*[@id='formDialogDevolucion:observaDev']")
	public WebElementFacade txtobservaciones;
//Botón guardar
	@FindBy(xpath="//*[@id='formDialogDevolucion:idBtnSaveProcesarDevolucion']/span")
	public WebElementFacade btnguardardevolución;
	
	public void estudio_de_titulos(List<String> estudiodetitulos) throws Throwable{
		//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
		Screen  screen = new Screen ();
		btnprocesar.and().click();
		waitFor(2).seconds();
		btninvetigaciondebienes.and().click();
		waitFor(2).seconds();
		Boolean vali = false;
		Boolean vali2 = false;
		int i=1;
		while (vali == false) {
			if (i>=6) {
				vali2=true;
				vali=true;
			}
			try {
				if(findBy("//*[@id='formInvestigacionControl:tabView:tableTitularDeuda_data']/tr["+i+"]/td[1]/div/div[1]/input").isEnabled()) {
					assertThat("Existen datos a seleccionar", containsString("validación"));
					vali=true;
				}else {
					i=i+1;
				}
			}catch (Exception e) {
				// TODO: handle exception
				i=i+1;
			}
		}
		if (vali2==true) {	
		String CargarMP = estudiodetitulos.get(0);
		waitFor(2).seconds();
		String Mandamiento = estudiodetitulos.get(4);
		waitFor(2).seconds();	
		//este condicional me permite controlar el flujo a seguir cuando se desea generar un mandamiento de pago manual.
		if (CargarMP.equals("Si")) {
			btncargarmp.and().click();
			waitFor(2).seconds();
			btncargarmpsi.and().click();
			waitFor(2).seconds();
			switch (estudiodetitulos.get(1)) {
			case "Sin dirección":
				waitFor(2).seconds();
				btncargarmpsindireccion.and().click();
			break;
			case "Con dirección":
				waitFor(2).seconds();
				btncargarmpcondireccion.and().click();
			break;
			}
			waitFor(1).seconds();
			btnseleccionararchivo.and().click();
			waitFor(1).seconds();
			//con este método es posible realizar búsqueda de la evidencia, con la ruta donde se encuentra, la cual es especificada en la historia de usuario.
			screen.paste(estudiodetitulos.get(2));
			waitFor(2).seconds();
			//se digita enter
			screen.type(Key.ENTER);
			waitFor(1).seconds();
			btnsubirarchivo.and().click();
			waitFor(2).seconds();
			btnguardar.and().click();
			waitFor(2).seconds();
			//este método me permite tener control de la información almacenada con éxito.
			assertThat(estudiodetitulos.get(6), containsString(lblgloboinformativo.and().getText()));	
		}
		//este condicional me permite controlar el flujo a seguir cuando se desea generar un mandamiento de pago automático.
		if (Mandamiento.equals("Si")) {
			waitFor(2).seconds();
			btnvistaprevia.and().click();
			waitFor(7).seconds();
			btnvistapreviacerrar.and().click();
			waitFor(2).seconds();
			btnmandamiento.and().click();
			waitFor(2).seconds();
			btnmandamientosi.and().click();
			waitFor(2).seconds();
			switch (estudiodetitulos.get(5)) {
			case "Sin dirección":
				waitFor(2).seconds();
				btnmandamientosindireccion.and().click();
			break;
			case "Con dirección":
				waitFor(2).seconds();
				btnmandamientocondireccion.and().click();
			break;
			}
			waitFor(2).seconds();
			//este método me permite tener control de la información almacenada con éxito.
			assertThat(estudiodetitulos.get(6), containsString(lblgloboinformativo.and().getText()));	
			}
		}		
	}
	
	public void estudio_de_titulos_bien_a_embargar(List<String> estudiodetitulosbienaembargar) throws Throwable{
		//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
		Screen  screen = new Screen ();
		btnprocesar.and().click();
		waitFor(2).seconds();
		btninvetigaciondebienes.and().click();
		waitFor(2).seconds();
		//Se define variable vali para controlar el flujo al momento de seleccionar un bien a embargar
		Boolean vali = false;
		Boolean vali2 = false;
		int i=1;
		while (vali == false) {
				if (i>=6) {
					vali2=true;
					vali=true;
				}
				try {
				if(findBy("//*[@id='formInvestigacionControl:tabView:tableTitularDeuda_data']/tr["+i+"]/td[1]/div/div[1]/input").isEnabled()) {
					findBy("//*[@id='formInvestigacionControl:tabView:tableTitularDeuda_data']/tr["+i+"]/td[1]/div/div[2]/span").and().click();
					vali=true;
				}else {
					i=i+1;
				}
			}catch (Exception e) {
				// TODO: handle exception
				i=i+1;
			}
		}
		if (vali2==true) {
			assertThat("No existen datos a seleccionar", containsString("validación"));	
		}
		String CargarMP = estudiodetitulosbienaembargar.get(0);
		waitFor(2).seconds();
		String Mandamiento = estudiodetitulosbienaembargar.get(4);
		waitFor(2).seconds();
		//este condicional me permite controlar el flujo a seguir cuando se desea generar un mandamiento de pago manual.
		if (CargarMP.equals("Si")) {
			btncargarmp.and().click();
			waitFor(2).seconds();
			btncargarmpsi.and().click();
			waitFor(2).seconds();
			switch (estudiodetitulosbienaembargar.get(1)) {
			case "Sin dirección":
				btncargarmpsindireccion.and().click();
			break;
			case "Con dirección":
				btncargarmpcondireccion.and().click();
			break;
			}
			waitFor(1).seconds();
			btnseleccionararchivo.and().click();
			waitFor(1).seconds();
			//con este método es posible realizar búsqueda de la evidencia, con la ruta donde se encuentra, la cual es especificada en la historia de usuario.
			screen.paste(estudiodetitulosbienaembargar.get(2)); 
			waitFor(2).seconds();
			//se digita enter
			screen.type(Key.ENTER);
			waitFor(1).seconds();
			btnsubirarchivo.and().click();
			waitFor(2).seconds();
			btnguardar.and().click();
			waitFor(2).seconds();
			//este método me permite tener control de la información almacenada con éxito.
			assertThat(estudiodetitulosbienaembargar.get(6), containsString(lblgloboinformativo.and().getText()));	
		}
		if (Mandamiento.equals("Si")) {
			btnvistaprevia.and().click();
			waitFor(2).seconds();
			btnvistapreviacerrar.and().click();
			waitFor(2).seconds();
			btnmandamiento.and().click();
			waitFor(2).seconds();
			btnmandamientosi.and().click();
			waitFor(2).seconds();
			switch (estudiodetitulosbienaembargar.get(5)) {
			case "Sin dirección":
				btnmandamientosindireccion.and().click();
			break;
			case "Con dirección":
				btnmandamientocondireccion.and().click();
			break;
			}
			waitFor(2).seconds();
			//este método me permite tener control de la información almacenada con éxito.
			assertThat(estudiodetitulosbienaembargar.get(6), containsString(lblgloboinformativo.and().getText()));	
		}
	}
	
    public void estudio_de_titulos_devolver_expedientes(List<String> estudiodetitulosdevolverexpedientes) throws Throwable {
    	btnprocesar.and().click();
		waitFor(2).seconds();
		btnpestañaexpediente.and().click();
		for (int j=Integer.parseInt(lblcantidadexpedientes.getText());j>0;j--) {
			//mediante esta definición es posible recorrer la cantidad de expedientes a devolver 
    		String xpath="//*[@id='formInvestigacionControl:tabView:tableExpedientes:0:idBtnDevolverExpediente']/span";
    		waitFor(1).seconds();
    		findBy(xpath).and().click();
    		waitFor(1).seconds();
    		cmbtipomotivo.and().selectByVisibleText(estudiodetitulosdevolverexpedientes.get(0));
    		waitFor(2).seconds();
    		txtobservaciones.and().type(estudiodetitulosdevolverexpedientes.get(1));
    		waitFor(1).seconds();
    		btnguardardevolución.and().click();
    		waitFor(2).seconds();
    		//este método me permite tener control de la información almacenada con éxito.
    		assertThat(estudiodetitulosdevolverexpedientes.get(2), containsString(lblgloboinformativo.and().getText()));
    		waitFor(1).seconds();
    		if (j>1) {
        	btnprocesar.and().click();
    		waitFor(2).seconds();
    		btnpestañaexpediente.and().click();	
    		}
		}
    }
}
