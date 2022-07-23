import axios from "axios";

const COURSE_API_URL = "http://localhost:80";
const INSTRUCTOR_API_URL = `${COURSE_API_URL}/producto`;

class ProductoDataService {
  retrieveAllProductos() {
    return axios.get(`${INSTRUCTOR_API_URL}/dtoprodsolo`);
  }
  retrieveExcel(){
    /*console.log("retrieve");
    return axios.get(`${INSTRUCTOR_API_URL}/exportar`);*/

    return axios({
      url: `${INSTRUCTOR_API_URL}/exportar`,
      method: 'GET',
      responseType: 'blob'
    }).then((response) => {
      console.log(response);
      new Blob([response.data]);
    });

  }
}

export default new ProductoDataService();
