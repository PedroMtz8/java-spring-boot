package com.api.crud;

// import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }

    // @PostMapping()
    // public ResponseEntity<Object> postSomething(){

    //     return ResponseEntity.ok();
    // } 

    @PostMapping("/receive-info")
    public ResponseEntity<Object> postSomething(@RequestBody InfoRequest infoRequest) {
        // Aquí puedes realizar cualquier lógica que necesites con la información recibida
        // En este ejemplo, simplemente devolvemos la misma información con un mensaje de éxito
        return ResponseEntity.ok()
                .body("Información recibida y regresada con éxito: Nombre: " + infoRequest.getNombre() +
                        ", Edad: " + infoRequest.getEdad());
    }

}

class InfoRequest {
    private String nombre;
    private int edad;

    // Constructor, getters y setters
    public InfoRequest() {}

    public InfoRequest(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
