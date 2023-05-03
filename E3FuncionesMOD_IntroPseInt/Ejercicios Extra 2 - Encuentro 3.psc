// Calcular el cambio de monedas en dólares y euros al ingresar cierta cantidad de dinero en pesos.

Algoritmo conversionDivisas
	Definir dolar Como Real
	Definir euro Como Real
	Definir peso_colombiano Como Real
	escribir "Ingrese el valor en pesos que quiere convertir: "
	leer peso_colombiano
	Definir conversion_dolar como Real
	Definir conversion_euro como Real 
		
	conversion_dolar <-  peso_colombiano * 0.00020
	conversion_euro <- peso_colombiano * 0.00022
	
	
	escribir "El número de dolares es:  ", conversion_dolar
	escribir "El número de eurores es: ", conversion_euro
		
FinAlgoritmo
