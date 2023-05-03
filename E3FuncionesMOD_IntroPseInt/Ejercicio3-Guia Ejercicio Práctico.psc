//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
// 1 día = 24 horas = 1440 minutos = 86400 segundos
Algoritmo conversio_unidades_tiempo
	Definir numero_de_dias Como Real
	escribir "Ingrese el número de días que quiere convertir: "
	leer numero_de_dias
	Definir conversion_horas como Real
	Definir conversion_minutos como Real 
	Definir conversion_segundos como Real
	
	conversion_horas <-  numero_de_dias * 24
	conversion_minutos <- numero_de_dias * 1440
	conversion_segundos <-  numero_de_dias * 86400
	
	escribir "El número de horas es:  ", conversion_horas
	escribir "El número de minutos es: ", conversion_minutos
	escribir "El número de segundos es: ", conversion_segundos
	
FinAlgoritmo
