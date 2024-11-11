<script setup>
const grupo = { nombre: "The Gods of Programming", descripcion: "Conozcamos brevemente a cada integrante del grupo"};
const miembros = [
  {id:1, nombre: 'Juan Pablo López', descripcion: 'Juan Pablo es un estudiante de desarrollo de software con una inclinación hacia la programación funcional. Le gusta explorar nuevos lenguajes de programación y en su tiempo libre disfruta tocar la guitarra y escribir poesía.', foto: 'src/assets/foto-juanpi.jpg'}, 
  {id:2, nombre: "Carina Londero", descripcion: "Carina es una estudiante de desarrollo de software con un interés especial en el análisis de datos y la optimización de consultas SQL. En su tiempo libre, disfruta de la jardinería y la fotografía.", foto: 'src/assets/foto-carina.jpg'}, 
  {id:3, nombre: "Jaime Nahuel Ramírez", descripcion:"Jaime es un estudiante de desarrollo de software apasionado por la ciberseguridad. Le gusta mantenerse al día con las últimas vulnerabilidades y en su tiempo libre practica artes marciales y cocina platos exóticos.", foto: 'src/assets/foto-jaime.jpg'}, 
  {id:4, nombre: "Uriel Ramírez", descripcion: "Uriel es un estudiante de desarrollo de software con un enfoque en el desarrollo full-stack. Le apasiona la creación de aplicaciones web interactivas y en su tiempo libre disfruta escalar montañas.", foto: 'src/assets/foto-uriel.jpg'}, 
  {id:5, nombre: "Juliana Rueda", descripcion:"Juliana es una estudiante de desarrollo de software con un talento especial para el diseño de interfaces de usuario (UI). En su tiempo libre, le gusta pintar al óleo y viajar.", foto: 'src/assets/foto-juliana.jpg'}, 
  {id:6, nombre: "Santiago Ortigoza", descripcion:"Santiago es un estudiante de desarrollo de software interesado en la arquitectura de software y los sistemas distribuidos. En su tiempo libre, disfruta de la astronomía y la observación de estrellas.", foto: 'src/assets/foto-santiago.jpg'}
];</script>

<template>
  <div id="app">
    <div class="container">
      <h1>{{ grupo.nombre }}</h1>
      <p>{{ grupo.descripcion }}</p>
      <ul>
        <li v-for="miembro in miembros" :key="miembro.id" class="miembro">
          <img :src="miembro.foto" :alt="miembro.nombre" class="foto">
          <div class="texto">
            <strong>{{ miembro.nombre }}</strong>
            <p>{{ miembro.descripcion }}</p>
          </div>
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
  .texto {
    text-align: center;
  }
  .foto {
    border-radius: 50%;
    width: 100px;
    height: 100px;
    object-fit: cover;
    display: block;
    margin: 0 auto 10px;
  }
</style>