//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//	5 *****
//	3 ***
//	11 ***********
//	2 **
// 9 *********

Algoritmo numAsteriscos
	
	Definir num1 Como Entero
	Definir j Como Entero
	Definir i Como Entero
	
	Para i = 1 Hasta 5 Con Paso 1 Hacer
		
		Escribir "Ingresa un número de 1 al 20: "
		Leer num1
		
		Si num1 >= 1 Y num1 <= 20 Entonces
			Escribir num1 Sin Saltar
			
			Para j =1 Hasta num1 Con Paso 1 Hacer
				Escribir " ","*" Sin saltar
			Fin Para
			
			Escribir " " //Brinda el espacio en sin saltar
		SiNo 
			Escribir "El número ingresado no está entre el 1 y el 20."
		FinSi		
	Fin Para
		
FinAlgoritmo
