//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
//continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
//m�ximo y m�nimo. Cada vez que un n�mero se encuentre entre ese intervalo, se sumara
//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
//n�meros ingresados dentro del intervalo.

Algoritmo maxMin
	
	Definir numMin como Entero
	Definir numMax como Entero 
	Definir num1 como Entero
	Definir contador como Entero 
		
	Escribir "Ingrese el n�mero entero m�nimo: "
	Leer numMin
	
	Escribir "Ingrese el n�mero entero m�ximo: "
	Leer numMax
	
	contador <- 0
	
	Escribir "Ingrese un n�mero entre ", numMin, " y ", numMax, " (o escriba un n�mero fuera de ese intervalo para terminar):"
    Leer num1
	
	Mientras num1 >= numMin Y  num1 <= numMax Hacer
		contador = contador + 1
		Escribir "Por favor ingrese otro n�mero"
		Leer num1
	Fin Mientras
	
	Escribir "Se ingresaron ", contador, " n�meros dentro del intervalo (", numMin, "-", numMax, ")."
	
FinAlgoritmo
