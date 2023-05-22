//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.

Algoritmo notasPromedio
	
	Definir nota1 como Real
	Definir nota2 como Real
	Definir nota3 como Real
	Definir nota4 como Real
	Definir promedioNotas como Real 
	Definir notaEliminada como Real
	
	Escribir "Ingrese la primera nota: "
	Leer nota1
	Escribir "Ingrese la segunda nota: "
	Leer nota2
	Escribir "Ingrese la tercera nota: "
	Leer nota3
	Escribir "Ingrese la cuarta nota: "
	Leer nota4
	
	Si nota1 < nota2 Y nota1 < nota3 Y nota1 < nota4 Entonces 
		notaEliminada = nota1
		
	SiNo
		Si nota2 < nota1 Y nota2 < nota3 Y nota2 < nota4 Entonces
			notaEliminada = nota2
			
		SiNo
			
			Si nota3 < nota1 Y nota3 < nota2 Y nota3 < nota4 Entonces
				notaEliminada = nota3
				
			SiNo 
				Si nota4 < nota1 Y nota4 < nota2 Y nota4 < nota3 Entonces
					notaEliminada = nota4
				FinSi
			FinSi	
		FinSi			
	FinSi	
	
	promedioNotas = (nota1 + nota2 + nota3 + nota4 - notaEliminada)/3 
	
	Escribir "El promedio de sus notas es : ", promedioNotas
	Escribir "La nota eliminada es: " , notaEliminada 
	

FinAlgoritmo