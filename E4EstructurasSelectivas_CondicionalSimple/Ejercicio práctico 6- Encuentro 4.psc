//Ejercicio 6

Algoritmo tareasAsistente
	
Escribir "�Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja de c�lculo de ingresos mensuales. Puedes hacerlo buscando los �ltimos ingresos publicitarios en los informes de marketing. Para ello, debes iniciar sesi�n con usuario de administrador"
Escribir " Despu�s de hacer todo eso, revisa mi correo electr�nico"

Definir cantidadEmails como Entero
Escribir "�Cu�ntos mensajes sin leer tengo?"
Leer cantidadEmails

Si cantidadEmails < 10  Entonces
	Escribir "Puedes revisar mi correo de voz para ver si hay alguna solicitud de los ejecutivos, Si hay tales solicitudes, podr�as hacerlas primero a menos que tenga una solicitud de emergencia de otro departamento" 
Fin Si

Definir solicitudEmergencia como Caracter 
Escribir "�Tenemos solicitudes de emergencia de otro departamento"
Leer solicitudEmergencia

Si solicitudEmergencia = "si" Entonces
	Escribir "Por favor trabaja en las solicitudes de emergencia"
SiNo
	Escribir " Puedes continuar con las solicitudes de cumplimiento" 
Fin Si

Definir correoActualizado Como Caracter
Escribir "Una vez revisadas las solicitudes, por favor env�ame un correo electr�nico de actualizaci�n, lo hiciste?"
Leer correoActualizado 

Si correoActualizado = "si" Entonces
	Escribir " Podr�as por favor regar mi planta y apagar el computador"
Fin Si

Escribir "Bueno, gracias de nuevo. �Es de gran ayuda! Te debo el almuerzo cuando regrese."

FinAlgoritmo
