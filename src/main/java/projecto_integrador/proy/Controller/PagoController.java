package projecto_integrador.proy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagoController {

    @GetMapping("/pago")
    public String pago() {
        return "Pago"; // Retorna la vista Pago.html
    }
}
