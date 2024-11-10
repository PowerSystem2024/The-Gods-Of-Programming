# funcion recursiva
# imprimir una lista de numeros de forma descendente de forma recursiva
#Si pasamos el 5 debe imprimir
# 5
# 4
# 3
# 2
# 1

def recursivaDescendiente(n):
    if n == 1:
        print(1)
    else:
        print(n)
        recursivaDescendiente(n - 1)

recursivaDescendiente(5)