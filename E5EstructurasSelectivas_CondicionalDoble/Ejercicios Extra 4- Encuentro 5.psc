// La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
//de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
//de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
//regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
//cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
//40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
//de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y
//el total a pagar por el cliente.


Algoritmo empresaAlquiler
	
	Definir horasUso Como Entero
	Definir minutosUso Como Entero
	Definir totalUso Como Entero
	Definir gasolinaGastada Como Entero
	Definir pagoTotal Como Real 
	

	Escribir "Ingrese la cantidad de horas de uso del carro:"
	Leer horasUso
	Escribir "Ingrese la cantidad de minutos de uso del carro:"
	Leer minutosUso
	
	totalUso <- (horasUso * 60) + minutosUso
	
	Si totalUso <= 120 Entonces
		Escribir "El valor a pagar es de $400 pesos y la gasolina va de regalo."
	Sino
		Escribir "Ingrese la cantidad de litros de gasolina gastada:"
		Leer gasolinaGastada
		pagoTotal <- (gasolinaGastada * 40) + (totalUso * 5.2 / 60)
		Escribir "El valor a pagar es de $", pagoTotal, " pesos."
		
	FinSi
	
FinAlgoritmo
