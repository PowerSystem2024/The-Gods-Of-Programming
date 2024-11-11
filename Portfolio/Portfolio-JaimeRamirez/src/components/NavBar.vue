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
    {id:1, nombre:'Educación', enlace:'#educacion'},
    {id:2, nombre:'Experiencia', enlace:'#experiencia'},
    {id:3, nombre:'Proyectos', enlace:'#proyectos'},
    {id:4, nombre:'Habilidades', enlace:'#habilidades'},
    {id:5, nombre:'Intereses', enlace:'#intereses'}
]);
</script>

<style scoped>
.navbar {
  padding: 10px 0;
}

ul {
  list-style-type: none;
  padding: 0;
  margin: 0;
  display: flex;
}

.nav-item {
  margin: 0 15px;
}

.navbar-menu {
    display: flex;
    justify-content: center;
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

a:hover {
    background-color: hsla(160, 100%, 37%, 0.2); /* Cambia el color de fondo al pasar el mouse sobre un enlace */
}

@media (max-width: 768px) {
  .navbar-menu {
    display: flex; /* Organiza los elementos en línea usando flexbox */
    justify-content: flex-end; /* Alinea los elementos al final de la navbar */
    width: 100%; /* Asegura que la navbar ocupe el 100% del ancho en pantallas pequeñas */
  }
}

</style>