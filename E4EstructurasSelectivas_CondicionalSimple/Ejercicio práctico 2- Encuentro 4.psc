//Construir un pseudocódigo que permita ingresar un número, si el número es mayor de
//500, se debe calcular y mostrar en pantalla el 18% de este.

Algoritmo porcentajesOperandos
	Definir num1 Como Real
	Definir descuento Como Real
	Escribir "Ingrese el número que desea evaluar: "
	Leer num1
	
	Si num1 > 500 Entonces
		descuento = num1 * 0.18
		Escribir "El 18% del número ingresado es: ", descuento
	Fin Si
	
FinAlgoritmo
	
