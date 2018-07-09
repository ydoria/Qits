package quipux.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import java.util.List;
import org.openqa.selenium.Keys;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


//clase QitsSupernotariadoPage con la definición de los objetos.
public class QitsSupernotariadoPage extends PageObject {

//Menú Investigación
	@FindBy(xpath="//A[@href='#'][text()=' INVESTIGACIÓN']")
	public WebElementFacade menuInvestigacion;
//Submenú Investigación y control
	@FindBy(xpath="//*[@id='idMenuinvestigacionControl']")
	public WebElementFacade menuInvestigacionycontrol;
//Tipo renta
	@FindBy(xpath="//*[@id='formInvestigacionControl:selectRenta']")
	public WebElementFacade cmbtiporenta;
//Proceso
	@FindBy(xpath="//*[@id='formInvestigacionControl:selectProceso']")
	public WebElementFacade cmbproceso;
//Criterio de búsqueda
	@FindBy(xpath="//*[@id='formInvestigacionControl:selectExtraCriterio']")
	public WebElementFacade cmbcriteriodebusqueda;
//Tipo de identificación 
	@FindBy(xpath="//*[@id='formInvestigacionControl:selectIdentificacion']")
	public WebElementFacade cmbtipoidentificacion;
//Nro. Identificación 
	@FindBy(xpath="//*[@id='formInvestigacionControl:textNroIdentificacion']")
	public WebElementFacade txtnroidentificacion;
//Botón buscar
	@FindBy(xpath="//*[@id='formInvestigacionControl:idBtnFindAsignarInvestigacion']/span")
	public WebElementFacade btnbuscar;
//Botón procesar 
	@FindBy(xpath="//*[@id='formInvestigacionControl:tableInvestigacion:0:idProcesarExpedienteInvestigacion']/span")
	public WebElementFacade btnprocesar;
//Pestaña investigación de bienes 
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView']/ul/li[3]/a")
	public WebElementFacade btninvestigaciondebienes;
//Botón adicionar
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idBtnAdicionarInvestigacion']/span")
	public WebElementFacade btnadicionar;
//Posee bien
	@FindBy(xpath="//*[@id='formDetalleCartera:selectPoseeBien']/span[2]")
	public WebElementFacade btnposeebien;
//Sistema de consulta 
	@FindBy(xpath="//*[@id='formDetalleCartera:selectEntidad']")
	public WebElementFacade cmbsistemaconsulta;
//Entidad
	@FindBy(xpath="//*[@id='formDetalleCartera:selectEntidadReg_label']")
	public WebElementFacade cmbentidad;
//Entidad buscar
	@FindBy(xpath="//*[@id='formDetalleCartera:selectEntidadReg_filter']")
	public WebElementFacade cmbentidadbuscar;
//Nro. matrícula 
	@FindBy(xpath="//*[@id='formDetalleCartera:textIdentificadorBien']")
	public WebElementFacade txtnromatricula;
//Medida inmueble
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:0:select']")
	public WebElementFacade cmbmedidainmueble;
//Dirección inmueble
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:1:idBtnAdicionarDireccion']/span")
	public WebElementFacade btndireccionadicionar;
//Dirección pais
	@FindBy(xpath="//*[@id='formDireccion:tablaSelectPais']")
	public WebElementFacade cmbpais;
//Dirección departamento
	@FindBy(xpath="//*[@id='formDireccion:tablaSelectDep']")
	public WebElementFacade cmbdepartamento;
//Dirección ciudad
	@FindBy(xpath="//*[@id='formDireccion:tablaSelectCiudad']")
	public WebElementFacade cmbciudad;
//Dirección tipo via
	@FindBy(xpath="//*[@id='formDireccion:selectTipoViaPersona']")
	public WebElementFacade cmbtipovia;
//Dirección Nro. via
	@FindBy(xpath="//*[@id='formDireccion:inputNumeroVia']")
	public WebElementFacade txtnrovia;
//Dirección Nro. via 1
	@FindBy(xpath="//*[@id='formDireccion:idSufijoVia1']")
	public WebElementFacade cmbnrovia1;
//Dirección Nro. via 2
	@FindBy(xpath="//*[@id='formDireccion:idCardinalidadVia1']")
	public WebElementFacade cmbnrovia2;
//Dirección barrio
	@FindBy(xpath="//*[@id='formDireccion:inputBarrio']")
	public WebElementFacade txtbarrio;
//Dirección tipo
	@FindBy(xpath="//*[@id='formDireccion:selectTipDir']")
	public WebElementFacade cmbtipodireccion;
//Dirección primer numero
	@FindBy(xpath="//*[@id='formDireccion:inputPrimerNumero']")
	public WebElementFacade txtnumero;
//Dirección primer numero 1
	@FindBy(xpath="//*[@id='formDireccion:idSufijoPrimerNro']")
	public WebElementFacade cmbnumero1;
//Dirección primer numero 2
	@FindBy(xpath="//*[@id='formDireccion:idCardinalidadPrimerNro']")
	public WebElementFacade cmbnumero2;
//Dirección segundo numero 
	@FindBy(xpath="//*[@id='formDireccion:inputSegundoNumero']")
	public WebElementFacade txtnumeros;
//Dirección segundo numero 1
	@FindBy(xpath="//*[@id='formDireccion:idCardinalidadSegundoNro']")
	public WebElementFacade cmbnumeros1;
//Dirección codigo postal
	@FindBy(xpath="//*[@id='formDireccion:inputCodPostal']")
	public WebElementFacade txtcodigopostal;
//Dirección autoriza envio informacion si
	@FindBy(xpath="//*[@id='formDireccion:selectAutorizacionEnvioInfo:0']")
	public WebElementFacade rdbautorizasi;
//Dirección autoriza envio informacion no
	@FindBy(xpath="//*[@id='formDireccion:selectAutorizacionEnvioInfo:1']")
	public WebElementFacade rdbautorizano;
//Dirección activa si
	@FindBy(xpath="//*[@id='formDireccion:selectActivo:0']")
	public WebElementFacade rdbactivasi;
//Dirección activa no
	@FindBy(xpath="//*[@id='formDireccion:selectActivo:1']")
	public WebElementFacade rdbactivano;
//Dirección complemento
	@FindBy(xpath="//*[@id='formDireccion:inputComplementoDireccion']")
	public WebElementFacade txtcomplemento;
//Botón guardar
	@FindBy(xpath="//*[@id='formDireccion:idBTnSaveDireccionOfiInstrumentos']/span")
	public WebElementFacade btnguardar;
//Radicado proceso 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:3:index']")
	public WebElementFacade txtradicadoproceso;
//Juzgado o entidad
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:4:index']")
	public WebElementFacade txtjuzgadoentidad;
//Dirección juzgado 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:5:idBtnAdicionarDireccionJuzgado']/span")
	public WebElementFacade btnjuzgadoadicionar;
//Dirección pais juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:tablaSelectPais']")
	public WebElementFacade cmbpaisjuzgado;
//Dirección departamento juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:tablaSelectDep']")
	public WebElementFacade cmbdepartamentojuzgado;
//Dirección ciudad juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:tablaSelectCiudad']")
	public WebElementFacade cmbciudadjuzgado;
//Dirección tipo via juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:selectTipoViaPersona']")
	public WebElementFacade cmbtipoviajuzgado;
//Dirección Nro. via juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputNumeroVia']")
	public WebElementFacade txtnroviajuzgado;
//Dirección Nro. via 1 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idSufijoVia1']")
	public WebElementFacade cmbnrovia1juzgado;
//Dirección Nro. via 2 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idCardinalidadVia1']")
	public WebElementFacade cmbnrovia2juzgado;
//Dirección barrio juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputBarrio']")
	public WebElementFacade txtbarriojuzgado;
//Dirección tipo juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:selectTipDir']")
	public WebElementFacade cmbtipodireccionjuzgado;
//Dirección primer numero juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputPrimerNumero']")
	public WebElementFacade txtnumerojuzgado;
//Dirección primer numero 1 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idSufijoPrimerNumeroJuz']")
	public WebElementFacade cmbnumero1juzgado;
//Dirección primer numero 2 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idCardinalidadPrimerNumeroJuz']")
	public WebElementFacade cmbnumero2juzgado;
//Dirección segundo numero juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputSegundoNumero']")
	public WebElementFacade txtnumerosjuzgado;
//Dirección segundo numero 1 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idCardinalidadSegundoNumeroJuz']")
	public WebElementFacade cmbnumeros1juzgado;
//Dirección codigo postal juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputCodPostal']")
	public WebElementFacade txtcodigopostaljuzgado;
//Dirección autoriza envio informacion si juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:selectAutorizacionEnvioInfo:0']")
	public WebElementFacade rdbautorizasijuz;
//Dirección autoriza envio informacion no juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:selectAutorizacionEnvioInfo:1']")
	public WebElementFacade rdbautorizanojuz;
//Dirección activa si juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:selectActivo:0']")
	public WebElementFacade rdbactivasijuz;
//Dirección activa no juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:selectActivo:1']")
	public WebElementFacade rdbactivanojuz;
//Dirección complemento juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputComplementoDireccion']")
	public WebElementFacade txtcomplementojuz;
//Botón guardar juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idBtnSaveDireccionJuzgadoOIP']/span")
	public WebElementFacade btnguardarjuzgado;
//Tipo proceso 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:7:index']")
	public WebElementFacade txttipoproceso;
//Demandante
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:8:index']")
	public WebElementFacade txtdemandante;
//Entidad_inmueble
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:9:index']")
	public WebElementFacade txtentidadinmueble;
//Nro. Escritura 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:10:index']")
	public WebElementFacade txtnroescritura;
//Fecha de escritura 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:11:fecha']")
	public WebElementFacade txtfechaescritura;
//Nombre y Nro. Notaría 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:12:index']")
	public WebElementFacade txtnombreynronotaria;
//Ciudad notaría 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:13:index']")
	public WebElementFacade txtciudadnotaría;
//Nro. Anotación	
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:14:index']")
	public WebElementFacade txtnroanotación;
//Observaciones	
	@FindBy(xpath="//*[@id='formDetalleCartera:textObservaciones']")
	public WebElementFacade txtobservaciones;
//Seleccionar archivo
	@FindBy(xpath="//*[@id='formDetalleCartera:idFileUploadAnexoInvestigacion']/div[1]/span")
	public WebElementFacade btnseleccionar;
//Subir archivos
	@FindBy(xpath="//*[@id='formDetalleCartera:idFileUploadAnexoInvestigacion']/div[1]/button[1]/span[2]")
	public WebElementFacade btnsubirarchivos;
//Guardar investigacion
	@FindBy(xpath="//*[@id='formDetalleCartera:idBtnRegistroBienAnexos']/span")
	public WebElementFacade btnguardarinvestigacion;
//Globo informativo 
	@FindBy(xpath="//*[@id='formDetalleCartera:growl_container']/div/div/div[2]/span")
	public WebElementFacade lblgloboinformativoinvestigacion;
//Botón volver
	@FindBy(xpath="//*[@id='formDetalleCartera:idBtnVolverDetalleBien']/span")
	public WebElementFacade btnvolver;
//Botón continuar
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idBtnContinuarCarteraInvestigacion']/span")
	public WebElementFacade btncontinuar;
//Botón continuar otros
	@FindBy(xpath="//*[@id='formDialogContinuar:selectContinuarInv']/tbody/tr[1]/td[1]/div/div[2]/span")
	public WebElementFacade rdbotros;
//Botón continuar devolver
	@FindBy(xpath="//*[@id='formDialogContinuar:selectContinuarInv']/tbody/tr[3]/td[1]/div/div[2]/span")
	public WebElementFacade rdbdevolver;
//Botón continuar guardar
	@FindBy(xpath="//*[@id='formDialogContinuar:idBtnSaveContinuarInvestigacion']/span")
	public WebElementFacade btncontinuarguardar;
//Botón continuar devolver tipo motivo
	@FindBy(xpath="//*[@id='formDialogContinuar:tipoMotivoCont']")
	public WebElementFacade cmbtipomotivo;
//Botón continuar devolver descripcion
	@FindBy(xpath="//*[@id='formDialogContinuar:observacionCont']")
	public WebElementFacade txtcontinuarobservaciones;
//Botón continuar globo informativo
	@FindBy(xpath="//*[@id='formInvestigacionControl:growl_container']/div/div/div[2]/span")
	public WebElementFacade lblgloboinformativo;
	
