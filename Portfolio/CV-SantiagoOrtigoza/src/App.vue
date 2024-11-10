<script setup>
import DatosPersonales from './components/DatosPersonales.vue';
import NavBar from './components/icons/NavBar.vue';
import MiExperiencia from './components/MiExperiencia.vue';
import LenguajesYTecnologias from './components/LenguajesYTecnologias.vue';
import ProyectoComponente from './components/ProyectoComponente.vue';
import MásSobreMi from './components/MásSobreMi.vue';
</script>

<template>
<header id="top">
<!--Barra de navegacion-->
      <NavBar/>
<!--DatosPersonales-->

      <DatosPersonales/>
     

</header>
<main>
  <section id="Experiencia"><h2>Experiencia</h2></section>
  <MiExperiencia/>
  <section id="Lenguajes"><h2>Lenguajes y Tecnologias</h2></section>
  <LenguajesYTecnologias/>
  <section id="Proyecto"><h2>Proyecto</h2></section>
  <ProyectoComponente/>
  <section id="Más"><h2>Más Sobre Mi</h2></section>
  <MásSobreMi/>
  
</main>

<footer>
        <a href="#top">Inicio</a>
        <p>© 2024 Santiago Ortigoza Peña- Portafolio web - UTN FRSR</p>
    </footer>
</template>

<style scoped>

footer {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 2rem;
    font-size: 1.3rem;
}
</style>
