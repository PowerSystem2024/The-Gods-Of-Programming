# ejercicio 5: convertiddor de temperaturas
# crear dos funciones para pasar de celsius a fahrenheit

def CtoF(temp):
    print(f"la temperatura en fahrenhei es {(temp * (9/5)) + 32}")

def FtoC(temp):
    print(f"la temperatura en celcius es {(temp - 32) * (9/5)}")

CtoF(10)

FtoC(10)