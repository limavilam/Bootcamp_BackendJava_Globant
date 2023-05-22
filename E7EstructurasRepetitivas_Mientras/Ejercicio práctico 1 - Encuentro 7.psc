//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
//nota se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo numerosNaturales
	
	Definir nota como real
		
	Escribir "Ingrese una nota valida"
	Leer nota
		
	Mientras nota <= 0 O nota >= 10 
	Escribir "Ingrese la nota de nuevo"
	Leer nota
			
	FinMientras
		
	Escribir "La nota es correcta"
		
FinAlgoritmo