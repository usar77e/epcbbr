<template>
  <div class="container">
    <h3>Todos los productos</h3>
    <div class="container">
      <table class="table">
        <thead>
          <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Modelo</th>
            <th>Marca</th>
            <th>Tipo de producto</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="producto in productos" v-bind:key="producto.idProducto">
            <td>{{producto.idProducto}}</td>
            <td>{{producto.nombre}}</td>
            <td>{{producto.modelo}}</td>
            <td>{{producto.marca.nombre}}</td>
            <td>{{producto.tipoProducto.nombre}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import ProductoDataService from '../service/ProductoDataService';
export default {
  name: "ListaProducto",
  data() {
    return {
        productos: [],
        message: null,
        INSTRUCTOR: "in28minutes"
    };
  },
  methods: {
    refreshCourses() {
      ProductoDataService.retrieveAllCourses() //HARDCODED
        .then(response => {
          this.productos = response.data;
        });
    }
  },
  created() {
    this.refreshCourses();
  }
};
</script>

<style>
</style>