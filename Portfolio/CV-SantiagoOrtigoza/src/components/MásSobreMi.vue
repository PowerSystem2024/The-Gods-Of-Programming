<script setup>
import { ref } from 'vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref(['Mi pasión por el fútbol me enseñó a trabajar en equipo, a luchar por mis objetivos y a celebrar los logros. Las películas me mostraron que la creatividad no tiene límites y que cada línea de código puede ser una escena memorable. Así que, amigos, ¿quieren unirse a mi equipo? ¿Quieren marcar goles en el mundo digital? La programación es nuestro campo de juego, y las posibilidades son infinitas. ¡Vamos a crear nuestra propia película épica!'
]);
</script>

<template>
    <div class="intereses-contenedor">
        <FondoLava />
        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">
                {{ interes }}
            </li>
        </ul>
        
    </div>
    
</template>

<style scoped>
.intereses-contenedor {
    /* Estilos para el contenedor principal */
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
  background-color: #555964;
    border-radius: 10px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    font-family: Arial, sans-serif;
    color: #ffffff; /* Texto oscuro para mayor contraste */
}

.descripcion p {
    font-size: 16px;
    line-height: 1.6;
    margin-bottom: 15px;
}

.llamado-accion {
    font-style: italic;
    color: #555555; /* Texto gris más claro para el llamado a la acción */
}
</style>