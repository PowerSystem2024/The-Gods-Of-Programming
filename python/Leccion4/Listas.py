# lista = Ariel, Liliana, Natalia, Osvaldo

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
print(nombres) #nos da error porque la lista fue borrada, no esta definida