	//método donde se interactúa con el menú, clic en investigación, clic en investigación y control.
		public void MenuInvestigacionExpedientes() {
			menuInvestigacion.click();
			menuInvestigacionycontrol.click();
		}
		
	//método que permite interactuar con los tipos de renta posibles a ser utilizados.	
		public void tipo_renta_investigacion(String tiporentainvestigacion){
			cmbtiporenta.and().selectByVisibleText(tiporentainvestigacion);
		}
		
	//método que permite seleccionar el proceso a ser utilizado 	
		public void proceso_investigacion(String procesoinvestigacion) {
			/*en este condicional es posible controlar cuando la bandeja ya se encuentre cargada, es decir, si la bandeja ya está cargada el robot seguirá validando siempre y cuando el campo 
			'proceso' que está definido en la historia de usuario se encuentre vacío.*/
			if (!procesoinvestigacion.equals("")) {
				cmbproceso.and().selectByVisibleText(procesoinvestigacion);	
			}
		}
	//método que permite interactuar con el criterio de búsqueda a ser utilizado.	
		public void criterio_de_busqueda(String criteriodebusqueda) {
			if (!criteriodebusqueda.equals("")) {
				cmbcriteriodebusqueda.and().selectByVisibleText(criteriodebusqueda);
			}
		}
		
