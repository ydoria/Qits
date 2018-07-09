#Feature: archivo de características, donde se define la historia de usuario, cada línea de un escenario, 
#mapea con un método en la clase .definition. Se agrupan los pasos en acciones, y cada una de estas acciones corresponderá a una línea gherkin en nuestra feature.


@QuipuxA
Feature: Cobro Coactivo 
  Gestión de procesos funcionales de cobro de las entidades gubernamentales, 
  con la finalidad de obtener pagos de las obligaciones que adeuda la ciudadanía.  

 Background: Inicie sesión con credenciales válidas.
    Given el usuario está en la página de inicio de sesión
    When usuario ingrese nombre de usuario "ydoria"
    And usuario ingrese la contraseña "Admin6*"
    And haga clic en el botón de inicio
    Then el usuario debe iniciar sesión con éxito "Bienvenido"

@CrearPersonaNatural
	Scenario Outline: Adicionar Expediente: permite la conformación manual de expedientes y\o Cartera de Patios y Grúas.
    Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción adicionar expedientes 
    When usuario seleccione tipo de identificación "<Tipo_identificación>"
    And digite Nro. identificación "<Nro_identificación>"
    And haga clic en el botón buscar "<Existe>" 
		And persona natural no existe
		|<Nombre_1>|<Nombre_2>|<Apellido_1>|<Apellido_2>|<Sexo>|<Grupo_sanguineo>|<RH>|<Ocupacion>|<Fecha_nacimiento>|<País_nacimiento>|<Departamento_nacimiento>|<Ciudad_nacimiento>|<Fecha_expedición>|<País_expedición>|<Departamento_expedición>|<Ciudad_expedición>|<Activoi>|<País>|<Departamento>|<Ciudad>|<Tipo_vía>|<Nro_Vía>|<Nro_Vía_1>|<Nro_Vía_2>|<Barrio>|<Tipo_dirección>|<Primer_Número>|<Primer_Número_1>|<Primer_Número_2>|<Segundo_Número>|<Segundo_Número_1>|<Código_postal>|<Autorizo_envio_información>|<Activa>|<Complemento>|<Tipo_contacto>|<Digita_contacto>|<Tipo_dato>|<Autoriza_envio_información>|<Activoc>|<Mensaje_esperado>|
		
	Examples: 
		|Tipo_identificación|Nro_identificación|Existe|Nombre_1|Nombre_2|Apellido_1|Apellido_2|Sexo|Grupo_sanguineo|RH|Ocupacion|Fecha_nacimiento|País_nacimiento|Departamento_nacimiento|Ciudad_nacimiento|Fecha_expedición|País_expedición|Departamento_expedición|Ciudad_expedición|Activoi|País|Departamento|Ciudad|Tipo_vía|Nro_Vía|Nro_Vía_1|Nro_Vía_2|Barrio|Tipo_dirección|Primer_Número|Primer_Número_1|Primer_Número_2|Segundo_Número|Segundo_Número_1|Código_postal|Autorizo_envio_información|Activa|Complemento|Tipo_contacto|Digita_contacto|Tipo_dato|Autoriza_envio_información|Activoc|Mensaje_esperado|
		##@externaldata@./src/test/resources/Datadriven/AdicionarExpediente.xlsx@CrearPersonaNatural@1
   |Cédula de Ciudadanía   |1125105134   |No   |Yised   |Paola   |Doria   |Vergara   |F   |O   |+   |INGENIERO(A)   |"04/12/1994"   |COLOMBIA   |ANTIOQUIA   |MEDELLIN   |"05/10/2012"   |COLOMBIA   |Cordoba   |MONTERIA   |Si   |COLOMBIA   |ANTIOQUIA   |BELLO   |Calle   |20   |A   |NORTE   |SANTA FE   |Personal   |57   |AA   |SUR   |62   |ESTE   |50001   |Si   |Si   |Ok   |Teléfono   |3205687283   |Personal   |Si   |Si   |La información ha sido almacenada satisfactoriamente.|
  
