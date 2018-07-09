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
//Clase QitsOtrosPage con la definición de los objetos requeridos para la prueba.
public class QitsOtrosPage extends PageObject {
	
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
	//Medida establecimiento 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:0:select']")
	public WebElementFacade cmbmedidaestablecimiento;
	//NIT
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:1:index']")
	public WebElementFacade txtnit;
	//Nombre establecimiento 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:2:index']")
	public WebElementFacade txtnombreestablecimiento;
	//Dirección establecimiento 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:3:idBtnAdicionarDireccion']/span")
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
	//Dirección primer número
	@FindBy(xpath="//*[@id='formDireccion:inputPrimerNumero']")
	public WebElementFacade txtnumero;
	//Dirección primer número 1
	@FindBy(xpath="//*[@id='formDireccion:idSufijoPrimerNro']")
	public WebElementFacade cmbnumero1;
	//Dirección primer número 2
	@FindBy(xpath="//*[@id='formDireccion:idCardinalidadPrimerNro']")
	public WebElementFacade cmbnumero2;
	//Dirección segundo número 
	@FindBy(xpath="//*[@id='formDireccion:inputSegundoNumero']")
	public WebElementFacade txtnumeros;
	//Dirección segundo número 1
	@FindBy(xpath="//*[@id='formDireccion:idCardinalidadSegundoNro']")
	public WebElementFacade cmbnumeros1;
	//Dirección codigo postal
	@FindBy(xpath="//*[@id='formDireccion:inputCodPostal']")
	public WebElementFacade txtcodigopostal;
	//Dirección autoriza envio información si
	@FindBy(xpath="//*[@id='formDireccion:selectAutorizacionEnvioInfo:0']")
	public WebElementFacade rdbautorizasi;
	//Dirección autoriza envio información no
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
	@FindBy(xpath="//*[@id='formDireccion:idBTnSaveDireccionCamaraComercio']/span")
	public WebElementFacade btnguardar;
	//Teléfono establecimiento 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:5:index']")
	public WebElementFacade txttelefono;
	//Fecha actualización matrícula 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:6:fecha']")
	public WebElementFacade txtfechaactualizacion;
	//Razón social 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:7:index']")
	public WebElementFacade txtrazonsocial;
	//Radicado proceso
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:8:index']")
	public WebElementFacade txtradicadoproceso;
	//Juzgado
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:9:index']")
	public WebElementFacade txtjuzgado;
	//Dirección juzgado 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:10:idBtnAdicionarDireccionJuzgado']/span")
	public WebElementFacade btnjuzgadoadicionar;
	//Dirección país juzgado
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
	//Dirección primer número juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputPrimerNumero']")
	public WebElementFacade txtnumerojuzgado;
	//Dirección primer número 1 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idSufijoPrimerNumeroJuz']")
	public WebElementFacade cmbnumero1juzgado;
	//Dirección primer número 2 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idCardinalidadPrimerNumeroJuz']")
	public WebElementFacade cmbnumero2juzgado;
	//Dirección segundo número juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputSegundoNumero']")
	public WebElementFacade txtnumerosjuzgado;
	//Dirección segundo número 1 juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:idCardinalidadSegundoNumeroJuz']")
	public WebElementFacade cmbnumeros1juzgado;
	//Dirección codigo postal juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:inputCodPostal']")
	public WebElementFacade txtcodigopostaljuzgado;
	//Dirección autoriza envio información si juzgado
	@FindBy(xpath="//*[@id='formDireccionJuz:selectAutorizacionEnvioInfo:0']")
	public WebElementFacade rdbautorizasijuz;
	//Dirección autoriza envio información no juzgado
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
	@FindBy(xpath="//*[@id='formDireccionJuz:idBtnSaveDireccionJuzgadoCC']/span")
	public WebElementFacade btnguardarjuzgado;
	//Tipo proceso
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:12:index']")
	public WebElementFacade txttipoproceso;
	//Demandante 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:13:index']")
	public WebElementFacade txtdemandante;
	//Entidad establecimiento 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:14:index']")
	public WebElementFacade txtentidad;
	//Nro. Escritura  
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:15:index']")
	public WebElementFacade txtnroescritura;
	//Fecha de escritura 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:16:fecha']")
	public WebElementFacade txtfechaescritura;
	//Nombre y Nro. Notaría
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:17:index']")
	public WebElementFacade txtnombreynronotaria;
	//Ciudad notaría
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:18:index']")
	public WebElementFacade txtciudadnotaria;
	//Nro. Anotación
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:19:index']")
	public WebElementFacade txtnroanotacion;
	//Observaciones
	@FindBy(xpath="//*[@id='formDetalleCartera:textObservaciones']")
	public WebElementFacade txtObservaciones;
	//Seleccionar archivo
	@FindBy(xpath="//*[@id='formDetalleCartera:idFileUploadAnexoInvestigacion']/div[1]/span")
	public WebElementFacade btnseleccionar;
	//Subir archivos
	@FindBy(xpath="//*[@id='formDetalleCartera:idFileUploadAnexoInvestigacion']/div[1]/button[1]/span[2]")
	public WebElementFacade btnsubirarchivos;
	//Guardar investigación
	@FindBy(xpath="//*[@id='formDetalleCartera:idBtnRegistroBienAnexos']/span")
	public WebElementFacade btnguardarinvestigacion;
	//Globo informativo 
	@FindBy(xpath="//*[@id='formDetalleCartera:growl_container']/div/div/div[2]/span")
	public WebElementFacade lblgloboinformativoinvestigacion;
	//Botón volver
	@FindBy(xpath="//*[@id='formDetalleCartera:idBtnVolverDetalleBien']/span")
	public WebElementFacade btnvolver;
	//Cifin Medida Produto Financiero 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:0:select']")
	public WebElementFacade cmbmedidaproducto;
	//Cifin Entidad producto financiero
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:1:index']")
	public WebElementFacade txtentidadproductofinanciero;
	//Cifin Número producto
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:2:index']")
	public WebElementFacade txtnumeroproducto;
	//Cifin Estado producto
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:3:index']")
	public WebElementFacade txtestadoproducto;
	//Cifin Tipo producto 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:4:index']")
	public WebElementFacade txttipoproducto;
	//Fosyga Medida Salario 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:0:select']")
	public WebElementFacade cmbmedidasalario;
	//Fosyga Fecha afiliación 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:2:fecha']")
	public WebElementFacade txtfechaafiliacion;
	//Fosyga NIT
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:5:index']")
	public WebElementFacade txtNit;
	//Fosyga Empresa donde labora
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:6:index']")
	public WebElementFacade txtempresalabora;
	//Fosyga Dirección empresa adicionar
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:7:idBtnAdicionarDireccion']/span")
	public WebElementFacade btndireccionadicionarempresa;
	//Fosyga Botón guardar
	@FindBy(xpath="//*[@id='formDireccion:idBTnSaveDireccionEntidadesPromotorasSalud']/span")
	public WebElementFacade btnguardardireccion;
	//Fosyga IBC (Salario) 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:10:index']")
	public WebElementFacade txtibc;
	//Runt Placa
	@FindBy(xpath="//*[@id='formDetalleCartera:textIdentificadorBien']")
	public WebElementFacade txtplaca;
	//Runt Medida Vehículo
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:0:select']")
	public WebElementFacade cmbmedidavehiculo;
	//Runt Chasis
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:1:index']")
	public WebElementFacade txtchasis;
	//Runt Clase 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:2:index']")
	public WebElementFacade txtclase;
	//Runt Linea 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:3:index']")
	public WebElementFacade txtlinea;
	//Runt Marca 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:4:index']")
	public WebElementFacade txtmarca;
	//Runt Modelo
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:5:index']")
	public WebElementFacade txtmodelo;
	//Runt Color 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:6:index']")
	public WebElementFacade txtcolor;
	//Runt Radicado proceso
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:7:index']")
	public WebElementFacade txtradicadoprocesorunt;
	//Runt Gravamenes
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:8:index']")
	public WebElementFacade txtgravamenes;
	//Runt Juzgado 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:9:index']")
	public WebElementFacade txtjuzgadorunt;
	//Dirección juzgado runt
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:10:idBtnAdicionarDireccionJuzgado']/span")
	public WebElementFacade btnjuzgadoadicionarrunt;
	//Botón guardar juzgado runt
	@FindBy(xpath="//*[@id='formDireccionJuz:idBtnSaveDireccionJuzgadoOT']/span")
	public WebElementFacade btnguardarjuzgadorunt;
	//Runt Tipo proceso
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:12:index']")
	public WebElementFacade txttipoprocesorunt;		
	//Runt Demandante 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:13:index']")
	public WebElementFacade txtdemandanterunt;	
	//Runt Entidad vehiculo 
	@FindBy(xpath="//*[@id='formDetalleCartera:dataGridDatosBien:14:index']")
	public WebElementFacade txtentidadvehiculo;	
	//Runt continuar
	@FindBy(xpath="//*[@id='formInvestigacionControl:tabView:idBtnContinuarCarteraInvestigacion']/span")
	public WebElementFacade btncontinuar;	
	//Runt estudio de títulos  
	@FindBy(xpath="//*[@id='formDialogContinuar:selectContinuarInv']/tbody/tr[2]/td[1]/div/div[2]/span")
	public WebElementFacade rdbestudiodetitulos;	
	//Botón continuar devolver
	@FindBy(xpath="//*[@id='formDialogContinuar:selectContinuarInv']/tbody/tr[3]/td[1]/div/div[2]/span")
	public WebElementFacade rdbdevolver;
	//Botón continuar guardar
	@FindBy(xpath="//*[@id='formDialogContinuar:idBtnSaveContinuarInvestigacion']/span")
	public WebElementFacade btncontinuarguardar;
	//Botón continuar devolver tipo motivo
	@FindBy(xpath="//*[@id='formDialogContinuar:tipoMotivoCont']")
	public WebElementFacade cmbtipomotivo;
	//Botón continuar devolver descripción
	@FindBy(xpath="//*[@id='formDialogContinuar:observacionCont']")
	public WebElementFacade txtcontinuarobservaciones;
	//Botón continuar globo informativo
	@FindBy(xpath="//*[@id='formInvestigacionControl:growl_container']/div/div/div[2]/span")
	public WebElementFacade lblgloboinformativo;	
		
	
		//método que permite interactuar con el menú, clic en investigación, clic en investigación y control.
		public void MenuInvestigacionExpedientesOtros() {
			menuInvestigacion.click();
			menuInvestigacionycontrol.click();
		}
			
