// Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir� al
//usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
//mostrar un mensaje por pantalla indic�ndolo.


Algoritmo comparacionSueldos
	Definir sueldoEmpleado Como Entero
	Escribir "Ingrese su salario: "
	Leer sueldoEmpleado
	
	Definir sueldoMinimo Como Entero
	sueldoMinimo = 1200
	
	
	Si sueldoEmpleado > sueldoMinimo Entonces
		Escribir "Su salario de : ", sueldoEmpleado, " es mayor al m�nimo" 
	SiNo
		Escribir "Su salario es menor al m�nimo"
	Fin Si
FinAlgoritmo
