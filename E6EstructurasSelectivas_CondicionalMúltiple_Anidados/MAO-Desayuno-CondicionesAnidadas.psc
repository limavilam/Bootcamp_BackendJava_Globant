//EJERCICIO DESAYUNO
//Es tu turno, dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
//en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si
//prefiere leche vegetal.

Algoritmo desayuno
	Definir tipoBebida como Caracter 
	Escribir "Ingrese la bebida que desea tomar puede elegir entre caf� o t�: "
	Leer tipoBebida 
	
	Definir tipoCafe como caracter 
	Definir tipoLeche como caracter
	
	Si tipoBebida == "Caf�" o tipoBebida =="caf�" o tipoBebida =="Cafe" Entonces
		Escribir "�Le gustar�a el caf� solo o cortado?"
		Leer tipoCafe
		
		Si tipoCafe == "solo" o tipoCafe =="Solo" 
			Escribir "Espero disfrute de su caf� solo"
		SiNo
			Escribir "�Le gustar�a su caf� con leche vegetal?"
			Leer tipoLeche
			
				Si tipoLeche == "Si" o tipoLeche == "si" entonces
					Escribir "Disfrute su caf� cortado con leche vegetal"
				SiNo
					Escribir "Entonces tomar� caf� cortado sin leche vegetal, disfrutelo"
				FinSi
			FinSi
	SiNo
		Escribir "Su bebida de selecci�n para el desayuno es t�"	
	FinSi	
FinAlgoritmo
