//Encuentro de cine

Algoritmo cine
	Definir opinion como entero 
	Escribir "Clasifique la pel�cula de 1 a 5 estrellas"
	Leer opinion
	
	
	Si opinion >= 1 Y opinion <= 5 Entonces 
		Escribir "Usted clasifico la pel�cula con ", opinion , " estrellas. Gracias"
	SiNo
		Escribir "El valor ", opinion, " no es valida y no se tomara en cuenta"
	FinSi
FinAlgoritmo
