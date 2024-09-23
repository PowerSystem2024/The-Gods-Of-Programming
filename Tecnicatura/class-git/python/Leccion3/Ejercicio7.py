"""
Ejercicio 8: Dada las horas trabajadas de 5 personas y la tarifa de pago calcular el salario,
y la sumatoria de todos los salarios.
"""

sumaSalarios = 0.0
i = 1

while i <= 5:
    print(f'Salario del empleado {i}:')
    horas = int(input('Ingrese la cantidad de horas trabajadas: '))
    tarifa = float(input('Ingrese la tarifa por hora: '))
    salario = horas * tarifa
    print(f'El salario es: ${salario:.2f}')
    sumaSalarios += salario
    i += 1
    print('')
print(f'La suma de los salarios es: ${sumaSalarios:.2f}')
