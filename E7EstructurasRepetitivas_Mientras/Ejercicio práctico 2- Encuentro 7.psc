//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

Algoritmo SumaNumeros
	
    Definir valorLimite Como Entero
	Definir num1 como Entero 
	Definir suma Como Entero
	
	Escribir "Ingrese el número límite: "
	Leer valorLimite
	
	suma <- 0
	
	Mientras suma <= valorLimite Hacer
		Escribir "Ingrese un número:"
        Leer num1
        suma <- suma + num1
	Fin Mientras
	
FinAlgoritmo


