Algoritmo Promedio
	Definir n_datos como Real
	Definir acum como Real
	Definir contador como Real
	Definir dato como Real
	Definir promedio_datos como Real
	
	Escribir "Ingrese la cantidad de datos a promediar:"
    Leer n_datos
    
    acum<-0
    
    Para contador<-1 Hasta n_datos Hacer   //contador inicia desde 1 porque si inicia desde 0 empieza a contar desde valor0, valor1, valor2...
        Escribir "Ingrese el valor del ítem del establecimiento ",contador,":"
        Leer dato
        acum<-acum+dato
    FinPara
    
    promedio_datos <-acum/n_datos
    
    Escribir "El promedio del ítem en los establecimientos es: ",promedio_datos
FinAlgoritmo
