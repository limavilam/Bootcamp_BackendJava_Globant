//Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera invertida de asteriscos con esa altura. 
//Por ejemplo, si ingresamos una altura de 5 se deber� mostrar:***** ****     ***    **   * 

Algoritmo cuadroasteriscos
	
	Definir num Como Entero
	Definir j Como Entero
	Definir i Como Entero
	
	Escribir "Ingrese el n�mero:"
	Leer num
	
	Para i = 0 Hasta num Con Paso 1 Hacer
		
		//Inicia con j=i porque es la cantidad inicial del anterior ciclo
		Para j = i Hasta num Con Paso 1 Hacer
			Escribir "X" Sin Saltar
		Fin Para
		Escribir " "
		
	Fin Para
	
	
FinAlgoritmo
