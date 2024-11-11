<template>
    <nav class="navbar">
            <div class="navbar-menu">
                <ul>
<!--Se coloco el operador v-bind al atributo href utilizando su minima expreción el operador : / y se soluciono el enlace a las distintas secciones-->
                    <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item" >{{nav.nombre}}</a>  
                </ul>
            </div>
        </nav>
</template>
<script setup>
import { ref } from 'vue';
const navegacion= ref([
    {id:1, nombre: "Integrantes", enlace:'#integrantes'},
    {id:2, nombre: "Lenguajes", enlace:'#lenguajes'},
    {id:3, nombre: "Proyecto", enlace:'#proyecto'},
    {id:4, nombre: "Más", enlace:'#más'}
]);
</script>

<style scoped>

.navbar {
  background-color: var(--vt-e-indigo);
  color:rgba(167, 0, 0, 0.781);
  padding: 0.5rem 1rem;
  align-items: center;
}
.navbar-item {
  color: rgb(120, 146, 146);
  text-decoration: none;
  margin-right: 1rem;


}
.navbar-menu {
  display: flex;
  justify-content: flex-end;
}
.nav-list{
  list-style: none;
}
a{
  border: 1px solid;
  border-color:cadetblue(160, 100%, 37%, 0.2);
  border-radius: 5px;
  text-decoration: none;
  transition: 0.4%;
  padding: 5px;
}
a:hover{
  background-color: cadetblue(160, 100%, 37%, 0.2);

}
@media(max-width: 768px){
  .navbar-menu{
    display: flex;
    justify-content: flex-end;
    width: 100%;
  }
}
</style>