//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.

Algoritmo porcentaje_genero
	
	Definir numero_de_estudiantes_femininas Como Entero
	escribir "Ingrese el n�mero de ni�as que tiene el curso: "
	leer numero_de_estudiantes_femininas
	Definir numero_de_estudiantes_masculinos Como Entero
	escribir "Ingrese el n�mero de ni�os que tiene el curso: "
	leer numero_de_estudiantes_masculinos
	Definir numero_estudiantes Como Entero
	Definir porcentaje_femeninas Como Real
	Definir porcentaje_masculinos Como Real
	
	
	numero_estudiantes = numero_de_estudiantes_femininas + numero_de_estudiantes_masculinos
	porcentaje_femeninas = (numero_de_estudiantes_femininas * 100) / numero_estudiantes
	porcentaje_masculinos = (numero_de_estudiantes_masculinos * 100) / numero_estudiantes
	
	escribir "El porcentaje de ni�as en el curso es ", porcentaje_femeninas , " % "
	escribir "El porcentaje de ni�os en el curso es ", porcentaje_masculinos , " % "
	
FinAlgoritmo
