//Se debe realizar un programa que:
//1º) Pida por teclado un número (entero positivo).
//2º) Pregunte al usuario si desea introducir o no otro número.
//3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
//4º) Muestre por pantalla la suma de los números introducidos por el usuario.

Algoritmo sumaNumeros
	
    Definir numero1 como Entero 
	Definir suma como Entero
    Definir respuesta como Caracter
	
    suma <- 0
    respuesta <- "s"
	
    Repetir
		Escribir "Ingrese un número (entero positivo):"
        Leer numero1
        suma <- suma + numero1
		
        Escribir "¿Desea introducir otro número? (s/n)"
        Leer respuesta
		
	Mientras Que respuesta = "s" o respuesta = "S"
		
    Escribir "La suma de los números ingresados es: ", suma
	
FinAlgoritmo


