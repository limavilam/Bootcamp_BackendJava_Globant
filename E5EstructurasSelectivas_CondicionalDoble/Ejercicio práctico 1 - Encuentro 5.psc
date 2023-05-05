//Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario
//ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
//que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".

Algoritmo caracteresSN
	Definir letras Como Caracter
	Escribir "Ingrese los caracteres a evaluar: "
	Leer letras
	
	Si letras = "N" O letras = "S" Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	Fin Si
	
FinAlgoritmo