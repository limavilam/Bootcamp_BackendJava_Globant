//Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo longitudNum
	
	Definir num1 como Caracter
	Escribir "Ingrese el n�mero A: "
	Leer num1
	
	Definir num2 como Caracter
	Escribir "Ingrese el n�mero B: "
	Leer num2
	
	Definir num3 como Caracter
	Escribir "Ingrese el n�mero C: "
	Leer num3
	
	Definir longitudNumeros como Entero
	
	longitudNumeros <- longitud(num1)
	longitudNumeros <- longitud(num2)
	longitudNumeros <- longitud(num3)
	
	Si longitudNumeros = 3 Entonces 
		Segun num1,num2, num3 Hacer
			"A":
				Escribir "el n�mero ingresado tiene 3 d�gitos"
			"B":
				Escribir "el n�mero ingresado tiene 3 d�gitos"
			"C":
				Escribir "el n�mero ingresado tiene 3 d�gitos"
			De Otro Modo:
				Escribir "el n�mero ingresado no tiene 3 d�gitos"
		Fin Segun
	
	FinSi
	
FinAlgoritmo