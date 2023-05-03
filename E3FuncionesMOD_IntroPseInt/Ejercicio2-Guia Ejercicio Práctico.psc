//Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar al
//usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
//volumen = pi * radio2 * altura
Algoritmo volumen
	Definir radio Como Real
	Definir altura Como Real
	Definir volumen_cilindro Como Real
	 
	escribir "Ingrese el valor del radio del cilindro: "
	leer radio
	escribir "Ingrese el valor de la altura del cilindro: "
	leer altura

	
	volumen_cilindro <-  PI * (radio)^2 * altura
	
	escribir "El volumen del cilindro es: ", volumen_cilindro 

	
FinAlgoritmo
