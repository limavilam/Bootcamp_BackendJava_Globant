Algoritmo notaAlgoritmos
	Definir n_datos como Real
	Definir acum como Real
	Definir contador como Real
	Definir dato como Real
	Definir promedio_datos como Real
	
	Escribir "Ingrese la cantidad de datos de parciales a promediar:"
    Leer n_datos
    
    acum<-0
    
    Para contador<-1 Hasta n_datos Hacer   //contador inicia desde 1 porque si inicia desde 0 empieza a contar desde valor0, valor1, valor2...
        Escribir "Ingrese la nota obtenida en el parcial ",contador,":"
        Leer dato
        acum<-acum+dato
    FinPara
    
    promedio_datos <-acum/n_datos
	
    Definir calificacionExamenFinal Como Real
	Escribir "Ingrese la nota obtenida en el examen final:"
    Leer calificacionExamenFinal
	Definir calificacionTrabajoFinal Como Real
	Escribir "Ingrese la nota obtenida en el trabajo final:"
    Leer calificacionTrabajoFinal
	Definir calificacionesParciales Como Real 
	Definir notaFinal como Real 
	
    calificacionesParciales <- promedio_datos * 0.55
	calificacionExamenFinal <- calificacionExamenFinal * 0.30
	calificacionTrabajoFinal <- calificacionTrabajoFinal * 0.15
	notaFinal <- calificacionesParciales + calificacionExamenFinal + calificacionTrabajoFinal
	
	Escribir "La nota obtenida en la materia algoritmos es:" , notaFinal
	
	
FinAlgoritmo