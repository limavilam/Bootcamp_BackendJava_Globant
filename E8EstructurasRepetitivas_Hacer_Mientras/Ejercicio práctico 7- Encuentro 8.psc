//Programar un juego donde la computadora elige un n�mero al azar entre 1 y 10, y a
//continuaci�n el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//1�) El programa elige al azar un n�mero n entre 1 y 10.
//2�) El usuario ingresa un n�mero x.
//3�) Si x no es el n�mero exacto, el programa indica si n es m�s grande o m�s peque�o que el n�mero ingresado.
//4�) Repetimos desde 2) hasta que x sea igual a n.
//El programa tiene que imprimir los mensajes adecuados para informarle al usuario qu�
//hacer y qu� pas� hasta que adivine el n�mero.
//NOTA: Para generar un n�mero aleatorio entre 1 y 10 se puede utilizar la funci�n
//Aleatorio(limite_inferior, limite_superior) de PseInt.

Algoritmo juegoAleatorios
	
	Definir numAleatorio Como Entero
	Definir numUsuario Como Entero
	
	numAleatorio <- Aleatorio(1,10)
	
	Escribir "�Bienvenido al juego de adivinar n�meros!"
    Escribir "La computadora ha elegido un n�mero entre 1 y 10. Adivinalo!!!!"
	
	Repetir
		
		Escribir "Ingresa el n�mero: "
		Leer numUsuario
		
		Si numUsuario > numAleatorio
			Escribir "El n�mero ingresado es mayor al n�mero aleatorio"
		SiNo
			Escribir "El n�mero ingresado es menor al n�mero aleatorio"
		FinSi
		
	Mientras Que numAleatorio <> numUsuario
	Escribir "�Felicidades! �Has adivinado el n�mero ", numAleatorio, "!"
	
FinAlgoritmo