#Ejercicio2
# escribir un programa que tenga dos listas y que a continuación cree las siguientes listas (en las que no debe haber repetición)

# lista con las palabras que aparecen en las listas
# lista de palabras que aparecen en la primer lista pero no en la segunda
# lista de palabras que aparecen en la segunda lista pero no en la primera
# lista de palabras que aparecen en ambas listas

lista1 = {"hola", "como", "estas", "hello", "word"}
lista2 = {"chau", "nos", "vemos", "hello", "word"}

print(lista1)
print(lista2)

listaPrimera = lista1 - lista2
print(listaPrimera)

listaSegunda = lista2 - lista1
print(listaSegunda)

listaConjuncion = lista1 | lista2
print(listaConjuncion)