// Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa.

Algoritmo numeroCapicua
	
	Definir numero1 como Entero
	Definir cifra1 como Entero
	Definir cifra2 como Entero
	Definir cifra3 como Entero
	
	Escribir "Ingrese un número de tres cifras: "
	Leer numero1
	
	Cifra1 <- TRUNC (numero1 / 100)
	Escribir "el número cifra 1 es:", cifra1
	cifra2 <- (TRUNC(numero1/ 10) MOD 10)
	Escribir "el número cifra 2 es:", cifra2
	cifra3 <- TRUNC(numero1 MOD 10)
	Escribir "el número cifra 3 es:", cifra3
	
	Si cifra1 = cifra3 Entonces
		Escribir "El número ingresado es capicúa."
	Sino
		Escribir "El número ingresado no es capicúa."
	FinSi
	
FinAlgoritmo