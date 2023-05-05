//Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
//usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje
//por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
//"INCORRECTO". Nota: investigar la función Longitud() de PseInt.

Algoritmo numCaracteres
	
	Definir palabra como Caracter	
	Escribir "Ingrese frases o palabras de 6 caracteres: "
	Leer palabra
	
	Definir numeroPalabras como Entero
	
	numeroPalabras <- longitud (palabra)
	
	Si numeroPalabras = 6 Entonces
		Escribir "CORRECTO"
	Sino
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo

///otra manera de hacerlo
//Algoritmo SeisCaracteres
	
	//Definir palabra como caracter
	//Escribir "Ingrese una frase o palabra de 6 caracteres: "
	//Leer palabra
	
	//Si Longitud(palabra) = 6 Entonces
		//Escribir "CORRECTO"
	//Sino
		//Escribir "INCORRECTO"
	//FinSi
	
//FinAlgoritmo
