import axios from "axios";

const COURSE_API_URL = "http://localhost:80";
const INSTRUCTOR_API_URL = `${COURSE_API_URL}/producto`;

class ProductoDataService {
  retrieveAllProductos() {
    return axios.get(`${INSTRUCTOR_API_URL}/dtoprodsolo`);
  }
  retrieveExcel(){
    return axios.get(`${INSTRUCTOR_API_URL}/exportar`);
  }
}

export default new ProductoDataService();