		//método que permite interactuar con los tipos de renta posibles a ser utilizados.	
		public void tipo_renta_investigacion_otros(String tiporentainvestigacion){
			cmbtiporenta.and().selectByVisibleText(tiporentainvestigacion);
		}
			
		//método que permite seleccionar el proceso a ser utilizado. 	
		public void proceso_investigacion_otros(String procesoinvestigacionotros) {
			/*en este condicional es posible controlar cuando la bandeja ya se encuentre cargada, es decir, si la bandeja ya está cargada el robot seguirá validando siempre y cuando el campo 
			'proceso' que está definido en la historia de usuario se encuentre vacío.*/
			if (!procesoinvestigacionotros.equals("")) {
				cmbproceso.and().selectByVisibleText(procesoinvestigacionotros);	
			}
		}
		//método que permite interactuar con el criterio de búsqueda a ser utilizado.	
		public void criterio_de_busqueda_otros(String criteriodebusquedaotros) {
			if (!criteriodebusquedaotros.equals("")) {
				cmbcriteriodebusqueda.and().selectByVisibleText(criteriodebusquedaotros);
			}
		}
			
		//método que permite interactuar con los tipos de identificación posibles a ser utilizados.	
		public void tipo_identificacion_otros(String tipoidentificacionotros) {
			if (!tipoidentificacionotros.equals("")) {
				cmbtipoidentificacion.and().selectByVisibleText(tipoidentificacionotros);
			}
		}
		//método que permite digitar el número de identificación. 	
		public void numero_identificacion_otros(String numeroidentificacionotros) {
			if (!numeroidentificacionotros.equals("")) {
				txtnroidentificacion.and().type(numeroidentificacionotros);
			}	
		}
		//método que permite buscar la bandeja según criterio de búsqueda.
		public void boton_buscar() {
				btnbuscar.click();
			}
			
