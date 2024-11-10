#Cajero automatico
# hacer un programa que simule un cajero automatico con un saldo inicial de 1000
# y tendra el siguiente menu de opciones:
#       ingresar dinero a la cuenta
#       retirar dinero de la cuenta
#       mostrar dinero disponible
#       salir
def cajero():
    saldo = 1000  # Inicializar el saldo una sola vez

    print('Bienvenido, seleccione una de las siguientes opciones: ')

    while True:
        opcion = int(input(""" \n
                        para ingresar dinero a su cuenta, seleccione 1 \n
                        para retirar dinero de su cuenta, seleccione 2 \n 
                        para mostrar el saldo disponible en su cuenta, seleccione 3 \n 
                        para salir ingrese 4
                        """))

        if opcion == 1:

            print(f'Su saldo actual es de {saldo}')

            monto = int(input("Ingrese la cantidad a depositar en su cuenta: "))
            saldo += monto

            print(f'Su saldo actual es de {saldo}')

        elif opcion == 2:

            print(f'Su saldo actual es de {saldo}')

            monto = int(input("Ingrese la cantidad a retirar de su cuenta: "))

            if monto > saldo:
                print("No tiene el saldo  suficiente para realizar esta operación.")
            else:
                saldo -= monto
                print(f'Su saldo actual es de {saldo}')

        elif opcion == 3:

            print(f'Su saldo actual es de {saldo}')

        elif opcion == 4:

            print("Gracias por usar nuestros servicios")
            break

        else:
            print("Opción no válida. Por favor, seleccione una opción correcta.")

cajero()