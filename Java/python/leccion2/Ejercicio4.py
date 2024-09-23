"""
Ejercicio 4: Área y longitud de un circulo
Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia.

Área = Pi * r2
Longitud = 2 * Pi * r
En este ejercicio vamos a necesitar importar el modulo math porque tiene el valor de Pi
Se escribe:   import math

"""
import math
radioCirculo = int(input("Ingrese el radio del circulo: "))
area= math.pi * radioCirculo ** 2
longitud = 2* math.pi * radioCirculo

print(f"El area del circulo es {area} y la longitud es {longitud}")