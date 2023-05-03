// Mostrar el área y perímetro de un paralelogramo.

Algoritmo areaParalelogramo
	Definir base Como Real
	Definir altura Como Real
	Definir ladoA Como Real
	Definir area_Paralelogramo Como Real
	Definir perimetro_Paralelogramo Como Real 
	
	escribir "Ingrese el valor de la base del paralelogramo: "
	leer base
	escribir "Ingrese el valor de la altura del paralelogramo: "
	leer altura
	escribir "Ingrese el valor del lado A del paralelogramo: "
	leer ladoA
	
	area_Paralelogramo <- base * altura
	perimetro_Paralelogramo <- 2 * (base + ladoA)
	
	escribir "El area del paralelogramo es: ", area_Paralelogramo
	escribir "El perimétro del paralelogramo es: ", perimetro_Paralelogramo
	
	
FinAlgoritmo