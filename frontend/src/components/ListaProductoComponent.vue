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
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>Dato ID</td>
            <td>Dato nombre</td>
            <td>Dato modelo</td>
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
      INSTRUCTOR: "in28minutes"
    };
  },
  methods: {
    refreshCourses() {
      ProductoDataService.retrieveAllCourses() //HARDCODED
        .then(response => {
          console.log(response.data);
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