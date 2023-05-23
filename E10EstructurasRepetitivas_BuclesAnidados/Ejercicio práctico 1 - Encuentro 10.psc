//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
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
		
		Escribir "Ingrese el n�mero de ventas: "
		Leer numeroVentas
		
		//Debo reinicar las variables acumuladores que uses en el ciclo m�s interno
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
