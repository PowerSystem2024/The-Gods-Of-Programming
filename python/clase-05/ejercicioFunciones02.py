# Ejercicio2: funcion con *args para multiplicar

def multiplicarTodo(*nums):

    multi = 1

    for i in nums:
        multi *= i

    return multi

n = [1, 2, 3]

res = multiplicarTodo(*n)

print(res)