//EJERCICIO DESAYUNO
//Es tu turno, diseña un condicional anidado que le pregunte al usuario si quiere tomar té o café y
//en caso de que quiera tomar café, preguntar si solo o cortado y en caso de ser cortado, si
//prefiere leche vegetal.

Algoritmo desayuno
	Definir tipoBebida como Caracter 
	Escribir "Ingrese la bebida que desea tomar puede elegir entre café o té: "
	Leer tipoBebida 
	
	Definir tipoCafe como caracter 
	Definir tipoLeche como caracter
	
	Si tipoBebida == "Café" o tipoBebida =="café" o tipoBebida =="Cafe" Entonces
		Escribir "¿Le gustaría el café solo o cortado?"
		Leer tipoCafe
		
		Si tipoCafe == "solo" o tipoCafe =="Solo" 
			Escribir "Espero disfrute de su café solo"
		SiNo
			Escribir "¿Le gustaría su café con leche vegetal?"
			Leer tipoLeche
			
				Si tipoLeche == "Si" o tipoLeche == "si" entonces
					Escribir "Disfrute su café cortado con leche vegetal"
				SiNo
					Escribir "Entonces tomará café cortado sin leche vegetal, disfrutelo"
				FinSi
			FinSi
	SiNo
		Escribir "Su bebida de selección para el desayuno es té"	
	FinSi	
FinAlgoritmo
