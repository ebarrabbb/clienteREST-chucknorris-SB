package es.iesclaradelrey.chucknorris;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteREST {
    @GetMapping("/chuck")
    public String obtenerChuck() {
        String url = "https://api.chucknorris.io/jokes/random";    // Cambia la URL según tu API REST
        RestTemplate restTemplate = new RestTemplate();
        String respuesta = restTemplate.getForObject(url, String.class);

        return respuesta;
    }
}
