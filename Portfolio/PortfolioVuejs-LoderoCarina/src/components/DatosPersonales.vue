<script setup>
// Importación de los iconos SVG de las redes sociales
import linkedin from '/src/assets/linkedin_icon.svg';
import instagram from '/src/assets/instagram_icon.svg';
import github from '/src/assets/github_icon.svg';
import cv from '/src/assets/cv_resume_icon.svg';

// Definición de las constantes que contienen los datos personales y profesionales
const title = 'Londero Carina Elizabeth'; // Nombre completo
const descripcion = 'Técnico Universitario en Programación - UTN'; // Descripción del título profesional
const residencia = 'Cordoba- Capital, Argentina'; // Ubicación geográfica
const presentacion = 'Hola, Bienvenido a mi portafolio de proyectos. Soy desarrollador web con experiencia en el desarrollo de aplicaciones web y móviles.'; // Breve presentación

// Definición de un array de objetos que representan las redes sociales y sus enlaces
const redesSociales = [
  { id: 1, name: 'linkedin', src: linkedin, url: '' }, // LinkedIn
  { id: 2, name: 'Instagram', src: instagram, url: '' }, // Instagram
  { id: 3, name: 'github', src: github, url: '' }, // GitHub
  { id: 4, name: 'curriculum', src: cv, url: '' }, // CV / Resumen
];
</script>

<template>
  <!-- Contenedor principal de los datos personales -->
  <section class="datos-personales">
    <div class="card">
      <!-- Nombre completo -->
      <h1>{{ title }}</h1>
      <!-- Título profesional -->
      <h2>{{ descripcion }}</h2>
      <!-- Presentación personal -->
      <p>{{ presentacion }}</p>

      <!-- Lista de redes sociales con los iconos -->
      <ul class="container-lista">
        <!-- Iteramos sobre el array 'redesSociales' para mostrar cada red social -->
        <li v-for="red in redesSociales" :key="red.id">
          <!-- Enlace a la URL de la red social (actualmente vacío, se puede completar con las URLs reales) -->
          <a :href="red.url">
            <!-- Imagen del icono de la red social -->
            <img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name">
          </a>
        </li>
      </ul>

      <!-- Ubicación geográfica -->
      <h3>{{ residencia }}</h3>
    </div>
  </section>
</template>

<style scoped>
/* Estilos específicos para el título principal (nombre) */
h1 {
  font-size: 2.5rem; /* Tamaño grande */
}

/* Estilos para el párrafo de presentación */
p {
  font-size: 1.2rem; /* Tamaño intermedio */
  font-weight: 600; /* Peso semi-negrita */
  margin-bottom: 1rem; /* Espacio debajo del párrafo */
}

/* Estilos para la tarjeta que contiene toda la información personal */
.card {
  background-color: rgb(240, 196, 204); /* Color de fondo */
  border-radius: 10px; /* Bordes redondeados */
  padding: 10px; /* Espaciado interno */
  margin: 10px; /* Espaciado externo */
  text-align: center; /* Alineación centrada del texto */
}

/* Estilos para la lista de iconos de redes sociales */
.container-lista {
  display: flex; /* Usamos flexbox para alinear los íconos horizontalmente */
  justify-content: center; /* Centramos los íconos horizontalmente */
  list-style: none; /* Quitamos los puntos de lista */
  padding: 0; /* Quitamos el padding por defecto */
  margin: 0; /* Quitamos el margen por defecto */
  text-align: center; /* Alineación centrada */
}

/* Estilos para los iconos de redes sociales */
.icon-redsocial {
  align-items: center; /* Centra el contenido del icono */
  background-color: aliceblue; /* Fondo azul claro */
  border-radius: 50%; /* Iconos redondeados */
  padding: 2px; /* Espaciado interno */
  margin: 5px; /* Espaciado entre iconos */
  box-shadow: 0 0 5px rgba(4, 26, 87, 0.322); /* Sombra sutil alrededor del icono */
}

/* Efecto al pasar el ratón sobre los iconos */
.icon-redsocial:hover {
  background-color: rgb(235, 99, 45); /* Fondo anaranjado al pasar el ratón */
  box-shadow: 0 0 5px rgba(251, 249, 249, 0.934); /* Cambio en la sombra */
}

/* Estilos para la ubicación (residencia) */
h3 {
  font-size: 1.2rem; /* Tamaño de fuente intermedio */
  font-weight: 600; /* Peso semi-negrita */
}
</style>
