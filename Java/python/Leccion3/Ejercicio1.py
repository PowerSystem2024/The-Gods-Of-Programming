# Calcular la suma de N primeros numeros

suma = 0
N = int(input("Ingrese la cantidad de numeros a sumar: "))
i = 0
while i <= N:
    suma += i
    i += 1
print(f'La suma de los numeros es: {suma}')