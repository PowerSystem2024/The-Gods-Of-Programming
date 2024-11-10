#Ejercicio7
# pedir numeros y meterlos en una lista, cuando el usuario introduzca un numero 0,
# nuestro programa dejaria de insertar, por ultimo, mostrar los numeros de menor a mayor


lista = []

while (True):

    numero = int(input("ingrese un numero, para terminar el programa ingrese 0: "))

    if (numero != 0):
        lista.append(numero)
    else:
        break


print(f'lista original: {lista}')

lista.sort()

print(f'lista ordenada: {lista}')