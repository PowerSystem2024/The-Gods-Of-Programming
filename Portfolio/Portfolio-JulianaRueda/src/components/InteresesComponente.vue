<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
    'Soy una profesional proactiva yresponsable, con un alto nivel decompromiso en cada tarea que realizo.Me caracterizo por mi capacidad paraadaptarme rápidamente y mi constantedeseo de aprender y desarrollarme.Busco continuamente oportunidadespara mejorar mis habilidades y contribuirpositivamente al equipo y a laorganización.'


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
    <!-- <div class="intereses-contenedor">
        <ul class="contenedor-lista">
            <li class="item">
                Desarrollo de Software de Código Abierto: Contribuyo a proyectos en GitHub, colaborando con otros
                desarrolladores para mejorar herramientas y librerías populares.
            </li>
            <li class="item">
                Deportes al Aire Libre: Disfruto del senderismo y el ciclismo de montaña, actividades que practico
                regularmente para mantener un equilibrio entre el trabajo y la vida personal.
            </li>
            <li class="item">
                Tecnología de Innovación: Me apasiona explorar nuevas tendencias tecnológicas como la inteligencia
                artificial y el desarrollo de aplicaciones móviles.
            </li>
            <li class="item">
                Fotografía: Practico la fotografía como un hobby, lo que me ayuda a mantener una perspectiva creativa
                tanto en mi vida profesional como personal.
            </li>
        </ul>
    </div> -->
</template>

<style scoped>
.intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    padding: 1rem;
}

.contenedor-lista {
    list-style-type: none;
    padding: 1rem;
    margin-bottom: .5rem;
    color: black;
    font-size: 1.4rem;
    text-shadow: 3px 3px 6px rgba(0, 0, 0, 1);
}

.item {
    margin-bottom: 1rem;
}

.fondo-lava {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1; /* Asegura que esté en una capa inferior */
  overflow: hidden;
}
</style>