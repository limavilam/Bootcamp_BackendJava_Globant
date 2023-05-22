//EJERCICIO MESES
//Ingresar un número del 1 ? 12 y mostrar el mes del año que corresponde, si el número
//ingresado no es correcto mostrar un "mensaje de error"

Algoritmo mesNombre
	Definir mesNumero Como Caracter //Va caracter porque en la línea 11 se está colocando "comillas"
	Escribir "Ingrese el número de acuerdo al mes (1 al 12): "
	Leer mesNumero
	
	Segun mesNumero Hacer
		"1":
			Escribir "El mes seleccionado es Enero"
		"2":
			Escribir "El mes seleccionado es Febrero"
		"3":
			Escribir "El mes seleccionado es Marzo"
		De Otro Modo:
			Escribir "El número ingresado no está en la lista de meses"
	Fin Segun
		
FinAlgoritmo







