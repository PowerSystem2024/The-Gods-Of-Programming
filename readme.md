# CLASE 1 MIÉRCOLES 27 DE MARZO DEL 2024
> Lo que vimos en la clase anterior:
<sub>
Abrimos la terminal de Git Bash en Window o la terminal de Ubuntu, tambien la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios
</sub>

```sh
pwd  #Vemos la ruta de la carpeta en la que estamos
cd #Es para navegar a una carpeta: change directory -> cambiar de directorio
cd / #Nos llava al home, en la raíz del disco
cd ~ #La virgulilla significa que estamos en el lugar de los documentos o del usuario
ls #Esto es listar los archivos, nos muestra todos los archivos en la raíz
ls -al #El espacio -al significa que es un argumento especial para ver archivos ocultos
#Usar la flecha hacía arriba nos muestra el último comando utilizado
ls -l #Muestra casi todos los archivos sin los que están ocultos
ls -a #Muestra el grupo de archivos pero no en una lista
clear #Limpia la consola o ctrl + l
cd .. #Nos devuelve a la carpeta anterior
cd U + tab #Esto se usa para un autocompletado o para buscar una referencia
cd /D #Cambiamos de disco en window
df -h #Muestra todos los directorios en Ubuntu
cd /mnt/d #Cambia de directorio usando WSL Ubuntu en window

```

## AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS
```sh
cd ..
cd ..
cd /mnt/c
cd ~ #Vamos a la raíz
mkdir Tecnicatura #Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux
cd tecnicatura
mkdir Python
mkdir Java
mkdir JavaScript
```
<sub>
Revisar y ejecutar cada comando, hacerlo como practica</sub>
<sub>
Profesor Ariel Betancud </sub>


## CLASE 2 MIÉRCOLES 3 DE ABRIL DEL 2024
<sub>
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador</sub>

```sh
touch vacio.txt #Crea un archivo con su extención: ESCRIBIR DENTRO
ctrl + s #Guardamos lo que escribimos en el archivo
./ #Significa la carpeta actual
../ #Significa la carpeta anterior
cat vacio.txt #Vemos el contenido del archivo
history #Veremos la historia completa de los comandos que hemos utilizado
!72 + enter #Veremos el comando que utilizamos en ese número
rm vacio.txt #Borra el archivo seleccionado, ¡¡¡¡CUIDADO!!!!
rm --help #Muestra como funciona el comando
```

## CREAR UN REPOSITORIO DE GIT Y HAZ TU PRIMER COMMIT

```sh 
cd tecnicatura
mkdir class-git
cd class-git #Entramos en la carpeta que necesitamos trabajar
git init #Creamos un repositorio en la carpeta central, se crea el archivo .git
code .  #Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados
ctrl + n #Creamos un archivo nuevo y escribimos en el, como lo hicimos antes
ctrl + s #Guardamos poniendo el nombre: historia.txt
git status #Vemos el estado del proyecto en tiempo real, esta en el área de trabajo
git add historia.txt #Enviamos el archivo al área de preparación
git status #Para ver el estado de cambios
git rm --cached historia.txt #Quitamos el archivo del área de preparación, cached significa que esta en memoria ram
git config #Tedremos la lista de como funciona la configuración
git config --list #Configuraciones por defecto, faltan cosas importantes
git config --list --show-origin #Veremos donde están las configuraciones guardadas
git config --global user.name "Ariel Betancud"
git config --global user.email "betancudariel@gmail.com" #El correo debe ser el mismo que usaremos en GitHub
git config --list #Ahora veremos que ya están todos los datos completos
git add . #Ingresamos todos los archivos al área de preparación (ram)
git commit -m "Mensaje importante del commit" #El primer commit esta hecho
code . #Hacemos cambios en el archivo y guardamos
git status #Hay cambios para commitear
git add .
git commit -m "Mi segundo commit"
git log historia.txt #Vemos toda la historia de este archivo, el número largo es el hash del commit
```
<sub>
Revisar y ejecutar cada comando, hacerlo como practica</sub>
<sub>
Profesor Ariel Betancud</sub>

## CLASE 4 MIÉRCOLES 17 DE ABRIL DEL 2024
<sub>
Analizar cambios en los archivos de tu proyecto Git parte 4</sub>

<sub>Ingresamos de la siguiente manera:</sub>
<sub>
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>
<sub>
TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.
</sub>

