//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
//impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares"
//siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
//siguiente mensaje "Los números no son pares, o uno de ellos no es par".

Algoritmo numerosPar
	
	Definir num1 como Entero
	Definir num2 Como Entero
	
	Escribir "Ingrese el primer número que quiere evaluar si es par o impar: "
	Leer num1
	
	Escribir "Ingrese el segundo número que quiere evaluar si es par o impar: "
	Leer num2
	
	Si num1 MOD 2 = 0 Y num2 MOD 2 = 0 Entonces 
		Escribir "Ambos números son pares"
	Sino
		Escribir "Los números no son pares, o uno de ellos no es par"
	FinSi
	
FinAlgoritmo

