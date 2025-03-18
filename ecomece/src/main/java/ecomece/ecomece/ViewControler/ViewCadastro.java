package ecomece.ecomece.ViewControler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/cadastro")
public class ViewCadastro {
    @GetMapping("/cadastro")
    public String singup(){
        return "cadastro";
    }
}
