<script setup>
// Importación de los componentes que se usarán en este archivo
import NavBar from './components/NavBar.vue'; // Barra de navegación
import DatosPersonales from './components/DatosPersonales.vue'; // Componente de datos personales
import Educacion from './components/EducacionComponente.vue'; // Componente de educación y cursos
import ExperienciaComponente from './components/ExperienciaComponente.vue'; // Componente de experiencia laboral
import ProyectosComponente from './components/ProyectosComponente.vue'; // Componente de proyectos
import HabilidadesComponente from './components/HabilidadesComponente.vue'; // Componente de habilidades
import InteresesComponente from './components/InteresesComponente.vue'; // Componente de intereses
</script>

<template>
    <header id="top">
        <!-- Barra de navegación en la parte superior -->
        <NavBar />
        
        <!-- Componente de datos personales con información básica del portafolio -->
        <DatosPersonales />
    </header>

    <main>
        <!-- Sección de Educación, Experiencia, Proyectos, etc. -->
        <section id="educacion">
            <h2>Educación - Cursos</h2>
            <Educacion />
        </section>
        <section id="experiencia">
            <h2>Experiencia</h2>
            <ExperienciaComponente />
        </section>
        <section id="proyectos">
            <h2>Proyectos</h2>
            <ProyectosComponente />
        </section>
        <section id="habilidades">
            <h2>Habilidades</h2>
            <HabilidadesComponente />
        </section>
        <section id="intereses">
            <h2>Intereses</h2>
            <InteresesComponente />
        </section>
    </main>

    <footer>
        <!-- Enlaces de navegación hacia las secciones de la página -->
        <a href="#educacion" class="footer-link">Educación</a>
        <a href="#experiencia" class="footer-link">Experiencia</a>
        <a href="#proyectos" class="footer-link">Proyectos</a>
        <a href="#habilidades" class="footer-link">Habilidades</a>
        <a href="#intereses" class="footer-link">Intereses</a>
        
        <!-- Información de copyright -->
        <p>© 2024 Londero Carina Elizabeth - Portafolio web - tutorial UTN FRSR</p>
    </footer>
</template>

<style scoped>
/* Estilo general para el footer */
footer {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 2rem;
    font-size: 1.3rem;
    text-align: center;
}

/* Estilo para los enlaces dentro del footer */
.footer-link {
    background-color: rgb(240, 196, 204); /* Color de fondo similar al del componente de Datos Personales */
    border-radius: 10px; /* Bordes redondeados */
    padding: 10px 20px; /* Espaciado interno para hacer más clicables los enlaces */
    margin: 10px; /* Separación entre los enlaces */
    text-decoration: none; /* Quitamos el subrayado del enlace */
    color: #333; /* Color de texto oscuro para buena visibilidad */
    font-size: 1.1rem; /* Tamaño de texto moderado */
    transition: background-color 0.3s, box-shadow 0.3s; /* Transiciones suaves para los efectos hover */
}

/* Efecto cuando el usuario pasa el ratón sobre los enlaces */
.footer-link:hover {
    background-color: rgb(235, 99, 45); /* Cambio de fondo a un color anaranjado */
    box-shadow: 0 0 10px rgba(251, 249, 249, 0.7); /* Sombra sutil cuando se pasa el ratón */
}
</style>
