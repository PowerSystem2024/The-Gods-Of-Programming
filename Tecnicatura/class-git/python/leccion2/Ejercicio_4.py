# Etapas de Vida
edad = int(input('Ingrese su edad: '));
if edad >= 0 and edad < 10:
    print('La infancia es increible y bella');
elif edad>= 10  and edad <= 19:
    print('Tienes muchos cambios, mucho que estudiar');
elif edad>= 20 and edad<=29:
    print('Amor y comienza el trabajo');
elif edad>=30 and edad<=39:
    print('Hermosa edad para viajar');
elif edad>=40 and edad<=49:
    print('A disfrutar de la familia');
elif edad>=50 and edad <=59:
    print('Etapa de mucha reflexion');
elif 60 <= edad <= 69:
    print("Jubilación y viajes");
elif 70 <= edad <= 79:
    print("Recordar y compartir experiencias")
elif edad <= 0:
    print("Edad incorrecta")
else:
    print("Muy grande")
