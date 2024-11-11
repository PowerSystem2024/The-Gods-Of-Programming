<script setup>
import DatosPersonales from './components/DatosPersonales.vue';
import NavBar from './components/NavBar.vue';
import IntegrantesGrupo from './components/IntegrantesGrupo.vue';
import LenguajesYTecnologias from './components/LenguajesYTecnologias.vue';
import Proyectos from './components/ProyectosComponente.vue';

</script>

<template>
<header>
<!--Barra de navegacion-->
      <NavBar/>
<!--DatosPersonales-->      
      <DatosPersonales/>

</header>
<main>
  <section id="integrantes"><h2>Integrantes</h2></section>
  <IntegrantesGrupo/>
  <section id="lenguajes"><h2>Lenguajes y Tecnologias</h2></section>
  <LenguajesYTecnologias/>
  <section id="proyectos"><h2>Proyectos</h2></section>
  <Proyectos/>
</main>

<footer>
      <a href="#top">Inicio</a>
      <p>© 2024 - The Gods of Programming</p>
</footer>
</template>

<style scoped>


</style>
