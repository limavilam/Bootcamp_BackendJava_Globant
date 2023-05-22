//EJERCICIO VOCAL SECRETA
//Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
//que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la
//adivine.

Algoritmo EjemploMientras
	
	Definir vocal como caracter
	Definir vocalSecreta como caracter
	
	Escribir "Ingrese una vocal: "
	Leer vocal
	
	vocalSecreta = 'a'
	
	Mientras vocal <> vocalSecreta  
		Escribir "Intente nuevamente, no es vocal secreta"
		Leer vocal
		
	FinMientras
	
FinAlgoritmo