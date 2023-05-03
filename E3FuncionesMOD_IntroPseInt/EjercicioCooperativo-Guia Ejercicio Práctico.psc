Algoritmo separarCifras
	Definir numeroIngresado, centenas, decenas, unidades, centenas1, decenas1, unidades1 como Real
    
    Escribir "Ingrese un número de 3 cifras:"
    Leer numeroIngresado
    
    centenas <- TRUNC(numeroIngresado / 100)
    decenas <- TRUNC((numeroIngresado MOD 100)/10)
    unidades <- TRUNC(numeroIngresado MOD 10)
    
	
	centenas1 <- numeroIngresado / 100
    decenas1 <- (numeroIngresado MOD 100)/10
    unidades1 <- numeroIngresado MOD 10
	
    Escribir "El número ingresado separado por cifras es:"
    Escribir "Centenas:", centenas
    Escribir "Decenas:", decenas
    Escribir "Unidades:", unidades
	
	Escribir "El número ingresado separado por cifras es:"
    Escribir "Centenas:", centenas1
    Escribir "Decenas:", decenas1
    Escribir "Unidades:", unidades1
    
    
FinAlgoritmo
