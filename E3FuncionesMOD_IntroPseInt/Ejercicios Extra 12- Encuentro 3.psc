//Pide al usuario dos n�meros y muestra la "distancia" entre ellos (el valor absoluto de su
//diferencia, de modo que el resultado sea siempre positivo).

Algoritmo diferencia
	Definir num1 Como Real
	Definir num2 Como Real
	Definir diferenciaValorAbsoluto Como Real
	
	Escribir "Ingrese el n�mero 1: " 
	Leer num1
	
	Escribir "Ingrese el n�mero 2: " 
	Leer num2
	
	diferenciaValorAbsoluto <- ABS(num1-num2)
	
	escribir "La distancia entre los n�meros ", num1, " y ", num2, " es ", diferenciaValorAbsoluto

	
FinAlgoritmo