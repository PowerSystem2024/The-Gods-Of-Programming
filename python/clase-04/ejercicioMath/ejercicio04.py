# obtener la raiz cuadrada de un numero positivo

import math

numero = int(input("ingrese un numero positivo: "))

#if (numero < 0):
#    print("el numero debe ser mayor a cero")
#else:
#    print(f'la raiz del numero {numero} es {math.sqrt(numero)}')

while numero < 0:

    print('error, el numero debe ser positivo')
    numero = int(input("ingrese un numero positivo: "))

print(f'la raiz del numero {numero} es {math.sqrt(numero)}')