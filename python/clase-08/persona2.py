class Persona2:

    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrarDetalle(self):
        print(f"La clase Persona: {self._nombre} {self._apellido} {self._edad}")

    # GETTERS and SETTERS
    @property  # decorador
    def nombre(self):  # Metodo Getter
        print("Usando getter")
        return self._nombre

    @nombre.setter  # Metodo Setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def apellido(self):  # Metodo Getter
        print("Usando getter")
        return self._apellido

    @apellido.setter  # Metodo Setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):  # Metodo Getter
        print("Usando getter")
        return self._edad

    @edad.setter  # Metodo Setter
    def edad(self, edad):
        self._edad = edad

    # DESTRUCTOR DE OBJETOS
    def __del__(self):
        print(f"Persona2: {self.mostrarDetalle} se borro")

if __name__ == "__main__":
    persona1 = Persona2("Ariel", "Betancud",41)
    print(persona1.nombre)#LLamamos a metodo getter
    persona1.nombre = "Juan pedro" #metodo setter
    print(persona1.nombre)
    print(persona1.mostrarDetalle())
    print(persona1.edad)

    # TAREA - Crear 3 objetos mas, modificar con setters y mostrar detalles

    persona2 = Persona2("Juan", "Lopez",20)
    persona2.nombre = "Juan"
    persona2.apellido= "Lopez"
    persona2.edad = 20
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)

    persona3 = Persona2("Pipi","Nunez",20)
    persona3.nombre = "Pipi"
    persona3.apellido = "Nunez"
    persona3.edad=20
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)

    persona4 = Persona2("Nachi","Balverdi",21)
    persona4.nombre = "Nachi"
    persona4.apellido = "Balverdi"
    persona4.edad = 21
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)

    print(__name__)


