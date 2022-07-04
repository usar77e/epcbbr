<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <ListaProducto></ListaProducto>
</template>

<script>
import ListaProducto from './components/ListaProductoComponent.vue'
export default {
  name: 'App',
  components: {
    ListaProducto
  }
}
</script>

<style>
@import url(https://unpkg.com/bootstrap@4.1.0/dist/css/bootstrap.min.css)
</style>
