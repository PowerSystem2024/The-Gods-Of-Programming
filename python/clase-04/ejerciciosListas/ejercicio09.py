# calcular el factorial de un numero positivo

def factorial(numero):
    if numero == 0:
        return 0
    elif(numero == 1):
        return 1
    else:
        return numero * factorial(numero -1)

numero = int(input("ingrese un numero para calcular el factorial "))

print(f'el factorial de {numero} es {factorial(numero)}')