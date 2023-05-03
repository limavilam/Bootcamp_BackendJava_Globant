// Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
//usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
//mostrar un mensaje por pantalla indicándolo.


Algoritmo comparacionSueldos
	Definir sueldoEmpleado Como Entero
	Escribir "Ingrese su salario: "
	Leer sueldoEmpleado
	
	Definir sueldoMinimo Como Entero
	sueldoMinimo = 1200
	
	
	Si sueldoEmpleado > sueldoMinimo Entonces
		Escribir "Su salario de : ", sueldoEmpleado, " es mayor al mínimo" 
	SiNo
		Escribir "Su salario es menor al mínimo"
	Fin Si
FinAlgoritmo
