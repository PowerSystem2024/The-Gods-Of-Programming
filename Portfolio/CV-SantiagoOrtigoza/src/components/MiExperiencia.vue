<script setup>
const grupo = { nombre: "Un repaso a mi experiencia"};
const miembros = [
    {id:1, nombre: ' Desarrollador Web en XYZ Tech ', descripcion: 'Implementé soluciones front-end utilizando Vue.js y React.'}, 
    {id:2, nombre: "Ingeniería en Sistemas, Universidad A. B. C", descripcion: "Universidad en donde me gradue con 9. Participe de distintas actividaddes extracurriculares de Programacion."}, 
    {id:3, nombre: "Idiomas", descripcion:"Inglés avanzado (TOEFL 110)"}]
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
    background-color: #555964;
    border-radius: 10px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    font-family: Arial, sans-serif;
    color: #ffffff;
    
}

h1 {
    font-size: 28px;
    margin-bottom: 30px; /* Ajustado para un espaciado más equilibrado */
}

p {
    font-size: 16px;
    line-height: 1.6; /* Ligeramente aumentado para una mejor legibilidad */
}

ul {
    list-style: none;
    padding: 0;
}

li {
    margin-bottom: 15px; /* Reducido para un espaciado más compacto */
}

strong {
    font-weight: bold;
    color: #cacee2;
}
</style>