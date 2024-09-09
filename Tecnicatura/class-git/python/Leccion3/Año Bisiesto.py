"""
diseñar programa en python ingresando  un año, nos devuelva por
consola si es unaño biviesto o no, repetir la
accion hasta que el usuario lo desida
"""
opcion = 1
while opcion == 1:
    num = int(input("Ingrese un año: "))
    if (num % 4 == 0 and num % 100 != 0) or (num % 400 == 0):
        print('El año es bisiesto')
    else:
        print('El año no es bisiesto')
    opcion = int(input("Para seguir adelante digite la opcion 1:  "))


