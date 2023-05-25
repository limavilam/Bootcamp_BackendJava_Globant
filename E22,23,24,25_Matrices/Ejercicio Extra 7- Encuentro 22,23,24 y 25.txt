//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo empresaProductos
	
	Definir N,M, i,j, totalProducto, totalSemana Como Entero
	Definir matriz Como Real
	Definir dias Como Caracter
	
	N = 7
	M = 6
	
	Dimension matriz[N,M]
	Dimension dias[M]
	
	dias[0] <- "Lunes"
	dias[1] <- "Martes"
	dias[2] <- "Miércoles"
	dias[3] <- "Jueves"
	dias[4] <- "Viernes"
	dias[5] <- "total Producto"
	
	Escribir "-------------------------------------------------------"
	imprimirArreglo(dias, 6) 	
	llenadoMatriz(matriz,N,M)
    imprimirMatriz(matriz, n, m)
	Escribir "-------------------------------------------------------"
	Escribir " "
	Escribir "-------------------------------------------------------"
	imprimirArreglo(dias, 6) 	
	mostrarMatriz(matriz,n,m)
	Escribir "-------------------------------------------------------"
	
FinAlgoritmo

// Subproceso de llenado de matriz
SubProceso llenadoMatriz(matriz, N,M)
	Definir i, j, k, totalProducto, totalSemana, maxPos, maxValue Como Entero
	Para i <- 0 Hasta N-1		//Tener presente que acá puedo cambiar el número de filas. 
		Para j <- 0 Hasta M-1
			Si j = M-1
				totalProducto <- 0
				Para k <- 0 Hasta M-2
					totalProducto <- totalProducto + matriz[i,k]
				Fin Para
				matriz[i,j] = totalProducto
			SiNo
				Si i= N-2 Entonces
					totalSemana = 0					
					Para k<-0 Hasta N-3 Con Paso 1 Hacer
						totalSemana  = totalSemana  + matriz[k,j]
					Fin Para
					matriz[i,j]= totalSemana 
				SiNo
					matriz[i,j]= Aleatorio(0,10)		
				Fin Si
			Fin Si
		Fin Para
	Fin Para
	
	//Definir el más grande
	Para j<-0 Hasta m-1 Con Paso 1 Hacer
		maxPos= 0
		maxValue= 0
		Para k<-0 Hasta n-3 Con Paso 1 Hacer
			Si matriz[k,j]> maxValue Entonces
				maxValue = matriz[k,j]
				maxPos = k				
			Fin Si
		Fin Para
		matriz[n-1,j]= matriz[maxPos,j]+(maxPos+1)/10		
	Fin Para
FinSubProceso


SubProceso imprimirMatriz(matriz, n, m)
	Definir i, j Como Entero
	para i = 0 hasta N-1
		Escribir ""
		Escribir Sin Saltar "Producto ", i + 1, "   "
		para j = 0 hasta M-1
			Escribir Sin Saltar "     ", matriz[i, j] "      "
		FinPara
	FinPara
	Escribir " " //Para que se me vean los guiones de arriba
FinSubProceso

SubProceso imprimirArreglo(arreglo, n) 
	Escribir Sin Saltar "                   "
	Definir i Como Entero
	para i = 0 hasta n-1
		Escribir Sin Saltar arreglo[i], "  "
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz,n,m)
	Definir i,j,k,espaciador,cantCifras como Entero
	definir vectorColumna como Caracter
	Dimension vectorColumna[8]
		
	vectorColumna[0]=[""]
	vectorColumna[1]=["P1"]
	vectorColumna[2]=["P2"]
	vectorColumna[3]=["P3"]
	vectorColumna[4]=["P4"]
	vectorColumna[5]=["P5"]
	vectorColumna[6]=["TS"]
	vectorColumna[7]=["P+V"]
	espaciador = 8
	Para i<--1 Hasta n-1 Con Paso 1 Hacer
		si i == -1 Entonces
			Escribir ""
		Sino 
			Para j<--1 Hasta m-1 Con Paso 1 Hacer
				Si j==-1 Entonces					
					cantCifras = Longitud(vectorColumna[i+1])
					Para k<-0 Hasta espaciador-cantCifras Con Paso 1 Hacer
						Escribir Sin Saltar " "
					Fin Para
					Escribir sin saltar vectorColumna[i+1]," "
				SiNo
					cantCifras = Longitud(ConvertirATexto(matriz[i,j]))
					Para k<-0 Hasta espaciador-cantCifras Con Paso 1 Hacer
						Escribir Sin Saltar " "
					Fin Para
					Escribir sin saltar matriz[i,j]," "
				Fin Si
				
				
			Fin Para
			Escribir " "
		FInsi 
	Fin Para
FinSubProceso
