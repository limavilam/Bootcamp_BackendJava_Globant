//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//bisiesto. Nota: recuerde la función mod de PseInt

Algoritmo bisiesto
	
	Definir numeroFecha como Real
		
	Escribir "Ingrese el año que quiere determinar si es bisiesto : "
	Leer numeroFecha
	
	Si numeroFecha MOD 4 = 0 Y numeroFecha MOD 100 <> 0  Entonces 
		Escribir "El año ", numeroFecha, " es bisiesto"
	SiNo
		Si numeroFecha MOD 100 = 0 Y numeroFecha MOD 400 = 0 Entonces
			Escribir "El año ", numeroFecha, " es bisiesto"
		SiNo 
			Escribir "El año no es bisiesto"
			
		FinSi			
	FinSi	
	

FinAlgoritmo