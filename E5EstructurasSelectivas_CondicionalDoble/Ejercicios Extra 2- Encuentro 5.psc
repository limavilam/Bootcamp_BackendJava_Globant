//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo ventasDescuento
	Definir mesCompra Como Caracter
	Definir valorBase Como Real
	Definir precioDescuento Como Real
	Definir precioFinal Como Real
	
	Escribir "Ingrese el mes que hizo la compra: " 
	Leer mesCompra
	
	Escribir "Ingrese el valor total de la compra: " 
	Leer valorBase
	
	Si mesCompra = "septiembre" O mesCompra = "Septiembre" O mesCompra = "octubre" O mesCompra = "Octubre" O mesCompra = "noviembre" O mesCompra = "Noviembre" Entonces
		precioDescuento <- valorBase * 0.10
		precioFinal <- valorBase - precioDescuento
		Escribir "El valor del descuento es: ", precioDescuento
		Escribir "El precio final de la compra es: " , precioFinal
	SiNo
		Escribir "Este mes no tuvo descuento de la compra" 
	Fin Si

	
FinAlgoritmo
