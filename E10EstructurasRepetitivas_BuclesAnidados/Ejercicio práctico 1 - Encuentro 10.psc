//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
//cada venta.


Algoritmo ventas
	// Definir ciclo uno para el numero de empleados
	//Dentro del ciclo anterior crear otro ciclo para el numero de ventas y obtener el valor de cada venta
	
	//ciclo1
	Definir i Como Entero
	Definir numeroVendedores Como Entero
	Definir nombreVendedores Como Caracter
	Definir sueldoBase Como Real
	
	//ciclo2
	Definir j Como Entero
	Definir numeroVentas Como Entero
	Definir valorVentas Como Real
	Definir comision Como Real
	Definir acumuladorComisiones Como Real
	
	Escribir "Ingrese la cantidad de vendedores: "
	Leer numeroVendedores 
	
	Para i<-1 Hasta numeroVendedores Con Paso 1 Hacer
		Escribir "Ingrese el nombre del vendedor " , i, ":"
		Leer nombreVendedores
		Escribir "Ingrese el valor del sueldo base: "
		Leer sueldoBase
		
		Escribir "Ingrese el número de ventas: "
		Leer numeroVentas
		
		//Debo reinicar las variables acumuladores que uses en el ciclo más interno
		acumuladorComisiones <- 0
		
		Para j <-1 Hasta numeroVentas Con Paso 1 Hacer
			Escribir "Ingrese el valor de la venta: ", j , ":"
			Leer valorVentas
			comision <- valorVentas * 0.1
			acumuladorComisiones <- acumuladorComisiones + comision
			
		Fin Para
			
	Escribir "El valor de las comisiones para el vendedor ", nombreVendedores, " es:" , acumuladorComisiones
	Escribir "El sueldo total del vendedor ", nombreVendedores , " es :" , sueldoBase + acumuladorComisiones
	
	Fin Para
	
	
FinAlgoritmo
