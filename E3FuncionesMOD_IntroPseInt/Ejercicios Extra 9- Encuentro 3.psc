// Un vendedor recibe un sueldo base m�s un 10% extra por comisi�n de sus ventas, el
//vendedor desea saber cu�nto dinero obtendr� por concepto de comisiones por las tres
//ventas que realiza en el mes y el total que recibir� en el mes tomando en cuenta su
//sueldo base y comisiones.

Algoritmo sueldoComision
	Definir sueldoBase Como Real
	Definir numeroVentas Como Real
	Definir n_datos como Real
	Definir acum como Real
	Definir contador como Real
	Definir dato como Real
	Definir sumaComision como Real
	
	Escribir "Ingrese el sueldo base del empleado: " 
	Leer sueldoBase
	
	Escribir "Ingrese la cantidad de ventas que realizo el empleado: "
    Leer n_datos
	
	acum<-0
    
    Para contador<-1 Hasta n_datos Hacer   //contador inicia desde 1 porque si inicia desde 0 empieza a contar desde valor0, valor1, valor2...
        Escribir "Ingrese el valor de la venta",contador,":"
        Leer dato
        acum<-acum+dato
    FinPara
	
	sumaComision <-acum
	
	Definir comision Como Real
	Definir sueldoFinal Como Real
	
	comision <- sumaComision * 0.10
	sueldoFinal <- comision + sueldoBase
	
	escribir "La comisi�n del vendedor al final del mes es: ", sumaComision
	escribir "El sueldo del vendedor al final del mes con comisi�n del 10% es: ", sueldoFinal 
	
	
FinAlgoritmo