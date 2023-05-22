//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//llantas que compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo precioLlantas
	
	Definir llantasCompradas como Real
	Definir precioIndividual como Real
	Definir totalCompra como Real
	
	Escribir "Ingrese la cantidad de llantas compradas : "
	Leer llantasCompradas
	
	Si llantasCompradas < 5 Entonces 
		precioIndividual = 3000
			
	SiNo
		Si llantasCompradas >= 5 Y llantasCompradas <= 10 Entonces //No es O porque tendría o una cosa o la otra y como ya tengo >=5
			precioIndividual = 2500
						
		SiNo
			precioIndividual = 2000
		FinSi			
	FinSi	
	
	totalCompra = llantasCompradas * precioIndividual
	Escribir "El precio de su compra es: ", totalCompra
	Escribir "El precio individual de la llanta es: " , precioIndividual
	Escribir "¡Gracias por su compra!"
	
	
FinAlgoritmo