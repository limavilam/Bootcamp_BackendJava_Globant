// Hacer un algoritmo para calcular la media de los n�meros pares e impares, s�lo se ingresar� diez n�meros.

Algoritmo mediaNumeros
	
    Definir dato Como Entero
	Definir numPar Como Entero
	Definir numImpar Como Entero
	Definir contadorPar como Entero 
	Definir contadorImpar como Entero 
	
	contadorPar<- 0
	contadorImpar<- 0
    numPar <- 0
    numImpar <- 0
	
	Repetir
		Escribir "Ingrese el n�mero: "
		Leer dato
		
		Si dato MOD 2 = 0 
			numPar <- numPar + dato
			contadorPar<- contadorPar+1
		SiNo 
			numImpar <- numImpar + dato
			contadorImpar<- contadorImpar+1
		FinSi
	
	Mientras Que contadorImpar + contadorPar < 10
	
    Escribir "La media de los n�meros pares ingresados es: ", numPar/contadorPar
	Escribir "La media de los n�meros impares ingresados es: ", numImpar/contadorImpar
	
FinAlgoritmo

