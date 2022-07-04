import axios from "axios";

//const INSTRUCTOR = "in28minutes";
const COURSE_API_URL = "http://localhost:80";
const INSTRUCTOR_API_URL = `${COURSE_API_URL}/producto`;

class ProductoDataService {
  retrieveAllCourses() {
    return axios.get(`${INSTRUCTOR_API_URL}/dtoprodsolo`);
  }
}

export default new ProductoDataService();
