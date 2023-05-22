//Escriba un programa que solicite dos números enteros (mínimo y máximo). A
//continuación, se debe pedir al usuario que ingrese números enteros situados entre el
//máximo y mínimo. Cada vez que un número se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminará cuando se escriba un número que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//números ingresados dentro del intervalo.

Algoritmo maxMin
	
	Definir numMin como Entero
	Definir numMax como Entero 
	Definir num1 como Entero
	Definir contador como Entero 
		
	Escribir "Ingrese el número entero mínimo: "
	Leer numMin
	
	Escribir "Ingrese el número entero máximo: "
	Leer numMax
	
	contador <- 0
	
	Escribir "Ingrese un número entre ", numMin, " y ", numMax, " (o escriba un número fuera de ese intervalo para terminar):"
    Leer num1
	
	Mientras num1 >= numMin Y  num1 <= numMax Hacer
		contador = contador + 1
		Escribir "Por favor ingrese otro número"
		Leer num1
	Fin Mientras
	
	Escribir "Se ingresaron ", contador, " números dentro del intervalo (", numMin, "-", numMax, ")."
	
FinAlgoritmo
