package projecto_integrador.proy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import projecto_integrador.proy.Model.Usuario;
import projecto_integrador.proy.Services.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public String registro(@ModelAttribute Usuario usuario, Model model) {
        usuarioService.save(usuario);
        model.addAttribute("mensaje", "Registro exitoso!");
        return "Login"; // Redirige al login después del registro
    }

    @PostMapping("/procesarLogin")
    public String login(@ModelAttribute Usuario usuario, Model model) {
        Usuario encontrado = usuarioService.findByCorreo(usuario.getCorreo());
        if (encontrado != null && encontrado.getContrasena().equals(usuario.getContrasena())) {
            model.addAttribute("mensaje", "Inicio de sesión exitoso!");
            return "redirect:/inicio"; // Redirige a la página de inicio tras el login exitoso
        } else {
            model.addAttribute("mensaje", "Credenciales incorrectas");
            return "Login"; // Vuelve a mostrar el formulario de login si las credenciales son incorrectas
        }
    }
}
