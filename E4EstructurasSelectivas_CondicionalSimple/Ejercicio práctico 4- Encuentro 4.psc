// Dise�e un algoritmo que lea un n�mero de tres cifras y determine si es o no capic�a.

Algoritmo numeroCapicua
	
	Definir numero1 como Entero
	Definir cifra1 como Entero
	Definir cifra2 como Entero
	Definir cifra3 como Entero
	
	Escribir "Ingrese un n�mero de tres cifras: "
	Leer numero1
	
	Cifra1 <- TRUNC (numero1 / 100)
	Escribir "el n�mero cifra 1 es:", cifra1
	cifra2 <- (TRUNC(numero1/ 10) MOD 10)
	Escribir "el n�mero cifra 2 es:", cifra2
	cifra3 <- TRUNC(numero1 MOD 10)
	Escribir "el n�mero cifra 3 es:", cifra3
	
	Si cifra1 = cifra3 Entonces
		Escribir "El n�mero ingresado es capic�a."
	Sino
		Escribir "El n�mero ingresado no es capic�a."
	FinSi
	
FinAlgoritmo