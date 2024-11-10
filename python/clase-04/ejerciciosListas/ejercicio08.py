#ejercicio8
# hacer un programa que sume numero pares dentro de un rango, por ejemplo,
# sumar los numeros pares del 2 al 30

suma = 0

numeroMin = int(input("ingrese el numero minimo del rango "))
numeroMax = int(input("ingrese el numero maximo del rango "))

if (numeroMax < numeroMin):
    print("los numeros no concuerdan, por favor, intente de nuevo")
else:
    for i in range(numeroMin, numeroMax + 1):
        if (i % 2 == 0):
            suma += i
    print(f"la suma de los numeros pares entre {numeroMin} y {numeroMax} es {suma}")