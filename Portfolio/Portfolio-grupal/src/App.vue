<script setup>
import DatosPersonales from './components/DatosPersonales.vue';
import NavBar from './components/NavBar.vue';
import IntegrantesGrupo from './components/IntegrantesGrupo.vue';
import LenguajesYTecnologias from './components/LenguajesYTecnologias.vue';

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
  <section id="mas"><h2>Más</h2></section>
</main>
</template>

<style scoped>


</style>
