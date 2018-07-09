package quipux.pageobjects;


import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.List;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//clase QitsAdicionarPage con la definición de los objetos.
public class QitsAdicionarPage extends PageObject {
	
//Botón buscar
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:buttonFindPersona']")
	public WebElementFacade btnbuscar;
//Cartera 
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente']/ul/li[2]/a")
	public WebElementFacade btncartera;
//Cartera adicionar
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:idAdicionarCartera']/span")
	public WebElementFacade btnadicionar;
//Cartera acuerdo pago
	@FindBy(xpath="//*[@id='formDetalleCartera:acuerdoPago']")
	public WebElementFacade btnacuerdopago;
//Cartera placa
	@FindBy(xpath="//*[@id='formDetalleCartera:textIdentificadorCartera']")
	public WebElementFacade txtplaca;
//Cartera cuantía 
	@FindBy(xpath="//*[@id='formDetalleCartera:textCuantia']")
	public WebElementFacade txtcuantia;
//Cartera intereses 
	@FindBy(xpath="//*[@id='formDetalleCartera:textInteres']")
	public WebElementFacade txtintereses;
//Cartera fecha ingreso  
	@FindBy(xpath="//*[@id='formDetalleCartera:textFechaAdquisicion']")
	public WebElementFacade txtfechaingreso;
//Cartera nro. resolución   
	@FindBy(xpath="//*[@id='formDetalleCartera:textNroTituloEjecutivo']")
	public WebElementFacade txtnumeroresolucion;
//Cartera fecha resolución   
	@FindBy(xpath="//*[@id='formDetalleCartera:textFechaResolucion']")
	public WebElementFacade txtfecharesolucion;
//Cartera valor iva   
	@FindBy(xpath="//*[@id='formDetalleCartera:textValorIva']")
	public WebElementFacade txtvaloriva;
//Cartera valor patio    
	@FindBy(xpath="//*[@id='formDetalleCartera:textValorPatio']")
	public WebElementFacade txtvalorpatio;
//Cartera valor grua    
	@FindBy(xpath="//*[@id='formDetalleCartera:textValorGrua']")
	public WebElementFacade txtvalorgrua;
//Cartera observaciones    
	@FindBy(xpath="//*[@id='formDetalleCartera:textObservacionesCartera']")
	public WebElementFacade txtobservaciones;
//Cartera botón guardar    
	@FindBy(xpath="//*[@id='formDetalleCartera:idBtnSaveExpediente']/span")
	public WebElementFacade btnguardar;
//Cartera seleccionar archivo  
	@FindBy(xpath="//*[@id='formDetalleCartera:fileUploadAnexos']/div[1]/span")
	public WebElementFacade btnseleccionar;
//Cartera subir archivo    
	@FindBy(xpath="//*[@id='formDetalleCartera:fileUploadAnexos']/div[1]/button[1]")
	public WebElementFacade btnsubirarchivo;
//Cartera conformar expediente    
	@FindBy(xpath="//*[@id='formDetalleCartera:idBtnConformarExpediente']/span")
	public WebElementFacade btnconformarexpediente;
//Cartera conformar expediente si    
	@FindBy(xpath="//*[@id='formDetalleCartera:idBtnConformarExpedienteSI']/span")
	public WebElementFacade btnconformarexpedientesi;
//Cartera intereses ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textInteresAp']")
	public WebElementFacade txtinteresesap;
//Cartera Nro acuerdo pago ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textNumeroAp']")
	public WebElementFacade txtnroacuerdopagoap;
//Cartera fecha acuerdo pago ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textFechaAp']")
	public WebElementFacade txtfechaacuerdoap;
//Cartera placa ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textIdentificadorDeudaAp']")
	public WebElementFacade txtplacaap;
//Cartera nro. resolución ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textNroTituloEjecutivoAp']")
	public WebElementFacade txtnroresolucionap;
//Cartera fecha resolución ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textFechaResolucionAp']")
	public WebElementFacade txtfecharesolucionap;
//Cartera valor acuerdo pago ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textValorAp']")
	public WebElementFacade txtvaloracuerdopagoap;
//Cartera valor cancelado ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textCanceladoAp']")
	public WebElementFacade txtvalorcanceladoap;
//Cartera valor capital ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textCapitalAp']")
	public WebElementFacade txtvalorcapitalap;
//Cartera valor iva ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textValorIvaAp']")
	public WebElementFacade txtvalorivaap;
//Cartera saldo acuerdo pago ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textSaldoAp']")
	public WebElementFacade txtsaldoacuerdopagoap;
//Cartera saldo acuerdo pago ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textFechaPrescripcionApi']")
	public WebElementFacade txtfechaprescripcion;
//Cartera observaciones ap
	@FindBy(xpath="//*[@id='formDetalleCartera:textObservacionesCarteraAp']")
	public WebElementFacade txtobservacionesap;
//Globo informativo
	@FindBy(xpath="//*[@id='idMessagesGlobal']/div/ul/li/span")
	public WebElementFacade lblgloboinformativo;
		
//método que me permite buscar la persona que ya existe	
	public void boton_buscar_Persona() {
		btnbuscar.click();
	}
	
