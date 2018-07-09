package quipux.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//clase QitsJuridicaPage con la definición de los objetos.
public class QitsJuridicaPage extends PageObject {
//Se inicializa la variable de tipo boolean vali en true.
	boolean vali = true;
//Botón buscar
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:buttonFindPersona']")
	public WebElementFacade btnbuscar;
//Botón editar
	@FindBy(xpath="//*[@id='formExpediente:tabViewExpediente:tableDeudores:0:idEditarDeudor']/span")
	public WebElementFacade btneditar;
//Nro. Matrícula 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:textNroMatricula']")
	public WebElementFacade txtnromatricula;
//Nombre  
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:textNombre']")
	public WebElementFacade txtnombre;
//Sigla empresa 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:textSiglaEmpresa']")
	public WebElementFacade txtsiglaempresa;
//Tipo sociedad 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:selectTipoSociedad']")
	public WebElementFacade cmbtiposociedad;
//Tipo empresa 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:selectTipoEmpresa']")
	public WebElementFacade cmbtipoempresa;
//Carácter servicio entidad 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:selectCaracterServicio']")
	public WebElementFacade cmbservicioentidad;
//Valor patrimonio líquido o inscrito 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:textValorPatrimonio']")
	public WebElementFacade txtvalorpatrimonio;
//Capital pagado
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:textCapitalPagado']")
	public WebElementFacade txtcapitalpagado;
//Pagina web
	@FindBy(id="formOpGenerales:idTabPersonaJuridica:textPaginaWeb")
	public WebElementFacade txtpaginaweb;
//Registra usuario externo si
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:radioRegistraUsuario:0']")
	public WebElementFacade rdbusuarioexternosi;
//Registra usuario externo no
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:radioRegistraUsuario:1']")
	public WebElementFacade rdbusuarioexternono;
//Tipo entidad 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:selectEntidad']")
	public WebElementFacade cmbtipoentidad;
//Presta servicio si
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:radioPrestaServicio:0']")
	public WebElementFacade rdbprestaserviciosi;
//Presta servicio no
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:radioPrestaServicio:1']")
	public WebElementFacade rdbprestaserviciono;
//Activo si
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:radioEstado:0']")
	public WebElementFacade rdbactivosi;
//Activo no
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:radioEstado:1']")
	public WebElementFacade rdbactivono;
//Guardar
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:idBtnSavePersonaJuridica']/span")
	public WebElementFacade btnguardar;
//Representante legal 
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica']/ul/li[2]/a")
	public WebElementFacade btnrepresentante;
//Representante legal adicionar
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:idAdicionarRepresentante']/span")
	public WebElementFacade btnadicionar;
//Representante legal criterio de búsqueda
	@FindBy(xpath="//*[@id='tabView:criterioBusqueda']")
	public WebElementFacade cmbcriterio;
//Representante legal tipo de identificación
	@FindBy(xpath="//*[@id='tabView:selectTipoDocumentoIdentidadBusqueda']")
	public WebElementFacade cmbtipoidentificacionbusqueda;
//Representante legal nro. identificación
	@FindBy(xpath="//*[@id='tabView:textNumeroDocumentoBusqueda']")
	public WebElementFacade txtnroidentificacion;
//Representante legal botón buscar
	@FindBy(xpath="//*[@id='tabView:idBtnBuscarPersona']/span")
	public WebElementFacade btnbuscarrepresentante;
//Representante legal botón volver en caso de que la persona exista
	@FindBy(xpath="//*[@id='buttonRegresar']")
	public WebElementFacade btnbvolver;
//Representante legal botón guardar
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:idBtnSaveListRepresentantes']/span")
	public WebElementFacade btnguardarrepresentante;
//Sede
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica']/ul/li[3]/a")
	public WebElementFacade btnsede;
//Sede adicionar
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:idBtnAdicionarSede']/span")
	public WebElementFacade btnadicionarsede;
//Sede editar
	@FindBy(xpath="//*[@id='formOpGenerales:idTabPersonaJuridica:tableSedes:0:idBtnEditarSede']/span")
	public WebElementFacade btnsedeeditar;	
//Sede nombre 
	@FindBy(xpath="//*[@id='formSede:idTabSede:textNombre']")
	public WebElementFacade txtsedenombre;
//Sede activo si 
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectEstadoSede:0']")
	public WebElementFacade rdbsedeactivosi;
//Sede activo no 
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectEstadoSede:1']")
	public WebElementFacade rdbsedeactivono;
//Sede principal si 
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectPrincipal:0']")
	public WebElementFacade rdbprincipalsi;
//Sede principal no 
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectPrincipal:1']")
	public WebElementFacade rdbprincipalno;
//Sede botón guardar
	@FindBy(xpath="//*[@id='formSede:idTabSede:idBtnSaveDatosBasicosSede']/span")
	public WebElementFacade btnsedeguardar;
//Sede dirección
	@FindBy(xpath="//*[@id='formSede:idTabSede']/ul/li[2]/a")
	public WebElementFacade btndireccion;
//Sede dirección pais
	@FindBy(xpath="//*[@id='formSede:idTabSede:tablaSelectPais']")
	public WebElementFacade cmbpais;
//Sede dirección departamento
	@FindBy(xpath="//*[@id='formSede:idTabSede:tablaSelectDep']")
	public WebElementFacade cmbdepartamento;
//Sede dirección ciudad
	@FindBy(xpath="//*[@id='formSede:idTabSede:tablaSelectCiudad']")
	public WebElementFacade cmbciudad;
//Sede dirección tipo via
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectTipoViaPersona']")
	public WebElementFacade cmbtipovia;
//Sede dirección Nro. via
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputNumeroVia']")
	public WebElementFacade txtnrovia;
//Sede dirección Nro. via 1
	@FindBy(xpath="//*[@id='formSede:idTabSede:idSufijoTipoVia']")
	public WebElementFacade cmbnrovia1;
//Sede dirección Nro. via 2
	@FindBy(xpath="//*[@id='formSede:idTabSede:idCardinalidadTipoVia']")
	public WebElementFacade cmbnrovia2;
//Sede dirección barrio
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputBarrio']")
	public WebElementFacade txtbarrio;
//Sede dirección tipo
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectTipDir']")
	public WebElementFacade cmbtipo;
//Sede dirección primer numero
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputPrimerNumero']")
	public WebElementFacade txtnumero;
//Sede dirección primer numero 1
	@FindBy(xpath="//*[@id='formSede:idTabSede:idSufijoNro1']")
	public WebElementFacade cmbnumero1;
//Sede dirección primer numero 2
	@FindBy(xpath="//*[@id='formSede:idTabSede:idCardinalidadNro1']")
	public WebElementFacade cmbnumero2;
//Sede dirección segundo numero 
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputSegundoNumero']")
	public WebElementFacade txtnumeros;
//Sede dirección segundo numero 1
	@FindBy(xpath="//*[@id='formSede:idTabSede:idCardinalidadNro2']")
	public WebElementFacade cmbnumeros1;
//Sede dirección codigo postal
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputCodPostal']")
	public WebElementFacade txtcodigopostal;
//Sede dirección autoriza envio informacion si
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectAutorizacionEnvioInfo:0']")
	public WebElementFacade rdbautorizasi;
//Sede dirección autoriza envio informacion no
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectAutorizacionEnvioInfo:1']")
	public WebElementFacade rdbautorizano;
//Sede dirección activa si
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectActivo:0']")
	public WebElementFacade rdbactivasi;
//Sede dirección activa no
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectActivo:1']")
	public WebElementFacade rdbactivano;
//Sede dirección complemento
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputComplementoDireccion']")
	public WebElementFacade txtcomplemento;
//Sede dirección botón guardar
	@FindBy(xpath="//*[@id='formSede:idTabSede:idSaveDireccion']/span")
	public WebElementFacade btnguardardireccion;
//Sede contactos 
	@FindBy(xpath="//*[@id='formSede:idTabSede']/ul/li[3]/a")
	public WebElementFacade btncontactos;
//Sede contactos adicionar
	@FindBy(xpath="//*[@id='formSede:idTabSede:idBtnAdicionar']/span")
	public WebElementFacade btncontactosadicionar;
//Sede contactos editar
	@FindBy(xpath="//*[@id='formSede:idTabSede:tableContactos_common:0:idEditarContacto']/span")
	public WebElementFacade btncontactoseditar;
//Sede contactos tipo 
	@FindBy(xpath="//*[@id='formSede:idTabSede:tipoContacto']")
	public WebElementFacade cmbcontactostipo;
//Sede contactos digite contacto celular
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputNumero']")
	public WebElementFacade txtdigitecontactocelular;
//Sede contactos digite contacto email
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputEmail']")
	public WebElementFacade txtdigitecontactoemail;
//Sede contactos digite contacto skype
	@FindBy(xpath="//*[@id='formSede:idTabSede:inputInformacion']")
	public WebElementFacade txtdigitecontactoskype;
//Sede contactos tipo dato
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectTipoContacto']")
	public WebElementFacade cmbtipodato;
//Contactos autoriza envio información 
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectContactoEnvio:0']")
	public WebElementFacade rdbautorizacsi;
//Contactos autoriza envio información 
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectContactoEnvio:1']")
	public WebElementFacade rdbautorizacno;
//Contactos activo si 
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectContactoActivo:0']")
	public WebElementFacade rdbactivocsi;
//Contactos activo no
	@FindBy(xpath="//*[@id='formSede:idTabSede:selectContactoActivo:1']")
	public WebElementFacade rdbactivocno;
//Contactos guardar
	@FindBy(xpath="//*[@id='formSede:idTabSede:idBtnSaveContacto']/span")
	public WebElementFacade btnguardarc;
//globo informativo
	@FindBy(xpath="//*[@id='idMessagesGlobal']/div/ul/li/span")
	public WebElementFacade lblgloboinformativo;	
	
//método donde se especifica si existe o no persona jurídica  	
	public void boton_buscar_juridica(String existe) {
		/*si en la .feature adicionar expediente, escenario @CrearPersonaJurídica en el campo 'existe' se indica un No, quiere decir que la persona no existe, la variable vali 
		que venía inicializada en true se convertirá en false, esto para controlar el camino que debe seguir el robot según el caso*/
		if (existe.equals("No")) {
			btnbuscar.click();
			vali = false;
		//en caso de que campo 'existe' se indique Si, la variable continuara en true y procederá a seguir el flujo para editar campos especificados en la historia de usuario.
		}else if(existe.equals("Si")) {
			btnbuscar.click();
			btneditar.click();
			vali = true;
		}
	}
////método que me permite indicarle al robot el camino a seguir según el caso.
	public void persona_juridica_no_existe(List<String> datosjuridica) {
//paso a seguir en caso de que el campo 'existe' se encuentre en No. El robot procederá a crear la persona jurídica.
		/*los siguientes condicionales permiten controlar el camino a seguir cuando se le indique al robot la edición de un campo, es decir, si el campo
		es diferente de vacío, procederá a digitar lo que se encuentre indicado en la historia de usuario, en caso de que el campo 
		sea igual a vacío el robot no realizara cambios en dicho campo*/
		if (!datosjuridica.get(0).equals("")) {
			txtnromatricula.and().type(datosjuridica.get(0));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(1).equals("")) {
			txtnombre.and().type(datosjuridica.get(1));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(2).equals("")) {
			txtsiglaempresa.and().type(datosjuridica.get(2));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(3).equals("")) {
			cmbtiposociedad.and().selectByVisibleText(datosjuridica.get(3));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(4).equals("")) {
			cmbtipoempresa.and().selectByVisibleText(datosjuridica.get(4));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(5).equals("")) {
			cmbservicioentidad.and().selectByVisibleText(datosjuridica.get(5));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(6).equals("")) {
			txtvalorpatrimonio.and().type(datosjuridica.get(6));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(7).equals("")) {
			txtcapitalpagado.and().type(datosjuridica.get(7));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(8).equals("")) {
			txtpaginaweb.and().type(datosjuridica.get(8));
			waitFor(1).seconds();
		}
		if ((!datosjuridica.get(9).equals("")) || (!datosjuridica.get(10).equals(""))) {
			//este condicional me permite tener control de los radio buttons, según lo que sea especificado en la historia de usuario.
			switch (datosjuridica.get(9)) {
			case "Si":
				rdbusuarioexternosi.and().click();
				cmbtipoentidad.and().selectByVisibleText(datosjuridica.get(10));
			break;
			case "No":
				rdbusuarioexternono.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(11).equals("")) {
			switch (datosjuridica.get(11)) {
			case "Si":
				rdbprestaserviciosi.and().click();
			break;
			case "No":
				rdbprestaserviciono.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(12).equals("")) {
			switch (datosjuridica.get(12)) {
			case "Si":
				rdbactivosi.and().click();
			break;
			case "No":
				rdbactivono.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		btnguardar.click();
		waitFor(1).seconds();
		//este método me permite tener control de la información almacenada con éxito.
		assertThat(datosjuridica.get(42), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
		btnrepresentante.click();
		waitFor(1).seconds();
		/*con el siguiente condicional se realiza control del campo 'existe' cuando se encuentra en No, en caso de que el campo se encuentre en Si y se desee editar
		un campo especificado en la historia de usuario, la variable ingresara en true y no entrara a realizar los siguientes pasos si no que continuara en la pestaña sede */
		//estos pasos son omitidos porque el botón editar que existe en esta pestaña tiene la misma función del proceso que ya fue realizado en persona natural.
		if (vali==false) {
			btnadicionar.click();
			waitFor(1).seconds();
		if (!datosjuridica.get(13).equals("")) {
			cmbcriterio.selectByVisibleText(datosjuridica.get(13));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(14).equals("")) {
			cmbtipoidentificacionbusqueda.and().selectByVisibleText(datosjuridica.get(14));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(15).equals("")) {
			txtnroidentificacion.and().type(datosjuridica.get(15));
			waitFor(1).seconds();
		}
		btnbuscarrepresentante.and().click();
		waitFor(1).seconds();
		//se carga un representante existente ya que el proceso para registrar dicho representante funciona de forma igual que el proceso crear persona natural.
		btnbvolver.and().click();
		waitFor(1).seconds();
		btnguardarrepresentante.and().click();
		assertThat(datosjuridica.get(42), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
		}
		btnsede.and().click();
		waitFor(1).seconds();
		if (vali==true) {
			btnsedeeditar.click();
		}else {
			btnadicionarsede.and().click();
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(16).equals("")) {
			txtsedenombre.and().type(datosjuridica.get(16));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(17).equals("")) {
			switch (datosjuridica.get(17)) {
			case "Si":
				rdbsedeactivosi.and().click();
			break;
			case "No":
				rdbsedeactivono.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(18).equals("")) {
			switch (datosjuridica.get(18)) {
			case "Si":
				rdbprincipalsi.and().click();
			break;
			case "No":
				rdbprincipalno.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		btnsedeguardar.and().click();
		waitFor(1).seconds();
		assertThat(datosjuridica.get(42), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
		btndireccion.and().click();
		waitFor(1).seconds();
		if (!datosjuridica.get(19).equals("")) {
			cmbpais.and().selectByVisibleText(datosjuridica.get(19));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(20).equals("")) {
			cmbdepartamento.selectByVisibleText(datosjuridica.get(20));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(21).equals("")) {
			cmbciudad.selectByVisibleText(datosjuridica.get(21));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(22).equals("")) {
			cmbtipovia.selectByVisibleText(datosjuridica.get(22));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(23).equals("")) {
			txtnrovia.and().type(datosjuridica.get(23));
			txtnrovia.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(24).equals("")) {
			cmbnrovia1.and().selectByVisibleText(datosjuridica.get(24));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(25).equals("")) {
			cmbnrovia2.and().selectByVisibleText(datosjuridica.get(25));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(26).equals("")) {
			txtbarrio.and().type(datosjuridica.get(26));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(27).equals("")) {
			cmbtipo.and().selectByVisibleText(datosjuridica.get(27));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(28).equals("")) {
			txtnumero.and().type(datosjuridica.get(28));
			txtnumero.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(29).equals("")) {
			cmbnumero1.and().selectByVisibleText(datosjuridica.get(29));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(30).equals("")) {
			cmbnumero2.and().selectByVisibleText(datosjuridica.get(30));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(31).equals("")) {
			txtnumeros.and().type(datosjuridica.get(31));
			txtnumeros.and().sendKeys(Keys.TAB);
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(32).equals("")) {
			cmbnumeros1.and().selectByVisibleText(datosjuridica.get(32));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(33).equals("")) {
			txtcodigopostal.and().type(datosjuridica.get(33));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(34).equals("")) {
			switch (datosjuridica.get(34)) {
			case "Si":
				rdbautorizasi.and().click();
			break;
			case "No":
				rdbautorizano.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(35).equals("")) {
			switch (datosjuridica.get(35)) {
			case "Si":
				rdbactivasi.and().click();
			break;
			case "No":
				rdbactivano.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(36).equals("")) {
			txtcomplemento.and().type(datosjuridica.get(36));
			waitFor(1).seconds();
		}
		btnguardardireccion.and().click();
		assertThat(datosjuridica.get(42), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
		btncontactos.and().click();
		waitFor(1).seconds();
		/*cuando existe el caso en que se encuentre el botón adicionar y editar, se debe controlar con este condicional 
		para indicarle al robot en que caso debe hacer clic en adionar o editar*/
		if (vali==true) {
			btncontactoseditar.click();
		}else {
			btncontactosadicionar.and().click();
		}
		waitFor(1).seconds();
		if ((!datosjuridica.get(37).equals("")) && (!datosjuridica.get(38).equals(""))) {
			cmbcontactostipo.and().selectByVisibleText(datosjuridica.get(37));
			waitFor(1).seconds();
			//se realiza control de cada tipo de contacto, ya que la relacion de objetos entre ellos es diferente.
			switch (datosjuridica.get(37)) {
			case "Celular":
				txtdigitecontactocelular.and().type(datosjuridica.get(38));
			break;
			case "Email":
				txtdigitecontactoemail.and().type(datosjuridica.get(38));
			break;
			case "Skype":
				txtdigitecontactoskype.and().type(datosjuridica.get(38));
			break;
			case "Teléfono":
				txtdigitecontactocelular.and().type(datosjuridica.get(38));
			break;
			}
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(39).equals("")) {
			cmbtipodato.and().selectByVisibleText(datosjuridica.get(39));
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(40).equals("")) {
			switch (datosjuridica.get(40)) {
			case "Si":
				rdbautorizacsi.and().click();
			break;
			case "No":
				rdbautorizacno.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		if (!datosjuridica.get(41).equals("")) {
			switch (datosjuridica.get(41)) {
			case "Si":
				rdbactivocsi.and().click();
			break;
			case "No":
				rdbactivocno.and().click();
			break;
			}
			waitFor(1).seconds();
		}
		btnguardarc.and().click();
		assertThat(datosjuridica.get(42), containsString(lblgloboinformativo.and().getText()));
		waitFor(1).seconds();
	}
}