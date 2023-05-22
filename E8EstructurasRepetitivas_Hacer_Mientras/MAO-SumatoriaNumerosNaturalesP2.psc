//sumatoria de los N primeros números enteros mayores que cero.

Algoritmo numerosNaturales
	
	Definir num, suma, i Como Entero
	
	//el bucle continua en ejecución hasta que se reemplace por un entero positivo.
	Hacer
		Escribir "Ingrese un número entero positivo"
		Leer num 
	Mientras Que num <=0
	
	suma = 0 //va a guardar el resultado.
	i = 1  //se denomina variable centinela porque se encuentra dentro de la expresión lógica pero a su vez se modifica dentro del bloque de acciones.
	Mientras i <= num Hacer 
		suma = suma + i
		i = i + 1 //Número de iteraciones que yo seleccioné, fueron 3 al iniciar. 
	FinMientras
	
	Escribir "La suma de los ", num, " números naturales es: " , suma
FinAlgoritmo

