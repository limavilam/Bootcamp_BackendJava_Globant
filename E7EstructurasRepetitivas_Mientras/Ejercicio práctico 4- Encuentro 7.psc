//Escriba un programa en el cual se ingrese un n�mero y mientras ese n�mero sea mayor
//de 10, se pedir� el n�mero de nuevo.

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
	
	Escribir "El n�mero ingresado es menor a 10"
	
FinAlgoritmo