// Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

Algoritmo conversionTemperatura
	Definir fahrenheit Como Real
	escribir "Ingrese la temperatura en Fahrenheit para ser convertida a Celsius: "
	leer fahrenheit
	Definir conversion_celsius como Real

	conversion_celsius <-  (fahrenheit - 32) / 1.8
	
	escribir "La temperatura de ", fahrenheit , " fahrenheit es equivalente a " , conversion_celsius , " grados Celsius"
	
FinAlgoritmo