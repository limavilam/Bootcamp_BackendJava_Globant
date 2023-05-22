//EJERCICIO NUMERO MAYOR
//Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
//mayor número ingresado.

Algoritmo numeroMayor
	
	Definir num Como Entero
	Definir numeroMaximo Como Entero
	Definir i Como Entero
	

	numeroMaximo <- 0 //se usa para almacenar el número mayor que se ha ingresado hasta ese momento.
	num <- 0 //Cantidad de iteraciones
	
	Escribir "Cuantos numeros desea ingresar: "
	Leer num
	
	Para i = 0 Hasta num-1 //LLega hasta el valor que ingreso el usuario, se le resta 1 dado que comienza a contar desde cero.
		Escribir "Ingrese un numero entero positivo"
		Leer num
		Si num > numeroMaximo
			numeroMaximo = num
		FinSi
	Fin Para
	
	Escribir "El numero mayor ingresado es ", numeroMaximo
	
FinAlgoritmo
