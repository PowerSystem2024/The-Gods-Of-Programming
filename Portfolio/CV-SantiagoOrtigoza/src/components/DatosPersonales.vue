<script setup>

const presentacion = 'Soy un apasionado desarrollador con más de 5 años de experiencia en proyectos web. Mi enfoque está en crear soluciones eficientes y escalables utilizando tecnologías como Python, Vue.js y Git. He trabajado en equipos multidisciplinarios y siempre busco aprender y crecer.'
const redessociales = [
    { id: 1, name: 'Linkedin', src: 'src/assets/linkedin_icon.svg', url: 'www.linkedin.com/in/TheGodsOfProgramming/'},
    { id: 2, name: 'Instagram', src: 'src/assets/instagram_icon.svg', url: 'www.instagram.com/TheGodsOfProgrammingOK/'},
    { id: 3, name: 'GitHub', src: 'src/assets/github_icon.svg', url: 'https://github.com/'},
];
</script>

<template>
    <section class="datos-personales">
        <div class="card">
            <h1>Santiago Ortigoza Peña</h1>
            <h2> {{ descripcion }}</h2>
            <p> {{ presentacion }}</p>
            <ul class="container-lista">
                <li v-for="red in redessociales" :key="red.id">
                    <a href="red.url"> <img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
                </li>
            </ul>
        </div>

    </section>
<ul>
  <li v-for="objeto in arreglo" :key="objeto.id"> {{objeto.nombre}} {{objeto.label}} </li>
</ul>
</template>
<style scoped>
h1 {
  font-size: 2.5rem;
  font-family: Arial, sans-serif; /* Fuente Arial */
  color: antiquewhite;
}

p {
  font-size: 1.2rem;
  font-weight: 600;
  margin-bottom: 1rem;
  font-family: Arial, sans-serif; /* Fuente Arial */
}

.card {
  background-color: #555964;
  border-radius: 10px;
  padding: 10px;
  margin: 10px;
  text-align: center;
}

.container-lista {
  display: flex;
  justify-content: center;
  list-style: none;
  padding: 0;
  margin: 0;
  text-align: center;
}

.icon-redsocial {
  align-items: center;
  background-color: aliceblue;
  border-radius: 50%;
  padding: 2px;
  margin: 5px;
  box-shadow: 0 0 5px rgba(95, 124, 205, 0.934);
}

.icon-redsocial:hover {
  background-color: rgb(28, 41, 52);
  box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}


</style>