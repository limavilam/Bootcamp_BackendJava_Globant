//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo longitudNum
	
	Definir num1 como Caracter
	Escribir "Ingrese el número A: "
	Leer num1
	
	Definir num2 como Caracter
	Escribir "Ingrese el número B: "
	Leer num2
	
	Definir num3 como Caracter
	Escribir "Ingrese el número C: "
	Leer num3
	
	Definir longitudNumeros como Entero
	
	longitudNumeros <- longitud(num1)
	longitudNumeros <- longitud(num2)
	longitudNumeros <- longitud(num3)
	
	Si longitudNumeros = 3 Entonces 
		Segun num1,num2, num3 Hacer
			"A":
				Escribir "el número ingresado tiene 3 dígitos"
			"B":
				Escribir "el número ingresado tiene 3 dígitos"
			"C":
				Escribir "el número ingresado tiene 3 dígitos"
			De Otro Modo:
				Escribir "el número ingresado no tiene 3 dígitos"
		Fin Segun
	
	FinSi
	
FinAlgoritmo