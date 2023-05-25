Algoritmo sin_titulo
//	Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
//		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
//		estadísticas sobre el comportamiento de sus representantes en cada zona. Se desea hacer un
//	programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
	//		c) el total de ventas de todos los representantes.
	definir n,m,vectorTotalSemana,vectorProMasVendido,vectorTotalProducto como entero
	definir matriz Como Real
	n=6
	m=6
	Dimension matriz[n,m],vector[n],vectorRes[n]
	cargarMatriz(matriz,n,m)
	
	Escribir "-------------------------------------------------------"
	mostrarMatriz(matriz,n,m)
	Escribir "-------------------------------------------------------"

	menu()

FinAlgoritmo
SubProceso menu()
	definir i,j,k,resultadoMenu Como Entero
	
	Repetir
		Escribir "Ingrese una opcion del menu"
		Escribir "1 - Total de ventas de una zona"
		Escribir "2 - Total de ventas de un vendedor en cada una de las zonas"
		Escribir "3 - El total de las ventas de todos los representantes"
		Escribir "4 - Salir"
		leer resultadoMenu
	Mientras Que resultadoMenu<1 O resultadoMenu>4
	
	Segun resultadoMenu Hacer
		1:
			Escribir ""
		2:
			Escribir ""
		3:
			Escribir ""
		De Otro Modo:
			Escribir "Gracias por usar nuestro programa "
	Fin Segun
FinSubProceso
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
	vectorColumna[1]=["V1"]
	vectorColumna[2]=["V2"]
	vectorColumna[3]=["V3"]
	vectorColumna[4]=["V4"]
	vectorColumna[5]=["TZ"]
	vectorColumna[6]=["P+V"]
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

	