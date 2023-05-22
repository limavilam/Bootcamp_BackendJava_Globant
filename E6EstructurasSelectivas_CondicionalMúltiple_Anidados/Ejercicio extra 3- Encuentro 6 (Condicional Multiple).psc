//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo numCaracteres
	
	Definir num1 como Caracter
	Escribir "Ingrese un número: "
	Leer num1
	
	Definir numeroDigitos como Entero
	
	numeroDigitos <- longitud (num1)
	
	Si numeroDigitos = 3 Entonces
		Escribir "El número tiene 3 dígitos"
	Sino
		Escribir "El número no tiene 3 dígitos"
	FinSi
	
FinAlgoritmo