//Se debe realizar un programa que:
//1�) Pida por teclado un n�mero (entero positivo).
//2�) Pregunte al usuario si desea introducir o no otro n�mero.
//3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
//4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario.

Algoritmo sumaNumeros
	
    Definir numero1 como Entero 
	Definir suma como Entero
    Definir respuesta como Caracter
	
    suma <- 0
    respuesta <- "s"
	
    Repetir
		Escribir "Ingrese un n�mero (entero positivo):"
        Leer numero1
        suma <- suma + numero1
		
        Escribir "�Desea introducir otro n�mero? (s/n)"
        Leer respuesta
		
	Mientras Que respuesta = "s" o respuesta = "S"
		
    Escribir "La suma de los n�meros ingresados es: ", suma
	
FinAlgoritmo


