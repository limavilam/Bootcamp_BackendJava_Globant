//Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. 
//El usuario ingresará una cantidad de litros de combustible cargados en la estación y una
//cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y se
//lo mostrará al usuario.
Algoritmo consumoCombustible
	Definir consumo_combustible Como Real
	Definir kilometros_recorridos como Real 
	
	escribir "Ingrese la cantidad de litros de combustible cargados en la estación: "
	leer consumo_combustible
	
	escribir "Ingrese la cantidad de kilómetros recorridos: "
	leer kilometros_recorridos
	
	Definir c como Real

	c <-  (kilometros_recorridos)/(consumo_combustible)
	
	escribir "El consumo en Km/Lt es:  ", c 
	
	
FinAlgoritmo