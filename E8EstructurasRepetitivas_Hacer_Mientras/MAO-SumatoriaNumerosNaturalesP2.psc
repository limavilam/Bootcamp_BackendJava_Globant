//sumatoria de los N primeros n�meros enteros mayores que cero.

Algoritmo numerosNaturales
	
	Definir num, suma, i Como Entero
	
	//el bucle continua en ejecuci�n hasta que se reemplace por un entero positivo.
	Hacer
		Escribir "Ingrese un n�mero entero positivo"
		Leer num 
	Mientras Que num <=0
	
	suma = 0 //va a guardar el resultado.
	i = 1  //se denomina variable centinela porque se encuentra dentro de la expresi�n l�gica pero a su vez se modifica dentro del bloque de acciones.
	Mientras i <= num Hacer 
		suma = suma + i
		i = i + 1 //N�mero de iteraciones que yo seleccion�, fueron 3 al iniciar. 
	FinMientras
	
	Escribir "La suma de los ", num, " n�meros naturales es: " , suma
FinAlgoritmo

