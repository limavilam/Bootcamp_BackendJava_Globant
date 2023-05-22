//Escriba un programa que solicite al usuario números decimales mientras que el usuario
//escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
//como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//número. El programa continuará solicitando valores sucesivamente mientras los valores
//ingresados sean mayores que 3.1, caso contrario, el programa finaliza.


Algoritmo numerosDecimales
	
	Definir num1 como Real
	Definir numMaximo como Real
	
	Escribir "Ingrese un numero: "
	Leer num1
	
	Escribir "Ingrese un número mayor que ", num1, " (o un número negativo para finalizar):"
	Leer numMaximo
	
	Mientras num1 < numMaximo
		Escribir "Ingrese nuevamente un número: "
		Leer numMaximo	
		
	FinMientras
	

FinAlgoritmo