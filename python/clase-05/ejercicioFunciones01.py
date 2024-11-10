#Ejercicio01: Creac una funcion para sumar los valores recibidos de tipo
#numericos, utilizando argumentos variables *args como parametro de la
#Funcion y agregar como resultado de la suma de todos los valores pasados
#como argumentos.
#Definimos funcion
def sumar_valor(*args): #Recibimos una cantidad de parametros indefinidos
    resultado = 0
    #Iteramos cada elemento
    for valor in args:
        resultado+=valor
    return resultado

#llamamos a la funcion
print(sumar_valor(3,5,9,2,))


