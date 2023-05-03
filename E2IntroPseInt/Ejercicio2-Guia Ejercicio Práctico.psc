//Escribir un programa que calcule el precio promedio de un producto. El precio promedio se
//debe calcular a partir del precio del mismo producto en tres establecimientos distintos.
Algoritmo promedio
	Definir precio1 Como Real
	Definir precio2 Como Real
	Definir precio3  Como Real
	
	escribir "Ingrese el precio del ítem en el establecimiento 1"
	leer precio1
	escribir "Ingrese el precio del ítem en el establecimiento 2"
	leer precio2
	escribir "Ingrese el precio del ítem en el establecimiento 3"
	leer precio3
	
	Definir precio_promedio_item como Real 
	
	precio_promedio_item <- (precio1 + precio2 + precio3)/3
	
	escribir "El precio promedio del ítem es: ", precio_promedio_item
	
	
FinAlgoritmo