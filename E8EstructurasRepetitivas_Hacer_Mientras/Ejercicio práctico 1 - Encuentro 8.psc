//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
//correctamente.

Algoritmo claves
	
	Definir ingresoClave como caracter
	Definir claveSecreta como caracter
	Definir numeroIntentos como entero
		
	claveSecreta = "eureka"
	numeroIntentos <- 3
		
	Repetir
		Escribir "Ingrese la clave: "
		Leer ingresoClave
		
		Si ingresoClave = claveSecreta
			Escribir "Ha ingresado correctamente al sistema"
			numeroIntentos = 0
		SiNo
			numeroIntentos = numeroIntentos -1
			Si numeroIntentos > 0 Entonces
				Escribir "Clave incorrecta. Le quedan ", numeroIntentos, " intentos."
			SiNo
				Escribir "Lo sentimos ha superado el número de intentos."
			FinSi
		FinSi
		
	Mientras Que numeroIntentos > 0 
	
FinAlgoritmo