```sh 
cd tecnicatura
cd class-git
ls
touch historia.txt
code .
#Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido     mi nombre es Ariel (coloca tu nombre)
ctrl + s
git status
git add .
git status
git commit #Sin agregar -m veremos que pasa

# Agregar mensaje y salir con
Esc #Presionamos Escape 
:wq! + enter #Y ya salimos si estamos en git bash con window
Esc + shift + z + z #Salimos del mensaje para el commit, en linux, esto anda en algunas terminales
#Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación
ctrl + s
git add .
git commit
#Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim
Esc + i #Para comenzar a escribir mensaje del commit, no suele ser necesario
ctrl + x #Para salir en linux
s + enter #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux
git show #Vemos todos los cambios en el último commit
git log historia.txt #Vemos todos los commit
q #Para salir del registro de commits
#Copiamos un hash mas antoguo y otro reciente, ingresamos el siguiente comando
git diff hash_commit_numerico hash_commit_numerico #Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva
q #Para salir
cd ..
cd ..
```

<sub>
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sub>
<sub>
Revisar y ejecutar cada comando, hacerlo como practica</sub>
<sub>
Profesor Ariel Betancud</sub>

# CLASE 6 MIÉRCOLES 8 DE MAYO DEL 2024
<sub>
Volver en el tiempo en nuestro repositorio utilizando reset y checkout parte 6</sub>
<sub>
Ingresamos de la siguiente manera:</sub>
<sub>
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>
<sub>
TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.</sub>

```sh 
cd tecnicatura
cd class-git
ls
code .
git log #Vemos los commit hechos hasta ahora
Copiar el hash #El número largo que tiene el commit
git reset hash-nombre-commit #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave
git status
git add .
git commit -m "Agregamos datos de estudios en historia.txt"
git config --list #Veremos la configuración que ya hemos hecho con en nombre y email
git reset hash-nombre-commit --hard #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo
git reset hash-nombre-commit --soft #Este es el suave, lo que tengamos en staging segirá allí
crear un archivo #portafolio.html introducir el código y
touch portafolio.html
html : 5 #Con esto se carga el código básico de html y modificamos
ctrl + s #Guardamos
Clic derecho en VSC Open with Live Server para ver en el navegador
git status
ls
ls -al
git add .
git status
git commit -m "Agregamos el html para nuestro portafolio"
creamos CSS #Este es un archivo de estilos, para esto creamos una nueva carpeta llamada css
mkdir css
ls
cd css
touch style.css #creamos un archivo dentro: estilos.css le cargamos el código.
ctrl + s #abrimos en el navegador y todo esta allí, pero todo esto supuestamente en git no existe.
git status #tenemos cosas en el área de trabajo, en staging distintas
git diff + enter #y nos muestra los cambios en memoria ram y en disco
git add . #Agregamos todo al staging
git status #Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea
git commit -m "Creamos el css para darle algo de estilo a nuestro portafolio"
git log #vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte
hacer cambios en historia.txt #Cambiamos la última línea y
ctrl + s 
git diff
git commit -am "cambio en la última línea del historia.txt"
git log
q  #Esto para salir
git log --stat #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits
q #salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit
git checkout hash-nombre-commit historia.txt #Veremos el archivo en su estado original
git status #Nos sugiere hacer un commit, si lo hacemos borramos todo lo que hicimos antes, debemos seguir con el siguiente commando
git checkout master historia.txt #Volvemos a la versión master del archivo historia.txt, esto es muy peligroso
git checkout hash-nombre-commit historia.txt #Volvemos a hacer esto y cambiamos cosas del archivo
git commit -am "Reemplazo de una versión por otra de la historia"
git log #Veremos los cambios sin tocar ningun otro archivo, esta es la forma de volver a una versión hacía atrás y llevarla a la cabeza de la master
cd ..
cd ..
```

<sub>
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sub>
<sub>
Revisar y ejecutar cada comando, hacerlo como practica</sub>
<sub>
Profesor Ariel Betancud</sub>

# CLASE 7 MIÉRCOLES 15 DE MAYO DEL 2024 - Portafolio 1
<sub>
Git reset vs. Git rm parte 7</sub>

<sub>
Los comandos git reset y git rm tienen utilidades muy diferentes, pero pueden confundirse fácilmente.</sub>

<sub>
GIT RESET</sub>

