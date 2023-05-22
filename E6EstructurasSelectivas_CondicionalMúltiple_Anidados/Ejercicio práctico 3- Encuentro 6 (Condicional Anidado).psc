// Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de
//tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período
//de prueba:
//Producir menos de 200 tornillos defectuosos.
//Producir más de 10000 tornillos sin defectos.
//El grado de eficiencia se determina de la siguiente manera:
// Si no cumple ninguna de las condiciones, grado 5.
//Si sólo cumple la primera condición, grado 6.
// Si sólo cumple la segunda condición, grado 7.
//Si cumple las dos condiciones, grado 8

Algoritmo eficienciaOperario
	Definir tornillosDefec como Entero 
	Definir tornillosBuenos Como Entero
	Definir gradoEficiencia Como Entero
	
	Escribir "Ingrese el número de tornillos defectuosos que ha obtenido: "
	Leer tornillosDefec 
	Escribir "Ingrese el número de tornillos sin defectos que ha obtenido: "
	Leer tornillosBuenos
	
	Si tornillosDefec > 200 Y tornillosBuenos <= 9999 Entonces
		Escribir "Usted tiene el grado 5"
	SiNo
		Si tornillosDefec < 200 Y tornillosBuenos >= 10000
			Escribir "Usted tiene el grado 8"
		SiNo
			Si tornillosDefec >= 201 Y tornillosBuenos >= 10000
				Escribir "Usted tiene el grado 7"
			SiNo
				Si tornillosDefec < 200 Y tornillosBuenos <= 9999
					Escribir "Usted tiene el grado 6"
				FinSi
			FinSi	
		FinSi
	FinSi	
	
FinAlgoritmo