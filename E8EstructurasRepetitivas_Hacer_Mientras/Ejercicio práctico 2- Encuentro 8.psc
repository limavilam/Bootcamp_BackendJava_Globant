//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
//numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable. Si es
//mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el máximo entre
//estos números será 5. Si luego ingreso el número 2, se evalúa 2>5 lo que resultará falso y por lo
//tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica similar tendrá el número menor.
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
	