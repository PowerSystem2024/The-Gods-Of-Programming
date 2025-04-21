import os

class Catalogo_Peliculas:
    ruta_archivo = 'peliculas.txt'

    @staticmethod
    def agregar_pelicula(pelicula):
        with open(Catalogo_Peliculas.ruta_archivo, 'a', encoding='utf-8') as archivo:
            archivo.write(str(pelicula) + '\n')

    @staticmethod
    def listar_peliculas():
        if os.path.exists(Catalogo_Peliculas.ruta_archivo):
            with open(Catalogo_Peliculas.ruta_archivo, 'r', encoding='utf-8') as archivo:
                print('Películas en catálogo:')
                print(archivo.read())
        else:
            print('No hay películas en el catálogo.')

    @staticmethod
    def eliminar():
        if os.path.exists(Catalogo_Peliculas.ruta_archivo):
            os.remove(Catalogo_Peliculas.ruta_archivo)
            print('Archivo eliminado.')
        else:
            print('No hay archivo que eliminar.')
