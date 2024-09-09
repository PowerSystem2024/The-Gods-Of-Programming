# calcular Estacion del año
num = int(input('Ingrese un numero entre 1 y 12: '));

if num >= 1 and num <= 3:
    print('La estación del año es Verano');
elif num >= 4 and num <= 6:
    print('La estación del año es Otoño');
elif num >= 7 and num <= 9:
    print('La estación del año es Invierno');
elif num >= 10 and num <= 12:
    print('La estación del año es Primavera')
else:
    print('Número inválido. Por favor, ingrese un número entre 1 y 12.')

estacion = None

# Pedir al usuario que ingrese un número entre 1 y 12
num = int(input('Ingrese un número entre 1 y 12: '))

# Determinar la estación del año según el número ingresado
if num >= 1 and num <= 3:
    estacion = 'Verano'
elif num >= 4 and num <= 6:
    estacion = 'Otoño'
elif num >= 7 and num <= 9:
    estacion = 'Invierno'
elif num >= 10 and num <= 12:
    estacion = 'Primavera'
else:
    print('Número inválido. Por favor, ingrese un número entre 1 y 12.')

# Verificar si la variable estacion tiene un valor asignado
if estacion is not None:
    print(f'La estación del año es {estacion}')