//Escriba un programa en el cual se ingrese un número y mientras ese número sea mayor
//de 10, se pedirá el número de nuevo.

Algoritmo numeroMayor
	
	Definir num1 como Entero
	Definir numMaximo como Entero
	
	Escribir "Ingrese un numero: "
	Leer num1
	
	numMaximo = 10 
	
	Mientras num1 > numMaximo
		Escribir "Ingrese nuevamente"
		Leer num1
		
	FinMientras
	
	Escribir "El número ingresado es menor a 10"
	
FinAlgoritmo