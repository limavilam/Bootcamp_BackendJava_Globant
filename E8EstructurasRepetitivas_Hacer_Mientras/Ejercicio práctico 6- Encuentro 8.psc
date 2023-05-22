//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
//de los siguientes valores: 2+4+6+8+10.

Algoritmo sumaPares
	
    Definir num como Entero
	Definir i como Entero
	Definir suma como Entero
	
    
	Hacer
		Escribir "Ingrese la cantidad de números pares a sumar:"
		Leer num 
	Mientras Que num <=0
	
	
    i = 1
    suma = 0
	
    Mientras i <= num Hacer
        suma = suma + (i * 2)
        i = i + 1
    Fin Mientras
	
    Escribir "La suma de los ", num, " primeros números pares es: ", suma
FinAlgoritmo


