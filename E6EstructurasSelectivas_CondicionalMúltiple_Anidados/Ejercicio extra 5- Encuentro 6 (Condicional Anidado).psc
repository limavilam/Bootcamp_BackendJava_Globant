//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//bisiesto. Nota: recuerde la funci�n mod de PseInt

Algoritmo bisiesto
	
	Definir numeroFecha como Real
		
	Escribir "Ingrese el a�o que quiere determinar si es bisiesto : "
	Leer numeroFecha
	
	Si numeroFecha MOD 4 = 0 Y numeroFecha MOD 100 <> 0  Entonces 
		Escribir "El a�o ", numeroFecha, " es bisiesto"
	SiNo
		Si numeroFecha MOD 100 = 0 Y numeroFecha MOD 400 = 0 Entonces
			Escribir "El a�o ", numeroFecha, " es bisiesto"
		SiNo 
			Escribir "El a�o no es bisiesto"
			
		FinSi			
	FinSi	
	

FinAlgoritmo