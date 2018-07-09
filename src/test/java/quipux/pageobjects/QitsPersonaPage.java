package quipux.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import java.util.List;
import org.openqa.selenium.Keys;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//clase QitsPersonaPage con la definición de los objetos.
public class QitsPersonaPage extends PageObject {
//se inicializa la variable de tipo boolean vali en true para realizar control cuando persona natural existe (permite editar) o no existe (crea persona natural).
	boolean vali = true;
//Menú Expedientes
	@FindBy(xpath="//A[@href='#'][text()=' Expedientes']")
	public WebElementFacade menuExpedientes;
//Submenú Adicionar Expediente
	@FindBy(xpath="//*[@id='idMenuConformacionExpediente']")
	public WebElementFacade menuAdicionar;
//Tipo identificación 
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:selectTipoDocumentoIdentidad']")
	public WebElementFacade cmbtipoidentificacion;
//Nro identificación 
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:textNumeroDocumento']")
	public WebElementFacade txtnumeroidentificacion;
//Botón buscar
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:buttonFindPersona']")
	public WebElementFacade btnbuscar;
//Botón editar
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:tableDeudores:0:idEditarDeudor']/span")
	public WebElementFacade btneditar;	
//Datos básicos	
	@FindBy(xpath="//*[@id='tabView']/ul/li[2]/a")
	public WebElementFacade btndatosbasicos;
//Datos básicos nombre 1
	@FindBy(xpath="//*[@id='tabView:tablaSelectNombre1']")
	public WebElementFacade txtnombre1;
//Datos básicos nombre 2
	@FindBy(xpath="//*[@id='tabView:tablaSelectNombre2']")
	public WebElementFacade txtnombre2;
//Datos básicos apellido 1
	@FindBy(xpath="//*[@id='tabView:tablaSelectApellido1']")
	public WebElementFacade txtapellido1;
//Datos básicos apellido 2
	@FindBy(xpath="//*[@id='tabView:textApellido2']")
	public WebElementFacade txtapellido2;
//Datos básicos sexo masculino 
	@FindBy(xpath="//*[@id='tabView:tablaSelectsexo:0']")
	public WebElementFacade rdbsexmasculino;
//Datos básicos sexo femenino 
	@FindBy(xpath="//*[@id='tabView:tablaSelectsexo:1']")
	public WebElementFacade rdbsexfemenino;
//Datos básicos grupo sanguineo 
	@FindBy(xpath="//*[@id='tabView:panelPersona']/table[2]/tbody/tr[3]/td/table/tbody/tr/td[1]/select")
	public WebElementFacade cmbgruposanguineo;
//Datos básicos RH positivo
	@FindBy(xpath="//*[@id='tabView:grupoSanguineo:0']")
	public WebElementFacade rdbRHpositivo;
//Datos básicos RH negativo
	@FindBy(xpath="//*[@id='tabView:grupoSanguineo:1']")
	public WebElementFacade rdbRHnegativo;
//Datos básicos ocupación
	@FindBy(xpath="//*[@id='tabView:tablaSelectOcupa']")
	public WebElementFacade cmbocupacion;
//Datos básicos fecha nacimiento 
	@FindBy(xpath="//*[@id='tabView:fechaNaci_input']")
	public WebElementFacade txtfechanacimiento;
//Datos básicos pais nacimiento 
	@FindBy(xpath="//*[@id='tabView:tablaSelectPaisNaci']")
	public WebElementFacade cmbpaisnacimiento;
//Datos básicos departamento nacimiento
	@FindBy(xpath="//*[@id='tabView:tablaSelectDepNaci']")
	public WebElementFacade cmbdepartamentonacimiento;
//Datos básicos ciudad nacimiento
	@FindBy(xpath="//*[@id='tabView:tablaSelectCiudadNaci']")
	public WebElementFacade cmbciudadnacimiento;
//Datos básicos botón guardar
	@FindBy(xpath="//*[@id='tabView:buttonSavePersonaNatural']")
	public WebElementFacade btnguardar;
//Datos identificación  
	@FindBy(xpath="//*[@id='tabView']/ul/li[3]/a")
	public WebElementFacade btndatosidentificacion;
//Datos idnetificación editar
	@FindBy(xpath="//*[@id='tabView:idTablaIdentificacion:0:idBtnEditarIdentificacion']/span")
	public WebElementFacade btndatosidentificacioneditar;
//Datos identificación fecha expedición  
	@FindBy(xpath="//*[@id='tabView:fechaExp_input']")
	public WebElementFacade txtfechaexpedicion;
//Datos identificación país expedición
	@FindBy(xpath="//*[@id='tabView:tablaSelectPaisExp']")
	public WebElementFacade cmbpaisexpedicion;
//Datos identificación departamento expedición
	@FindBy(xpath="//*[@id='tabView:tablaSelectDepExp']")
	public WebElementFacade cmbdepartamentoexpedicion;
//Datos identificación ciudad expedición
	@FindBy(xpath="//*[@id='tabView:tablaSelectCiudadExp']")
	public WebElementFacade cmbciudadexpedicion;
//Datos identificación Activo si
	@FindBy(xpath="//*[@id='tabView:radioActioTipoDoc:0']")
	public WebElementFacade rdbactivosi;
//Datos identificación Activo no
	@FindBy(xpath="//*[@id='tabView:radioActioTipoDoc:1']")
	public WebElementFacade rdbactivono;
//Datos identificación botón guardar
	@FindBy(xpath="//*[@id='tabView:idBtnSavePersonaIdentificacion']/span")
	public WebElementFacade btnguardardatosindentificacion;
//Dirección
	@FindBy(xpath="//*[@id='tabView']/ul/li[4]/a")
	public WebElementFacade btndireccion;
//Dirección adicionar
	@FindBy(xpath="//*[@id='tabView:idBtnAdicionarDireccion']/span")
	public WebElementFacade btnadicionar;
//Dirección editar
	@FindBy(xpath="//*[@id='tabView:genericTableDocumentos:0:idBtnEditarDireccion']")
	public WebElementFacade btndireccioneditar;
//Dirección pais
	@FindBy(xpath="//*[@id='tabView:tablaSelectPais']")
	public WebElementFacade cmbpais;
//Dirección departamento
	@FindBy(xpath="//*[@id='tabView:tablaSelectDep']")
	public WebElementFacade cmbdepartamento;
//Dirección ciudad
	@FindBy(xpath="//*[@id='tabView:tablaSelectCiudad']")
	public WebElementFacade cmbciudad;
//Dirección tipo via
	@FindBy(xpath="//*[@id='tabView:selectTipoViaPersona']")
	public WebElementFacade cmbtipovia;
//Dirección Nro. via
	@FindBy(xpath="//*[@id='tabView:inputNumeroVia']")
	public WebElementFacade txtnrovia;
//Dirección Nro. via 1
	@FindBy(xpath="//*[@id='tabView:idSufijoTipoVia']")
	public WebElementFacade cmbnrovia1;
//Dirección Nro. via 2
	@FindBy(xpath="//*[@id='tabView:idCardinalidadTipoVia']")
	public WebElementFacade cmbnrovia2;
//Dirección barrio
	@FindBy(xpath="//*[@id='tabView:inputBarrio']")
	public WebElementFacade txtbarrio;
//Dirección tipo
	@FindBy(xpath="//*[@id='tabView:selectTipDir']")
	public WebElementFacade cmbtipodireccion;
//Dirección primer numero
	@FindBy(xpath="//*[@id='tabView:inputPrimerNumero']")
	public WebElementFacade txtnumero;
//Dirección primer numero 1
	@FindBy(xpath="//*[@id='tabView:idSufijoNro1']")
	public WebElementFacade cmbnumero1;
//Dirección primer numero 2
	@FindBy(xpath="//*[@id='tabView:idCardinalidadNro1']")
	public WebElementFacade cmbnumero2;
//Dirección segundo numero 
	@FindBy(xpath="//*[@id='tabView:inputSegundoNumero']")
	public WebElementFacade txtnumeros;
//Dirección segundo numero 1
	@FindBy(xpath="//*[@id='tabView:idCardinalidadNro2']")
	public WebElementFacade cmbnumeros1;
//Dirección codigo postal
	@FindBy(xpath="//*[@id='tabView:inputCodPostal']")
	public WebElementFacade txtcodigopostal;
//Dirección autoriza envio informacion si
	@FindBy(xpath="//*[@id='tabView:selectAutorizacionEnvioInfo:0']")
	public WebElementFacade rdbautorizasi;
//Dirección autoriza envio informacion no
	@FindBy(xpath="//*[@id='tabView:selectAutorizacionEnvioInfo:1']")
	public WebElementFacade rdbautorizano;
//Dirección activa si
	@FindBy(xpath="//*[@id='tabView:selectActivo:0']")
	public WebElementFacade rdbactivasi;
//Dirección activa no
	@FindBy(xpath="//*[@id='tabView:selectActivo:1']")
	public WebElementFacade rdbactivano;
//Dirección complemento
	@FindBy(xpath="//*[@id='tabView:inputComplementoDireccion']")
	public WebElementFacade txtcomplemento;
//Dirección botón guardar
	@FindBy(xpath="//*[@id='tabView:idSaveDireccion']/span")
	public WebElementFacade btnguardardireccion;
//Contactos
	@FindBy(xpath="//*[@id='tabView']/ul/li[5]/a")
	public WebElementFacade btncontactos;
//Contactos adicionar
	@FindBy(xpath="//*[@id='tabView:idBtnAdicionar']/span")
	public WebElementFacade btnadicionarcontacto;
//Contactos editar
	@FindBy(xpath="//*[@id='tabView:tableContactos_common:0:idEditarContacto']/span")
	public WebElementFacade btncontactoeditar;
//Contactos tipo contacto
	@FindBy(xpath="//*[@id='tabView:tipoContacto']")
	public WebElementFacade cmbtipocontacto;
//Contactos digite contacto celular
	@FindBy(xpath="//*[@id='tabView:inputNumero']")
	public WebElementFacade txtdigitecontactocelular;
//Contactos digite contacto email
	@FindBy(xpath="//*[@id='tabView:inputEmail']")
	public WebElementFacade txtdigitecontactoemail;
//Contactos digite contacto skype
	@FindBy(xpath="//*[@id='tabView:inputInformacion']")
	public WebElementFacade txtdigitecontactoskype;
//Contactos tipo dato
	@FindBy(xpath="//*[@id='tabView:selectTipoContacto']")
	public WebElementFacade cmbtipodato;
//Contactos autoriza envio información 
	@FindBy(xpath="//*[@id='tabView:selectContactoEnvio:0']")
	public WebElementFacade rdbautorizacsi;
//Contactos autoriza envio información 
	@FindBy(xpath="//*[@id='tabView:selectContactoEnvio:1']")
	public WebElementFacade rdbautorizacno;
//Contactos activo si 
	@FindBy(xpath="//*[@id='tabView:selectContactoActivo:0']")
	public WebElementFacade rdbactivocsi;
//Contactos activo no
	@FindBy(xpath="//*[@id='tabView:selectContactoActivo:1']")
	public WebElementFacade rdbactivocno;
//Contactos guardar
	@FindBy(xpath="//*[@id='tabView:idBtnSaveContacto']/span")
	public WebElementFacade btnguardarc;
//Contactos globo informativo
	@FindBy(xpath="//*[@id='idMessagesGlobal']/div/ul/li/span")
	public WebElementFacade lblgloboinformativo;
	
//método que permite interactuar con el menú, clic en expedientes, clic en adicionar expediente.
	public void MenuAdicionarExpedientes() {
		menuExpedientes.click();
		menuAdicionar.click();
	}
//método que permite interactuar con los tipos de identificación posibles a ser utilizados.	
	public void tipo_identificacion(String tipoidentificacion) {
		cmbtipoidentificacion.and().selectByVisibleText(tipoidentificacion);
	}
//método que permite digitar el número de identificación. 	
	public void numero_identificacion(String numeroidentificacion) {
		txtnumeroidentificacion.and().type(numeroidentificacion);
	}
//método donde se especifica si existe o no persona natural.  	
	public void boton_buscar(String existe) {
		/*si en la .feature adicionar expediente, escenario @CrearPersonaNatural en el campo 'existe' se indica un No, quiere decir que la persona no existe, la variable vali 
		que venía inicializada en true se convertirá en false, esto para controlar el camino que debe seguir el robot según el caso*/
		if (existe.equals("No")) {
			btnbuscar.click();
			vali = false;
		//en caso de que campo 'existe' se indique Si, la variable continuara en true y procederá a seguir el flujo para editar campos especificados en la historia de usuario.
		}else if(existe.equals("Si")) {
			btnbuscar.click();
			waitFor(1).seconds();
			btneditar.click();
			vali = true;
			waitFor(1).seconds();
		}
	}
//método que me permite indicarle al robot el camino a seguir según el caso.
	public void persona_natural_no_existe(List<String> datos) {
		
//paso a seguir en caso de que el campo 'existe' se encuentre en No. El robot procederá a crear la persona natural.
		btndatosbasicos.click();
		waitFor(1).seconds();
		/*los siguientes condicionales permiten controlar el camino a seguir cuando se le indique al robot la edición de un campo, es decir, si el campo
		es diferente de vacío, procederá a digitar lo que se encuentre indicado en la historia de usuario, en caso de que el campo 
		sea igual a vacío el robot no realizara cambios en dicho campo*/
		if (!datos.get(0).equals("")) {
			txtnombre1.and().type(datos.get(0));
			waitFor(1).seconds();
		}
		if(!datos.get(1).equals("")) {
			txtnombre2.and().type(datos.get(1));
			waitFor(1).seconds();
		}
		if (!datos.get(2).equals("")) {
			txtapellido1.and().type(datos.get(2));
			waitFor(1).seconds();
		}
		if (!datos.get(3).equals("")) {
			txtapellido2.and().type(datos.get(3));
			waitFor(1).seconds();
		}
		if (!datos.get(4).equals("")) {
		//este condicional me permite tener control de los radio buttons, según lo que sea especificado en la historia de usuario.
			switch (datos.get(4)) {
			case "M":
				rdbsexmasculino.and().click();
			break;
			case "F":
				rdbsexfemenino.and().click();
			break;
			}	
			waitFor(1).seconds();
		}
		if (!datos.get(5).equals("")) {
			cmbgruposanguineo.and().selectByVisibleText(datos.get(5));
			waitFor(1).seconds();
		}
		if (!datos.get(6).equals("")) {
			switch (datos.get(6)) {
			case "+":
				rdbRHpositivo.and().click();
			break;
			case "-":
				rdbRHnegativo.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datos.get(7).equals("")) {
			cmbocupacion.and().selectByVisibleText(datos.get(7));
			waitFor(1).seconds();
		}
		if (!datos.get(8).equals("")) {
			txtfechanacimiento.and().type(datos.get(8));
			//este método permite controlar la ventana que se logra visualizar cuando la fecha es digitada. Simplemente la oculta para poder visualizar lo que ocurre con el siguiente campo a ser digitado. 
			txtfechanacimiento.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datos.get(9).equals("")) {
			cmbpaisnacimiento.and().selectByVisibleText(datos.get(9));
			waitFor(1).seconds();
		}
		if (!datos.get(10).equals("")) {
			cmbdepartamentonacimiento.and().selectByVisibleText(datos.get(10));
			waitFor(1).seconds();
		}
		if (!datos.get(11).equals("")) {
			cmbciudadnacimiento.and().selectByVisibleText(datos.get(11));
			waitFor(1).seconds();
		}
		btnguardar.click();
		waitFor(2).seconds();
		btndatosidentificacion.click();
		waitFor(1).seconds();
		//en este condicional se controla el flujo a seguir, cuando el campo existe se encuentre en Si, es decir cuando se procede a realizar la edición de un campo.
		if (vali==true) {
			btndatosidentificacioneditar.click();
		}
		if (!datos.get(12).equals("")) {
			txtfechaexpedicion.and().type(datos.get(12));
			txtfechaexpedicion.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datos.get(13).equals("")) {
			cmbpaisexpedicion.and().selectByVisibleText(datos.get(13));
			waitFor(1).seconds();
		}
		if (!datos.get(14).equals("")) {
			cmbdepartamentoexpedicion.and().selectByVisibleText(datos.get(14));
			waitFor(1).seconds();
		}
		if (!datos.get(15).equals("")){
			cmbciudadexpedicion.and().selectByVisibleText(datos.get(15));
			waitFor(1).seconds();
		}
		if(!datos.get(16).equals("")) {
			switch (datos.get(16)) {
			case "Si":
				rdbactivosi.and().click();
			break;
			case "No":
				rdbactivono.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		btnguardardatosindentificacion.click();
		waitFor(1).seconds();
		//este método me permite tener control de la información almacenada con éxito.
		assertThat(datos.get(40), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
		btndireccion.click();
		waitFor(2).seconds();
		/*cuando existe el caso en que se encuentre el botón adicionar y editar, se debe controlar con este condicional 
		para indicarle al robot en que caso debe hacer clic en adicionar o editar*/
		if (vali==true) {
			btndireccioneditar.click();
		}else {
			btnadicionar.click();
		}
		waitFor(1).seconds();
		if (!datos.get(17).equals("")) {
			cmbpais.and().selectByVisibleText(datos.get(17));
			waitFor(1).seconds();	
		}
		if (!datos.get(18).equals("")) {
			cmbdepartamento.and().selectByVisibleText(datos.get(18));
			waitFor(1).seconds();
		}
		if (!datos.get(19).equals("")) {
			cmbciudad.and().selectByVisibleText(datos.get(19));
			waitFor(1).seconds();
		}
		if (!datos.get(20).equals("")) {
			cmbtipovia.and().selectByVisibleText(datos.get(20));
			waitFor(1).seconds();
		}
		if (!datos.get(21).equals("")) {
			txtnrovia.and().type(datos.get(21));
			txtnrovia.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datos.get(22).equals("")) {
			cmbnrovia1.and().selectByVisibleText(datos.get(22));
			waitFor(1).seconds();
		}
		if (!datos.get(23).equals("")) {
			cmbnrovia2.and().selectByVisibleText(datos.get(23));
			waitFor(1).seconds();
		}
		if (!datos.get(24).equals("")) {
			txtbarrio.and().type(datos.get(24));
			waitFor(1).seconds();
		}
		if (!datos.get(25).equals("")) {
			cmbtipodireccion.and().selectByVisibleText(datos.get(25));
			waitFor(1).seconds();
		}
		if (!datos.get(26).equals("")) {
			txtnumero.and().type(datos.get(26));
			txtnumero.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datos.get(27).equals("")) {
			cmbnumero1.and().selectByVisibleText(datos.get(27));
			waitFor(1).seconds();
		}
		if (!datos.get(28).equals("")) {
			cmbnumero2.and().selectByVisibleText(datos.get(28));
			waitFor(1).seconds();
		}
		if (!datos.get(29).equals("")) {
			txtnumeros.and().type(datos.get(29));
			txtnumeros.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datos.get(30).equals("")) {
			cmbnumeros1.and().selectByVisibleText(datos.get(30));
			waitFor(1).seconds();
		}
		if (!datos.get(31).equals("")) {
			txtcodigopostal.and().type(datos.get(31));
			waitFor(1).seconds();
		}
		if (!datos.get(32).equals("")) {
			switch (datos.get(32)) {
			case "Si":
				rdbautorizasi.and().click();
			break;
			case "No":
				rdbautorizano.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datos.get(33).equals("")) {
			switch (datos.get(33)) {
			case "Si":
				rdbactivasi.and().click();
			break;
			case "No":
				rdbactivano.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datos.get(34).equals("")) {
			txtcomplemento.and().type(datos.get(34));
			waitFor(1).seconds();
		}
		btnguardardireccion.click();
		waitFor(1).seconds();
		assertThat(datos.get(40), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
		btncontactos.click();
		waitFor(1).seconds();
		if (vali==true) {
			btncontactoeditar.click();
		}else {
			btnadicionarcontacto.click();
			waitFor(1).seconds();
		}
		if ((!datos.get(35).equals("")) && (!datos.get(36).equals(""))) {
			cmbtipocontacto.selectByVisibleText(datos.get(35));
			waitFor(1).seconds();
			//se realiza control de cada tipo de contacto, ya que la relacion de objetos entre ellos es diferente.
			switch (datos.get(35)) {
			case "Celular":
				txtdigitecontactocelular.and().type(datos.get(36));
			break;
			case "Email":
				txtdigitecontactoemail.and().type(datos.get(36));
			break;
			case "Skype":
				txtdigitecontactoskype.and().type(datos.get(36));
			break;
			case "Teléfono":
				txtdigitecontactocelular.and().type(datos.get(36));
			break;
			}
		}
		if (!datos.get(37).equals("")) {
			cmbtipodato.selectByVisibleText(datos.get(37));
			waitFor(1).seconds();
		}
		if (!datos.get(38).equals("")) {
			switch (datos.get(38)) {
			case "Si":
				rdbautorizacsi.and().click();
			break;
			case "No":
				rdbautorizacno.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datos.get(39).equals("")) {
			switch (datos.get(39)) {
			case "Si":
				rdbactivocsi.and().click();
			break;
			case "No":
				rdbactivocno.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		btnguardarc.click();
		waitFor(1).seconds();
		assertThat(datos.get(40), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
	}
		
}
