"""
Lee 10 numeros e imprimir cuantos son positivos, cuantos negativos
y cuantos neutros.
"""
conteo_positivos= 0
conteo_negativos= 0
conteo_neutros= 0
i = 0
while i < 10:
    num = int(input("Ingrese un numero: "))
    if num > 0:
        conteo_positivos += 1

    elif num < 0:
        conteo_negativos += 1

    else:
        conteo_neutros += 1
    i += 1
print(f'''
        La cantidad de numeros positivos son: {conteo_positivos}
        La cantidad de numeros negativos son: {conteo_negativos}
        La cantidad de numeros neutros son: {conteo_neutros
}''')