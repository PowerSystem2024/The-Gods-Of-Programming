"""
Ingresar N enteros, visualizar la suma de los numeros pares de la lista
nuantos numeros pares existen y cual es el promedio de los
numeros impares
"""
n_elementos = int(input("Ingrese la cantidad de números a ingresar: "))
i = 1
numPares = 0
sumaPares = 0
numImpares = 0
sumaImpares = 0

while i <= n_elementos:
    num = int(input("Ingrese un número: "))
    if num % 2 == 0:
        # Calcular la suma de números pares y contar la cantidad de números pares
        sumaPares += num
        numPares += 1
    else:
        # Calcular la suma de números impares y contar la cantidad de números impares
        sumaImpares += num
        numImpares += 1
    i += 1

if numPares == 0:
    print("No se han digitado números pares.")
else:
    print(f"La suma de números pares es: {sumaPares}")
    print(f"El conteo de números pares es: {numPares}")

if numImpares == 0:
    print("No se han digitado números impares.")
else:
    promImpares = sumaImpares / numImpares
    print(f"El promedio de números impares es: {promImpares}")