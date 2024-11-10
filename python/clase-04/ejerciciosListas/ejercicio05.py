# llenar una lista con los numeros del 1 al 50, luego mostrar la lista con un bucle for, mostrar de esta forma
# 1 - 2 - 3 - ...

numeros = []
contador = 0

for i in range(0, 51):
    numeros.append(i)

for i in numeros:
    if (i != 50):
        print(i, end= " - ")
    else:
        print(i)