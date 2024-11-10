# Adivina el numero
# realizar un juego para adivinar un numero, para ello se debe generar
# un numero aleatorio entre 1 y 100, luego ir pidiendo numeros indicando
# si es mayor o menor, cuando se adivine el numero
# mostrar la cantidad de usuarios

import random

def adivinanzas():

    numeroAdivinanza = random.randint(1, 100)

    contadorIntentos = 0;

    print("vamos a jugar a las adivinanzas")

    while True:

        numero = int(input("ingresa un numero "))


        if(numero < numeroAdivinanza):
            print("el numero que estas buscando es mayor al ingresado")
            contadorIntentos += 1
        elif (numero > numeroAdivinanza):
            print("el numero que estas buscando es menor al ingresado")
            contadorIntentos += 1
        elif(numero == numeroAdivinanza):
            print(f'GANASTE, el numero que buscabas es el {numero}')
            break

    print(f'cantidad de intentos: {contadorIntentos + 1}')

adivinanzas()