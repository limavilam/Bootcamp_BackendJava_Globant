//Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
//PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se
//puede calcular?

Algoritmo raices
	Definir num1 Como Real
	Definir raizCuadrada Como Real
	Definir raizCubica Como Real 
	
	Escribir "Ingrese el número: " 
	Leer num1
	
	raizCuadrada <- raiz(abs(num1))
	raizCubica <- (abs(num1))^(1/3)
	
	escribir "La raiz cuadrada del número ", num1, " es ", raizCuadrada
	escribir "La raiz cúbica del número ", num1, " es ", raizCubica
	
FinAlgoritmo