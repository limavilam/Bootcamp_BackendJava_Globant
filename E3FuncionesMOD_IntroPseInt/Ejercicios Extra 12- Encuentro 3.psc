//Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su
//diferencia, de modo que el resultado sea siempre positivo).

Algoritmo diferencia
	Definir num1 Como Real
	Definir num2 Como Real
	Definir diferenciaValorAbsoluto Como Real
	
	Escribir "Ingrese el número 1: " 
	Leer num1
	
	Escribir "Ingrese el número 2: " 
	Leer num2
	
	diferenciaValorAbsoluto <- ABS(num1-num2)
	
	escribir "La distancia entre los números ", num1, " y ", num2, " es ", diferenciaValorAbsoluto

	
FinAlgoritmo