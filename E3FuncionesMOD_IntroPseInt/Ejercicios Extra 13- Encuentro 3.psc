//Realizar un algoritmo que lea un n�mero y que muestre su ra�z cuadrada y su ra�z c�bica.
//PSeInt no tiene ninguna funci�n predefinida que permita calcular la ra�z c�bica, �C�mo se
//puede calcular?

Algoritmo raices
	Definir num1 Como Real
	Definir raizCuadrada Como Real
	Definir raizCubica Como Real 
	
	Escribir "Ingrese el n�mero: " 
	Leer num1
	
	raizCuadrada <- raiz(abs(num1))
	raizCubica <- (abs(num1))^(1/3)
	
	escribir "La raiz cuadrada del n�mero ", num1, " es ", raizCuadrada
	escribir "La raiz c�bica del n�mero ", num1, " es ", raizCubica
	
FinAlgoritmo