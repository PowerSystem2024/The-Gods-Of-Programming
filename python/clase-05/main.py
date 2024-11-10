"""Coomenzamos con funciones
mi funcion () #no se puede llamar antes de definir a una funcion
definimos una funcion"""
def mi_funcion():#Para identificar a la funcion utiliamos parentesis
    print("Saludamos a los alumnos de la tecnicatura")

mi_funcion() #Estamos llamando a la funcion
mi_funcion() #Se puede llama a una funion n cantidad de veces


#Desempaquetado de listas  o list unpacking
def show(name, lastname):
    print(name+" "+lastname)

person = ["Ariel", "Betancud"]
show(person[0], person[1],)#Pasasmos uno por uno los datos de la lista a la funcion
show(*person)#Esto es lo mismo que lo anterior pero le pasamoos todo junto
person2 = ("Osvaldo","Giordanini")
show(person2)
person3 = {"lastname": "Lucero", "name": "Natalia"}
show(**person3)

#Repaso del ciclo for else
numbers = [1, 2, 3, 4, 5]

for n in numbers:
    print(n)
    if n == 3:
        break
    else:
        print("esto se termino")

#Lista de comprension
names = ["jjuan", "nico", "pepe"]

alongP = [p for p in names if p[0] == "p"]
print(alongP)

bottleC = [
    {"name": "quilmes", "country": "arg"},
    {"name": "corona", "country": "mx"},
    {"name": "stella artois", "country": "belgium"}
]

arg = [b for b in bottleC if b["country"] == "arg"]

print(arg)
print(bottleC)

#funciones, paso de argumentos
def miFuncion(name, lastName):
    print(f"nombre {name} apellido {lastName}")

miFuncion("agus", "delgado")
miFuncion("facu", "martinez")
miFuncion("nina", "diaz")

#Return
def sumar(a, b):
    return  a + b

print(sumar(1, 2))

#Argumentos vriables para un diccionrio
def listaTerminos(**termino):
    for llave, valor in termino.items():
        print(f"{llave} : {valor}")

listaTerminos(IDE = "integrated developmet envirometn", pk = "primary key")

#List de elementos con funciones
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)

nombres = ["tito", "pepe"]
desplegarNombres(nombres)

desplegarNombres("carla")

desplegarNombres((11, 10))
desplegarNombres([22, 55])

#Funciones recursivas
def factorial(n):
    if n == 1:#Caso base
        return 1
    else:
        return n * factorial(n - 1)#Caso recursivo

res = factorial(5)

print(f"el factorial de 5 es {res}")