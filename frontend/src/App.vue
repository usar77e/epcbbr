<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <!--<HelloWorld msg="Welcome to Your Vue.js App"/>-->
  <!--<ProductoApp></ProductoApp>-->
  <ListaProducto></ListaProducto>
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue'
//import ProductoApp from './components/ProductoApp.vue',
import ListaProducto from './components/ListaProductoComponent.vue'
export default {
  name: 'App',
  components: {
    //HelloWorld
    ListaProducto
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
