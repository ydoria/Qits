package quipux.pageobjects;

import static org.junit.Assert.assertThat;
import Data.DataRevision;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//Clase QitsRevisionPage con la definición de los objetos requeridos para la prueba.
public class QitsRevisionPage extends PageObject {
	//con este método es posible guardar la información básica del deudor para los expedientes que son aprobados.
	DataRevision dataRevision=new DataRevision();
	//Menú Expedientes
	@FindBy(xpath="//A[@href='#'][text()=' Expedientes']")
	public WebElementFacade menuExpedientes;
	//Submenú Revisar Expedientes
	@FindBy(xpath="//*[@id='idMenuRevisionExpedientes']")
	public WebElementFacade menuRevisar;
	//Tipo renta
	@FindBy(xpath="//SELECT[@id='formRevisionExpediente:selectRenta']")
	public WebElementFacade cmbtiporenta;
	//Proceso
	@FindBy(xpath="//SELECT[@id='formRevisionExpediente:selectProceso']")
	public WebElementFacade cmbproceso;
	//Botón buscar
	@FindBy(xpath="//SPAN[@class='ui-button-text ui-c'][text()='Buscar']")
	public WebElementFacade btnbuscar;
	//BandejaTotalElement
	@FindBy(xpath="//*[@id='formRevisionExpediente:idTotalPendienteRevision']/div/table/tbody/tr/td")
	public WebElementFacade lbltotal;
	//Botón revisar
	@FindBy(xpath="//*[@id='formRevisionExpediente:tablePendientesRevision:0:idBtnRevisarExpedientePendRevision']/span")
	public WebElementFacade btnrevisar;
	//Pestaña expediente
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView']/ul/li[2]/a")
	public WebElementFacade btnexpediente;
	//Cantidad expedientes
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:idPanelDatosGenerales_content']/table[2]/tbody/tr[1]/td[2]/span")
	public WebElementFacade lblcantexpedientes;
	//Botón evaluar
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView:tableExpedientes:0:idNewDevolucionRevisarExpediente']/span")
	public WebElementFacade btnevaluar;
	//Evaluación expediente Estado
	@FindBy(xpath="//*[@id='formDialogEvaluar:estado']")          
	public WebElementFacade cmbestado;
	//Evaluación expediente tipo motivo
	@FindBy(xpath="//*[@id='formDialogEvaluar:tipoMotivo']")
	public WebElementFacade cmbtipomotivo;
	//Evaluación expediente Observaciones
	@FindBy(xpath="//*[@id='formDialogEvaluar:observa']")
	public WebElementFacade txtobservaciones;	
	//Evaluación expediente Aceptar
	@FindBy(xpath="//*[@id='formDialogEvaluar:IdProcesarEvaluacionPendRevision']/span")
	public WebElementFacade btnaceptar;	
	//Botón guardar
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView:idProcesarListEvaluacionPendRevision']/span")
	public WebElementFacade btnguardar;
	//Botón volver
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:volverInicioRMI']/span")
	public WebElementFacade btnvolver;
	//Total subpantallas
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView:tableExpedientes_paginator_bottom']/a[3]/span")
	public WebElementFacade btnsubpantallas;
	//Globo informativo 
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:growl_container']/div/div/div[2]/span")
	public WebElementFacade lblgloboinformativo;
	//BandejaTotalElement devueltos
	@FindBy(xpath="//*[@id='formRevisionExpediente:idTotalDevueltos']/div/table/tbody/tr/td")
	public WebElementFacade lbltotald;
	//Botón revisar devueltos
	@FindBy(xpath="//*[@id='formRevisionExpediente:tableDevueltos:0:idRevisarExpedienteDevuelto']/span")
	public WebElementFacade btnrevisard;
	//Botón evaluar devueltos
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView:tableExpedientes:0:idNewDevolucion']/span")
	public WebElementFacade btnevaluard;
	//Evaluación expediente mensaje de validación devueltos
	@FindBy(xpath="//*[@id='messages']")
	public WebElementFacade lblmensaje;
	//Evaluación expediente Aceptar devueltos
	@FindBy(xpath="//*[@id='formDialogEvaluar:idProcesarEvaluacionDevuelto']/span")
	public WebElementFacade btnaceptard;	
	//Botón guardar devueltos
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView:idProcesarListEvaluacionDevuelto']/span")
	public WebElementFacade btnguardard;
	//Proceso anterior pendiente corrección
	@FindBy(xpath="//*[@id='formRevisionExpediente:selectProcesoAnterior']")
	public WebElementFacade cmbprocesoanterior;
	//BandejaTotalElement pendiente corrección
	@FindBy(xpath="//*[@id='formRevisionExpediente:idTotalPendienteCorreccion']/div/table/tbody/tr/td")
	public WebElementFacade lbltotalc;
	//Botón revisar pendiente corrección
	@FindBy(xpath="//*[@id='formRevisionExpediente:tablePendientesCorrecion:0:idRevisarExpedientePendCorrecion']/span")
	public WebElementFacade btnrevisarc;
	//Botón evaluar pendiente corrección
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView:tableExpedientes:0:idNewDevolucionCorreccion']/span")
	public WebElementFacade btnevaluarc;
	//Auto aclaratorio pendiente corrección
	@FindBy(xpath="//*[@id='formDialogEvaluar:textAutoAclaratorio']")
	public WebElementFacade txtautoaclaratorio;
	//Evaluación expediente Aceptar pendiente corrección
	@FindBy(xpath="//*[@id='formDialogEvaluar:idProcesarEvaluacionPendCorrecion']/span")
	public WebElementFacade btnaceptarc;
	//Botón guardar pendiente corrección
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:tabView:idProcesarListEvaluacionPendCorrecion']/span")
	public WebElementFacade btnguardarc;
	//nombre
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:idPanelDatosGenerales_content']/table[1]/tbody/tr[1]/td[2]/span")
	public WebElementFacade lblnombre;
	//identificación
	@FindBy(xpath="//*[@id='formDetalleRevisionExpediente:idPanelDatosGenerales_content']/table[1]/tbody/tr[2]/td[2]/span")
	public WebElementFacade lblidentificacion;
	
