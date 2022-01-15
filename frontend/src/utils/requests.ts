//?? informa que se process.env.REACT_APP_BACKEND_URL
//não estiver definida vai usar a localhost
export const BASE_URL = process.env.REACT_APP_BACKEND_URL ?? "http://localhost:8080";