<sub>
El comando git reset es una herramienta poderosa que te permite deshacer o revertir cambios en tu repositorio de Git. Lo puedes ejecutar de tres maneras diferentes, con las líneas de commando --soft, --mixed y --hard.</sub>
<sub>
Pero como git checkout que nos deja ir, mirar, pasear y volver. Con git reset volvemos al pasado sin la posibilidad de volver al futuro. Borramos la historia y la debemos sobreescribir. No hay vuelta atrás.</sub>
<sub>
Tres árboles en Git Para entender lo anterior, recordemos que los “tres árboles” de Git son estructuras de datos basadas en nodos y punteros que Git utiliza para hacer seguimiento a un cronograma de ediciones, aunque no sean estructuras en forma de árbol en el sentido tradicional.</sub>
<sub>
La mejor forma de entender estos mecanismos es creando un conjunto de cambios en un repositorio y siguiéndolos a través de los tres árboles.Averigüémoslo.</sub>
<sub>
Ingresamos de la siguiente manera:</sub>
<sub>
Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>
<sub>
TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.</sub>


```sh 
mkdir git_reset_test #Vamos a hacer pruebas, es por esto que creamos una carpeta nueva
cd git_reset_test #Entramos en la carpeta
git init #Inicializamos el repositorio
touch reset_file.txt
git add reset_file.txt
git commit -m"Iniciando el primer commit"
¿Cómo funciona Git Reset en tu flujo de trabajo? 
Git reset permite moverte entre diferentes commits para deshacer o rehacer cambios. Git guarda todo lo nuevo del repositorio como commits, que son instantáneas del estado del código en un momento dado y existen variaciones de este comando.
Variaciones de Git Reset 
git reset --soft: Borra el historial y los registros de Git de commits anteriores, pero guarda los cambios en Staging para aplicar las últimas actualizaciones a un nuevo commit. 
git reset --hard: Deshace todo, absolutamente todo. Toda la información de los commits y del área de staging se elimina del historial. 
git reset --mixed: Borra todo, exactamente todo. Toda la información de los commits y del área de staging se elimina del historial. 
git reset HEAD: El comando git reset saca archivos del área de staging sin borrarlos ni realizar otras acciones. Esto impide que los últimos cambios en estos archivos se envíen al último commit. Podemos incluirlos de nuevo en staging con git add si cambiamos de opinión. Ten en cuenta que, si deshaces commits en un repositorio compartido en GitHub, estarás cambiando su historia y esto puede causar problemas de sincronización con otros colaboradores.
¿Qué es git reset HEAD? 
git reset HEAD es un comando que te permite revertir los cambios que ya habías preparado para subir, y moverlos de vuelta a tu proyecto. Con este comando puedes cancelar los cambios que ya habías agregado, para que puedas revisarlos, modificarlos o deshacerlos antes de confirmarlos con un commit.
git rm Por otro lado, es un comando que nos ayuda a eliminar archivos de Git sin eliminar su historial del sistema de versiones. Para recuperar el archivo eliminado, necesitamos retroceder en la historia del proyecto, recuperar el último commit y obtener la última confirmación antes de la eliminación del archivo.
Es importante tener en cuenta que git rm no puede usarse sin evaluarlo antes. Debemos usar uno de los flags siguientes para indicarle a Git cómo eliminar los archivos que ya no necesitamos en la última versión del proyecto.
Variaciones de Git rm
git rm --cached: Elimina archivos del repositorio local y del área de staging, pero los mantiene en el disco duro. Deja de trackear el historial de cambios de estos archivos, por lo que quedan en estado untracked, que significa: que un archivo no está siendo rastreado por Git
git rm --force: Elimina los archivos de Git y del disco duro. Git guarda todo, por lo que podemos recuperar archivos eliminados si es necesario (empleando comandos avanzados). ¡Al usar git rm lo que haremos será eliminar este archivo completamente de git!
¿Cuál es la diferencia entre git rm y git reset Head? 
La diferencia principal entre git rm y git reset HEAD radica en que git rm elimina archivos del repositorio y de la historia del proyecto, mientras que git reset saca los cambios del área de preparación y los mueve del espacio de trabajo, sin afectar la historia del repositorio.
Es importante tener en cuenta el efecto que cada comando tiene en el proyecto y usarlos según tus necesidades y objetivos específicos.
```
<sub>
¿Cuándo utilizar git reset en lugar de git revert? 

Para reescribir la historia del repositorio y eliminar confirmaciones anteriores, se utiliza git reset. Para deshacer cambios de confirmaciones anteriores de forma segura sin modificar la historia del repositorio, se emplea git revert.</sub>

