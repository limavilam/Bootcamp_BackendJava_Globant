//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
//igual a 70; y reprueba en caso contrario.

Algoritmo Promedio
	Definir n_datos como Real
	Definir acum como Real
	Definir contador como Real
	Definir dato como Real
	Definir promedioDatos como Real
	
	Escribir "Ingrese la cantidad de datos a promediar:"
    Leer n_datos
    
    acum<-0
    
    Para contador<-1 Hasta n_datos Hacer   //contador inicia desde 1 porque si inicia desde 0 empieza a contar desde valor0, valor1, valor2...
        Escribir "Ingrese las notas obtenidas en un rango de 10 a 100 de calificación", "(Nota " contador "):" //cuenta el número de notas ingresadas
        Leer dato
        acum<-acum+dato
    FinPara
    
    promedioDatos <-acum/n_datos
	
	Escribir "El promedio de sus notas es:" , promedioDatos
	
	Si promedioDatos >=70 Entonces
		Escribir "Usted aprobo la materia"
	SiNo
		Escribir "Usted no aprobo la materia"
	Fin Si
FinAlgoritmo