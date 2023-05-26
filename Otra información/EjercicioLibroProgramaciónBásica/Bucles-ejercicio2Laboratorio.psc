//Diseñe un programa que lea un número entero de teclado y escriba un cuadrado (relleno) con tantos
//asteriscos (*) de lado como indique el número leído. Por ejemplo, para un número leído con valor 4,
//escribirá:
	//****
	//****
	//****
    //****

Algoritmo ejercicio2Laboratorio
	
	Definir num1 Como Entero
	Definir i Como Entero
	Definir j Como Entero
	
	
	Escribir "Ingrese un número:"
	Leer num1
	
	Para i <- 0 Hasta num1-1 Con Paso 1 Hacer
		Para j <- 0 Hasta num1-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		Escribir "*"
	Fin Para
	
FinAlgoritmo