	//método que permite interactuar con el menú, clic en expedientes, clic en revisar expedientes.
	public void MenuRevisarExpedientes() {
		menuExpedientes.click();
		menuRevisar.click();
	}
	//método que permite interactuar con los tipos de renta posibles a ser utilizados.	
	public void tipo_renta(String tiporenta){
		cmbtiporenta.and().selectByVisibleText(tiporenta);
	}
	//método que permite seleccionar el proceso a ser utilizado. 	
	public void proceso(String proceso) {
		/*en este condicional es posible controlar cuando la bandeja ya se encuentre cargada, es decir, si la bandeja ya está cargada el robot seguirá validando siempre y cuando el campo 
		'proceso' que está definido en la historia de usuario se encuentre vacío.*/
		if (!proceso.equals("")) {
			cmbproceso.and().selectByVisibleText(proceso);	
			waitFor(1).seconds();
		}
	}
	//método que permite seleccionar el proceso donde serán corregidos los expedientes. 	
	public void procesoanterior(String procesoanterior) {
		/*en este condicional es posible controlar cuando la bandeja ya se encuentre cargada, es decir, si la bandeja ya está cargada el robot seguirá validando siempre y cuando el campo 
		'proceso anterior' que está definido en la historia de usuario se encuentre vacío.*/
		if (!procesoanterior.equals("")) {
			cmbprocesoanterior.and().selectByVisibleText(procesoanterior);
			waitFor(2).seconds();
		}
	}
	//método que me permite buscar la bandeja según criterio de búsqueda.	
	public void boton_buscar() {
		btnbuscar.and().click();
		waitFor(3).seconds();
	}
	//método que permite controlar el flujo a seguir cuando se carga la bandeja pendiente revisión.	
	public void bandeja_total_element(String estado, String observaciones, String tipomotivo, String globoinformativo) throws Throwable {
		//en esta declaración es posible verificar la cantidad de registros a ser revisados.
		String separador = lbltotal.getText();
		String[] parts = separador.split(": ");	
		//se define variable para controlar la cantidad de expedientes a ser evaluados. 
		int k;
        System.out.println(parts[1]);
        //la totalidad de registros se controlan mediante la definición del siguiente ciclo.
        for (int i=1;i<=Integer.parseInt(parts[1]);i++) {
        	btnrevisar.click();
        	waitFor(1).seconds();
        	btnexpediente.click();
        	waitFor(1).seconds();
        	//se inicializa la variable que me permite controlar la cantidad de expedientes a ser evaluados en 0, para que sea posible iniciar con el primer expediente a ser evaluado.
        	k=0;
        	//se define variable 'pagina' para controlar las diferentes pantallas que se cargan cuando son más de 10 registros o expedientes.
        	int pagina=0;
        	//cuando el expediente es aprobado se captura el nombre y la identificación del deudor para ser almacenados en un archivo de excel.
        	String deudor=lblnombre.and().getText();
        	String identificacion=lblidentificacion.and().getText();
        	//la totalidad de expedientes a ser evaluados se controlan mediante la definición del siguiente ciclo.
        	for (int j=0;j<Integer.parseInt(lblcantexpedientes.getText());j++){
        		//mediante esta definición es posible recorrer la cantidad de expedientes a evaluar. 
        		String xpath="//*[@id='formDetalleRevisionExpediente:tabView:tableExpedientes:"+k+":idNewDevolucionRevisarExpediente']/span";
        		waitFor(1).seconds();
        		findBy(xpath).and().click();
        		waitFor(1).seconds();
        		String label = null;
        		try {
        			label = (lblmensaje.getText());	
    			}catch(Throwable n) {
    				
    			}
        		//si el mensaje de vencimiento es nulo me permitirá aprobar, corregir o archivar el expediente según lo definido en la historia de usuario. 
        		if (label == null) {
        			cmbestado.and().selectByVisibleText(estado);
            		waitFor(2).seconds();	
        		//si el estado en la historia de usuario se define como corregir o archivar el robot tendrá en cuenta el campo 'tipo motivo'.
        			if(estado.equals("Corregir") || estado.equals("Archivar")) {
        				cmbtipomotivo.and().selectByVisibleText(tipomotivo);
        				waitFor(2).seconds();
        			} 
        		//si el mensaje no es igual a nulo, es decir que existe, el robot solo me permitirá archivar el expediente.	
        		}else if(estado.equals("Archivar")){
        			cmbtipomotivo.and().selectByVisibleText(tipomotivo);	
        			waitFor(2).seconds();
        		//si el estado en la historia de usuario se define para ser aprobado o corregido y el mensaje de vencimiento existe el robot procederá a archivar el expediente. Nota: cuando el mensaje existe solo es posible archivar el expediente. 
        		}else if(estado.equals("Aprobar") || estado.equals("Corregir")) {	
	        		cmbestado.and().selectByVisibleText("Archivar");  
	        		waitFor(2).seconds();
	        		cmbtipomotivo.and().selectByVisibleText(tipomotivo);
            		waitFor(2).seconds();
        		}
        		txtobservaciones.and().type(observaciones);
        		waitFor(1).seconds();
        		btnaceptar.click();
        		waitFor(2).seconds();
        		//en este condicional se parametrizan las pantallas, es decir, en caso de que se carguen más de 10 expedientes el robot tendrá la capacidad de pasar a la siguiente pantalla hasta evaluar todos los expedientes, esto mediante un contador.
        		if (k == 9 + pagina) {
        			btnsubpantallas.click();
        			pagina = pagina + 10;
        			waitFor(1).seconds();
        		}
        		//contador que me permite avanzar para evaluar el próximo expediente.
        		k=k+1;
        	}
        		waitFor(2).seconds();
        		btnguardar.click();
        		waitFor(1).seconds();
        		//con esta definición es posible escribir el nombre y la identificación del deudor en el archivo de excel. 
        		dataRevision.Escribir(deudor, identificacion);
        		waitFor(1).seconds();
        		//este método me permite tener control de la información almacenada con éxito.
        		assertThat(lblgloboinformativo.getText(), containsString(globoinformativo));
        		waitFor(1).seconds();
        		btnvolver.click();
        		waitFor(1).seconds();
        }
	}
	
//método que permite controlar el flujo a seguir cuando se carga la bandeja devueltos.
	public void bandeja_total_element_devueltos(String estado, String observaciones, String tipomotivo, String globoinformativo) throws Throwable {
		//en esta declaración es posible verificar la cantidad de registros a ser revisados.
		String separadord = lbltotald.getText();
		String[] partsd = separadord.split(": ");
		//se define variable para controlar la cantidad de expedientes a ser evaluados. 
		int k;
        System.out.println(partsd[1]);	
        //la totalidad de registros se controlan mediante la definición del siguiente ciclo.
        for (int i=1;i<=Integer.parseInt(partsd[1]);i++) {
        	btnrevisard.click();
        	waitFor(1).seconds();
        	btnexpediente.click();
        	waitFor(1).seconds();
        	//se inicializa la variable que me permite controlar la cantidad de expedientes a ser evaluados en 0, para que sea posible iniciar con el primer expediente a ser evaluado.
        	k=0;
        	//se define variable 'pagina' para controlar las diferentes pantallas que se cargan cuando son más de 10 registros o expedientes.
        	int pagina=0;
        	//cuando el expediente es aprobado se captura el nombre y la identificación del deudor para ser almacenados en un archivo de excel.
        	String deudor=lblnombre.and().getText();
        	String identificacion=lblidentificacion.and().getText();
        	//la totalidad de expedientes a ser evaluados se controlan mediante la definición del siguiente ciclo.
        	for (int j=0;j<Integer.parseInt(lblcantexpedientes.getText());j++){
        		//mediante esta definición es posible recorrer la cantidad de expedientes a evaluar. 
        		String xpath="//*[@id='formDetalleRevisionExpediente:tabView:tableExpedientes:"+k+":idNewDevolucion']/span";
        		waitFor(1).seconds();
        		findBy(xpath).and().click();
        		waitFor(1).seconds();
        		//en esta variable se guarda el mensaje de validación que arroja el sistema cuando el expediente se encuentra vencido y no es posible aprobarlo.
        		String label = null;
        		try {
        			label = (lblmensaje.getText());	
    			}catch(Throwable n) {
    				
    			}
        		//si el mensaje de vencimiento es nulo me permitirá aprobar, corregir o archivar el expediente según lo definido en la historia de usuario. 
        		if (label == null) {
	        		cmbestado.and().selectByVisibleText(estado);  
	        		waitFor(2).seconds();
	        		//si el estado en la historia de usuario se define como corregir o archivar el robot tendrá en cuenta el campo 'tipo motivo'.
	        		if(estado.equals("Corregir") || estado.equals("Archivar")) {
	        			cmbtipomotivo.and().selectByVisibleText(tipomotivo);
	        			waitFor(2).seconds();
	        		}	
	        	//si el mensaje no es igual a nulo, es decir que existe, el robot solo me permitirá archivar el expediente.
        		}else if(estado.equals("Archivar")){
        			cmbtipomotivo.and().selectByVisibleText(tipomotivo);	
        			waitFor(2).seconds();
        		//si el estado en la historia de usuario se define para ser aprobado o corregido y el mensaje de vencimiento existe el robot procederá a archivar el expediente. Nota: cuando el mensaje existe solo es posible archivar el expediente.  
        		}else if(estado.equals("Aprobar") || estado.equals("Corregir")) {	
	        		cmbestado.and().selectByVisibleText("Archivar");  
	        		waitFor(2).seconds();
	        		cmbtipomotivo.and().selectByVisibleText(tipomotivo);
            		waitFor(2).seconds();
        		}
        		txtobservaciones.and().type(observaciones);
        		waitFor(1).seconds();
        		btnaceptard.click();
        		waitFor(1).seconds();
        		//en este condicional se parametrizan las pantallas, es decir, en caso de que se carguen más de 10 expedientes el robot tendrá la capacidad de pasar a la siguiente pantalla hasta evaluar todos los expedientes, esto mediante un contador.
        		if (k == 9 + pagina) {
        			btnsubpantallas.click();
        			pagina = pagina + 10;
        			waitFor(1).seconds();
        		}
        		//contador que me permite avanzar para evaluar el próximo expediente.
       			k=k+1; 
        	}
        		waitFor(2).seconds();
        		btnguardard.click();
        		waitFor(1).seconds();
        		//con esta definición es posible escribir el nombre y la identificación del deudor en el archivo de excel. 
        		dataRevision.Escribir(deudor, identificacion);
        		waitFor(1).seconds();
        		//este método me permite tener control de la información almacenada con éxito.
        		assertThat(lblgloboinformativo.getText(), containsString(globoinformativo));
        		waitFor(1).seconds();
        		btnvolver.click();
        		waitFor(1).seconds();
        }      		
	}
	
//método que permite controlar el flujo a seguir cuando se carga la bandeja pendiente corrección	
	public void bandeja_total_element_pendiente_correccion(String estado, String autoaclaratorio, String observaciones, String tipomotivo, String globoinformativo) throws Throwable {
		//en esta declaración es posible verificar la cantidad de registros a ser revisados.
		String separadorc = lbltotalc.getText();
		waitFor(1).seconds();
		String[] partsc = separadorc.split(": ");
		//se define variable para controlar la cantidad de expedientes a ser evaluados 
		int k;
        System.out.println(partsc[1]);	
        //la totalidad de registros se controlan mediante la definición del siguiente ciclo
        for (int i=1;i<=Integer.parseInt(partsc[1]);i++) {
        	waitFor(2).seconds();
        	btnrevisarc.click();
        	waitFor(1).seconds();
        	btnexpediente.click();
        	//se inicializa la variable que me permite controlar la cantidad de expedientes a ser evaluados en 0, para que sea posible iniciar con el primer expediente a ser evaluado.
        	k=0;
        	//se define variable 'pagina' para controlar las diferentes pantallas que se cargan cuando son más de 10 registros o expedientes.
        	int pagina=0;
        	//cuando el expediente es aprobado se captura el nombre y la identificación del deudor para ser almacenados en un archivo de excel.
        	String deudor=lblnombre.and().getText();
        	String identificacion=lblidentificacion.and().getText();
        	//la totalidad de expedientes a ser evaluados se controlan mediante la definición del siguiente ciclo
        	for (int j=0;j<Integer.parseInt(lblcantexpedientes.getText());j++){
        		//mediante esta definición es posible recorrer la cantidad de expedientes a evaluar 
        		String xpath="//*[@id='formDetalleRevisionExpediente:tabView:tableExpedientes:"+k+":idNewDevolucionCorreccion']/span";
        		waitFor(1).seconds();
        		findBy(xpath).and().click();
        		waitFor(1).seconds();
        		//en esta variable se guarda el mensaje de validación que arroja el sistema cuando el expediente se encuentra vencido y no es posible aprobarlo.
        		String label = null;
        		try {
        			label = (lblmensaje.getText());	
    			}catch(Throwable n) {
    				
    			}
        		//si el mensaje de vencimiento es nulo me permitirá aprobar, corregir o archivar el expediente según lo definido en la historia de usuario. 
        		if (label == null) {
        			cmbestado.and().selectByVisibleText(estado);   
            		waitFor(2).seconds();   		
        		//en la bandeja pendiente corrección cuando se desea aprobar un expediente se debe tener en cuenta el campo autoaclaratorio 
            		if (estado.equals("Aprobar")) {
            			txtautoaclaratorio.and().type(autoaclaratorio);
            			waitFor(1).seconds();
            		}
        		//si el estado es corregir o archivar se debe tener en cuenta el campo tipo motivo
            		if(estado.equals("Corregir") || estado.equals("Archivar")) {
            			cmbtipomotivo.and().selectByVisibleText(tipomotivo);	
            			waitFor(2).seconds();
            		}
        		}else if(estado.equals("Archivar")){
        			cmbtipomotivo.and().selectByVisibleText(tipomotivo);	
        			waitFor(2).seconds();
        			Serenity.takeScreenshot();
        		//si el estado en la historia de usuario se define para ser aprobado o corregido y el mensaje de vencimiento existe el robot procederá a archivar el expediente. Nota: cuando el mensaje existe solo es posible archivar el expediente.  
        		}else if(estado.equals("Aprobar") || estado.equals("Corregir")) {	
	        		cmbestado.and().selectByVisibleText("Archivar");  
	        		waitFor(2).seconds();
	        		cmbtipomotivo.and().selectByVisibleText(tipomotivo);
            		waitFor(2).seconds();
        		}
        		txtobservaciones.and().type(observaciones);
        		waitFor(2).seconds();
        		btnaceptarc.click();
        		waitFor(3).seconds();
        		//en este condicional se parametrizan las pantallas, es decir, en caso de que se carguen más de 10 expedientes el robot tendrá la capacidad de pasar a la siguiente pantalla hasta evaluar todos los expedientes, esto mediante un contador
        		if (k == 9 + pagina) {
        			btnsubpantallas.click();
        			pagina = pagina + 10;
        			waitFor(1).seconds();
        		}
        		//contador que me permite avanzar para evaluar el próximo expediente
        		k=k+1;
        	}
        		waitFor(2).seconds();
        		btnguardarc.click();
        		waitFor(1).seconds();
        		//con esta definición es posible escribir el nombre y la identificación del deudor en el archivo de excel
        		dataRevision.Escribir(deudor, identificacion);
        		waitFor(1).seconds();
        		//este método me permite tener control de la información almacenada con éxito.
        		assertThat(lblgloboinformativo.getText(), containsString(globoinformativo));
        		waitFor(1).seconds();
        		btnvolver.click();
        }
	}
}


