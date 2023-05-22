//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,...,-1; realizar un programa que calcule el promedio de
//los números ingresados. Suponemos que el usuario no insertará número negativos.

Algoritmo promedio_secuencia
	
    //Declaración de variables
    Definir num, suma, contador Como Entero
    Definir promedio Como Real
    
    //Inicialización de variables
    suma <- 0 //se almace los números ingresados
    contador <- 0 // cuenta los número ingresados
    
    //Solicitud de números hasta ingresar -1
    Escribir "Ingrese una secuencia de números enteros positivos (finalice con -1):"
    Leer num
    
    Mientras num <> -1 Hacer
        suma = suma + num
        contador = contador + 1
        Leer num
    FinMientras
    
    //Cálculo del promedio y muestra por pantalla
    Si contador > 0 Entonces
        promedio = suma / contador
        Escribir "El promedio de la secuencia ingresada es: ", promedio
    SiNo
        Escribir "No se ingresaron números válidos."
    FinSi
    
FinAlgoritmo
