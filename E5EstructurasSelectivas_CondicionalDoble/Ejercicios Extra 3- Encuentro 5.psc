//Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
//impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares"
//siempre y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el
//siguiente mensaje "Los n�meros no son pares, o uno de ellos no es par".

Algoritmo numerosPar
	
	Definir num1 como Entero
	Definir num2 Como Entero
	
	Escribir "Ingrese el primer n�mero que quiere evaluar si es par o impar: "
	Leer num1
	
	Escribir "Ingrese el segundo n�mero que quiere evaluar si es par o impar: "
	Leer num2
	
	Si num1 MOD 2 = 0 Y num2 MOD 2 = 0 Entonces 
		Escribir "Ambos n�meros son pares"
	Sino
		Escribir "Los n�meros no son pares, o uno de ellos no es par"
	FinSi
	
FinAlgoritmo

