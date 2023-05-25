//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se
//realiza la multiplicación entre matrices consultar el siguiente link:
//https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector

Algoritmo matrizPorVector
    Definir vector, matriz, matrizResultante Como Entero
    Definir N, M, i, j Como Entero
    
    N <- 3
    M <- 3
    
    Escribir "El tamaño del vector es de 3"
    Dimension vector[M]
    Dimension matriz[N, M]
    Dimension matrizResultante[N, 1]
    
    Para i <- 0 Hasta M-1 Con Paso 1 Hacer
        Escribir "Ingrese el valor para la posición ", i
        Leer vector[i]
    FinPara
    
    llenadoMatriz(matriz, N, M)
	Escribir "La matriz original es:"	
	imprimeMatrizOriginal(matriz,N,M)
    multiplicacionMatrizYVector(matriz, vector, N, M, matrizResultante)
	Escribir "La matriz resultante es:"
    imprimeMatriz(matrizResultante, N)
    
FinAlgoritmo

// Subproceso de llenado de matriz
SubProceso llenadoMatriz(matriz, N, M)
    Definir i, j Como Entero
    Para i <- 0 Hasta N-1
        Para j <- 0 Hasta M-1
            matriz[i, j] <- Aleatorio(1, 10)
        FinPara
    FinPara
FinSubProceso

// Multiplicación de matriz y vector
SubProceso multiplicacionMatrizYVector(matriz, vector, N, M, matrizResultante)
    Definir i, j Como Entero
    Para i <- 0 Hasta N-1
        matrizResultante[i, 0] <- 0
        Para j <- 0 Hasta M-1
			//matriz[i,j] indica la posición, matrizResultante nos indica el tamaño de la matriz (vector resultante con una sola columna).
            matrizResultante[i, 0] <- matrizResultante[i, 0] + matriz[i, j] * vector[j]
        FinPara
    FinPara
FinSubProceso

//Visualización de la matriz 
SubProceso imprimeMatrizOriginal(matriz,N,M)
	Definir i,j Como Entero
	Para i=0 Hasta N-1
		Para j=0 Hasta M-1
			Escribir "[" matriz(i,j) "]", " " Sin Saltar			
		FinPara
		Escribir " "
	FinPara
FinSubProceso

// Visualización de la matriz Resultante 
SubProceso imprimeMatriz(matrizResultante, N)
    Definir i Como Entero
    Para i <- 0 Hasta N-1
        Escribir "[" matrizResultante[i, 0] "]"
    FinPara
FinSubProceso
