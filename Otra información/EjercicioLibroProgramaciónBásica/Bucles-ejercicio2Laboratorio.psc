//Dise�e un programa que lea un n�mero entero de teclado y escriba un cuadrado (relleno) con tantos
//asteriscos (*) de lado como indique el n�mero le�do. Por ejemplo, para un n�mero le�do con valor 4,
//escribir�:
	//****
	//****
	//****
    //****

Algoritmo ejercicio2Laboratorio
	
	Definir num1 Como Entero
	Definir i Como Entero
	Definir j Como Entero
	
	
	Escribir "Ingrese un n�mero:"
	Leer num1
	
	Para i <- 0 Hasta num1-1 Con Paso 1 Hacer
		Para j <- 0 Hasta num1-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		Escribir "*"
	Fin Para
	
FinAlgoritmo
