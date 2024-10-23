package projecto_integrador.proy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String index() {
        return "Inicio"; // Sirve la página Inicio.html desde /templates
    }
    @GetMapping("/inicio")
    public String inicio() {
        return "Inicio"; // Retorna la vista Inicio.html
    }
}
