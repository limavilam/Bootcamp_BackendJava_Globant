Algoritmo maquinaReciclaje
	
	Definir login Como Logico
	Definir usuarioValido Como Caracter
	Definir contrasenaValida Como Caracter
	Definir numeroIntentos Como Entero
	Definir cantidadDeBotellas Como Entero
	Definir pesoBotella Como Entero
	Definir valorTotalBotellas Como Entero
	Definir valorBotella Como Entero
	Definir saldoTotal Como Entero
	
	
	Escribir "Ingrese nombre de usuario:"
	Leer usuario
	
	usuarioValido <- "Albus_D"
	contrasenaValida <- "caramelosDeLimon"
	numeroIntentos <- 3
	saldoTotal <- 0
	login = falso
	// Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
	//verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es
	//correcta haremos que una variable llamada Login sea verdadera.
	
	Si usuario <> usuarioValido Entonces 
		Escribir "Usuario incorrecto, int�ntelo nuevamente"	
	SiNo
		//Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un
		//bucle Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.		
		Repetir
			Escribir "Ingrese la clave: "
			Leer contrasenna				
			Si contrasenna = contrasenaValida
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
	FinSi	
	
	Si login == Verdadero Entonces
		Hacer
			Escribir "�Bienvenido a la m�quina autom�tica de reciclaje de botellas !"
			Escribir "�Qu� acci�n desea realizar?"
			Escribir "1. Ingresar botellas"
			Escribir "2. Consultar saldo"
			Escribir "3. Salir"				
			Leer opcion
			
			Segun opcion Hacer
				1:
					Escribir "Ingrese la cantidad de botellas que desea reciclar:"
					Leer cantidadDeBotellas						
					valorTotalBotellas = 0
					Para i = 1 Hasta cantidadDeBotellas Con Paso 1 Hacer
						pesoBotella = Aleatorio(100,3000)
						Escribir "La botella ", i, " tiene un peso de ", pesoBotella, " KG"
						
						Si pesoBotella < 500 Entonces
							valorBotella <- 50
						SiNo 
							Si pesoBotella > 501 Y pesoBotella <= 1500 Entonces
								valorBotella <- 125
							SiNo
								valorBotella <- 200
							FinSi
						FinSi
						valorTotalBotellas = valorTotalBotellas + valorBotella
					Fin Para
					
					Escribir "El valor de las botellas ingresadas es:", valorTotalBotellas	
					Escribir "�Le gustar�a recibir ese saldo a su favor (Si/No)?"
					Leer recibirSaldo					
					
					Si Mayusculas(recibirSaldo) == "SI" Entonces
						saldoTotal = saldoTotal + valorTotalBotellas
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
		Mientras Que opcion <> 3	
	FinSi
FinAlgoritmo