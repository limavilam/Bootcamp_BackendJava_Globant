//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea
//saber cuánto deberá pagar finalmente por su compra.

Algoritmo ventasDescuento
	Definir valorBase Como Real
	Definir precioDescuento Como Real
	Definir precioFinal Como Real
		
	Escribir "Ingrese el valor total de la compra: " 
	Leer valorBase
	
	precioDescuento <- valorBase * 0.15
	precioFinal <- valorBase - precioDescuento
		
	escribir "El valor del descuento es: ", precioDescuento
	escribir "El valor total de la compra es: ", precioFinal
	
	
FinAlgoritmo