@CrearPersonaJurídica
	Scenario Outline: Adicionar Expediente: permite la conformación manual de expedientes y\o Cartera de Patios y Grúas. 	 
  	Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción adicionar expedientes 
		When usuario seleccione tipo de identificación "<Tipo_identificación>"
  	And digite Nro. identificación "<Nro_identificación>"
 		And haga clic en el botón buscar juridica "<Existe>" 
		And persona jurídica no existe
		|<Nro_Matrícula>|<Nombre>|<Sigla_empresa>|<Tipo_sociedad>|<Tipo_empresa>|<Carácter_servicio_entidad>|<Valor_patrimonio>|<Capital_pagado>|<Pagina_web>|<Registra_usuario_externo>|<Tipo_entidad>|<Presta_servicio>|<Activod>|<Criterio_de_búsqueda>|<Tipo_de_identificación>|<Nro_Identificación>|<Nombre_Sede>|<Activos>|<Principal>|<País>|<Departamento>|<Ciudad>|<Tipo_vía>|<Nro_Vía>|<Nro_Vía_1>|<Nro_Vía_2>|<Barrio>|<Tipo_dirección>|<Primer_Número>|<Primer_Número_1>|<Primer_Número_2>|<Segundo_Número>|<Segundo_Número_1>|<Código_postal>|<Autorizo_envio_información>|<Activa>|<Complemento>|<Tipo_contacto>|<Digita_contacto>|<Tipo_dato>|<Autoriza_envio_información>|<Activoc>|<Mensaje_esperado>|
		
	Examples: 
		|Tipo_identificación|Nro_identificación|Existe|Nro_Matrícula|Nombre|Sigla_empresa|Tipo_sociedad|Tipo_empresa|Carácter_servicio_entidad|Valor_patrimonio|Capital_pagado|Pagina_web|Registra_usuario_externo|Tipo_entidad|Presta_servicio|Activod|Criterio_de_búsqueda|Tipo_de_identificación|Nro_Identificación|Nombre_Sede|Activos|Principal|País|Departamento|Ciudad|Tipo_vía|Nro_Vía|Nro_Vía_1|Nro_Vía_2|Barrio|Tipo_dirección|Primer_Número|Primer_Número_1|Primer_Número_2|Segundo_Número|Segundo_Número_1|Código_postal|Autorizo_envio_información|Activa|Complemento|Tipo_contacto|Digita_contacto|Tipo_dato|Autoriza_envio_información|Activoc|Mensaje_esperado|
		##@externaldata@./src/test/resources/Datadriven/AdicionarExpediente.xlsx@CrearPersonaJurídica@1
   |NIT   |16132902090395   |No    |30053297   |Inmobiliaria   |In   |LTDA   |Punto de Atención a Usuario   |Privada   |80000000   |1000000   |http://www.inmobiliariaprotebienes.com   |Si   |Cisneros   |Si   |Si   |Tipo de identificación   |Cédula de Ciudadanía    |123   |Bello   |Si   |Si   |COLOMBIA   |ANTIOQUIA   |BELLO   |Avenida   |80   |BG   |ESTE   |Primavera   |Trabajo   |80   |AB   |ESTE   |63   |ESTE   |50002   |Si   |Si   |Ok   |Celular   |3205467893   |Trabajo   |Si   |Si   |La información ha sido almacenada satisfactoriamente.|

@AdicionarExpediente
	Scenario Outline: Adicionar Expediente: permite la conformación manual de expedientes y\o Cartera de Patios y Grúas. 	 
  	Given el usuario realizo el previo logueo en la aplicación, seleccionar la opción adicionar expedientes 
		When usuario seleccione tipo de identificación "<Tipo_identificación>"
  	And digite Nro. identificación "<Nro_identificación>"
 		And haga clic en el botón buscar  
		And persona existe 
		|<Acuerdo_pago>|<Placa>|<Cuantía>|<Intereses>|<Fecha_ingreso>|<Nro_Resolución>|<Fecha_resolución>|<Valor_iva>|<Valor_patio>|<Valor_grua>|<Observaciones>|<Intereses_ap>|<Nro_acuerdo_pago_ap>|<Fecha_acuerdo_pago_ap>|<Placa_ap>|<Nro_Resolución_ap>|<Fecha_resolución_ap>|<Valor_acuerdo_pago_ap>|<Valor_cancelado_ap>|<Valor_capital_ap>|<Valor_iva_ap>|<Saldo_acuerdo_pago_ap>|<Observaciones_ap>|<Ruta>|<Mensaje_esperado>|
		
	Examples: 
    |Tipo_identificación|Nro_identificación|Acuerdo_pago|Placa|Cuantía|Intereses|Fecha_ingreso|Nro_Resolución|Fecha_resolución|Valor_iva|Valor_patio|Valor_grua|Observaciones|Intereses_ap|Nro_acuerdo_pago_ap|Fecha_acuerdo_pago_ap|Placa_ap|Nro_Resolución_ap|Fecha_resolución_ap|Valor_acuerdo_pago_ap|Valor_cancelado_ap|Valor_capital_ap|Valor_iva_ap|Saldo_acuerdo_pago_ap|Observaciones_ap|Ruta|Mensaje_esperado| 
		##@externaldata@./src/test/resources/Datadriven/AdicionarExpediente.xlsx@AdicionarExpediente@1
   |Cédula de Ciudadanía   |123   |No   |CVY000   |10000   |1   |"05/06/2016"   |1918   |"07/05/2017"   |2000   |10000   |5000   |Ok   |   |   |   |   |   |   |   |   |   |   |   |   |C:\Users\ydoria\eclipse-workspace\Quipux\src\test\resources\Datadriven\Archivos\Prueba.pdf   |se conformó satisfactoriamente.|

  
