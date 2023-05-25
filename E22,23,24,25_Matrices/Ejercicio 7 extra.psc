Algoritmo sin_titulo
	
//	Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//	realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
	//	d) El nombre, el día de la semana y la cantidad del producto más vendido.
	
	definir n,m,vectorTotalSemana,vectorProMasVendido,vectorTotalProducto como entero
	definir matriz Como Real
	n=7
	m=6
	Dimension matriz[n,m],vector[n],vectorRes[n]
	cargarMatriz(matriz,n,m)

	Escribir "-------------------------------------------------------"
	mostrarMatriz(matriz,n,m)
	Escribir "-------------------------------------------------------"

	
FinAlgoritmo

SubProceso cargarMatriz (matriz,n,m)
	Definir i,j,k,acumuladorTP,acumuladorTS,maxPos,maxValue como Entero
	acumuladorTP = 0
	acumuladorTS = 0
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			Si j == m-1 Entonces
				acumuladorTP = 0 
				Para k<-0 Hasta m-2 Con Paso 1 Hacer
					acumuladorTP = acumuladorTP + matriz[i,k]
				Fin Para
				matriz[i,j]= acumuladorTP	
			SiNo
				Si i==n-2 Entonces
					acumuladorTS = 0

					Para k<-0 Hasta n-3 Con Paso 1 Hacer
						acumuladorTS = acumuladorTS + matriz[k,j]
					Fin Para
					matriz[i,j]= acumuladorTS
				SiNo
						matriz[i,j]= Aleatorio(0,100)		
				Fin Si
			Fin Si
		Fin Para
	Fin Para
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

SubProceso mostrarMatriz(matriz,n,m)
	Definir i,j,k,espaciador,cantCifras como Entero
	definir vectorHeader,vectorColumna como Caracter
	Dimension vectorHeader[7],vectorColumna[8]
	vectorHeader[0]=[""]
	vectorHeader[1]=["L"]
	vectorHeader[2]=["M"]
	vectorHeader[3]=["M"]
	vectorHeader[4]=["J"]
	vectorHeader[5]=["V"]
	vectorHeader[6]=["TP"]
	
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
			
			Para j<-0 Hasta m Con Paso 1 Hacer
				cantCifras = Longitud(VectorHeader[j])
				Para k<-0 Hasta espaciador-cantCifras Con Paso 1 Hacer
					Escribir Sin Saltar " "
				Fin Para
				Escribir sin saltar VectorHeader[j]," "
			Fin Para
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


