// Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
//es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
//programa mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y
//Concatenar() de PseInt.

Algoritmo numCaracteres
	
	Definir palabra como Caracter	
	Escribir "Ingrese frases o palabras: "
	Leer palabra
	
	Si Longitud(palabra) = 4 Entonces
		Escribir "La palabra o frase final queda as�: " concatenar(palabra, "!")
	Sino
		Escribir "La palabra o frase final queda as�: " concatenar(palabra, "?")
	FinSi
	
FinAlgoritmo