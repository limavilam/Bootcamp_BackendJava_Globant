// Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener el n�mero
//invertido. Ejemplo, si se introduce 23 que muestre 32.

Algoritmo numerosInvertidos
	
    Definir num, unidades, decenas, numInvertido Como Real
	Escribir "Ingrese un n�mero de dos cifras:"
    Leer num
    
    unidades <- num MOD 10
    decenas <- TRUNC (num / 10)
    numInvertido <- (unidades * 10) + decenas //se le suman las unidades
    
    Escribir "El n�mero invertido de " num, " es: "
	Escribir numInvertido
    
FinAlgoritmo