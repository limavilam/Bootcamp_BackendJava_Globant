//Realizar un programa que, dado un número entero, visualice en pantalla si es par o
//impar. En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni
//impar". Nota: investigar la función mod de PSeInt

Algoritmo numerosPar
	
	Definir num1 como Entero
		
	Escribir "Ingrese el primer número que quiere evaluar si es par o impar: "
	Leer num1
	
	Si num1 = 0 Entonces
		Escribir "El número no es par ni impar"
	Sino
		Si num1 MOD 2 = 0 Entonces
			Escribir "El número es par"
		Sino
			Escribir "El número es impar"
		FinSi
	FinSi
	
FinAlgoritmo

