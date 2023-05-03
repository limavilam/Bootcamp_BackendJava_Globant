//Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no.

Algoritmo diaslaborales
	Definir diaLaboral Como Caracter
	Escribir "Ingrese el día de la semana que quiere verificar si es laboral o no: "
	Leer diaLaboral
	
	Si diaLaboral = "Lunes" O diaLaboral = "Martes" O diaLaboral = "Miercoles"O diaLaboral = "Jueves" O diaLaboral = "Viernes" Entonces
		Escribir "El día de la semana ingresado es laboral"
	SiNo
		Escribir "El día de la semana ingresado no es laboral"
	Fin Si
	
FinAlgoritmo
