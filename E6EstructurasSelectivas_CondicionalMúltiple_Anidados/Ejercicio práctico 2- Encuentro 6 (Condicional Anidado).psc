//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o
//impar. En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni
//impar". Nota: investigar la funci�n mod de PSeInt

Algoritmo numerosPar
	
	Definir num1 como Entero
		
	Escribir "Ingrese el primer n�mero que quiere evaluar si es par o impar: "
	Leer num1
	
	Si num1 = 0 Entonces
		Escribir "El n�mero no es par ni impar"
	Sino
		Si num1 MOD 2 = 0 Entonces
			Escribir "El n�mero es par"
		Sino
			Escribir "El n�mero es impar"
		FinSi
	FinSi
	
FinAlgoritmo

