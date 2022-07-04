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
@import url(https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css)
</style>
