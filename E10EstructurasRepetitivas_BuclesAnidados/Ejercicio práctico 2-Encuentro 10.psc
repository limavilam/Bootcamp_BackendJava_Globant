//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un cuadrado de asteriscos de ese tama�o. 
//Los asteriscos s�lo se ver�n en el borde del cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:

Algoritmo cuadroasteriscos
	
	Definir num Como Entero
	Definir lado Como Entero
	Definir i Como Entero
	
	Escribir "Ingrese el n�mero:"
	Leer num
	
	Para i = 0 Hasta num-1 Con Paso 1 Hacer
		
		Para lado = 0 Hasta num-1 Con Paso 1 Hacer
			
			Si i = 0 o i = num o lado = 0 o lado= num  Entonces 
				Escribir "*" Sin Saltar
			SiNo
				Escribir " " Sin Saltar
			FinSi
			
		Fin Para
		Escribir " "
		
	Fin Para
	
	
FinAlgoritmo