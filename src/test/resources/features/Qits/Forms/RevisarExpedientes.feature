#Feature: archivo de características, donde se define la historia de usuario, cada línea de un escenario, 
#mapea con un método en la clase .definition. Se agrupan los pasos en acciones, y cada una de estas acciones corresponderá a una línea gherkin en nuestra feature.

@QuipuxR
Feature: Cobro Coactivo 
  Gestión de procesos funcionales de cobro de las entidades gubernamentales, 
  con la finalidad de obtener pagos de las obligaciones que adeuda la ciudadanía.  

 Background: Inicie sesión con credenciales válidas.
    Given el usuario está en la página de inicio de sesión
    When usuario ingrese nombre de usuario "ydoria"
    And usuario ingrese la contraseña "Admin6*"
    And haga clic en el botón de inicio
    Then el usuario debe iniciar sesión con éxito "Bienvenido"

@PendienteRevisión
 Scenario Outline: Revisar Expedientes: permite visualizar los deudores y/o expedientes asignados por funcionario para analizar en qué proceso se encuentra el deudor y/o expediente.
 		Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción revisar expedientes 
 		When usuario seleccione opción de búsqueda "<Tipo_renta>"
 		And seleccionar proceso "<Proceso>"
 		And bandeja pendiente revisión se encuentre cargada "<Estado>" and  "<Observaciones>" and "<Tipo_motivo>" and "<Mensaje_esperado>"
 	
 Examples:
 		|Tipo_renta|Proceso|Estado|Tipo_motivo|Observaciones|Mensaje_esperado| 	     		  	
		##@externaldata@./src/test/resources/Datadriven/RevisarExpedientes.xlsx@PendienteRevisión@2
   |INFRACCIONES DE TRÁNSITO   |Pendiente revisión   |Corregir   |Error en nombre y/o apellido    |Failed   |La información ha sido almacenada satisfactoriamente.|

@Devueltos
 Scenario Outline: Revisar Expedientes: permite visualizar los deudores y/o expedientes asignados por funcionario para analizar en qué proceso se encuentra el deudor y/o expediente.
 		Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción revisar expedientes  
 		When usuario seleccione opción de búsqueda "<Tipo_renta>"
 		And seleccionar proceso "<Proceso>"
 		And bandeja devueltos se encuentre cargada "<Estado>" and  "<Observaciones>" and "<Tipo_motivo>" and "<Mensaje_esperado>"
  
 Examples:
 		|Tipo_renta|Proceso|Estado|Tipo_motivo|Observaciones|Mensaje_esperado| 	     		  	
		##@externaldata@./src/test/resources/Datadriven/RevisarExpedientes.xlsx@Devueltos
   |INFRACCIONES DE TRÁNSITO   |   |Aprobar   |Error en el auto aclaratorio   |Ok   |La información ha sido almacenada satisfactoriamente.|
   |INFRACCIONES DE TRÁNSITO   |Devueltos   |Corregir   |Error en el auto aclaratorio   |Failed   |La información ha sido almacenada satisfactoriamente.|
   |INFRACCIONES DE TRÁNSITO   |Devueltos   |Archivar   |Error en el auto aclaratorio   |Failed   |La información ha sido almacenada satisfactoriamente.|

@PendienteCorreción
 Scenario Outline: Revisar Expedientes: permite visualizar los deudores y/o expedientes asignados por funcionario para analizar en qué proceso se encuentra el deudor y/o expediente.
 		Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción revisar expedientes  
 		When usuario seleccione opción de búsqueda "<Tipo_renta>"
 		And seleccionar proceso "<Proceso>" and "<Proceso_anterior>"
 		And bandeja pendiente corrección se encuentre cargada "<Estado>" and  "<Auto_aclaratorio>" and "<Observaciones>" and "<Tipo_motivo>" and "<Mensaje_esperado>"
 
 Examples:
 		|Tipo_renta|Proceso|Proceso_anterior|Estado|Auto_aclaratorio|Tipo_motivo|Observaciones|Mensaje_esperado| 	     		  	
		##@externaldata@./src/test/resources/Datadriven/RevisarExpedientes.xlsx@PendienteCorreción
   |INFRACCIONES DE TRÁNSITO   |Pendiente corrección   | Devolución expedientes   |Aprobar   |Ok   | Error en la placa del vehiculo   |Ok   |La información ha sido almacenada satisfactoriamente. |
   |INFRACCIONES DE TRÁNSITO   |Pendiente corrección   | Devolución expedientes   |Corregir   |   | Error en la placa del vehiculo   |Failed   |La información ha sido almacenada satisfactoriamente. |
   |INFRACCIONES DE TRÁNSITO   |Pendiente corrección   | Revisar expedientes    |Archivar   |   | Error en la placa del vehiculo   |Failed   |La información ha sido almacenada satisfactoriamente. |
