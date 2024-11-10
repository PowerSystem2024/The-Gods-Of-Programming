# definimos una tupla
cocina= ('cuchara', 'cuchillo', 'tenedor')
print(cocina)
print(len(cocina))  #3

#funciones
#acceder a un elemento con corchetes no ()
print(cocina[0])  #cuchara
print(cocina[-1]) #tenedor

#acceder a un rango
print(cocina[0:1]) #cuchara (muestra el indice inicial 0 y no incluye el final 1
print(cocina[0:2]) #cuchara. cuchillo
verduras = ('papa') #no es una tupla, aunq sea de un elemento necesita la coma. De lo contrario solo seria un tipo str cadena
#Ejemplo
verduras = ('papa', )

#recorremos los elementos de la tupla
cocina= ('cuchara', 'cuchillo', 'tenedor')
for cocinar in cocina:
    print(cocinar) #print esta usando \n para saltos de linea
for cocinar in cocina:
    print(cocinar, end=' ')  #usamos end= para eliminar los saltos de lineas
print(cocinar)
#las tuplas no se modifican

# tipo set
planetas= {'marte','júpiter', 'venus'}
print(planetas)
print(len(planetas)) # usamos la funcion len para ver el largo

#revisamos si un elemento existe denro del set
print('marte' in planetas)
print('jupiter' in planetas) # false xq no ingresamos el acento
# agregamos elementos
planetas.add('tierra') # and es una funcion
planetas.add('tierra')
planetas.add('tierra') #solo lo va agregar 1 vez
#eliminar un elemento que no exixte va arrojar un error
planetas.remove('júpiter') #esta funcion ante un mal ingreso da error
print(planetas)
planetas.discard('Tierra') #ests funcion no da error, si esta mal escrito no borra y sigue el programa
print(planetas)
#limpiar set o conjunto
planetas.clear()
print(planetas)
#eliminar set o conjunto
#del planetas
#print(planetas) #al eliminar nos muestra un error

#diccionario
#'Maradona':10 #una llave y un valor
# dict(key,value)
diccionario = {
    'IDE' : 'Integrate development environment',
    'POO' : 'Programacion Orientada a objetos',
    'SABD' : 'Sistema de administracion de base de datos'
}
print(diccionario)
#verificar la cantidad de elementos de un diccionario
print(len(diccionario))
print(diccionario)
#acceder a un elemento del diccionario con la llave
print(diccionario['IDE']) #los datos deben ser precisos
#otra forma de buscar
print(diccionario.get('POO'))

#modificamos elemento
diccionario['IDE']= 'ENTORNO DE DESARROLLO INTEGRADO'
print(diccionario)

# como recorrer los elementos

for termino in diccionario: #recorremos mostrando solo las llaves
    print(termino)
#necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)
#otras maneras de acceder a dicc
for termino in diccionario.keys(): #usamos uncion para ver la llave
    print(termino)

for valor in diccionario.values(): #usamos uncion para ver el valor
    print(valor)

#comprobar la existencia de algun elemento
print('IDE' in diccionario)

#agregar un elemento

diccionario['PK'] = 'Primary key'
print(diccionario)

#eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# vacial dicc
diccionario.clear()
print(diccionario)

#eliminar dicc
del diccionario # El diccionario se borro
#concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = [lista1+lista2]
print(lista3)

lista3.extend([7, 8, 9, 1])#Funcion para agreegar varios eleentos a una lista
print(lista3.index(5))
#print(lista3.index(0)) esto daria error porr no ser el elemento parte de la lista

#como saber cuantos valoores hay en una lista
print(lista3.count(1))  #cuanta cuantos valores iguales hay en una lilsta

#Para poner nuestra lista al reves

