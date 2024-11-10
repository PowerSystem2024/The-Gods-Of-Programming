<script setup>
import icono1 from '/src/assets/ventas.svg';
import icono2 from '/src/assets/ecomerce.svg';
import icono3 from '/src/assets/configuracion.svg';
import icono4 from '/src/assets/uiux.svg';


import { ref } from 'vue';
const titulo = 'Analista Sr - Gestión y Proyectos';
const fecha = 'Desde Enero 2018 / Actualmente';
const experiencias = ref([
    { id: 1, src: icono1, parrafo: 'Analista Sr. Data Analytics de Gestión de Deuda: Actualmente, me desempeño como Analista Sr. en Data Analytics, donde lidero el desarrollo de dashboards interactivos utilizando herramientas de Business Intelligence (BI) para el análisis y seguimiento de KPIs estratégicos. Estos informes facilitan la toma de decisiones ejecutivas y mejoran la visibilidad de los resultados. Además, implemento modelos analíticos avanzados para optimizar los procesos de control y gestión de deuda, lo que ha contribuido a mejorar la transparencia y eficiencia operativa.' },
    { id: 2, src: icono2, parrafo: 'Product Manager - Débitos Automáticos: En mi rol como Product Manager, supervisé la gestión y evolución del sistema de débito automático de impuestos provinciales para la Dirección General de Rentas (DGR) de Córdoba. Fui responsable del desarrollo y ejecución de planes de crecimiento, garantizando el cumplimiento de los objetivos establecidos. También coordiné la capacitación del personal y lideré la automatización de procesos internos para optimizar los controles. Además, gestioné los acuerdos con proveedores y administré las herramientas de gestión de pagos, mejorando la eficiencia operativa del área..' },
    { id: 3, src: icono3, parrafo: 'Analista de Programación Fiscal: Como Analista de Programación Fiscal, gestioné el control y la programación para la Policía Fiscal de la provincia de Córdoba. Mi enfoque estuvo en la implementación de nuevos procesos para mejorar la eficiencia de la recaudación fiscal. Participé activamente en el desarrollo de estrategias para aumentar la recaudación, así como en proyectos orientados a fomentar la conducta tributaria correcta entre los grandes contribuyentes.' },
    { id: 4, src: icono4, parrafo: 'Analista de Programación Fiscal: En este puesto, supervisé las operaciones del sistema de Recaudación Bancaria (SIRCREB), trabajando en el desarrollo de planes para incrementar la recaudación de impuestos. Me encargué de la creación y gestión de bases de datos y padrones de control recaudatorio, lo que permitió una mejor gestión de la información y optimización de los procesos de recaudación.' },
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experencia in experiencias" :key="experencia.id">
                <img class="imagen-svg" :src="experencia.src" width="45rem" :alt="experencia.parrafo">
                <p>{{ experencia.parrafo }}</p>
            </li>

            <!-- <li class="item"><img class="imagen-svg" src="/src/assets/ventas.svg" width="45rem" alt="">
                <p>Lideré un equipo de 5 desarrolladores en la creación de una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/ecomerce.svg" width="45rem" alt="">
                <p>Diseñé y desarrollé aplicaciones web utilizando Node.js, React y MongoDB, logrando reducir el tiempo de carga de las páginas en un 50%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/configuracion.svg" width="45rem" alt="">
                <p>Implementé soluciones de autenticación y autorización, mejorando la seguridad del sitio web y reduciendo los intentos de acceso no autorizado en un 20%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/uiux.svg" width="45rem" alt="">
                <p>Colaboré con diseñadores de UX/UI para crear interfaces de usuario atractivas y fáciles de usar, aumentando la satisfacción del cliente en un 15%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/watch.svg" width="45rem" alt="">
                <p>Automaticé procesos de despliegue continuo utilizando Jenkins y Docker, reduciendo los tiempos de despliegue en un 40%.</p>
            </li> -->
        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: rgb(240, 196, 204);
    border-radius: 15px;
}

.titulo {
    font-size: 1.5rem;
    color: rgb(235, 99, 45);
}

.fecha {
    font-size: 1rem;
    color: rgb(223, 128, 5);
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
}
</style>