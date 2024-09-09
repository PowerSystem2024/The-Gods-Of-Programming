'''
miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = 3.5
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
x = 10
y = 2
z = x + y
print(z)
print(id(x)) #direccion de memoria
# las literales se escriben: la vbe x se encuentra en x904, la vbe y esta en x648 la veriable z esta en x968
print(id(y))
print(id(z))


# Tipos int, float, string, bool

x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas
miGrupoFavorito = "The letter Black"
print(miGrupoFavorito)
miGrupoFavorito = "The letter Black"
print("Mi grupo favorito es: " + miGrupoFavorito) # concatenamos la cadena

miGrupoFavorito = "The letter Black:" + " The Best Rock Band"
print("Mi grupo favorito es: " + miGrupoFavorito) # concatenamos en la vble

miGrupoFavorito = "The letter Black:" " The Best Rock Band"
print("Mi grupo favorito es: " + miGrupoFavorito) # concatenamos en la vble sin el +

miGrupoFavorito = "The letter Black:"
caracteristica = "The Best Rock Band"
print("Mi grupo favorito es: " + miGrupoFavorito + " " +caracteristica)
miGrupoFavorito = "The letter Black:"
caracteristica = "The Best Rock Band"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristica)

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos boleanos (bool)

miBooleano = True
print(miBooleano)

miBooleano = False
print(miBooleano)

miBooleano = 1 > 2
print(miBooleano)

miBooleano = 3 > 2
print(miBooleano)

miBooleano = 1 > 2
if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")
miBooleano = 3 > 2
if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")


# Procesar la entrada del usuario
# funcion input

resultado = input("Ingrese un numero: ")  # regresa un dato tipo string
print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escribe el primr numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("el resultado de la suma es: ", resultado)
'''
"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("Resultado de la suma", suma)
print(f"El resultado de la suma es : {suma}") # interpolacion

resta = operandoA - operandoB
print(f'El resultado de la resta es : {resta}')

multiplicacion = operandoA * operandoB
print(f'El resultado de la ,ultiplicacion es: {multiplicacion}')

division = operandoA / operandoB
print(f'El resultado de la division es: {division}')
division = operandoA // operandoB
print(f'El resultado de la division (int) es: {division}')

modulo = operandoA % operandoB
print(f'El resultado de la division o residuo(modulo) es : {modulo}')
exponente = operandoA ** operandoB
print(f'El resultado del exponente es: {exponente}')


alto = int(input("Ingrese ul alto del rectangulo: "))
ancho= int(input("Ingrese el ancho del rectangulo: "))

area = alto * ancho
perimetro = (alto + ancho) *2

print(f"El área del rectangulo es {area} y el perimetro es {perimetro}")


# operadores de reasignación

miVariable3 = 10
print(miVariable3)
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable# = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable# = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable# = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)
"""
'''
# operadores de comparación
d = 4
b = 2
resultado = d == b
print(resultado)

# operadores diferente
resultado = d != b
print(resultado)

# operador mayor que
resultado = d > b
print(resultado)

# operador menor que
resultado = d < b
print(resultado)

# operador menor o igual que
resultado = d <= b
print(resultado)

# operador mayor o igual  que
resultado = d >= b
print(resultado)
'''
'''
a = int(input("Ingrese un número: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número PAR")
else:
    print(f"El valor de a es: {a} es un número IMPAR")
'''
"""
# Ejercicio: Es mayor de edad
edad = int(input("Ingrese la edad: "))
mayorEdad = 18
if edad >= mayorEdad:
    print(f"Es mayor de edad, tiene {edad} años")
else:
    print(f"Es menor de edad, tiene {edad} años")
"""
'''
# Operadores logicos
a = True
b = True
resultado = a and b
print(resultado)

# Operador or
resultado= a or b
print(resultado)

# operador not
resultado= not a
print(resultado)
'''
'''
# Ejercicio: Valor dentro de un rango
num = int(input("Ingrese un numero dentro del rango 0 a 5: "))

if num >=0 and num <= 5:
    print(f"El numero ingresado {num} esta dentro del rango")
else:
    print(f"El numero ingresado {num} esta fuera del rango")
'''
'''
# Ejercicio : Puede asistir al juego
vacaciones = True
diaLibre = True
if vacaciones or diaLibre:
    print('Puede asistir al Juego')
else:
    print('Tiene que ir a trabajar')

# operador not

if not(vacaciones or diaLibre):
    print('Tiene que ir a trabajar')
else:
    print('Puede asistir al Juego')
'''
"""
# Ejercicio: Rango entre 20 y 30 años
edad = int(input("Ingrese su edad: "))
#veinte = edad >= 20 and edad < 30
#print(veinte)
#treinta = edad >= 30 and edad < 40
#print(treinta)
#if veinte or treinta:
#    print("Esta dentro del rango")
#else:
#    print("Esta fuera del rango")
if (20 <= edad < 30) or (30 <= edad < 40): # sintaxis simplificada del operados and
    print("Esta dentro del rango")
else:
    print("Esta fuera del rango")
"""
'''
# Ejercicio: El mayor de dos números
num1 = int(input("Ingrese el valor para el número 1: "))
num2 = int(input("Ingrese el valor para el número 2: "))
if num1 > num2:
    print(f"El numero mayor es {num1}")
elif num1 < num2:
    print(f"El numero mayor es {num2}")
else:
    print("Los numeros ingresados son iguales")
'''
"""
# Ejercicio: Tienda de Libros
print('Digite los siguientes datos del libro')
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input('Digite el precio del libro: '))
envioGratuito = input("Indicar si el libro es gratuito (True/False): ")
if envioGratuito == 'True':  # cambiamos de str a bool
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = "El Valor es incorrecto, debe escribir True/False"

print(f'''
        Nombre: {nombre}
        ID: {id}
        Precio: {precio}
        Envio Gratuito?: {envioGratuito}
''')
"""