	public void persona_existe(List<String> adicionar) throws Throwable {
		//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
		Screen  screen = new Screen ();
		btncartera.and().click();
		btnadicionar.and().click();
		String acuerdo = adicionar.get(0);
		//en este método se realiza el control cuando el deudor no realiza acuerdo pago
		if (acuerdo.equals("No")) {
			txtplaca.and().type(adicionar.get(1));
			waitFor(1).seconds();
			txtcuantia.and().type(adicionar.get(2));
			waitFor(1).seconds();
			txtintereses.and().type(adicionar.get(3));
			waitFor(1).seconds();
			txtfechaingreso.and().type(adicionar.get(4));
			waitFor(1).seconds();
			txtnumeroresolucion.and().type(adicionar.get(5));
			waitFor(1).seconds();
			txtfecharesolucion.and().type(adicionar.get(6));
			waitFor(1).seconds();
			txtvaloriva.and().type(adicionar.get(7));
			waitFor(1).seconds();
			txtvalorpatio.and().type(adicionar.get(8));
			waitFor(1).seconds();
			txtvalorgrua.and().type(adicionar.get(9));
			waitFor(1).seconds();
			txtobservaciones.and().type(adicionar.get(10));	
			waitFor(1).seconds();
		//en este método se realiza el control cuando el deudor si realiza acuerdo pago
		}	else if (acuerdo.equals("Si")){
			waitFor(1).seconds();
			btnacuerdopago.and().click();
			waitFor(1).seconds();
			txtinteresesap.and().type(adicionar.get(11));
			waitFor(1).seconds();
			txtnroacuerdopagoap.and().type(adicionar.get(12));
			waitFor(1).seconds();
			txtfechaacuerdoap.and().type(adicionar.get(13));
			waitFor(1).seconds();
			txtplacaap.and().type(adicionar.get(14));
			waitFor(1).seconds();
			txtnroresolucionap.and().type(adicionar.get(15));
			waitFor(1).seconds();
			txtfecharesolucionap.and().type(adicionar.get(16));
			waitFor(1).seconds();
			txtvaloracuerdopagoap.and().type(adicionar.get(17));
			waitFor(1).seconds();
			txtvalorcanceladoap.and().type(adicionar.get(18));
			waitFor(1).seconds();
			txtvalorcapitalap.and().type(adicionar.get(19));
			waitFor(1).seconds();
			txtvalorivaap.and().type(adicionar.get(20));
			waitFor(1).seconds();
			txtsaldoacuerdopagoap.and().type(adicionar.get(21));
			waitFor(1).seconds();
			txtobservacionesap.and().type(adicionar.get(22));
		}
		btnguardar.and().click();
		waitFor(1).seconds();
		btnseleccionar.and().click();
		waitFor(1).seconds();
		//en este método se realiza el control para subir la evidencia cuando la persona realiza acuerdo de pago o no.
		//Se pega la ruta especificada en la historia de usuario.
		screen.paste(adicionar.get(23));
		//se digita enter
		screen.type(Key.ENTER);
		waitFor(1).seconds();
		btnsubirarchivo.and().click();
		waitFor(2).seconds();
		btnguardar.and().click();
		waitFor(2).seconds();
		btnconformarexpediente.and().click();
		waitFor(2).seconds();
		btnconformarexpedientesi.and().click();
		waitFor(2).seconds();
		assertThat(lblgloboinformativo.and().getText(), containsString(adicionar.get(24))); 
		waitFor(1).seconds();
	}
}
