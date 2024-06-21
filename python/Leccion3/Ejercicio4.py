"""
Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos
Realizar un algoritmo para calcular la calificacion promedio y la calificacion
mas baja de todo el grupo
"""
sumaNotas = 0
promedioNotas = 0
notaMasBaja = 10
i = 0
while i < 10:
    nota = int(input("Ingrese una nota: "))
    sumaNotas += nota
    if nota <= notaMasBaja:
        notaMasBaja = nota
    i += 1
promedioNotas = sumaNotas/10

print(f"""
        La nota mas baja es: {notaMasBaja}
        El promedio de las notas es: {promedioNotas}
""")

