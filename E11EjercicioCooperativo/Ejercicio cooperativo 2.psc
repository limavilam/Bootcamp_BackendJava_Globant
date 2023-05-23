// Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.

Algoritmo contarDigitos
	
    Definir numero1 como Entero
	Definir digito como Entero
	Definir contador como Entero
	
    Escribir "Ingrese un número entero positivo:"
    Leer numero1
	
    contador <- 0
	Mientras numero1 > 0  Hacer
		
		//digito = trunc(numero1 MOD 10) podría no ir
        numero1 = trunc(numero1/10)
        contador = contador + 1
		
	Fin Mientras
	
    Escribir "El número ingresado tiene ", contador, " dígitos." 
	
FinAlgoritmo