<sub>
Resumen Para evitar problemas en el trabajo, es valioso entender las implicaciones y riesgos de cada comando y elegir el enfoque adecuado según las necesidades y el flujo de trabajo del proyecto.</sub>
<sub>
Con git rm eliminamos un archivo de Git, pero mantenemos su historial de cambios. Si no queremos borrar un archivo, sino dejarlo como está y actualizarlo después, no debemos usar este comando en este commit.</sub>
<sub>
Empleando git reset HEAD, movemos los cambios de Staging a Unstaged, pero mantenemos el archivo en el repositorio con los últimos cambios en los que hicimos commit. Así, no perdemos nada relevante.</sub>
<sub>
Siguientes pasos Bueno, todos los cambios están en el área de Staging, incluido el archivo con los cambios que no están listos. Esto significa que debemos sacar ese archivo de Staging para poder hacer commit de todos los demás.</sub>
<sub>
Crear cambios en el archivo creado, donde vamos a hacer varios commits, para ir probando los nuevos comandos, al finalizar las pruebas, eliminar el directorio con todo su contenido.</sub>

<sub>
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sub>

# CLASE 8 MIÉRCOLES 22 DE MAYO DEL 2024 - Portafolio 2
<sub>
Flujo de trabajo básico con un repositorio remoto parte 8</sub>

<sub>
Cuando empiezas a trabajar en un entorno local, el proyecto vive únicamente en tu computadora. Esto significa que no hay forma de que otros miembros del equipo trabajen en él.</sub>
<sub>
Para solucionar esto, utilizamos los servidores remotos: un nuevo estado que deben seguir nuestros archivos para conectarse y trabajar con equipos de cualquier parte del mundo.</sub>
<sub>
Estos servidores remotos pueden estar alojados en GitHub, GitLab, BitBucket, entre otros. Lo que van a hacer es guardar el mismo repositorio que tienes en tu computadora y darnos una URL con la que todos podremos acceder a los archivos del proyecto. Así, el equipo podrá descargarlos, hacer cambios y volverlos a enviar al servidor remoto para que otras personas vean los cambios, comparen sus versiones y creen nuevas propuestas para el proyecto.</sub>
<sub>
Esto significa que debes aprender algunos nuevos comandos</sub>

```sh 
Comandos para trabajo remoto con GIT
git clone url_del_servidor_remoto #Nos permite descargar los archivos de la última versión de la rama principal y todo el historial de cambios en la carpeta .git
git push #Luego de hacer git add y git commit debemos ejecutar este comando para mandar los cambios al servidor remoto.
git fetch #Lo usamos para traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local (en caso de que hayan, por supuesto).
git merge #También usamos el comando git merge con servidores remotos. Lo necesitamos para combinar los últimos cambios del servidor remoto y nuestro directorio de trabajo.
git pull #Básicamente, git fetch y git merge al mismo tiempo.
#Adicionalmente, tenemos otros comandos que nos sirven para trabajar en proyectos muy grandes:
git log --oneline #Te muestra el id commit y el título del commit.
git log --decorate #Te muestra donde se encuentra el head point en el log.
git log --stat #Explica el número de líneas que se cambiaron brevemente.
git log -p #Explica el número de líneas que se cambiaron y te muestra que se cambió en el contenido.
git shortlog #Indica que commits ha realizado un usuario, mostrando el usuario y el título de sus commits.
git log --graph --oneline --decorate --all
git log --pretty=format #"%cn hizo un commit %h el dia %cd": Muestra mensajes personalizados de los commits.
git log -3 #Limitamos el número de commits.
git log --after=“2018-1-2”
git log --after=“today” 
git log --after=“2018-1-2” --before=“today” #Commits para localizar por fechas.
git log --author=“Name Author” #Commits hechos por autor que cumplan exactamente con el nombre.
git log --grep=“INVIE” #Busca los commits que cumplan tal cual está escrito entre las comillas.
git log --grep=“INVIE” –i #Busca los commits que cumplan sin importar mayúsculas o minúsculas.
git log – index.html #Busca los commits en un archivo en específico.
git log -S “Por contenido” #Buscar los commits con el contenido dentro del archivo.
git log > log.txt #guardar los logs en un archivo txt
```

<sub>
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sub>

# CLASE 9 MIÉRCOLES 29 DE MAYO DEL 2024 - Portafolio 3
<sub>
Introducción a las ramas o branches de Git parte 9</sub>
<sub>
Cuando entramos en el proyecto veremos que nos encontramos con la rama master, y es a partir de allí que debe saber que esta es la rama madre o principal rama, y las otras ramas se crean para no afectar a la master</sub>

