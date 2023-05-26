Algoritmo ejercicioCooperativo
	Definir M, N, i, j, buscadorLetras,fila Como Entero
		
	N = 3
	M = 12
		
	Escribir "El número de filas de la matriz es:" , N 
	Escribir "El número de columnas de la matriz es:" , M 
	
	// Definir matriz
	Definir original, matrizLetras, fraseLetras Como Caracter
	Dimension original[N,M]
	Dimension matrizLetras[N,M]
	
	Imprimir "Tamaño matriz:", N * M
	
	inicializarMatriz(original, N,M)	
	imprimirMatriz(original,N,M)
	
	Para i <- 0 Hasta N-1 Con Paso 1 Hacer
        Escribir "Ingrese la palabra ", i
        Leer fraseLetras
		agregarPalabra(matrizLetras, fraseLetras, i, M)
    FinPara
    
	Escribir "--------------------------------------------------"
	
	imprimirMatrizLetras(matrizLetras,N,M)
				
FinAlgoritmo

// Subproceso de llenado de matriz
SubProceso inicializarMatriz(original, N,M)
	Definir i, j Como Entero
	Para i <- 0 Hasta N-1
		Para j <- 0 Hasta M-1
			original[i,j] <- "*"
		FinPara
	FinPara
FinSubProceso

//Visualización de la matriz
SubProceso imprimirMatriz(original,N,M)
	Definir i,j Como Entero
	Para i=0 Hasta N-1
		Para j=0 Hasta M-1
			Escribir "[" original(i,j) "]", " " Sin Saltar			
		FinPara
		Escribir " "
	FinPara
FinSubProceso

//Agregando palabras
SubProceso agregarPalabra(matrizLetras, fraseLetras, fila, M)
    Definir j, contador Como Entero
    // El contador se utiliza para realizar un seguimiento de la posición actual en la cadena mientras se llena la matriz.
    contador <- 0
    Para j <- 0 Hasta M-1 Con Paso 1
        matrizLetras[fila, j] <- Subcadena(fraseLetras, contador, contador)
        contador <- contador + 1		
    FinPara
FinSubProceso

//Buscando R
SubProceso buscarR(matrizLetras,N,M)
    Definir i,j Como Entero
	Definir encontrado Como Logico
	encontrado <- Falso
	Para i <-0 Hasta N-1 Con Paso 1
		Para j <- 0 Hasta M-1 Con Paso 1
			Si matrizLetras(i, j) = "r" entonces
				Escribir "El elemento se encuentra en la posición de fila:", "[",i,"]" , " y columna:","[",j,"]" , " de la matriz."
				encontrado <- Verdadero
			FinSi
		FinPara    
    FinPara
	Si encontrado = Falso Entonces
		Escribir "El elemento no está dentro de la matriz."
	FinSi
FinSubProceso

//Visualización de la matriz letras
SubProceso imprimirMatrizLetras(matrizLetras,N,M)
	Definir i,j Como Entero
	Para i=0 Hasta N-1
		Para j=0 Hasta M-1
			Escribir "[" matrizLetras(i,j) "]", " " Sin Saltar	
		FinPara
		Escribir " "
	FinPara
FinSubProceso

