//Una empresa tiene personal de distintas �reas con distintas condiciones de contrataci�n y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//a) comisi�n
//b) salario fijo + comisi�n, y
//c) salario fijo
//	a) Para la modalidad salario por comisi�n se debe ingresar el monto total de las ventas
//realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//empleado.
//b) Para la condici�n de salario fijo + comisi�n, se debe ingresar el valor que se paga por
//hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//esa semana. En este tipo de contrato las horas extras no est�n contempladas y se fija
//como m�ximo 40 horas por semana. La comisi�n por las ventas se calcula como 25%
//del valor de venta total.
//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga
//por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las
//40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor
//de la hora. Realizar un men� de opciones para poder elegir el tipo de contrato que
//tiene un empleado.

Algoritmo sueldoDeLaSemana
	Definir tipoSueldo Como Caracter
	Definir sueldoBase Como Real
	Definir horasTrabajadas Como Entero
	Definir ventasComision Como Real
	Definir sueldoTotal Como Real
	
	Escribir "Ingrese el tipo de sueldo: "
	Escribir "A. Comisi�n"
	Escribir "B. Salario fijo + comisi�n"
	Escribir "C. Salario fijo"
	Leer tipoSueldo
	
	Si tipoSueldo = "A" Entonces
		Escribir "Ingrese el total de las ventas en la semana: "
		Leer ventasComision
		sueldoBase = ventasComision * 0.4
		Escribir "El sueldo semanal para el empleado que comisiona es : ", sueldoBase
	SiNo
		Si tipoSueldo = "B" Entonces
			Escribir "Ingrese el valor que se paga por hora: "
			Leer sueldoBase
			Escribir "Ingrese la cantidad de horas trabajadas en la semana: "
			Leer horasTrabajadas
			Escribir "Ingrese el total de las ventas realizadas en la semana: "
			Leer ventasComision
			
			si horasTrabajadas > 40 Entonces
				horasTrabajadas = 40
			FinSi
			sueldoTotal = sueldoBase * horasTrabajadas + ventasComision * 0.25
			Escribir "El salario semanal del empleado es: ", sueldoTotal
			
		SiNo
			Si tipoSueldo = "C" Entonces
				Escribir "Ingrese el valor que se paga por hora: "
				Leer sueldoBase
				Escribir "Ingrese el n�mero de horas trabajadas en la semana: "
				Leer horasTrabajadas
				
				Si horasTrabajadas > 40 Entonces
					sueldoTotal = (40 * sueldoBase) + ((horasTrabajadas- 40) * sueldoBase * 0.5)
				SiNo
					sueldoTotal = sueldoBase * horasTrabajadas
				FinSi
				Escribir "El salario semanal del empleado es: ", sueldoTotal
			SiNo
				Escribir "Opci�n no v�lida"
			FinSi
		FinSi
	FinSi

FinAlgoritmo