		public void investigacion_de_bienes_CC(List<String> controlinvestigacioncc){
			//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
			Screen  screen = new Screen ();
			btnprocesar.and().click();
			waitFor(1).seconds();
			btninvestigaciondebienes.and().click();
			waitFor(1).seconds();
			btnadicionar.and().click();
			waitFor(1).seconds();
			String posee = controlinvestigacioncc.get(0);
			//en este método se realiza el control cuando el deudor posee un bien. 
			if (posee.equals("Si")) {
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacioncc.get(1));
				waitFor(2).seconds();
				cmbentidad.and().click();
				waitFor(1).seconds();
				cmbentidadbuscar.sendKeys(controlinvestigacioncc.get(2));
				cmbentidadbuscar.sendKeys(Key.ENTER);
				waitFor(1).seconds();
				txtnromatricula.and().type(controlinvestigacioncc.get(3));
				waitFor(3).seconds();
				cmbmedidaestablecimiento.and().click();
				waitFor(1).seconds();
				cmbmedidaestablecimiento.and().selectByVisibleText(controlinvestigacioncc.get(4));
				waitFor(2).seconds();
				txtnit.and().type(controlinvestigacioncc.get(5));
				waitFor(1).seconds();
				txtnombreestablecimiento.and().type(controlinvestigacioncc.get(6));
				waitFor(2).seconds();
				btndireccionadicionar.and().click();
				waitFor(1).seconds();
				cmbpais.and().selectByVisibleText(controlinvestigacioncc.get(7));
				waitFor(2).seconds();
				cmbdepartamento.and().selectByVisibleText(controlinvestigacioncc.get(8));
				waitFor(2).seconds();
				cmbciudad.and().selectByVisibleText(controlinvestigacioncc.get(9));
				waitFor(2).seconds();
				cmbtipovia.and().selectByVisibleText(controlinvestigacioncc.get(10));
				waitFor(1).seconds();
				txtnrovia.and().type(controlinvestigacioncc.get(11));
				txtnrovia.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnrovia1.and().selectByVisibleText(controlinvestigacioncc.get(12));
				waitFor(1).seconds();
				cmbnrovia2.and().selectByVisibleText(controlinvestigacioncc.get(13));
				waitFor(1).seconds();
				txtbarrio.and().type(controlinvestigacioncc.get(14));
				waitFor(1).seconds();
				cmbtipodireccion.and().selectByVisibleText(controlinvestigacioncc.get(15));
				waitFor(1).seconds();
				txtnumero.and().type(controlinvestigacioncc.get(16));
				txtnumero.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumero1.and().selectByVisibleText(controlinvestigacioncc.get(17));
				waitFor(1).seconds();
				cmbnumero2.and().selectByVisibleText(controlinvestigacioncc.get(18));
				waitFor(1).seconds();
				txtnumeros.and().type(controlinvestigacioncc.get(19));
				txtnumeros.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumeros1.and().selectByVisibleText(controlinvestigacioncc.get(20));
				waitFor(1).seconds();
				txtcodigopostal.and().type(controlinvestigacioncc.get(21));
				waitFor(1).seconds();
				//este condicional me permite tener control de los radio buttons, según lo que sea especificado en la historia de usuario.
				switch (controlinvestigacioncc.get(22)) {
				case "Si":
					rdbautorizasi.and().click();
				break;
				case "No":
					rdbautorizano.and().click();
				break;
				}	
				waitFor(1).seconds();
				switch (controlinvestigacioncc.get(23)) {
				case "Si":
					rdbactivasi.and().click();
				break;
				case "No":
					rdbactivano.and().click();
				break;
				}	
				waitFor(1).seconds();
				txtcomplemento.and().type(controlinvestigacioncc.get(24));
				waitFor(1).seconds();
				btnguardar.and().click();
				waitFor(1).seconds();
				txttelefono.and().type(controlinvestigacioncc.get(25));
				waitFor(1).seconds();
				txtfechaactualizacion.and().type(controlinvestigacioncc.get(26));
				waitFor(1).seconds();
				txtrazonsocial.and().type(controlinvestigacioncc.get(27));
				waitFor(1).seconds();
				txtradicadoproceso.and().type(controlinvestigacioncc.get(28));
				waitFor(1).seconds();
				txtjuzgado.and().type(controlinvestigacioncc.get(29));
				waitFor(1).seconds();
				btnjuzgadoadicionar.and().click();
				waitFor(1).seconds();
				cmbpaisjuzgado.and().selectByVisibleText(controlinvestigacioncc.get(30));
				waitFor(2).seconds();
				cmbdepartamentojuzgado.and().selectByVisibleText(controlinvestigacioncc.get(31));
				waitFor(2).seconds();
				cmbciudadjuzgado.and().selectByVisibleText(controlinvestigacioncc.get(32));
				waitFor(2).seconds();
				cmbtipoviajuzgado.and().selectByVisibleText(controlinvestigacioncc.get(33));
				waitFor(1).seconds();
				txtnroviajuzgado.and().type(controlinvestigacioncc.get(34));
				txtnroviajuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnrovia1juzgado.and().selectByVisibleText(controlinvestigacioncc.get(35));
				waitFor(1).seconds();
				cmbnrovia2juzgado.and().selectByVisibleText(controlinvestigacioncc.get(36));
				waitFor(1).seconds();
				txtbarriojuzgado.and().type(controlinvestigacioncc.get(37));
				waitFor(1).seconds();
				cmbtipodireccionjuzgado.and().selectByVisibleText(controlinvestigacioncc.get(38));
				waitFor(1).seconds();
				txtnumerojuzgado.and().type(controlinvestigacioncc.get(39));
				txtnumerojuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumero1juzgado.and().selectByVisibleText(controlinvestigacioncc.get(40));
				waitFor(1).seconds();
				cmbnumero2juzgado.and().selectByVisibleText(controlinvestigacioncc.get(41));
				waitFor(1).seconds();
				txtnumerosjuzgado.and().type(controlinvestigacioncc.get(42));
				txtnumerosjuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumeros1juzgado.and().selectByVisibleText(controlinvestigacioncc.get(43));
				waitFor(1).seconds();
				txtcodigopostaljuzgado.and().type(controlinvestigacioncc.get(44));
				waitFor(1).seconds();
				switch (controlinvestigacioncc.get(45)) {
				case "Si":
					rdbautorizasijuz.and().click();
				break;
				case "No":
					rdbautorizanojuz.and().click();
				break;
				}	
				waitFor(1).seconds();
				switch (controlinvestigacioncc.get(46)) {
				case "Si":
					rdbactivasijuz.and().click();
				break;
				case "No":
					rdbactivanojuz.and().click();
				break;
				}	
				waitFor(1).seconds();
				txtcomplementojuz.and().type(controlinvestigacioncc.get(47));
				waitFor(1).seconds();
				btnguardarjuzgado.and().click();
				waitFor(1).seconds();
				txttipoproceso.and().type(controlinvestigacioncc.get(48));
				waitFor(1).seconds();
				txtdemandante.and().type(controlinvestigacioncc.get(49));
				waitFor(1).seconds();
				txtentidad.and().type(controlinvestigacioncc.get(50));
				waitFor(1).seconds();
				txtnroescritura.and().type(controlinvestigacioncc.get(51));
				waitFor(1).seconds();
				txtfechaescritura.and().type(controlinvestigacioncc.get(52));
				waitFor(1).seconds();
				txtnombreynronotaria.and().type(controlinvestigacioncc.get(53));
				waitFor(1).seconds();
				txtciudadnotaria.and().type(controlinvestigacioncc.get(54));
				waitFor(1).seconds();
				txtnroanotacion.and().type(controlinvestigacioncc.get(55));
				waitFor(1).seconds();
				txtObservaciones.and().type(controlinvestigacioncc.get(56));
				waitFor(1).seconds();
			//en este método se realiza el control cuando el deudor no posee un bien.
			} else if (posee.equals("No")) {
				btnposeebien.and().click();
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacioncc.get(1));
				waitFor(2).seconds();
			}
			if (!controlinvestigacioncc.get(57).equals("")) {
			btnseleccionar.and().click();
			waitFor(1).seconds();
			//en este método se realiza el control para subir la evidencia cuando la persona realiza acuerdo de pago o no.
			//se pega la ruta especificada en la historia de usuario.
			screen.paste(controlinvestigacioncc.get(57));
			waitFor(1).seconds();
			//se digita enter
			screen.type(Key.ENTER);
			waitFor(1).seconds();
			btnsubirarchivos.and().click();
			waitFor(1).seconds();
			btnguardarinvestigacion.and().click();
			waitFor(1).seconds();
			assertThat(controlinvestigacioncc.get(58), containsString(lblgloboinformativoinvestigacion.and().getText()));
			waitFor(1).seconds();
			btnvolver.and().click();
			waitFor(3).seconds();
			}else {
				btnguardarinvestigacion.and().click();
				waitFor(1).seconds();
				assertThat(controlinvestigacioncc.get(59), containsString(lblgloboinformativoinvestigacion.and().getText()));
			}
		}
		
		public void investigacion_de_bienes_Cifin(List<String> controlinvestigacioncifin) {
			//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
			Screen  screen = new Screen ();
			btnprocesar.and().click();
			waitFor(1).seconds();
			btninvestigaciondebienes.and().click();
			waitFor(1).seconds();
			btnadicionar.and().click();
			waitFor(1).seconds();
			String posee = controlinvestigacioncifin.get(0);
			//en este método se realiza el control cuando el deudor posee un bien. 
			if (posee.equals("Si")) {
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacioncifin.get(1));
				waitFor(2).seconds();
				cmbentidad.and().click();
				waitFor(1).seconds();
				cmbentidadbuscar.sendKeys(controlinvestigacioncifin.get(2));
				cmbentidadbuscar.sendKeys(Key.ENTER);
				waitFor(1).seconds();
				cmbmedidaproducto.and().selectByVisibleText(controlinvestigacioncifin.get(3));
				waitFor(2).seconds();
				txtentidadproductofinanciero.and().type(controlinvestigacioncifin.get(4));
				waitFor(1).seconds();
				txtnumeroproducto.and().type(controlinvestigacioncifin.get(5));
				waitFor(1).seconds();
				txtestadoproducto.and().type(controlinvestigacioncifin.get(6));
				waitFor(1).seconds();
				txttipoproducto.and().type(controlinvestigacioncifin.get(7));
				waitFor(1).seconds();
				txtObservaciones.and().type(controlinvestigacioncifin.get(8));
			//en este método se realiza el control cuando el deudor no posee un bien.
			} else if (posee.equals("No")) {
				btnposeebien.and().click();
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacioncifin.get(1));
				waitFor(2).seconds();
			}
			if (!controlinvestigacioncifin.get(9).equals("")) {
			btnseleccionar.and().click();
			waitFor(1).seconds();
			//en este método se realiza el control para subir la evidencia cuando la persona realiza acuerdo de pago o no.
			//Se pega la ruta especificada en la historia de usuario.
			screen.paste(controlinvestigacioncifin.get(9));
			waitFor(1).seconds();
			//se digita enter
			screen.type(Key.ENTER);
			waitFor(1).seconds();
			btnsubirarchivos.and().click();
			waitFor(1).seconds();
			btnguardarinvestigacion.and().click();
			waitFor(1).seconds();
			assertThat(controlinvestigacioncifin.get(10), containsString(lblgloboinformativoinvestigacion.and().getText()));
			waitFor(1).seconds();
			btnvolver.and().click();
			waitFor(3).seconds();
			}else {
				btnguardarinvestigacion.and().click();
				waitFor(1).seconds();
				assertThat(controlinvestigacioncifin.get(11), containsString(lblgloboinformativoinvestigacion.and().getText()));
			}
		}
		
		public void investigacion_de_bienes_Fosyga(List<String> controlinvestigacionfosyga) {
			//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
			Screen  screen = new Screen ();
			btnprocesar.and().click();
			waitFor(1).seconds();
			btninvestigaciondebienes.and().click();
			waitFor(1).seconds();
			btnadicionar.and().click();
			waitFor(1).seconds();
			String posee = controlinvestigacionfosyga.get(0);
			//en este método se realiza el control cuando el deudor posee un bien. 
			if (posee.equals("Si")) {
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacionfosyga.get(1));
				waitFor(2).seconds();
				cmbentidad.and().click();
				waitFor(1).seconds();
				cmbentidadbuscar.sendKeys(controlinvestigacionfosyga.get(2));
				cmbentidadbuscar.sendKeys(Key.ENTER);
				waitFor(1).seconds();
				cmbmedidasalario.and().selectByVisibleText(controlinvestigacionfosyga.get(3));
				waitFor(1).seconds();
				txtfechaafiliacion.and().type(controlinvestigacionfosyga.get(4));
				waitFor(1).seconds();
				txtNit.and().type(controlinvestigacionfosyga.get(5));
				waitFor(1).seconds();
				txtempresalabora.and().type(controlinvestigacionfosyga.get(6));
				waitFor(1).seconds();
				txtempresalabora.and().type(controlinvestigacionfosyga.get(6));
				waitFor(1).seconds();
				txtempresalabora.and().sendKeys(Keys.TAB);
				btndireccionadicionarempresa.and().click();
				waitFor(1).seconds();
				cmbpais.and().selectByVisibleText(controlinvestigacionfosyga.get(7));
				waitFor(2).seconds();
				cmbdepartamento.and().selectByVisibleText(controlinvestigacionfosyga.get(8));
				waitFor(2).seconds();
				cmbciudad.and().selectByVisibleText(controlinvestigacionfosyga.get(9));
				waitFor(2).seconds();
				cmbtipovia.and().selectByVisibleText(controlinvestigacionfosyga.get(10));
				waitFor(1).seconds();
				txtnrovia.and().type(controlinvestigacionfosyga.get(11));
				txtnrovia.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnrovia1.and().selectByVisibleText(controlinvestigacionfosyga.get(12));
				waitFor(1).seconds();
				cmbnrovia2.and().selectByVisibleText(controlinvestigacionfosyga.get(13));
				waitFor(1).seconds();
				txtbarrio.and().type(controlinvestigacionfosyga.get(14));
				waitFor(1).seconds();
				cmbtipodireccion.and().selectByVisibleText(controlinvestigacionfosyga.get(15));
				waitFor(1).seconds();
				txtnumero.and().type(controlinvestigacionfosyga.get(16));
				txtnumero.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumero1.and().selectByVisibleText(controlinvestigacionfosyga.get(17));
				waitFor(1).seconds();
				cmbnumero2.and().selectByVisibleText(controlinvestigacionfosyga.get(18));
				waitFor(1).seconds();
				txtnumeros.and().type(controlinvestigacionfosyga.get(19));
				txtnumeros.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumeros1.and().selectByVisibleText(controlinvestigacionfosyga.get(20));
				waitFor(1).seconds();
				txtcodigopostal.and().type(controlinvestigacionfosyga.get(21));
				waitFor(1).seconds();
				//este condicional me permite tener control de los radio buttons, según lo que sea especificado en la historia de usuario.
				switch (controlinvestigacionfosyga.get(22)) {
				case "Si":
					rdbautorizasi.and().click();
				break;
				case "No":
					rdbautorizano.and().click();
				break;
				}	
				waitFor(1).seconds();
				switch (controlinvestigacionfosyga.get(23)) {
				case "Si":
					rdbactivasi.and().click();
				break;
				case "No":
					rdbactivano.and().click();
				break;
				}	
				waitFor(1).seconds();
				txtcomplemento.and().type(controlinvestigacionfosyga.get(24));
				waitFor(1).seconds();
				btnguardardireccion.and().click();
				waitFor(1).seconds();
				txtibc.and().type(controlinvestigacionfosyga.get(25));
				waitFor(1).seconds();
				txtObservaciones.and().type(controlinvestigacionfosyga.get(26));
				waitFor(1).seconds();
			//en este método se realiza el control cuando el deudor no posee un bien.
			} else if (posee.equals("No")) {
				btnposeebien.and().click();
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacionfosyga.get(1));
				waitFor(2).seconds();
			}
			if (!controlinvestigacionfosyga.get(27).equals("")) {
			btnseleccionar.and().click();
			waitFor(1).seconds();
			//en este método se realiza el control para subir la evidencia cuando la persona realiza acuerdo de pago o no.
			//Se pega la ruta especificada en la historia de usuario.
			screen.paste(controlinvestigacionfosyga.get(27));
			waitFor(1).seconds();
			//se digita enter
			screen.type(Key.ENTER);
			waitFor(1).seconds();
			btnsubirarchivos.and().click();
			waitFor(1).seconds();
			btnguardarinvestigacion.and().click();
			waitFor(1).seconds();
			assertThat(controlinvestigacionfosyga.get(28), containsString(lblgloboinformativoinvestigacion.and().getText()));
			waitFor(1).seconds();
			btnvolver.and().click();
			waitFor(3).seconds();
			} else {
				btnguardarinvestigacion.and().click();
				waitFor(1).seconds();
				assertThat(controlinvestigacionfosyga.get(29), containsString(lblgloboinformativoinvestigacion.and().getText()));
			}
		}
		
		public void investigacion_de_bienes_Runt(List<String> controlinvestigacionrunt) {
			//mediante este método es posible interactuar con la ventana de windows que aparece al momento de cargar la evidencia. (sikuli)
			Screen  screen = new Screen ();
			btnprocesar.and().click();
			waitFor(1).seconds();
			btninvestigaciondebienes.and().click();
			waitFor(1).seconds();
			btnadicionar.and().click();
			waitFor(1).seconds();
			String posee = controlinvestigacionrunt.get(0);
			//en este método se realiza el control cuando el deudor posee un bien 
			if (posee.equals("Si")) {
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacionrunt.get(1));
				waitFor(2).seconds();
				cmbentidad.and().click();
				waitFor(1).seconds();
				cmbentidadbuscar.sendKeys(controlinvestigacionrunt.get(2));
				waitFor(1).seconds();
				cmbentidadbuscar.sendKeys(Key.ENTER);
				waitFor(1).seconds();
				txtplaca.and().type(controlinvestigacionrunt.get(3));
				waitFor(1).seconds();
				cmbmedidavehiculo.and().selectByVisibleText(controlinvestigacionrunt.get(4));
				waitFor(4).seconds();
				cmbmedidavehiculo.and().selectByVisibleText(controlinvestigacionrunt.get(4));
				waitFor(4).seconds();
				txtchasis.and().type(controlinvestigacionrunt.get(5));
				waitFor(1).seconds();
				txtclase.and().type(controlinvestigacionrunt.get(6));
				waitFor(1).seconds();
				txtlinea.and().type(controlinvestigacionrunt.get(7));
				waitFor(1).seconds();
				txtmarca.and().type(controlinvestigacionrunt.get(8));
				waitFor(1).seconds();
				txtmodelo.and().type(controlinvestigacionrunt.get(9));
				waitFor(1).seconds();
				txtcolor.and().type(controlinvestigacionrunt.get(10));
				waitFor(1).seconds();
				txtradicadoprocesorunt.and().type(controlinvestigacionrunt.get(11));
				waitFor(1).seconds();
				txtgravamenes.and().type(controlinvestigacionrunt.get(12));
				waitFor(1).seconds();
				txtjuzgadorunt.and().type(controlinvestigacionrunt.get(13));
				waitFor(1).seconds();
				btnjuzgadoadicionarrunt.and().click();
				waitFor(1).seconds();
				cmbpaisjuzgado.and().selectByVisibleText(controlinvestigacionrunt.get(14));
				waitFor(2).seconds();
				cmbdepartamentojuzgado.and().selectByVisibleText(controlinvestigacionrunt.get(15));
				waitFor(2).seconds();
				cmbciudadjuzgado.and().selectByVisibleText(controlinvestigacionrunt.get(16));
				waitFor(2).seconds();
				cmbtipoviajuzgado.and().selectByVisibleText(controlinvestigacionrunt.get(17));
				waitFor(1).seconds();
				txtnroviajuzgado.and().type(controlinvestigacionrunt.get(18));
				txtnroviajuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnrovia1juzgado.and().selectByVisibleText(controlinvestigacionrunt.get(19));
				waitFor(1).seconds();
				cmbnrovia2juzgado.and().selectByVisibleText(controlinvestigacionrunt.get(20));
				waitFor(1).seconds();
				txtbarriojuzgado.and().type(controlinvestigacionrunt.get(21));
				waitFor(1).seconds();
				cmbtipodireccionjuzgado.and().selectByVisibleText(controlinvestigacionrunt.get(22));
				waitFor(1).seconds();
				txtnumerojuzgado.and().type(controlinvestigacionrunt.get(23));
				txtnumerojuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumero1juzgado.and().selectByVisibleText(controlinvestigacionrunt.get(24));
				waitFor(1).seconds();
				cmbnumero2juzgado.and().selectByVisibleText(controlinvestigacionrunt.get(25));
				waitFor(1).seconds();
				txtnumerosjuzgado.and().type(controlinvestigacionrunt.get(26));
				txtnumerosjuzgado.and().sendKeys(Keys.TAB);
				waitFor(1).seconds();
				cmbnumeros1juzgado.and().selectByVisibleText(controlinvestigacionrunt.get(27));
				waitFor(1).seconds();
				txtcodigopostaljuzgado.and().type(controlinvestigacionrunt.get(28));
				waitFor(1).seconds();
				//este condicional me permite tener control de los radio buttons, según lo que sea especificado en la historia de usuario.
				switch (controlinvestigacionrunt.get(29)) {
				case "Si":
					rdbautorizasijuz.and().click();
				break;
				case "No":
					rdbautorizanojuz.and().click();
				break;
				}	
				waitFor(1).seconds();
				switch (controlinvestigacionrunt.get(30)) {
				case "Si":
					rdbactivasijuz.and().click();
				break;
				case "No":
					rdbactivanojuz.and().click();
				break;
				}	
				waitFor(1).seconds();
				txtcomplementojuz.and().type(controlinvestigacionrunt.get(31));
				waitFor(1).seconds();
				btnguardarjuzgadorunt.and().click();
				waitFor(2).seconds();
				txttipoprocesorunt.and().type(controlinvestigacionrunt.get(32));
				waitFor(1).seconds();
				txtdemandanterunt.and().type(controlinvestigacionrunt.get(33));
				waitFor(1).seconds();
				txtentidadvehiculo.and().type(controlinvestigacionrunt.get(34));
				waitFor(1).seconds();
				txtObservaciones.and().type(controlinvestigacionrunt.get(35));
				waitFor(1).seconds();
			//en este método se realiza el control cuando el deudor no posee un bien.
			} else if (posee.equals("No")) {
				btnposeebien.and().click();
				waitFor(1).seconds();
				cmbsistemaconsulta.and().selectByVisibleText(controlinvestigacionrunt.get(1));
				waitFor(2).seconds();
			}
			if (!controlinvestigacionrunt.get(36).equals("")) {
			btnseleccionar.and().click();
			waitFor(1).seconds();
			//en este método se realiza el control para subir la evidencia cuando la persona realiza acuerdo de pago o no.
			//Se pega la ruta especificada en la historia de usuario.
			screen.paste(controlinvestigacionrunt.get(36));
			waitFor(1).seconds();
			//se digita enter
			screen.type(Key.ENTER);
			waitFor(1).seconds();
			btnsubirarchivos.and().click();
			waitFor(1).seconds();
			btnguardarinvestigacion.and().click();
			waitFor(1).seconds();
			assertThat(controlinvestigacionrunt.get(37), containsString(lblgloboinformativoinvestigacion.and().getText()));
			waitFor(1).seconds();
			btnvolver.and().click();
			waitFor(3).seconds();
			btncontinuar.and().click();
			waitFor(1).seconds();
			String continuar = controlinvestigacionrunt.get(38);
			//este condicional me permite tener control cuando se decide pasar la invetigación a estudio de títulos. 
			if (continuar.equals("Estudio de títulos")) {
				rdbestudiodetitulos.and().click();
				waitFor(1).seconds();
			//en caso de no enviar la investigación a estudio de títulos se puede devolver y esta instrucción me permite tener control de ello. 
			}else if (continuar.equals("Devolver expediente")){
				rdbdevolver.and().click();
				waitFor(1).seconds();
				cmbtipomotivo.and().selectByVisibleText(controlinvestigacionrunt.get(39));
				waitFor(1).seconds();
				txtcontinuarobservaciones.and().type(controlinvestigacionrunt.get(40));
				waitFor(1).seconds();
			}
			btncontinuarguardar.and().click();
			waitFor(1).seconds();
			assertThat(controlinvestigacionrunt.get(41), containsString(lblgloboinformativo.and().getText()));
			waitFor(1).seconds();
			}else {
				btnguardarinvestigacion.and().click();
				waitFor(1).seconds();
				assertThat(controlinvestigacionrunt.get(42), containsString(lblgloboinformativoinvestigacion.and().getText()));
			}
		}					
}
		

