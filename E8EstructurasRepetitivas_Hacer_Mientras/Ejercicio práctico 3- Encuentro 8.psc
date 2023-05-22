//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a
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
		Escribir "Ingrese su c�digo de usuario: "
		Leer usuario
		
		Escribir "Ingrese su contrase�a de usuario: "
		Leer contrasena
		suma <- suma + 1
		ingresoSatisfactorio = usuario == codigoUsuario y contrasena == contrasenaUsuario
		Si ingresoSatisfactorio entonces
			Escribir "Ingreso al sistema exitoso"
		Sino
			Escribir "C�digo o contrase�a incorrecta, intente de nuevo"
		FinSi	
	Hasta Que ingresoSatisfactorio
	Escribir "Numero de intentos: ", suma
FinAlgoritmo

"C�digo o contrase�a incorrecta, intente de nuevo"