from figuraGeometrica import figuraGeometrica
from color import color


class rectangulo(figuraGeometrica, color):
    def __init__(self, ancho, alto, color):
        #   super().__init__(lado,lado)
        figuraGeometrica.__init__(self, ancho, alto)
        color.__init__(self, color)

    def calcular_area(self):
        return self.alto * self.ancho

    def __str__(self):  # SIRVE PARA SOBREESCRIBIR
        return f"Rectangulo: [{figuraGeometrica.__str__(self)} {color.__str__(self)}]"