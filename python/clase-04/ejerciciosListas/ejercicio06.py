#Ejercicio6
# llenar una lista con los numeros del 1 al 10, luego modificar los elementos de la lista multiplicandolos por un valor ingresado por el usuario

numeros = [i for i in range(1, 11)]
numerosMultiplicados = []

numeroMultiplicador = int(input("ingrese un numero para multiplicar los elementos de la lista "))

for i in numeros:
    numerosMultiplicados.append(i * numeroMultiplicador)

print(numerosMultiplicados)