<sub>
Las ramas (branches) son la forma de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.</sub>
<sub>
La cabecera o HEAD representan la rama y el commit de esa rama donde estamos trabajando. Por defecto, esta cabecera aparecerá en el último commit de nuestra rama principal. Pero podemos cambiarlo al crear una rama (git branch rama, git checkout -b rama) o movernos en el tiempo a cualquier otro commit de cualquier otra rama con los comandos (git reset id-commit, git checkout rama-o-id-commit).</sub>
<sub>
Repasa: ¿Qué es Git?</sub>
<sub>
Cómo funcionan las ramas en GIT
Las ramas son la manera de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.</sub>

```sh 
git branch nombre de la rama #Con este comando se genera una nueva rama.
git checkout nombre de la rama #Con este comando puedes saltar de una rama a otra.
git checkout -b rama #Genera una rama y nos mueve a ella automáticamente, Es decir, es la combinación de git branch y git checkout al mismo tiempo.
git reset id-commit #Nos lleva a cualquier commit no importa la rama, ya que identificamos el id del tag., eliminando el historial de los commit posteriores al tag seleccionado.
git checkout rama-o-id-commit #Nos lleva a cualquier commit sin borrar los commit posteriores al tag seleccionado.
```
<sub>
Vamos a hacer una practica: mientras la rama master esta cambiando normalmente, vamos a crear una rama paralela que va a crear nuevas secciones: osea una sección y a esta rama la vamos a llamar segunda y con esto, la vamos a fusionar para ver como queda en la rama master y así entender el flujo de ramas entre git. Al crear otra rama estamos creando una copia de todos los commit que ya tiene la rama master en la nueva rama y todos los cambios que hagamos en esta nueva rama, no los va a ver la rama master hasta que no la volvamos a fusionar con un proceso que se llama merge.</sub>

```sh 
Abrir terminal #En ubuntu
Abrir como adminstrados git bash #En window
cd Tecnicatura
cd class-git
code . #En ubuntu
code . #En window, abrir como administrador
ctrl + s #Guardamos
clic mouse derecho #Abrimos en el navegador con Live Server vemos los cambios
git status
git commit -am "mensaje del commit" #Este solo funciona con archivos creado previamente
git commit -a -m "Mensaje del commit" #Esto es lo mismo que el anterior
git commit -a + enter #Se abrira el entorno para editar el vim con el mensaje
Escribir el mensaje
ctrl + x
s + enter #No cambiar el nombre ni ruta de ubicación
git log #Veremos los cambios guardados
q #Para salir
git log --stat #Veremos los cambios nombrando cada archivo
q #Para salir
git branch #Muestra en la rama que estamos, desde aquí crearemos una nueva
git show #Muestra el último cambio que hicimos, esto significa que desde el HEAD -> master es que haremos cambios
q #Para salir
ctrl + l #Limpiamos consola
git branch segunda #creamos una nueva rama
git show #Nos muestra ahora que esta en el HEAD -> master, cabecera aquí es donde esta apuntando, es decir el último commit esta pegado a dos ramas distintas, aunque todavía estemos en master
q #Para salir
git status #No hay nada para hacer commit
git chekout segunda #Nos movemos hacía otras ramas, en este caso a segunda, esto no se ve en mac ni en ubuntu, para ver donde estamos hay que ingresar...
git branch #veremos en que rama estamos ubicados o ingresando...
git status #Veremos en que HEAD estamos apuntando
VSC #hacemos cambios que veremos con Nico
```
<sub>
Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:
Dante Nicolás Martinez
Parte 2:
Introduccin</sub>

```sh 
ctrl + s 
F5 #Actualizamos en el navegador para ver los cambios
git status #Veremos el archivo que modificamos
git add .
git commit
vim escribimos el mensaje del commit
ctrl + x
s #Para un si 
enter #Terminado el mensaje del commit
git status #No hay mas nada para commitear y estamos en la rama segunda
git show #Vemos todo lo que cambiamos
q #Para salir
git log #Nos muestra donde estabamos con la rama master y el HEAD paso a la rama cabecera
q #Para salir
git checkout master #Volvemos a la rama master, desaparese lo que habíamos hecho
git log #No muestra lo que hicimos en el portafolio
q #Para salir
git checkout segunda #Volvemos a ver todos los cambios que hicimos de nuevo
```
<sub>
La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.</sub>
Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.
Profesor Ariel Betancud</sub>

