<template>
    <nav class="navbar">
        <div class="navbar-container">
            <ul class="navbar-list">
<!--Se coloco el operador v-bind al atributo href utilizando su minima expreción el operador : / y se soluciono el enlace a las distintas secciones-->
                    <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="navbar-item" >{{nav.nombre}}</a>  
                </ul>
            </div>
        </nav>
</template>

<script setup>
import { ref } from 'vue';
const navegacion= ref([
    {id:1, nombre: "Integrantes", enlace:'#integrantes'},
    {id:2, nombre: "Lenguajes", enlace:'#lenguajes'},
    {id:3, nombre: "Proyectos", enlace:'#proyectos'}
]);
</script>

<style scoped>
.navbar {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    background: linear-gradient(90deg, #4b6cb7, #182848); /* Gradiente de color compatible con el fondo */
    color: #fff;
    padding: 1rem;
    display: flex;
    justify-content: center;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1); /* Sombra */
    z-index: 1000; /* Asegura que la navbar esté por encima de otros elementos */
}

.navbar-container {
    max-width: 1280px;
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}

.navbar-list {
    list-style: none;
    display: flex;
    gap: 1rem;
    margin: 0;
    padding: 0;
}

.navbar-item {
    color: #fff; /* Establece el color del texto en blanco */
    text-decoration: none; /* Elimina el subrayado de los enlaces */
    margin-right: 1rem; /* Añade un margen derecho de 1rem entre los elementos */
}

.navbar-item a {
    color: #fff;
    text-decoration: none;
    padding: 0.5rem 1rem;
    border-radius: 4px;
    transition: background-color 0.3s, transform 0.3s; /* Transiciones */
}

.navbar-menu {
    display: flex; /* Organiza los elementos en línea usando flexbox */
    justify-content: flex-end; /* Alinea los elementos al final de la navbar */
}

.nav-list {
    list-style: none; /* Elimina los puntos o números de las listas */
}

a {
    border: 1px solid; /* Añade un borde sólido de 1px */
    border-color: hsla(160, 100%, 37%, 0.2); /* Define el color del borde usando hsla */
    border-radius: 5px; /* Redondea las esquinas del borde */
    text-decoration: none; /* Elimina el subrayado de los enlaces */
    transition: 0.4s; /* Añade una transición suave de 0.4s para los cambios de estilo */
    padding: 5px; /* Añade un padding de 5px alrededor del contenido */
}

.navbar-item a:hover {
    background-color: rgba(255, 255, 255, 0.2); /* Fondo al pasar el ratón */
    transform: scale(1.05); /* Escala al pasar el ratón */
}

@media (max-width: 768px) {
  .navbar-container {
    flex-direction: column;
    align-items: flex-start;
  }

  .navbar-list {
    flex-direction: column;
    width: 100%;
  }

  .navbar-item {
    width: 100%;
  }

  .navbar-item a {
    display: block;
    width: 100%;
    text-align: left;
  }
}

</style>
