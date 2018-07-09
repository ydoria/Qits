#Feature: archivo de características, donde se define la historia de usuario, cada línea de un escenario, 
#mapea con un método en la clase .definition. Se agrupan los pasos en acciones, y cada una de estas acciones corresponderá a una línea gherkin en nuestra feature.

@QuipuxE
Feature: Cobro Coactivo 
  Gestión de procesos funcionales de cobro de las entidades gubernamentales, 
  con la finalidad de obtener pagos de las obligaciones que adeuda la ciudadanía.  

  Background: Inicie sesión con credenciales válidas.
    Given el usuario está en la página de inicio de sesión
    When usuario ingrese nombre de usuario "ydoria"
    And usuario ingrese la contraseña "Admin6*"
    And haga clic en el botón de inicio
    Then el usuario debe iniciar sesión con éxito "Bienvenido"
    
  @EstudioTitulosSinBien
  Scenario Outline: Estudio de títulos: los expedientes que son aprobados, continúan con la generación del mandamiento de pago en el proceso de ESTUDIO DE TÍTULOS.
    Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When usuario seleccione opción "<Tipo_renta_investigacion>"
    And seleccione proceso "<Proceso_investigacion>"
    And criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja estudio de titulos se encuentre cargada
		|<CargarMP>|<Dirección>|<Ruta>|<Vista_Previa>|<Mandamiento>|<Direccion_Mandamiento>|<Globo_informativo>|
		
    Examples: 
    |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|CargarMP|Dirección|Ruta|Mandamiento|Direccion_Mandamiento|Globo_informativo|
  	##@externaldata@./src/test/resources/Datadriven/Estudio.xlsx@EstudioTitulosSinBien@1
   |INFRACCIONES DE TRÁNSITO   |   |   |   |   |Si   |Sin dirección   | C:\Users\ydoria\eclipse-workspace\Quipux\src\test\resources\Datadriven\Archivos\Prueba.pdf   |   |   |La información ha sido almacenada satisfactoriamente.|
       
  @EstudioTitulosConBien
  Scenario Outline: Estudio de títulos: los expedientes que son aprobados, continúan con la generación del mandamiento de pago en el proceso de ESTUDIO DE TÍTULOS.
    Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When usuario seleccione opción "<Tipo_renta_investigacion>"
    And seleccione proceso "<Proceso_investigacion>"
    And criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja estudio de titulos se encuentre cargada y seleccione un bien a embargar
    |<CargarMP>|<Dirección>|<Ruta>|<Vista_Previa>|<Mandamiento>|<Direccion_Mandamiento>|<Globo_informativo>|

    Examples: 
    |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|CargarMP|Dirección|Ruta|Mandamiento|Direccion_Mandamiento|Globo_informativo|
    ##@externaldata@./src/test/resources/Datadriven/Estudio.xlsx@EstudioTitulosConBien@1
   |INFRACCIONES DE TRÁNSITO   |   |   |   |   |Si   |Sin dirección    |C:\Users\ydoria\eclipse-workspace\Quipux\src\test\resources\Datadriven\Archivos\Prueba.pdf   |   |   |La información ha sido almacenada satisfactoriamente.|
 
  @EstudioTitulosDevolver
  Scenario Outline: Estudio de títulos: los expedientes que son aprobados, continúan con la generación del mandamiento de pago en el proceso de ESTUDIO DE TÍTULOS.
    Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When usuario seleccione opción "<Tipo_renta_investigacion>"
    And seleccione proceso "<Proceso_investigacion>"
    And criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja estudio de títulos se encuentre cargada y se desee devolver los expedientes
    |<Tipo_Motivo>|<Obervaciones>|<Globo_informativo>|
    
    Examples: 
    |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|Tipo_Motivo|Obervaciones|Globo_informativo|
   	##@externaldata@./src/test/resources/Datadriven/Estudio.xlsx@DevolverExpedientes@1
   |   |   |   |   |   |No registra dirección o ciudad   |Failed   |La información ha sido almacenada satisfactoriamente.|
   	
