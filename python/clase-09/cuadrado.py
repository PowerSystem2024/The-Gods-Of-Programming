from figuraGeometrica import figuraGeometrica
from color import color


class cuadrado(figuraGeometrica, color):
    def __init__(self, lado, color):
        #   super().__init__(lado,lado)
        figuraGeometrica.__init__(self, lado, lado)
        color.__init__(self, color)

    def __str__(self):  # SIRVE PARA SOBREESCRIBIR
        return f"Cuadrado: [{figuraGeometrica.__str__(self)} {color.__str__(self)}]"

    def calcular_area(self):
        return self.alto * self.ancho
