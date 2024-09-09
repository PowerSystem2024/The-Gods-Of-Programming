# ciclo while (mientras o durante)
# contador = 0
# while contador < 78:
#     print("Ejecutando nuestro cocli while",  contador)
#     contador += 1
# else:
#     print("Fin del ciclo while")
'''
# Imprimir del 1 al 5
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1
'''
"""
contador = 5
minimo = 1
while contador >= minimo:
    print(contador)
    contador -= 1
"""
'''# ciclo for (para)
cadena = "hello"
for letra in cadena:
    print(letra)
else:
    print("fin del ciclo for")
'''
"""
#palabra beak
for letra in "Alemania" :
    if letra == "a":
        print(f"letra encontrada: {letra}")
        break
else:
    print("fin ciclo for")
"""
# Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f"valor {i}")

for i in range(6):
    if i % 2 != 0:
        continue
    print(f"valor {i}")

