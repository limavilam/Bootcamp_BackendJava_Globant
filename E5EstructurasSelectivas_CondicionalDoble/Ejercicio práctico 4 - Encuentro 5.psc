// Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
//es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
//programa mostrará después la frase final. Nota: investigar la función Longitud() y
//Concatenar() de PseInt.

Algoritmo numCaracteres
	
	Definir palabra como Caracter	
	Escribir "Ingrese frases o palabras: "
	Leer palabra
	
	Si Longitud(palabra) = 4 Entonces
		Escribir "La palabra o frase final queda así: " concatenar(palabra, "!")
	Sino
		Escribir "La palabra o frase final queda así: " concatenar(palabra, "?")
	FinSi
	
FinAlgoritmo