//Construir un programa que simule un men� de opciones para realizar las cuatro
//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//?M? o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.

Algoritmo calculadoraAritmetica
	Definir num1 como Entero 
	Definir num2 Como Entero
	
	Escribir "Ingrese el n�mero A de la operaci�n"
	Leer num1
	Escribir "Ingrese el n�mero B de la operaci�n"
	Leer num2
	
	Definir operacion Como Caracter
	Escribir "Desea realizar qu� tipo de operaci�n Suma (S o s), Resta (R o r), Multiplicaci�n (M o m) o Division (D o d)"
	Leer operacion
	
	Definir sumaOperacion Como Entero
	Definir restaOperacion Como Entero
	Definir multiplicacionOperacion Como Entero
	Definir divisionOperacion Como Real
		
	Segun operacion Hacer
		"S" o "s": 
			sumaOperacion <- num1 + num2
			Escribir "La suma para los n�meros A y B es: ", sumaOperacion
		"R" o "r": 
			restaOperacion <- num1 - num2
			Escribir "La suma para los n�meros A y B es: ", restaOperacion
		"M" o "m": 
			multiplicacionOperacion <- num1 * num2
			Escribir "La suma para los n�meros A y B es: ", multiplicacionOperacion
		"D" o "d": 
			divisionOperacion <- num1 / num2
			Escribir "La suma para los n�meros A y B es: ", divisionOperacion
			
		De Otro Modo:
			Escribir "No se reconoce esa operaci�n que deseas realizar"
	Fin Segun
	
	Escribir  "Hasta la pr�xima"
	
FinAlgoritmo