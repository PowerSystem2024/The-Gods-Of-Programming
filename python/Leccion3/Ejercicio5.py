"""
Calcular el factorial de un numero mayor o igual a 0

"""
num = -1
i = 0
factorial = 0
if num < 0:
    num = int(input("Ingrese un numero: "))

i = 1
factorial = 1

while i <= num:
    factorial *= i
    i += 1
print(f"El factorial es: {factorial}")


