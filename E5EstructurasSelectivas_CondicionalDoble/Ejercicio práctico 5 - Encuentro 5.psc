//Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
//entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
//ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
//variable de tipo lógico.

Algoritmo notasCurso
	Definir n_datos como Real
	Definir contador como Real
	Definir nota como Real
	
	Escribir "Ingrese la cantidad de notas:"
    Leer n_datos
         
    Para contador<-1 Hasta n_datos Hacer   //contador inicia desde 1 porque si inicia desde 0 empieza a contar desde valor0, valor1, valor2...
        Escribir "Ingrese la nota ",contador,":"
        Leer nota
		
	FinPara
	
	Definir datocorrecto como Logico
	datocorrecto <- nota >=1 Y nota <=10 
	Escribir datocorrecto 
	
FinAlgoritmo


