//Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
//pantalla el área y perímetro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.
Algoritmo arearectangulo
	Definir base Como Real
	Definir altura como Real
	Definir area_rectangulo Como Real
	Definir perimetro_rectangulo Como Real 
	escribir "Ingrese el valor de la base del rectangulo: "
	leer base
	escribir "Ingrese el valor de la altura del rectangulo: "
	leer altura
	
	area_rectangulo <-  base * altura
	perimetro_rectangulo <- (2 * altura) + (2 * base)
	
	escribir "El area del rectángulo es: ", area_rectangulo
	escribir "El perimétro del rectángulo es: ", perimetro_rectangulo
	
	
FinAlgoritmo
