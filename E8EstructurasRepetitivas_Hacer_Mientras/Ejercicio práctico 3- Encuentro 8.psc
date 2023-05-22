//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como código 1024 y como contraseña
//4567. El programa finaliza cuando ingresa los datos correctos.

Algoritmo EjemploMientras
	
	Definir usuario como entero
	Definir contrasena como entero
	Definir codigoUsuario como entero
	Definir contrasenaUsuario como entero
	Definir ingresoSatisfactorio Como Logico
	Definir suma como Entero 
	
	codigoUsuario <- 1024
	contrasenaUsuario <-456
	suma <- 0
	
	Repetir
		Escribir "Ingrese su código de usuario: "
		Leer usuario
		
		Escribir "Ingrese su contraseña de usuario: "
		Leer contrasena
		suma <- suma + 1
		ingresoSatisfactorio = usuario == codigoUsuario y contrasena == contrasenaUsuario
		Si ingresoSatisfactorio entonces
			Escribir "Ingreso al sistema exitoso"
		Sino
			Escribir "Código o contraseña incorrecta, intente de nuevo"
		FinSi	
	Hasta Que ingresoSatisfactorio
	Escribir "Numero de intentos: ", suma
FinAlgoritmo

"Código o contraseña incorrecta, intente de nuevo"