//Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil. 
//El usuario ingresar� una cantidad de litros de combustible cargados en la estaci�n y una
//cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo (km/lt) y se
//lo mostrar� al usuario.
Algoritmo consumoCombustible
	Definir consumo_combustible Como Real
	Definir kilometros_recorridos como Real 
	
	escribir "Ingrese la cantidad de litros de combustible cargados en la estaci�n: "
	leer consumo_combustible
	
	escribir "Ingrese la cantidad de kil�metros recorridos: "
	leer kilometros_recorridos
	
	Definir c como Real

	c <-  (kilometros_recorridos)/(consumo_combustible)
	
	escribir "El consumo en Km/Lt es:  ", c 
	
	
FinAlgoritmo