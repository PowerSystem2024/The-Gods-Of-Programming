<script setup>
const grupo = { nombre: "The Gods of Programming", descripcion: "Conozcamos brevemente a cada integrante del grupo"};
const miembros = [
    {id:1, nombre: 'Juan Pablo López', descripcion: 'Juan Pablo es un apasionado desarrollador de software con una inclinación hacia la programación funcional. Su amor por los lenguajes de programación exóticos lo llevó a explorar Elixir y Haskell. Cuando no está codificando, le gusta tocar la guitarra y escribir poesía.'}, 
    {id:2, nombre: "Carina Londero", descripcion: "Carina es una ingeniera de datos con un enfoque en la optimización de consultas SQL. Ha trabajado en proyectos de análisis de big data y le encanta resolver problemas complejos. En su tiempo libre, disfruta de la jardinería y la fotografía."}, 
    {id:3, nombre: "Jaime Nahuel Ramírez", descripcion:"Jaime es un entusiasta de la ciberseguridad. Ha participado en competencias de hacking ético y siempre está al tanto de las últimas vulnerabilidades. Además de programar, le gusta practicar artes marciales y cocinar platos exóticos."}, 
    {id:4, nombre: "Uriel Ramírez", descripcion: "Uriel es un desarrollador full-stack con experiencia en JavaScript y Python. Le apasiona la creación de aplicaciones web interactivas y ha contribuido a proyectos de código abierto. Fuera del mundo digital, es un ávido escalador de montañas."}, 
    {id:5, nombre: "Juliana Rueda",descripcion:"Juliana es una diseñadora de interfaces de usuario (UI) con un ojo para los detalles. Ha trabajado en proyectos de diseño de aplicaciones móviles y sitios web. Cuando no está diseñando, le gusta pintar al óleo y viajar."}, 
    {id:6, nombre: "Santiago Ortigoza",descripcion:"Santiago es un arquitecto de software con experiencia en sistemas distribuidos. Ha trabajado en proyectos de alta escalabilidad y tolerancia a fallos. Además de programar, disfruta de la astronomía y la observación de estrellas."},];
</script>

<template>
  <div id="app">
    <div class="container">
      <h1>{{ grupo.nombre }}</h1>
      <p>{{ grupo.descripcion }}</p>
      <ul>
        <li v-for="miembro in miembros" :key="miembro.id">
          <strong>{{ miembro.nombre }}</strong>
          <p>{{ miembro.descripcion }}</p>
        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
  .container {
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
    background-color: #7284b6;
    border-radius: 10px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    font-family: Arial, sans-serif;
  }
  h1 {
    color: #ffffff;
    font-size: 28px;
    margin-bottom: 40px;
  }
  p {
    color: #00319c;
    font-size: 16px;
    line-height: 1.5;
  }
  ul {
    list-style: none;
    padding: 0;
  }
  li {
    margin-bottom: 20px;
  }
  strong {
    font-weight: bold;
    color: #cacee2;
  }
 
</style>