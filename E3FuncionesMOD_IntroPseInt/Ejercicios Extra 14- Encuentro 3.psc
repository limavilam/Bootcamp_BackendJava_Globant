// Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
//invertido. Ejemplo, si se introduce 23 que muestre 32.

Algoritmo numerosInvertidos
	
    Definir num, unidades, decenas, numInvertido Como Real
	Escribir "Ingrese un número de dos cifras:"
    Leer num
    
    unidades <- num MOD 10
    decenas <- TRUNC (num / 10)
    numInvertido <- (unidades * 10) + decenas //se le suman las unidades
    
    Escribir "El número invertido de " num, " es: "
	Escribir numInvertido
    
FinAlgoritmo