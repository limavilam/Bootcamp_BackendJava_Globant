//Mostrar el �rea y per�metro de un rombo.

Algoritmo areaRombo
	Definir diagonalD1 Como Real
	Definir diagonalD2 Como Real
	Definir lado Como Real
	Definir area_rombo Como Real
	Definir perimetro_rombo Como Real 
	escribir "Ingrese el valor de la diagonal 1 del rombo: "
	leer diagonalD1
	escribir "Ingrese el valor de la diagonal 2 del rombo: "
	leer diagonalD2
	escribir "Ingrese el valor del lado del rombo: "
	leer lado
	
	area_rombo <-  (diagonalD1 * diagonalD2)/2
	perimetro_rombo <- 4 * lado
	
	escribir "El area del rombo es: ", area_rombo
	escribir "El perim�tro del rombo es: ", perimetro_rombo
	
	
FinAlgoritmo