//La función factorial se aplica a números enteros positivos. El factorial de un número entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
//Escriba un programa que calcule las factoriales de todos los números enteros desde el 1 hasta el 5. El programa deberá mostrar la siguiente salida: !1 = 1     !2 = 1*2 = 2...  !5 = 1*2*3*4*5 = 120

Algoritmo calculoFactorial
	
	Definir i Como Real
	Definir factorial Como Entero
	
	factorial <- 1
	
	Para i <- 1 Hasta 5 Con Paso 1 Hacer
		factorial <- i * factorial
		Escribir "El número factorial es: " , factorial
		
	Fin Para
	
	
FinAlgoritmo

Algoritmo factorial
	
	definir i, j, factorialnum Como Entero
	
	factorialnum = 1
	para i=1 hasta 5 Con Paso 1 Hacer
		escribir "!" i " = " sin saltar
		para j = 1 hasta i Con Paso 1 Hacer
			si j = i Entonces
				Escribir j Sin Saltar
			SiNo
				Escribir j "*" Sin Saltar
			FinSi
		fin para
		factorialnum = factorialnum * i 
		si i > 1 Entonces
			escribir " = " factorialnum
		sino 
			Escribir " "
		FinSi
	FinPara
	
FinAlgoritmo