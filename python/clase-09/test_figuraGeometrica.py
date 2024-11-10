from cuadrado import cuadrado
from rectangulo import rectangulo


print("Creamos objeto clase cuadrado".center(50,"_"))
cuadrado1 = cuadrado(-1,"Azul")
rectangulo1 = rectangulo(2,2,"Rojo")
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"El area es: {cuadrado1.calcular_area()}")

# MRO = METHOD RESOLUTION ORDER
# [<class 'Cuadrado.Cuadrado'>, <class 'FiguraGeometrica.FiguraGeometrica'>, <class 'Color.Color'>, <class 'object'>]
# nos dice que va a CUADRADO, luego a FIGURA, luego a COLOR, y ultimo obviamente a la CLASE OBJECT
print(cuadrado.mro())

print(cuadrado1)
print(rectangulo1)