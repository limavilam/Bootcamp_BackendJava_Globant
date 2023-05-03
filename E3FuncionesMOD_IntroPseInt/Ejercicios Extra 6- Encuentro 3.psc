// Mostrar el área y perímetro de un hexágono.

Algoritmo areaHexagono
	Definir apotema Como Real
	Definir lado Como Real
	Definir area_hexagono Como Real
	Definir perimetro_hexagono Como Real 
	
	escribir "Ingrese el valor del apotema del hexágono: "
	leer apotema
	escribir "Ingrese el valor del lado del hexágono: "
	leer lado
	
	perimetro_hexagono <- 6 * lado
	area_hexagono <- (perimetro_hexagono * apotema) / 2
	
	escribir "El area del hexágono es: ", area_hexagono
	escribir "El perimétro del hexágono es: ", perimetro_hexagono
	
	
FinAlgoritmo