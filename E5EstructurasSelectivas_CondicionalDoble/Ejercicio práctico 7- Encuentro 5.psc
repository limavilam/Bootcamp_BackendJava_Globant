//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una A. Si la primera letra es una A, se deber� de imprimir un mensaje por pantalla
//que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO". Nota:
//investigar la funci�n Subcadena de PseInt.
//Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
//primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
//"INCORRECTO".

Algoritmo palabrasConMayusoMinus
	
	Definir palabra como Cadena
	Escribir "Ingrese frases o palabras: "
	Leer palabra
	
	Si subcadena(palabra,0,0) = subcadena(palabra,Longitud(palabra)-1,Longitud(palabra)-1) Entonces
		Escribir "CORRECTO"
	Sino
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo

