//Escriba un programa que permita al usuario ingresar el valor de dos variables num�ricas de
//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables
//y mostrar el resultado final por pantalla.
//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
//programa deber� mostrar: num1 = 3 y num2 = 9
//Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar.
Algoritmo intercambio
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir numAuxiliar Como Entero

	escribir "Ingrese el n�mero 1: "
	leer num1
	
	escribir "Ingrese el n�mero 2: "
	leer num2
	
	
	numAuxiliar = num1
	num1 = num2
			
	escribir "El valor del n�mero 1 despu�s del intercambio es: ", num1
	escribir "El valor del n�mero 2 despu�s del intercambio es: ", numAuxiliar
		
FinAlgoritmo