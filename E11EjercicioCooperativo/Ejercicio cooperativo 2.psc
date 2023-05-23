// Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
//deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
//resultados.

Algoritmo contarDigitos
	
    Definir numero1 como Entero
	Definir digito como Entero
	Definir contador como Entero
	
    Escribir "Ingrese un n�mero entero positivo:"
    Leer numero1
	
    contador <- 0
	Mientras numero1 > 0  Hacer
		
		//digito = trunc(numero1 MOD 10) podr�a no ir
        numero1 = trunc(numero1/10)
        contador = contador + 1
		
	Fin Mientras
	
    Escribir "El n�mero ingresado tiene ", contador, " d�gitos." 
	
FinAlgoritmo