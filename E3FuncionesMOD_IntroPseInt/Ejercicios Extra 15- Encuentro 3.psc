// Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo
// de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que
// determine la hora de llegada a la ciudad B.

Algoritmo horaLlegadaCiudad
	
	Definir HH, MM, SS, T, horaLlegada, minLlegada, segLlegada Como Entero
	
	Escribir "Ingrese la hora de salida en horas (HH): "
	Leer HH
	Escribir "Ingrese los minutos de salida (MM): "
	Leer MM
	Escribir "Ingrese los segundos de salida (SS): "
	Leer SS
	Escribir "Ingrese el tiempo de viaje hasta llegar a la ciudad B en segundos (T): "
	Leer T
	
	segLlegada <- (SS + T) MOD 60  //Cambio a mins
	minLlegada <- (TRUNC(MM + ((SS + T) / 60)) MOD 60) //cambio a horas
	horaLlegada <- (HH + (TRUNC((MM + ((SS + T) / 60)) / 60) MOD 24)) //sumatoria de horas 
	
	Escribir "La hora de llegada a la ciudad B es: "
	Escribir "Hora: ", HoraLlegada
	Escribir "Minutos: ", MinLlegada
	Escribir "Segundos: ", SegLlegada
	
FinAlgoritmo