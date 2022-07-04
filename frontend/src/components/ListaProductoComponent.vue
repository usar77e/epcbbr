<template>
  <div class="container">
    <h3>Todos los productos</h3>
    <div class="container">
        <button class="btn btn-warning" v-on:click="exportarExcel()">
    Exportar
  </button>
    </div>
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
        message: null
    };
  },
  methods: {
    refreshCourses() {
      ProductoDataService.retrieveAllProductos()
        .then(response => {
          this.productos = response.data;
        });
    },
    exportarExcel() {
        ProductoDataService.retrieveExcel()
        .then(console.log("presionado"));
    }
  },
  created() {
    this.refreshCourses();
  }
};
</script>

<style>
</style>