//Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la funci�n trunc().

Algoritmo ContarDigitos
    Definir numero1, digito, contador como Entero
    Escribir "Ingrese un n�mero entero positivo:"
    Leer numero
    contador = 0
    mientras numero1 > 0 hacer
        digito = trunc(numero1%10)
        numero1 = trunc(numero1/10)
        contador = contador + 1
    fin mientras
    Escribir "El n�mero tiene ", contador, " d�gitos."
FinAlgoritmo