	//método que permite interactuar con los tipos de identificación posibles a ser utilizados.	
		public void tipo_identificacion(String tipoidentificacion) {
			if (!tipoidentificacion.equals("")) {
				cmbtipoidentificacion.and().selectByVisibleText(tipoidentificacion);
			}
		}
	//método que permite digitar el número de identificación 	
		public void numero_identificacion(String numeroidentificacion) {
			if (!numeroidentificacion.equals("")) {
				txtnroidentificacion.and().type(numeroidentificacion);
			}	
		}
	//método que me permite buscar la bandeja según criterio de búsqueda
		public void boton_buscar() {
			btnbuscar.click();
		}
	//método que me permite indicarle al robot el camino a seguir según el caso.	
		public void investigacion_de_bienes(List<String> controlinvestigacion) throws Throwable {
			//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
			Screen  screen = new Screen ();
			btnprocesar.and().click();
			waitFor(1).seconds();
			btninvestigaciondebienes.and().click();
			waitFor(1).seconds();
			btnadicionar.and().click();
			waitFor(1).seconds();
			String posee = controlinvestigacion.get(0);
			//en este método se realiza el control cuando el deudor posee un bien 
			if (posee.equals("Si")) {
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacion.get(1));
				waitFor(2).seconds();
				cmbentidad.and().click();
				waitFor(1).seconds();
				cmbentidadbuscar.sendKeys(controlinvestigacion.get(2));
				cmbentidadbuscar.sendKeys(Key.ENTER);
				waitFor(1).seconds();
				txtnromatricula.and().type(controlinvestigacion.get(3));
				waitFor(3).seconds();
				cmbmedidainmueble.and().click();
				waitFor(1).seconds();
				cmbmedidainmueble.and().selectByVisibleText(controlinvestigacion.get(4));
				waitFor(2).seconds();
				btndireccionadicionar.and().click();
				waitFor(1).seconds();
				cmbpais.and().selectByVisibleText(controlinvestigacion.get(5));
				waitFor(2).seconds();
				cmbdepartamento.and().selectByVisibleText(controlinvestigacion.get(6));
				waitFor(2).seconds();
				cmbciudad.and().selectByVisibleText(controlinvestigacion.get(7));
				waitFor(2).seconds();
				cmbtipovia.and().selectByVisibleText(controlinvestigacion.get(8));
				waitFor(1).seconds();
				txtnrovia.and().type(controlinvestigacion.get(9));
				txtnrovia.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnrovia1.and().selectByVisibleText(controlinvestigacion.get(10));
				waitFor(1).seconds();
				cmbnrovia2.and().selectByVisibleText(controlinvestigacion.get(11));
				waitFor(1).seconds();
				txtbarrio.and().type(controlinvestigacion.get(12));
				waitFor(1).seconds();
				cmbtipodireccion.and().selectByVisibleText(controlinvestigacion.get(13));
				waitFor(1).seconds();
				txtnumero.and().type(controlinvestigacion.get(14));
				txtnumero.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumero1.and().selectByVisibleText(controlinvestigacion.get(15));
				waitFor(1).seconds();
				cmbnumero2.and().selectByVisibleText(controlinvestigacion.get(16));
				waitFor(1).seconds();
				txtnumeros.and().type(controlinvestigacion.get(17));
				txtnumeros.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumeros1.and().selectByVisibleText(controlinvestigacion.get(18));
				waitFor(1).seconds();
				txtcodigopostal.and().type(controlinvestigacion.get(19));
				waitFor(1).seconds();
				//este condicional me permite tener control de los radio buttons, según lo que sea especificado en la historia de usuario.
				switch (controlinvestigacion.get(20)) {
				case "Si":
					rdbautorizasi.and().click();
				break;
				case "No":
					rdbautorizano.and().click();
				break;
				}	
				waitFor(1).seconds();
				switch (controlinvestigacion.get(21)) {
				case "Si":
					rdbactivasi.and().click();
				break;
				case "No":
					rdbactivano.and().click();
				break;
				}	
				waitFor(1).seconds();
				txtcomplemento.and().type(controlinvestigacion.get(22));
				waitFor(1).seconds();
				btnguardar.and().click();
				waitFor(1).seconds();
				txtradicadoproceso.and().type(controlinvestigacion.get(23));
				waitFor(1).seconds();
				txtjuzgadoentidad.and().type(controlinvestigacion.get(24));
				waitFor(1).seconds();
				btnjuzgadoadicionar.and().click();
				waitFor(1).seconds();
				cmbpaisjuzgado.and().selectByVisibleText(controlinvestigacion.get(25));
				waitFor(2).seconds();
				cmbdepartamentojuzgado.and().selectByVisibleText(controlinvestigacion.get(26));
				waitFor(2).seconds();
				cmbciudadjuzgado.and().selectByVisibleText(controlinvestigacion.get(27));
				waitFor(2).seconds();
				cmbtipoviajuzgado.and().selectByVisibleText(controlinvestigacion.get(28));
				waitFor(1).seconds();
				txtnroviajuzgado.and().type(controlinvestigacion.get(29));
				txtnroviajuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnrovia1juzgado.and().selectByVisibleText(controlinvestigacion.get(30));
				waitFor(1).seconds();
				cmbnrovia2juzgado.and().selectByVisibleText(controlinvestigacion.get(31));
				waitFor(1).seconds();
				txtbarriojuzgado.and().type(controlinvestigacion.get(32));
				waitFor(1).seconds();
				cmbtipodireccionjuzgado.and().selectByVisibleText(controlinvestigacion.get(33));
				waitFor(1).seconds();
				txtnumerojuzgado.and().type(controlinvestigacion.get(34));
				txtnumerojuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumero1juzgado.and().selectByVisibleText(controlinvestigacion.get(35));
				waitFor(1).seconds();
				cmbnumero2juzgado.and().selectByVisibleText(controlinvestigacion.get(36));
				waitFor(1).seconds();
				txtnumerosjuzgado.and().type(controlinvestigacion.get(37));
				txtnumerosjuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumeros1juzgado.and().selectByVisibleText(controlinvestigacion.get(38));
				waitFor(1).seconds();
				txtcodigopostaljuzgado.and().type(controlinvestigacion.get(39));
				waitFor(1).seconds();
				switch (controlinvestigacion.get(40)) {
				case "Si":
					rdbautorizasijuz.and().click();
				break;
				case "No":
					rdbautorizanojuz.and().click();
				break;
				}	
				waitFor(1).seconds();
				switch (controlinvestigacion.get(41)) {
				case "Si":
					rdbactivasijuz.and().click();
				break;
				case "No":
					rdbactivanojuz.and().click();
				break;
				}	
				waitFor(1).seconds();
				txtcomplementojuz.and().type(controlinvestigacion.get(42));
				waitFor(1).seconds();
				btnguardarjuzgado.and().click();
				waitFor(1).seconds();
				txttipoproceso.and().type(controlinvestigacion.get(43));
				waitFor(1).seconds();
				txtdemandante.and().type(controlinvestigacion.get(44));
				waitFor(1).seconds();
				txtentidadinmueble.and().type(controlinvestigacion.get(45));
				waitFor(1).seconds();
				txtnroescritura.and().type(controlinvestigacion.get(46));
				waitFor(1).seconds();
				txtfechaescritura.and().type(controlinvestigacion.get(47));
				waitFor(1).seconds();
				txtnombreynronotaria.and().type(controlinvestigacion.get(48));
				waitFor(1).seconds();
				txtciudadnotaría.and().type(controlinvestigacion.get(49));
				waitFor(1).seconds();
				txtnroanotación.and().type(controlinvestigacion.get(50));
				waitFor(1).seconds();
				txtobservaciones.and().type(controlinvestigacion.get(51));	
				waitFor(1).seconds();
			//en este método se realiza el control cuando el deudor no posee un bien
			} else if (posee.equals("No")) {
				btnposeebien.and().click();
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacion.get(1));
				waitFor(2).seconds();
			}
			if (!controlinvestigacion.get(52).equals("")) {
			btnseleccionar.and().click();
			waitFor(1).seconds();
			//en este método se realiza el control para subir la evidencia cuando la persona realiza acuerdo de pago o no.
			//Se pega la ruta especificada en la historia de usuario.
			screen.paste(controlinvestigacion.get(52));
			waitFor(1).seconds();
			//se digita enter
			screen.type(Key.ENTER);
			waitFor(1).seconds();
			btnsubirarchivos.and().click();
			waitFor(1).seconds();
			btnguardarinvestigacion.and().click();
			waitFor(1).seconds();
			assertThat(controlinvestigacion.get(53), containsString(lblgloboinformativoinvestigacion.and().getText()));
			waitFor(1).seconds();
			btnvolver.and().click();
			waitFor(1).seconds();
			btncontinuar.and().click();
			waitFor(1).seconds();
			String continuar = controlinvestigacion.get(54);
			//este condicional me permite tener control cuando deseo pasar la invetigación a otros 
			if (continuar.equals("Otros")) {
				rdbotros.and().click();
				waitFor(1).seconds();
			//en caso de no enviar el expediente a otros lo puedo devolver y esta instrucción me permite tener control de ello 
			}else if (continuar.equals("Devolver expediente")){
				rdbdevolver.and().click();
				waitFor(1).seconds();
				cmbtipomotivo.and().selectByVisibleText(controlinvestigacion.get(55));
				waitFor(1).seconds();
				txtcontinuarobservaciones.and().type(controlinvestigacion.get(56));
				waitFor(1).seconds();
			}
			btncontinuarguardar.and().click();
			waitFor(1).seconds();
			assertThat(controlinvestigacion.get(57), containsString(lblgloboinformativo.and().getText()));
			waitFor(1).seconds();
			}else {
				btnguardarinvestigacion.and().click();
				waitFor(1).seconds();
				assertThat(controlinvestigacion.get(58), containsString(lblgloboinformativoinvestigacion.and().getText()));
			}	
		}			
}		




		
	

