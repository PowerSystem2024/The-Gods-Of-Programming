from dominio.peliculas import Pelicula
from servicios.catalogo_peliculas import Catalogo_Peliculas

def menu():
    opcion = None
    while opcion != '4':
        print('\nOpciones:')
        print('1. Agregar película')
        print('2. Listar películas')
        print('3. Eliminar archivo de películas')
        print('4. Salir')
        opcion = input('Elige una opción (1-4): ')

        if opcion == '1':
            nombre = input('Nombre de la película: ')
            pelicula = Pelicula(nombre)
            Catalogo_Peliculas.agregar_pelicula(pelicula)
        elif opcion == '2':
            Catalogo_Peliculas.listar_peliculas()
        elif opcion == '3':
            Catalogo_Peliculas.eliminar()
        elif opcion == '4':
            print('¡Hasta luego!')
        else:
            print('Opción no válida.')

menu()
