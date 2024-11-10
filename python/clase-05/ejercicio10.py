#Ejercicio 10: no repetir caracteres
#Hacer un programa que pida una cadena por teclado, luego
#meter los caracteres en una lista son repetir caracteres
cadena = input("Digite una cadena: ")
lista = []
for i in cadena:
    if i not in lista:
        lista.append(i)

print(f"\n Lista de caracteres sin repetir ninguno: \n {lista}")
