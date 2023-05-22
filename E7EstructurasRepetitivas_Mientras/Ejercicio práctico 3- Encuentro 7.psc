//Dada una secuencia de n�meros ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,...,-1; realizar un programa que calcule el promedio de
//los n�meros ingresados. Suponemos que el usuario no insertar� n�mero negativos.

Algoritmo promedio_secuencia
	
    //Declaraci�n de variables
    Definir num, suma, contador Como Entero
    Definir promedio Como Real
    
    //Inicializaci�n de variables
    suma <- 0 //se almace los n�meros ingresados
    contador <- 0 // cuenta los n�mero ingresados
    
    //Solicitud de n�meros hasta ingresar -1
    Escribir "Ingrese una secuencia de n�meros enteros positivos (finalice con -1):"
    Leer num
    
    Mientras num <> -1 Hacer
        suma = suma + num
        contador = contador + 1
        Leer num
    FinMientras
    
    //C�lculo del promedio y muestra por pantalla
    Si contador > 0 Entonces
        promedio = suma / contador
        Escribir "El promedio de la secuencia ingresada es: ", promedio
    SiNo
        Escribir "No se ingresaron n�meros v�lidos."
    FinSi
    
FinAlgoritmo
