//Conocido el n�mero en matem�tica PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el �rea y per�metro. Recuerde que para
//calcular el �rea y el per�metro se utilizan las siguientes f�rmulas:
//area = PI * radio2
//perimetro = 2 * PI * radio

Algoritmo area
	Definir radio Como Real
	Definir numeroPi como Real
	Definir area_circulo Como Real
	Definir perimetro Como Real 
	escribir "Ingrese el valor del radio"
	leer radio
	escribir "Ingrese el valor de Pi"
	leer numeroPi
	
	area_circulo <-  numeroPi * (radio)^2
	perimetro <- 2 * numeroPi * radio
	
	escribir "El area del c�rculo es: ", area_circulo
	escribir "El perim�tro del c�rculo es: ", perimetro
	
	
FinAlgoritmo

