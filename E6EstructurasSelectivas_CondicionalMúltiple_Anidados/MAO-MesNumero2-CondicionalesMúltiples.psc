//EJERCICIO MESES
//Ingresar un n�mero del 1 ? 12 y mostrar el mes del a�o que corresponde, si el n�mero
//ingresado no es correcto mostrar un "mensaje de error"

Algoritmo mesNombre
	Definir mesNumero Como Caracter //Va caracter porque en la l�nea 11 se est� colocando "comillas"
	Escribir "Ingrese el n�mero de acuerdo al mes (1 al 12): "
	Leer mesNumero
	
	Segun mesNumero Hacer
		"1":
			Escribir "El mes seleccionado es Enero"
		"2":
			Escribir "El mes seleccionado es Febrero"
		"3":
			Escribir "El mes seleccionado es Marzo"
		De Otro Modo:
			Escribir "El n�mero ingresado no est� en la lista de meses"
	Fin Segun
		
FinAlgoritmo







