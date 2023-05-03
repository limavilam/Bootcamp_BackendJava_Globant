// Hacer un programa que calcule el salario de un empleado, si se descuenta el 20% de su salario bruto.

Algoritmo salarios
	Definir salarioBruto Como Real
	Definir descuento Como Real
	
	escribir "Ingrese el salario bruto del empleado: "
	leer salarioBruto
	
	Definir salarioReal Como Real
	
	descuento <- salarioBruto * 0.20
	salarioReal <- salarioBruto - descuento
		
	escribir "El salario del empleado aplicando el 20% de descuento es:  ", salarioReal
	
	
FinAlgoritmo
