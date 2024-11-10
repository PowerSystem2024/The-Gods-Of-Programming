#Ejercicio 11: Agenda telefonica
# hacer un programa que simule una agenda de contactos. Crear un
#Dicccionario donde la clave sea el nombre del usuario y el valor
#sea el telefono el prograama tendra el siguiente menu de opciones:
#   1.Nuevo contacto
#   2.borrar contacto
#   3.ver contactos exstentes
#   4.salir
agenda = {}
while True:
    print("\t Menu:")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contacto existente")
    print("4. salir")
    opcion = int(input("Digite una opcion del menu: "))
    if opcion == 1:
        nombre = input("Digite ell nombre del contacto: ")
        telefono = input("Digite el numero de telefono")
        if nombre  not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado exitosamente")
        else:
            print("Este nombre de contacto ya existe")

    elif opcion == 2:
        nombre = input("Cual es el nombre del contacto: ")
        if nombre in agenda:
            del (agenda[nombre])
            print("Se ha eliminado el contacto requerido")
        else:
            print("Este contacto no existe en la agenda")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4:
        print("Gracias por utilizar su agenda de contactos")
        break
    else:
        print("Se equivoco de opcion de menu")
    print()


