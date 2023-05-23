Algoritmo maquinaReciclaje
	
	Definir usuario Como Caracter
	Definir contrasenna Como Caracter
	Definir login Como Logico
	Definir usuarioRespuesta Como Caracter
	Definir contrasennaRespuesta Como Caracter
	Definir numeroIntentos Como Entero
	Definir respuestaOpciones Como Entero
	Definir botellasIngresadas Como Entero
	Definir pesoBotellas Como Entero
	Definir pesoBotellasTotal Como Entero
	Definir valorBotellas Como Entero
	Definir respuestaSaldo Como Caracter
	Definir saldoTotal Como Entero
	Definir i Como Entero
		
	
	Escribir "Ingrese nombre de usuario:"
	Leer usuario
	
	usuarioRespuesta <- "Albus_D"
	contrasennaRespuesta <- "caramelosDeLimon"
	numeroIntentos <- 3
	
	// Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
	//verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es
	//correcta haremos que una variable llamada Login sea verdadera.
	
	Si usuario <> usuarioRespuesta Entonces 
		Escribir "Usuario incorrecto, int�ntelo nuevamente"	
	SiNo
		//Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un
		//bucle Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.		
		Repetir
			Escribir "Ingrese la clave: "
			Leer contrasenna				
			Si contrasenna = contrasennaRespuesta
				Escribir "Ha ingresado correctamente al sistema"
				login <- Verdadero
				numeroIntentos = 0
			SiNo
				numeroIntentos = numeroIntentos -1
				Si numeroIntentos > 0 Entonces
					Escribir "Clave incorrecta. Le quedan ", numeroIntentos, " intentos."
				SiNo
					Escribir "Lo sentimos ha superado el n�mero de intentos."
				FinSi
			FinSi				
		Mientras Que numeroIntentos > 0 
		
		Repetir
			Hacer
				Hacer
					Escribir "�Bienvenido a la m�quina autom�tica de reciclaje de botellas !"
					Escribir "�Qu� acci�n desea realizar?"
					Escribir "1. Ingresar botellas"
					Escribir "2. Consultar saldo"
					Escribir "3. Salir"
					Leer respuestaOpciones			
				Mientras Que respuestaOpciones <> 1 y respuestaOpciones <> 2 y respuestaOpciones <> 3				
			
					
			Segun respuestaOpciones Hacer
				1:
					Escribir "Ingrese la cantidad de botellas que desea reciclar:"
					Leer botellasIngresadas
										
					Para i = 0 Hasta botellasIngresadas Con Paso 1 Hacer
						pesoBotellasTotal = 0
						pesoBotellas = Aleatorio(100,3000)
						pesoBotellasTotal = pesoBotellasTotal + pesoBotellas					
						
						Si pesoBotellasTotal < 500 Entonces
							valorBotellas <- 50
						SiNo 
							Si pesoBotellasTotal > 501 Y pesoBotellasTotal <= 1500 Entonces
								valorBotellas <- 125
							SiNo
								valorBotellas <- 200
							FinSi					
						FinSi				
					Fin Para
					Escribir "El peso de las botellas ingresadas es:", pesoBotellasTotal
					Escribir "El valor de las botellas ingresadas es:", valorBotellas
					
					Escribir "�Le gustar�a recibir ese saldo a su favor (Si/No)?"
					Leer respuestaSaldo					
					saldoTotal <- 0
					Si respuestaSaldo = "Si" o respuestaSaldo = "SI" Entonces
						saldoTotal = saldoTotal + valorBotellas
					SiNo 
						Escribir "Devolviendo material"					
					FinSi
				2:
					Escribir "Su saldo actual es: ", saldoTotal
				3:
					Escribir "�Feliz d�a, hemos terminado el d�a de hoy, contin�a reciclando!"
				De Otro Modo:
					Escribir "Opci�n no v�lida, debe elegir una opci�n v�lida"
			Fin Segun		
		Mientras Que respuestaOpciones = 1 o respuestaOpciones = 2 	
		Hasta Que respuestaOpciones = 3
	FinSi	
	
FinAlgoritmo

	