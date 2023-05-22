//EJERCICIO MESES
//Ingresar un número del 1 ? 12 y mostrar el mes del año que corresponde, si el número
//ingresado no es correcto mostrar un "mensaje de error"

Algoritmo mesNumero1
	
	Definir numeroMes como Entero
	Escribir "Ingrese un número del 1 al 12:"
	Leer numeroMes
	
	// Validación del número ingresado
	Si numeroMes >= 1 y numeroMes <= 12 Entonces
		// Mostrar el mes correspondiente
		Segun numeroMes Hacer
			1: Escribir "Enero"
			2: Escribir "Febrero"
			3: Escribir "Marzo"
			4: Escribir "Abril"
			5: Escribir "Mayo"
			6: Escribir "Junio"
			7: Escribir "Julio"
			8: Escribir "Agosto"
			9: Escribir "Septiembre"
			10: Escribir "Octubre"
			11: Escribir "Noviembre"
			12: Escribir "Diciembre"
		FinSegun
	Sino
		// Mostrar mensaje de error
		Escribir "Error: el número ingresado no es válido."
	FinSi
	
FinAlgoritmo