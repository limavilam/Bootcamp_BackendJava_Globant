//condicionales m�ltiples: ejercicio Cine

Algoritmo cine
	Definir opinion como entero 
	Escribir "Clasifique la pel�cula de 1 a 5 estrellas"
	Leer opinion
	
	Segun opinion Hacer
		1,2:
			Escribir "Nos sentimos apenados que no hayas disfrutado la peli"
		3:
			Escribir "Has calificado la peli como buena"
		4:
			Escribir "Has calificado la peli como muy buena"
		5:
			Escribir "Fantastico que hayas disfrutado un excelente entretenimiento "
			
		De Otro Modo:
			Escribir "El valor ", opinion, " no es valida y no se tomara en cuenta"
	Fin Segun
	
	Escribir  "Hasta la pr�xima"
	
FinAlgoritmo