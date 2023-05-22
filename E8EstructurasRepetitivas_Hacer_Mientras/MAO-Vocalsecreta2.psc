//EJERCICIO VOCAL SECRETA ? PARTE 2
//Vamos a hacer nuevamente el ejercicio de la vocal misteriosa, pero esta vez con una estructura
//Hacer-Mientras. ¿Puedes notar cuál es la diferencia entre ambas estructuras?

Algoritmo EjemploMientras
	
	Definir vocal como caracter
	Definir vocalSecreta como caracter
	
	Escribir "Ingrese una vocal: "
	Leer vocal
	
	vocalSecreta = 'a'
	
	Repetir
		Escribir "Intente nuevamente, no es vocal secreta"
		Leer vocal
	Mientras Que vocal <> vocalSecreta  
	
FinAlgoritmo
