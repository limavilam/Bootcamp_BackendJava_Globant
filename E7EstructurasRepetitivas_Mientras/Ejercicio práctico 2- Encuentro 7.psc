//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el
//l�mite inicial.

Algoritmo SumaNumeros
	
    Definir valorLimite Como Entero
	Definir num1 como Entero 
	Definir suma Como Entero
	
	Escribir "Ingrese el n�mero l�mite: "
	Leer valorLimite
	
	suma <- 0
	
	Mientras suma <= valorLimite Hacer
		Escribir "Ingrese un n�mero:"
        Leer num1
        suma <- suma + num1
	Fin Mientras
	
FinAlgoritmo


