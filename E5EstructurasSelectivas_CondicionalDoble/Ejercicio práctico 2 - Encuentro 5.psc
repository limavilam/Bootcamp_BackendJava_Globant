//Realizar un programa que pida un número y determine si ese número es par o impar.
//Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
//número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota:
//investigar la función mod de PseInt.

Algoritmo numParOImpar
	
	Definir num1 como Real
				
	Escribir "Ingrese el número que desea evaluar si es par o impar: "
	Leer num1
	
		
	Si num1 MOD 2 = 0 Entonces
		Escribir "El número " , num1, " es un par."
	Sino
		Escribir "El número " , num1, " es un mpar."
	FinSi
	
FinAlgoritmo