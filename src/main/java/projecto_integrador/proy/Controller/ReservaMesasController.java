package projecto_integrador.proy.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaMesasController {

    @GetMapping("/reservaMesas")
    public String reservaMesas() {
        return "ReservaMesas"; // Retorna la vista ReservaMesas.html
    }
}
