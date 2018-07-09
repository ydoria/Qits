#Feature: archivo de características, donde se define la historia de usuario, cada línea de un escenario, 
#mapea con un método en la clase .definition. Se agrupan los pasos en acciones, y cada una de estas acciones corresponderá a una línea gherkin en nuestra feature.


@QuipuxI
Feature: Cobro Coactivo 
  Gestión de procesos funcionales de cobro de las entidades gubernamentales, 
  con la finalidad de obtener pagos de las obligaciones que adeuda la ciudadanía.  

 Background: Inicie sesión con credenciales válidas.
    Given el usuario está en la página de inicio de sesión
    When usuario ingrese nombre de usuario "ydoria"
    And usuario ingrese la contraseña "Admin6*"
    And haga clic en el botón de inicio
    Then el usuario debe iniciar sesión con éxito "Bienvenido"
    
  @InvestigaciónSupernotariado
   Scenario Outline: Investigacion y control: permite realizar la evaluación del expediente del deudor, registrar la investigación de bienes y generar el mandamiento correspondiente.
    Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When usuario seleccione opción "<Tipo_renta_investigacion>"
    And seleccione proceso "<Proceso_investigacion>"
    And criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja investigación de bienes se encuentre cargada
   	 |<Posee_bien>|<Sistema_de_consulta>|<Entidad>|<Nro_matrícula>|<Medida_Inmueble>|<País>|<Departamento>|<Ciudad>|<Tipo_vía>|<Nro_Vía>|<Nro_Vía_1>|<Nro_Vía_2>|<Barrio>|<Tipo_dirección>|<Primer_Número>|<Primer_Número_1>|<Primer_Número_2>|<Segundo_Número>|<Segundo_Número_1>|<Código_postal>|<Autoriza_envio_información>|<Activa>|<Complemento>|<Radicado_proceso>|<Juzgado_o_entidad>|<País_juzgado>|<Departamento_juzgado>|<Ciudad_juzgado>|<Tipo_vía_juzgado>|<Nro_Vía_juzgado>|<Nro_Vía_1_juzgado>|<Nro_Vía_2_juzgado>|<Barrio_juzgado>|<Tipo_dirección_juzgado>|<Primer_Número_juzgado>|<Primer_Número_1_juzgado>|<Primer_Número_2_juzgado>|<Segundo_Número_juzgado>|<Segundo_Número_1_juzgado>|<Código_postal_juzgado>|<Autoriza_envio_información_juzgado>|<Activa_juzgado>|<Complemento_juzgado>|<Tipo_proceso>|<Demandante>|<Entidad_inmueble>|<Nro_Escritura>|<Fecha_de_escritura>|<Nombre_y_Nro_Notaría>|<Ciudad_notaría>|<Nro_Anotación>|<Observaciones>|<Ruta>|<Mensaje_esperado>|<Continuar_proceso>|<Tipo_motivo>|<Observacionesc>|<Mensaje>|<Caso_Alterno>|
  	
   Examples: 
     |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|Posee_bien|Sistema_de_consulta|Entidad|Nro_matrícula|Medida_Inmueble|País|Departamento|Ciudad|Tipo_vía|Nro_Vía|Nro_Vía_1|Nro_Vía_2|Barrio|Tipo_dirección|Primer_Número|Primer_Número_1|Primer_Número_2|Segundo_Número|Segundo_Número_1|Código_postal|Autoriza_envio_información|Activa|Complemento|Radicado_proceso|Juzgado_o_entidad|País_juzgado|Departamento_juzgado|Ciudad_juzgado|Tipo_vía_juzgado|Nro_Vía_juzgado|Nro_Vía_1_juzgado|Nro_Vía_2_juzgado|Barrio_juzgado|Tipo_dirección_juzgado|Primer_Número_juzgado|Primer_Número_1_juzgado|Primer_Número_2_juzgado|Segundo_Número_juzgado|Segundo_Número_1_juzgado| Código_postal_juzgado|Autoriza_envio_información_juzgado|Activa_juzgado|Complemento_juzgado|Tipo_proceso|Demandante|Entidad_inmueble|Nro_Escritura|Fecha_de_escritura|Nombre_y_Nro_Notaría|Ciudad_notaría|Nro_Anotación|Observaciones|Ruta|Mensaje_esperado|Continuar_proceso|Tipo_motivo|Observacionesc|Mensaje|Caso_Alterno|
			##@externaldata@./src/test/resources/Datadriven/Investigacion.xlsx@InvestigaciónSupernotariado@1
   |   |   |   |   |   |Si   |Supernotariado   |OFICINA DE INSTRUMENTOS PÚBLICOS MEDELLIN   |AVC023   |Embargo   |COLOMBIA   |Cordoba   |AYAPEL   |Carrera   |3   |B   |ESTE   |Guayabal   |Personal   |57   |BF   |SUR   |2   |ESTE   |500023   |Si   |Si   |Ok   |4895621256   |Fredonia   |COLOMBIA   |ANTIOQUIA   |ITUANGO   |Diagonal   |68   |AC   |NORTE   |Clarita   |Trabajo   |8   |BG   |OESTE   |97   |SUR   |47   |Si   |Si   |Ok   |Judicial   |Yised   |OFICINA DE INSTRUMENTOS PÚBLICOS   |545454554   |"05/06/2001"   |Notaria526   |Medellin   |5   |Ok   | C:\Users\ydoria\eclipse-workspace\Quipux\src\test\resources\Datadriven\Archivos\Prueba.pdf    |El registro fue almacenado satisfactoriamente.   |Otros   |   |   |La información ha sido actualizada satisfactoriamente.   ||
  
  @InvestigaciónOtrosCC
   Scenario Outline: Investigacion y control: permite realizar la evaluación del expediente del deudor, registrar la investigación de bienes y generar el mandamiento correspondiente.
    Given usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When seleccione opción "<Tipo_renta_investigacion>"
    And proceso "<Proceso_investigacion>"
    And seleccione criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja Investigación de bienes se encuentre cargada proceso cámara de comercio
   	 |<Posee_bien>|<Sistema_de_consulta>|<Entidad>|<Nro_matrícula>|<Medida_Establecimiento>|<NIT>|<Nombre_establecimiento>|<País>|<Departamento>|<Ciudad>|<Tipo_vía>|<Nro_Vía>|<Nro_Vía_1>|<Nro_Vía_2>|<Barrio>|<Tipo_dirección>|<Primer_Número>|<Primer_Número_1>|<Primer_Número_2>|<Segundo_Número>|<Segundo_Número_1>|<Código_postal>|<Autoriza_envio_información>|<Activa>|<Complemento>|<Teléfono_establecimiento>|<Fecha_actualización_matrícula>|<Razón_social>|<Radicado_proceso>|<Juzgado>|<País_juzgado>|<Departamento_juzgado>|<Ciudad_juzgado>|<Tipo_vía_juzgado>|<Nro_Vía_juzgado>|<Nro_Vía_1_juzgado>|<Nro_Vía_2_juzgado>|<Barrio_juzgado>|<Tipo_dirección_juzgado>|<Primer_Número_juzgado>|<Primer_Número_1_juzgado>|<Primer_Número_2_juzgado>|<Segundo_Número_juzgado>|<Segundo_Número_1_juzgado>|<Código_postal_juzgado>|<Autoriza_envio_información_juzgado>|<Activa_juzgado>|<Complemento_juzgado>|<Tipo_proceso>|<Demandante>|<Entidad_establecimiento>|<Nro_Escritura>|<Fecha_de_escritura>|<Nombre_y_Nro_Notaría>|<Ciudad_notaría>|<Nro_Anotación>|<Observaciones>|<Ruta>|<Mensaje_esperado>|<Caso_Alterno>| 	
  
   Examples: 
     |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|Posee_bien|Sistema_de_consulta|Entidad|Nro_matrícula|Medida_Establecimiento|NIT|Nombre_establecimiento|País|Departamento|Ciudad|Tipo_vía|Nro_Vía|Nro_Vía_1|Nro_Vía_2|Barrio|Tipo_dirección|Primer_Número|Primer_Número_1|Primer_Número_2|Segundo_Número|Segundo_Número_1|Código_postal|Autoriza_envio_información|Activa|Complemento|Teléfono_establecimiento|Fecha_actualización_matrícula|Razón_social|Radicado_proceso|Juzgado|País_juzgado|Departamento_juzgado|Ciudad_juzgado|Tipo_vía_juzgado|Nro_Vía_juzgado|Nro_Vía_1_juzgado|Nro_Vía_2_juzgado|Barrio_juzgado|Tipo_dirección_juzgado|Primer_Número_juzgado|Primer_Número_1_juzgado|Primer_Número_2_juzgado|Segundo_Número_juzgado|Segundo_Número_1_juzgado|Código_postal_juzgado|Autoriza_envio_información_juzgado|Activa_juzgado|Complemento_juzgado|Tipo_proceso|Demandante|Entidad_establecimiento|Nro_Escritura|Fecha_de_escritura|Nombre_y_Nro_Notaría|Ciudad_notaría|Nro_Anotación|Observaciones|Ruta|Mensaje_esperado|Caso_Alterno|
			##@externaldata@./src/test/resources/Datadriven/Investigacion.xlsx@InvestigaciónOtrosCC@4
   |   |   |   |   |   |No   |Cámara de comercio   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |Debe adjuntar un archivo para continuar con el proceso.|

   @InvestigaciónOtrosC
   Scenario Outline: Investigacion y control: permite realizar la evaluación del expediente del deudor, registrar la investigación de bienes y generar el mandamiento correspondiente.
    Given usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When seleccione opción "<Tipo_renta_investigacion>"
    And proceso "<Proceso_investigacion>"
    And seleccione criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja Investigación de bienes se encuentre cargada proceso cifin
   	 |<Posee_bien>|<Sistema_de_consulta>|<Entidad>|<Medida_Produto_Financiero>|<Entidad_producto_financiero>|<Numero_producto>|<Estado_producto>|<Tipo_producto>|<Observaciones>|<Ruta>|<Mensaje_esperado>|<Caso_Alterno>| 	
  
   Examples: 
     |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|Posee_bien|Sistema_de_consulta|Entidad|Medida_Produto_Financiero|Entidad_producto_financiero|Numero_producto|Estado_producto|Tipo_producto|Observaciones|Ruta|Mensaje_esperado|Caso_Alterno|
			##@externaldata@./src/test/resources/Datadriven/Investigacion.xlsx@InvestigaciónOtrosC@4
   |API PATIOS y GRÚAS    |   |   |   |   |No   |CIFIN   |   |   |   |   |   |   |   |   |   |Debe adjuntar un archivo para continuar con el proceso.|
  
   @InvestigaciónOtrosF
   Scenario Outline: Investigacion y control: permite realizar la evaluación del expediente del deudor, registrar la investigación de bienes y generar el mandamiento correspondiente.
    Given usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When seleccione opción "<Tipo_renta_investigacion>"
    And proceso "<Proceso_investigacion>"
    And seleccione criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja Investigación de bienes se encuentre cargada proceso fosyga
   	 |<Posee_bien>|<Sistema_de_consulta>|<Entidad>|<Medida_Salario>|<Fecha_afiliación>|<NIT>|<Empresa_donde_labora>|<País>|<Departamento>|<Ciudad>|<Tipo_vía>|<Nro_Vía>|<Nro_Vía_1>|<Nro_Vía_2>|<Barrio>|<Tipo_dirección>|<Primer_Número>|<Primer_Número_1>|<Primer_Número_2>|<Segundo_Número>|<Segundo_Número_1>|<Código_postal>|<Autoriza_envio_información>|<Activa>|<Complemento>|<IBC_(Salario)>|<Observaciones>|<Ruta>|<Mensaje_esperado>|<Caso_Alterno>| 
 
   Examples: 
     |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|Posee_bien|Sistema_de_consulta|Entidad|Medida_Salario|Fecha_afiliación|NIT|Empresa_donde_labora|País|Departamento|Ciudad|Tipo_vía|Nro_Vía|Nro_Vía_1|Nro_Vía_2|Barrio|Tipo_dirección|Primer_Número|Primer_Número_1|Primer_Número_2|Segundo_Número|Segundo_Número_1|Código_postal|Autoriza_envio_información|Activa|Complemento|IBC_(Salario)|Observaciones|Ruta|Mensaje_esperado|Caso_Alterno|
			##@externaldata@./src/test/resources/Datadriven/Investigacion.xlsx@InvestigaciónOtrosF@4
   |   |   |   |   |   |No   |FOSYGA   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |Debe adjuntar un archivo para continuar con el proceso.|
  
   @InvestigaciónOtrosR
   Scenario Outline: Investigacion y control: permite realizar la evaluación del expediente del deudor, registrar la investigación de bienes y generar el mandamiento correspondiente.
    Given usuario realizo el previo logueo en la aplicación, seleccionar la opción investigación y control
    When seleccione opción "<Tipo_renta_investigacion>"
    And proceso "<Proceso_investigacion>"
    And seleccione criterios de búsqueda "<Criterio_de_búsqueda>" and "<Tipo_de_identificación>" and "<Nro_Identificación>"
    Then bandeja Investigación de bienes se encuentre cargada proceso runt
   	 |<Posee_bien>|<Sistema_de_consulta>|<Entidad>|<Placa>|<Medida_Vehículo>|<Chasis>|<Clase>|<Linea>|<Marca>|<Modelo>|<Color>|<Radicado_proceso>|<Gravamenes>|<Juzgado>|<País_juzgado>|<Departamento_juzgado>|<Ciudad_juzgado>|<Tipo_vía_juzgado>|<Nro_Vía_juzgado>|<Nro_Vía_1_juzgado>|<Nro_Vía_2_juzgado>|<Barrio_juzgado>|<Tipo_dirección_juzgado>|<Primer_Número_juzgado>|<Primer_Número_1_juzgado>|<Primer_Número_2_juzgado>|<Segundo_Número_juzgado>|<Segundo_Número_1_juzgado>|<Código_postal_juzgado>|<Autoriza_envio_información_juzgado>|<Activa_juzgado>|<Complemento_juzgado>|<Tipo_proceso>|<Demandante>|<Entidad_vehiculo>|<Observaciones>|<Ruta>|<Mensaje_esperado>|<Continuar>|<Tipo_motivo>|<Observacionesc>|<Mensaje>|<Caso_Alterno>| 
  
   Examples: 
     |Tipo_renta_investigacion|Proceso_investigacion|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|Posee_bien|Sistema_de_consulta|Entidad|Placa|Medida_Vehículo|Chasis|Clase|Linea|Marca|Modelo|Color|Radicado_proceso|Gravamenes|Juzgado|País_juzgado|Departamento_juzgado|Ciudad_juzgado|Tipo_vía_juzgado|Nro_Vía_juzgado|Nro_Vía_1_juzgado|Nro_Vía_2_juzgado|Barrio_juzgado|Tipo_dirección_juzgado|Primer_Número_juzgado|Primer_Número_1_juzgado|Primer_Número_2_juzgado|Segundo_Número_juzgado|Segundo_Número_1_juzgado|Código_postal_juzgado|Autoriza_envio_información_juzgado|Activa_juzgado|Complemento_juzgado|Tipo_proceso|Demandante|Entidad_vehiculo|Observaciones|Ruta|Mensaje_esperado|Continuar|Tipo_motivo|Observacionesc|Mensaje|Caso_Alterno| 
			##@externaldata@./src/test/resources/Datadriven/Investigacion.xlsx@InvestigaciónOtrosR@3
   |   |   |   |   |   |Si   |RUNT   |TRANSITO MEDELLIN    |jhg456   |Embargo   |gjgh456   |Carro   |Aveo   |Chevrolet   |2019   |Rojo   |6454645435   |451552656   |4656   |COLOMBIA   |ANTIOQUIA   |ITUANGO   |Diagonal   |68   |AC   |NORTE   |Clarita   |Trabajo   |8   |BG   |OESTE   |97   |SUR   |47   |Si   |Si   |Ok   |Judicial   |Daniel   |Secretaria   |Ok   |   |   |   |   |   |   |Debe adjuntar un archivo para continuar con el proceso.|
 
