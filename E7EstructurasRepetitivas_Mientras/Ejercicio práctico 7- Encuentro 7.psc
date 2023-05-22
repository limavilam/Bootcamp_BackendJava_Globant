Algoritmo calificaciones_alumnos
	
	//Declaración de variables
	Definir nombre como Cadena
	Definir nota_practica como Real
	Definir nota_problemas como Real
	Definir nota_teoria como Real
	Definir nota_final como Real
	
	//Inicio del ciclo para ingresar las notas de los alumnos
	mientras Verdadero hacer
		//Lectura del nombre del alumno
		Escribir "Ingrese el nombre del alumno (dejar en blanco para terminar): "
		Leer nombre
		
		//Salida del ciclo si se deja el nombre en blanco
		si nombre = "" entonces
			Escribir "Ha terminado la carga de calificaciones."
		fin si
		
		//Lectura de las notas del alumno
		Escribir "Ingrese la nota de práctica del alumno (entre 0 y 10): "
		Leer nota_practica
		Escribir "Ingrese la nota de problemas del alumno (entre 0 y 10): "
		Leer nota_problemas
		Escribir "Ingrese la nota de teoría del alumno (entre 0 y 10): "
		Leer nota_teoria
		
		//Cálculo de la nota final
		si (nota_practica >= 0 y nota_practica <= 10) y (nota_problemas >= 0 y nota_problemas <= 10) y (nota_teoria >= 0 y nota_teoria <= 10) entonces
			nota_final <- (nota_practica * 0.1) + (nota_problemas * 0.5) + (nota_teoria * 0.4)
			Escribir "La nota final de ", nombre, " es: ", nota_final
		sino
			Escribir "Las notas deben estar entre 0 y 10. Inténtelo nuevamente."
		fin si
	fin mientras
	
FinAlgoritmo
