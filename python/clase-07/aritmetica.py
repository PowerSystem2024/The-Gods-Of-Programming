class Aritmetica:

    # DEFINIENDO LOS ATRIBUTOS
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # DEFINIENDO LOS METODOS
    def sumar(self):
        return self.operandoA + self.operandoB

    def resta(self):
        return self.operandoA - self.operandoB

    def multiplicacion(self):
        return self.operandoA * self.operandoB

    def division(self):
        if self.operandoB == 0:
            return 0
        else:
            return self.operandoA / self.operandoB


ariemetica1 = Aritmetica(7, 8)

print(f"La suma es: {ariemetica1.sumar()}")
print(f"La resta es: {ariemetica1.resta()}")
print(f"La multiplicacion es: {ariemetica1.multiplicacion()}")
print(f"La division es: {ariemetica1.division()}")