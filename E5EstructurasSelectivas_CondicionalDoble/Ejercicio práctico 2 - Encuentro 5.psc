//Realizar un programa que pida un n�mero y determine si ese n�mero es par o impar.
//Mostrar en pantalla un mensaje que indique si el n�mero es par o impar. (para que un
//n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota:
//investigar la funci�n mod de PseInt.

Algoritmo numParOImpar
	
	Definir num1 como Real
				
	Escribir "Ingrese el n�mero que desea evaluar si es par o impar: "
	Leer num1
	
		
	Si num1 MOD 2 = 0 Entonces
		Escribir "El n�mero " , num1, " es un par."
	Sino
		Escribir "El n�mero " , num1, " es un mpar."
	FinSi
	
FinAlgoritmo