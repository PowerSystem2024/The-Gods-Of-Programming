<template>
    <nav class="navbar">
            <div class="navbar-menu">
                <ul>
<!--Se coloco el operador v-bind al atributo href utilizando su minima expreción el operador : / y se soluciono el enlace a las distintas secciones-->
                    <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item" >{{nav.nombre}}</a>  
                </ul>
            </div>
        </nav>
</template>
<script setup>
import { ref } from 'vue';
const navegacion= ref([
    {id:1, nombre: "Experiencia", enlace:'#Experiencia'},
    {id:2, nombre: "Lenguajes", enlace:'#Lenguajes'},
    {id:3, nombre: "Proyecto", enlace:'#Proyecto'},
    {id:4, nombre: "Más Sobre Mi", enlace:'#Más'}
]);
</script>

<style scoped>
/* Estilos para la barra de navegación */
.navbar {
    background-color: var(--vt-c-indigo); /* Establece el color de fondo usando una variable CSS */
    color: #ffffffe5; /* Establece el color del texto en blanco */
    padding: 0.5rem 1rem; /* Añade un padding de 0.5rem arriba y abajo, y 1rem a los lados */
    display: flex;
    justify-content: space-between; /* Alinea los elementos al inicio y al final de la navbar */
    align-items: center; /* Centra verticalmente los elementos dentro de la navbar */
}

/* Estilos para los elementos de la barra de navegación */
.navbar-item {
    color: #fff; /* Establece el color del texto en blanco */
    text-decoration: none; /* Elimina el subrayado de los enlaces */
    margin-right: 1rem; /* Añade un margen derecho de 1rem entre los elementos */
}

/* Estilos para los enlaces */
a {
    border: 1px solid; /* Añade un borde sólido de 1px */
    border-color: hsla(54, 100%, 80%, 0.651); /* Define el color del borde usando hsla */
    border-radius: 5px; /* Redondea las esquinas del borde */
    text-decoration: none; /* Elimina el subrayado de los enlaces */
    transition: 0.4s; /* Añade una transición suave de 0.4s para los cambios de estilo */
    padding: 5px; /* Añade un padding de 5px alrededor del contenido */
}

/* Estilos al pasar el mouse sobre los enlaces */
a:hover {
    background-color: hsla(54, 93%, 83%, 0.918); /* Cambia el color de fondo al pasar el mouse sobre un enlace */
}
</style>