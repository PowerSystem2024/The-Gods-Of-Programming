<script setup>
const grupo = { nombre: "Mi experiencia"};
const miembros = [
    {id:1, nombre: ' Primer año de ingenieria en sistemas ', descripcion: 'En ese año comence a conocer el mundo de la programacion y me adentre en el rubro'}, 
    {id:2, nombre: "Curso tecnico en arreglo de computadoras(sin titulo)", descripcion: "Aprendi lo basico de como elegir bien los componentes de tu pc, tambien como armarla y en caso de fallos en el equipo a arreglarla."}, 
    {id:3, nombre: "Idiomas", descripcion:"Inglés avanzado (b2)"}]
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