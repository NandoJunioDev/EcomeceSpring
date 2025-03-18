package ecomece.ecomece.Controler;

import java.security.Provider.Service;
import ecomece.ecomece.ViewControler.ViewCadastro;
import ecomece.ecomece.ViewControler.ViewCadastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import ecomece.ecomece.Repository.UsuarioRepository;
import ecomece.ecomece.Service.Service_Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class LoginController {

    

    
    

@Autowired 
Service_Usuario service_Usuario;


@GetMapping("/fazer-login")
    public String mostrarLogin(@RequestParam(value = "erro", required = false) String erro, Model model) {
        if (erro != null) {
            model.addAttribute("erro", "Credenciais inválidas. Tente novamente.");
        }
        return "login"; // Nome da view de login (login.html)
    }


    
    


@PostMapping("/logado")
public String postMethodName(@RequestParam String email, @RequestParam  String senha, Model model ) {

    boolean auteticado = service_Usuario.autenciarusuario(email, senha);
    //TODO: process POST request
    
    if (auteticado) {
            return "redirect:/usuario";

    } else{
        return "redirect:/fazer-login?erro=true";

    }
    
}


@GetMapping("/usuario")
public String paginaUsuario() {
    return "usuario"; // Nome da view da página de usuário logado (usuario.html)
}





}
