# lista = Ariel, Liliana, Natalia, Osvaldo
# colecciones de Python
# las listas es lo que se conoce en otros lenguajes como arreglos o vectores
nombres =['Ariel', 'Liliana', 'Natalia', 'Osvaldo']

print(nombres)
print (nombres[0])
print(nombres[1])
#si no tenemos referencia del numero de indice y queremos ver el ultimo
print(nombres[-1])
#penultimo
print(nombres[-2])

###############################
nombres =['Naty', 'Osvaldo', 'Lily' , 'Ariel' ]
print(nombres[0:2]) #recorre hasta la posicion 2  es decir 0 y 1

#desde el inicio de la lista al indice (sin incluirlo)
print(nombres[:3])

#desde el inicio de la lista al final
print(nombres[0: ])

#modificamos un valor
nombres[2]= "Liliana"
nombres[0]= "Natalia"
print(nombres)
#iteramos
for nombre in nombres: # nombre es singular, la lista es en plural
    print(nombre)
else:
    print("Se acabaron los nombres")

#########################

# Preguntamos cuantos elementos liene
print(len(nombres))

#agregamos elementos
nombres.append('Marcelo')   #al final
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
print(nombres)

#agregamos elemento en un indice especifico
nombres.insert(1,'Carina') #numero entero del indice y el parametro str
print(nombres)

nombres.insert(3,'Debora')
print(nombres)

#eliminamos elemento
nombres.remove('Carina')
print(nombres)

#eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar indice especifico
del nombres[2] #del significa eliminar
print(nombres)

#eliminar todos los elementos
nombres.clear()
print(nombres)

#eliminar la lista
del nombres
#print(nombres) #nos da error porque la lista fue borrada, no esta definida

# concatenar Listas
lista1 = [1, 2, 3]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7, 8, 9, 1]) #funcion para agregar varios elementos a la lista
print(lista3)
print(lista3.index(5))# funcion para ubicaren que indice esta el valor ingresado
#print(lista3.index(0)) #da error por no ser un elemento que esta ingresado en la lista

#como saber cuantos valores repetidos hay dentro de una lista

print(lista3.count(1)) #cuenta cuantos valores iguales hay dentro en una lista

#para poner la lista al reves
lista3.reverse()
print(lista3)
#para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 *2
print(lista3)

#lista de ordenamiento
lista3.sort() # ordena los elementos ascendentes
print(lista3)
lista3.sort(reverse=True) #ordena los elementos descendente
print(lista3)
# repaso de tuplas
tupla = (4, 'Hola', 6.78, [1, 2, 78], 'Hola') #puede tener diferentes tipos de datos adentro
print(tupla)
print( 4 in tupla) #accion booleana, su rta es de tipo booleana
# lo q podemos usar dentro d tuplas son: index, count, len
# En tupla se puede convertir de tupla a lista y de lista a tupla

#repaso de conjunto o set
#para definir un conj
conjunto2 = set() #unica manera de incializar vacio es con set
conjunto1 = {'bye',}
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('Hola')
print(conjunto1)
print(3 not in conjunto1) #preguntamos si el elemento 3 no esta en el conjunto1

#como hacer la igualdad de dos conj
print(conjunto1 == conjunto2) #nos devuelve como respuesta un booleano
#operaciones de conj
conjunto3 = conjunto1 | conjunto2 #une los 2 conj
print(conjunto3)
#interseccion
conjunto3 = conjunto1 & conjunto2
print(conjunto3)
conjunto3 = conjunto1 - conjunto2 #muestra valor que esta en conj 1 pero no en 2

print(conjunto3)

conjunto3 = conjunto2 - conjunto1
print((conjunto3))

conjunto3 = conjunto1 ^ conjunto2 # ejementos que no comparten o diferentes entre ambos
print(conjunto3)
conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) #funcion para consultar si un conj es un subconjunto de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1)) #preg  si los elementos del conj 1 estan dentro del 3
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))

#conj disconexo, esto es si NO comparten elementos en comun
#convertir un conjunto TOTALMENTE INMUTABLES
conjunto1 = frozenset   #esto hace que el conj sea totalemnte inmutable
#no se puede agregar, modificar ni eliminar elemento del conjunto

diccionarioNuevo={'azul':'blue', 'rojo': 'red', 'verde':'green', 'amarillo':'yellow'}
print(diccionarioNuevo)

# como eliminar
del(diccionarioNuevo['azul'])
print(diccionarioNuevo)

#los doccionarios pueden almacenar los diferentes tipos de datos
diccionario2 = {'Ariel': {'edad': 40, 'altura': 1.8}, 'Osvaldo':[45, 1.85], 'Natalia':[35, 1.67]}
print(diccionario2)
seleccionArgantina = {
    10: {'Nombre': 'Lionel Messi', 'edad': 35, 'altura': 1.70, 'precio': '50 millones', 'posicion': 'extremo derecho'},
    11: {'Nombre': 'Angel Di Maria', 'edad': 34, 'altura': 1.80, 'precio': '12 millones', 'posicion': 'extremo derecho'},
    21: {'Nombre': 'Paulo Dybala', 'edad': 28, 'altura': 1.77, 'precio': '35 millones', 'posicion': 'medio punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'edad': 34, 'altura': 1.83, 'precio': '3.5 millones', 'posicion': 'defensa'},
    1: {'Nombre': 'Franco Armani', 'edad': 35, 'altura': 1.89, 'precio': '3.5 millones', 'posicion': 'portero'},
    24: {'Nombre': 'Enzo Fernandez', 'edad': 23, 'altura': 1.78, 'precio': '85 millones', 'posicion': 'medio campo'},
    7: {'Nombre': 'Rodrigo De Paul', 'edad': 30, 'altura': 1.78, 'precio': '35 millones', 'posicion': 'medio campo'},
    13: {'Nombre': 'Cristian Romero', 'edad': 26, 'altura': 1.85, 'precio': '65 millones', 'posicion': 'defensa'},
    23: {'Nombre': 'Damian Emiliano Martinez', 'edad': 32, 'altura': 1.95, 'precio': '33 millones', 'posicion': 'portero'}
}

print(seleccionArgantina)
print(seleccionArgantina[10])
print(seleccionArgantina.values())

for llave in seleccionArgantina:
    print(llave)

for valor in seleccionArgantina.values():
    print(valor)

for llave, valor in seleccionArgantina.items():
    print(llave, valor)

#pilas usando listas
pilas = [1, 2, 3]
# agregar elemento a la pila, ultimo ingresado es el primero en salir
pilas.append(4)
pilas.append(5)
print(pilas)

#sacamos elemento
elementoBorrado = pilas.pop() #elimina ultimo elemento y lo guarda en la variable
print(f'El elemento borrado es el {elementoBorrado}')
print(f'la pila ahora quedo asi: {pilas}')

#colas con listas
# estructuta de datos de tipo fifo(first input / first output)
cola =['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

#agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Jose')
print(cola)

#sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido {seRetira}')
print(cola)
seRetira = cola.pop(0)
print(f'Atendido {seRetira}')
print(cola)