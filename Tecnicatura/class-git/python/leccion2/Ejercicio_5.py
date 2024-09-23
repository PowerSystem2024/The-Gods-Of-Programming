# Ejercicio 5: Sistema de Calificaciones
num = int(input('Ingrese un Valor entre 0 y 10: '))

# Determinar la Calificacion segun el valor ingresado
if num >= 9 and num < 10:
   print('A')
elif num >= 8 and num < 9:
    print('B')
elif num >= 7 and num < 8:
    print('C')
elif num >= 6 and num < 7:
    print('D')
elif num >= 0 and num < 6:
    print('F')
else:
    print('El Valor ingresado es incorrecto')
