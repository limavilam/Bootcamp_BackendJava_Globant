//Solicitar al usuario que ingrese la base y altura de un rect�ngulo, y calcular y mostrar por
//pantalla el �rea y per�metro del mismo
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
	
	escribir "El area del rect�ngulo es: ", area_rectangulo
	escribir "El perim�tro del rect�ngulo es: ", perimetro_rectangulo
	
	
FinAlgoritmo
