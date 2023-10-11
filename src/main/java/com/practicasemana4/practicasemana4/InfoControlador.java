package com.practicasemana4.practicasemana4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoControlador {
    @GetMapping //GET Map default
    public String getInfo(){
        return "Hola";
    }
    
    @GetMapping("/servidor") //GET secundario (anidado dentro de /info)
    public String getInfoServer(){
        return "Servidor en linea GET";
    }

    @PostMapping("/servidor") //POST (anidado dentro de /info)
    public String postInfoServer(String nombre, String email){ //los parametros se pasan dentro de postman como un param/key
        System.out.println(nombre); 
        System.out.println(email); 
        return "POST -  Mi nombre es: "+nombre + " | mi correo es: " + email;
    }
}
