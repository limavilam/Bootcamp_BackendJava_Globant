//Conocido el número en matemática PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
//calcular el área y el perímetro se utilizan las siguientes fórmulas:
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
	
	escribir "El area del círculo es: ", area_circulo
	escribir "El perimétro del círculo es: ", perimetro
	
	
FinAlgoritmo

