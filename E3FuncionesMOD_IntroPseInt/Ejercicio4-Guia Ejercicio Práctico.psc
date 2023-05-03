//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.
Algoritmo porcentaje_valor_cambio_producto
	Definir precio_del_producto_inicio Como Real
	escribir "Ingrese el precio que el producto tiene al inicio de año: "
	leer precio_del_producto_inicio
	Definir precio_del_producto_final Como Real
	escribir "Ingrese el precio que el producto tiene al final de año: "
	leer precio_del_producto_final
	Definir porcentajeAumento Como Real
	
	porcentajeAumento = ((precio_del_producto_final - precio_del_producto_inicio) / precio_del_producto_inicio) * 100
	
	escribir "El porcentaje de aumento del producto fue del ", porcentajeAumento, "%"
		
FinAlgoritmo
