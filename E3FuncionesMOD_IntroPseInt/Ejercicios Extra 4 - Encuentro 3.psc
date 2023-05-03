//Hacer un programa que ingrese por teclado un número total de segundos y que luego
//pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor
//ingresado.

Algoritmo conversion_unidades_tiempo
	Definir numero_de_segundos Como Real
	escribir "Ingrese el número de segundos que quiere convertir: "
	leer numero_de_segundos
	Definir conversion_horas como Real
	Definir conversion_minutos como Real 
	Definir conversion_segundos como Real
	
	conversion_horas <-  numero_de_segundos * 0.000277778
	conversion_minutos <- numero_de_segundos * 0.01666668
	
	escribir "El número de horas es:  ", conversion_horas
	escribir "El número de minutos es: ", conversion_minutos
	escribir "El número de segundos es: ", numero_de_segundos
	
FinAlgoritmo