//Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo numCaracteres
	
	Definir num1 como Caracter
	Escribir "Ingrese un n�mero: "
	Leer num1
	
	Definir numeroDigitos como Entero
	
	numeroDigitos <- longitud (num1)
	
	Si numeroDigitos = 3 Entonces
		Escribir "El n�mero tiene 3 d�gitos"
	Sino
		Escribir "El n�mero no tiene 3 d�gitos"
	FinSi
	
FinAlgoritmo