//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
//numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable. Si es
//mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el m�ximo entre
//estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2>5 lo que resultar� falso y por lo
//tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica similar tendr� el n�mero menor.
Algoritmo ejercicio2
	Definir num Como Entero
	Definir suma Como Entero
	Definir numeroMinimo Como Entero
	Definir numeroMaximo Como Entero
	Definir totalNums Como Entero
	
	suma <- 0
	totalNums <- 0

	// Aqui comenzamos a definir el cilo el cual perdira ingresar un valor mientras que sea diferente de cero
	Repetir
		Escribir "Ingrese un numero entero positivo"
		Leer num
		si totalNums == 0
			numeroMaximo = num
			numeroMinimo = num
		FinSi
		Si num <> 0
			suma = suma + num
			totalNums = totalNums + 1
			Si num > numeroMaximo
				numeroMaximo = num
			FinSi
			Si num < numeroMinimo
				numeroMinimo = num
			FinSi
		FinSi
	Mientras Que num <> 0
	
	Escribir "Suma: ", suma
	Escribir "Promedio: ", suma/totalNums
	Escribir "Numero maximo: ", numeroMaximo
	Escribir "Numero minimo: ", numeroMinimo
FinAlgoritmo
	