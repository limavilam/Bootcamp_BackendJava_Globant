//Una verduler�a ofrece las manzanas con descuento seg�n la siguiente tabla:
//Determinar cu�nto pagar� una persona que compre manzanas en esa verduler�a

Algoritmo tiendaManzanas
	
	Definir precioManzana como Real
	Definir kilosManzana como Real
	Definir descuentoManzana como Real
	Definir precioTotal como Real
	
	Escribir "Ingrese el precio del kilo de manzana : "
	Leer precioManzana
	
	Escribir "Ingrese el n�mero de kilos de manzana comprados : "
	Leer kilosManzana
	
	Si kilosManzana = 0 O kilosManzana <= 1.99  Entonces 
		precioTotal = precioManzana * kilosManzana
		Escribir "El precio de su compra es: ", precioTotal
	SiNo
		Si kilosManzana = 2 Entonces
			descuentoManzana = precioManzana * 0.10
			precioTotal = kilosManzana * (precioManzana - descuentoManzana)	
			Escribir "El precio de su compra es: ", precioTotal
			
		SiNo
			Si kilosManzana >= 2.01 O  kilosManzana <= 4.99   Entonces
				descuentoManzana = precioManzana * 0.15
				precioTotal = kilosManzana * (precioManzana - descuentoManzana)	
				Escribir "El precio de su compra es: ", precioTotal
				
			SiNo 
				Si kilosManzana >= 5  Entonces
					descuentoManzana = precioManzana * 0.20
					precioTotal = kilosManzana * (precioManzana - descuentoManzana)	
					Escribir "El precio de su compra es: ", precioTotal
				FinSi
			FinSi	
		FinSi			
	FinSi	
	
	Escribir "�Gracias por su compra!"
	
	
FinAlgoritmo