//A partir de una conocida cantidad de d�as que el usuario ingresa a trav�s del teclado, escriba
//un programa para convertir los d�as en horas, en minutos y en segundos. Por ejemplo
// 1 d�a = 24 horas = 1440 minutos = 86400 segundos
Algoritmo conversio_unidades_tiempo
	Definir numero_de_dias Como Real
	escribir "Ingrese el n�mero de d�as que quiere convertir: "
	leer numero_de_dias
	Definir conversion_horas como Real
	Definir conversion_minutos como Real 
	Definir conversion_segundos como Real
	
	conversion_horas <-  numero_de_dias * 24
	conversion_minutos <- numero_de_dias * 1440
	conversion_segundos <-  numero_de_dias * 86400
	
	escribir "El n�mero de horas es:  ", conversion_horas
	escribir "El n�mero de minutos es: ", conversion_minutos
	escribir "El n�mero de segundos es: ", conversion_segundos
	
FinAlgoritmo
