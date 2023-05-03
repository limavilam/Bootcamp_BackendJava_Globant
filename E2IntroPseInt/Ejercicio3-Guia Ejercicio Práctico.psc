// A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado se
//debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
Algoritmo unidades
	Definir numero_de_metros Como Real
	escribir "Ingrese el número de metros que quiere convertir: "
	leer numero_de_metros
	Definir conversion_centimetros como Real
	Definir conversion_pulgadas como Real 
	
	conversion_centimetros <-  numero_de_metros * 100
	conversion_pulgadas <- numero_de_metros * 39.3701
	
	escribir "El número de centimetros es:  ", conversion_centimetros
	escribir "El número de pulgadas es: ", conversion_pulgadas
	
	
FinAlgoritmo

