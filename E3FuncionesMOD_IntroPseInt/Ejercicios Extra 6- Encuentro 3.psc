// Mostrar el �rea y per�metro de un hex�gono.

Algoritmo areaHexagono
	Definir apotema Como Real
	Definir lado Como Real
	Definir area_hexagono Como Real
	Definir perimetro_hexagono Como Real 
	
	escribir "Ingrese el valor del apotema del hex�gono: "
	leer apotema
	escribir "Ingrese el valor del lado del hex�gono: "
	leer lado
	
	perimetro_hexagono <- 6 * lado
	area_hexagono <- (perimetro_hexagono * apotema) / 2
	
	escribir "El area del hex�gono es: ", area_hexagono
	escribir "El perim�tro del hex�gono es: ", perimetro_hexagono
	
	
FinAlgoritmo