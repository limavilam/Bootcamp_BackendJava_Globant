// A partir de una conocida cantidad de metros que el usuario ingresa a trav�s del teclado se
//debe obtener su equivalente en cent�metros, en mil�metros y en pulgadas.
Algoritmo unidades
	Definir numero_de_metros Como Real
	escribir "Ingrese el n�mero de metros que quiere convertir: "
	leer numero_de_metros
	Definir conversion_centimetros como Real
	Definir conversion_pulgadas como Real 
	
	conversion_centimetros <-  numero_de_metros * 100
	conversion_pulgadas <- numero_de_metros * 39.3701
	
	escribir "El n�mero de centimetros es:  ", conversion_centimetros
	escribir "El n�mero de pulgadas es: ", conversion_pulgadas
	
	
FinAlgoritmo

