//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//?M? o ?m? para la multiplicación y ?D? o ?d? para la división.

Algoritmo calculadoraAritmetica
	Definir num1 como Entero 
	Definir num2 Como Entero
	
	Escribir "Ingrese el número A de la operación"
	Leer num1
	Escribir "Ingrese el número B de la operación"
	Leer num2
	
	Definir operacion Como Caracter
	Escribir "Desea realizar qué tipo de operación Suma (S o s), Resta (R o r), Multiplicación (M o m) o Division (D o d)"
	Leer operacion
	
	Definir sumaOperacion Como Entero
	Definir restaOperacion Como Entero
	Definir multiplicacionOperacion Como Entero
	Definir divisionOperacion Como Real
		
	Segun operacion Hacer
		"S" o "s": 
			sumaOperacion <- num1 + num2
			Escribir "La suma para los números A y B es: ", sumaOperacion
		"R" o "r": 
			restaOperacion <- num1 - num2
			Escribir "La suma para los números A y B es: ", restaOperacion
		"M" o "m": 
			multiplicacionOperacion <- num1 * num2
			Escribir "La suma para los números A y B es: ", multiplicacionOperacion
		"D" o "d": 
			divisionOperacion <- num1 / num2
			Escribir "La suma para los números A y B es: ", divisionOperacion
			
		De Otro Modo:
			Escribir "No se reconoce esa operación que deseas realizar"
	Fin Segun
	
	Escribir  "Hasta la próxima"
	
FinAlgoritmo