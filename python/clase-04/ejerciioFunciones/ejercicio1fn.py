#Ejercicio: Tabla de multiplicar
# hacer un programa que pida un numero por teclado y guarde
# en la lista su tabla de multiplicar hasta el 10

def tablaMultiplicar(numero):
    listaMultiplicar = []
    for i in range(0, 11):
        listaMultiplicar.append(numero * i)
    return listaMultiplicar

numero = int(input("ingrese un numero "))

print(f"la tabla de multiplicar del numero {numero} es {tablaMultiplicar(numero)}")