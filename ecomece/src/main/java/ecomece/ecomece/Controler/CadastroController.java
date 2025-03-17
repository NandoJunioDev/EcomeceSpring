package ecomece.ecomece.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ecomece.ecomece.Cadastro.Cadastros;
import ecomece.ecomece.Service.Service_Cadastro;

@Controller




public class CadastroController {

    @Autowired
    private Service_Cadastro service_Cadastro ;

        @RequestMapping(value="/singup", method=RequestMethod.POST)
    public String cadastrar(@RequestParam String nome,@RequestParam String sobrenome,  @RequestParam String email, @RequestParam String senha)
    {
        Cadastros cadastro = new Cadastros();
        cadastro.setNome(nome);
        cadastro.setSobrenome(sobrenome);
        cadastro.setEmail(email);
        cadastro.setSenha(senha);
        
        
        service_Cadastro.cadastrar(cadastro);

        return "redirect:/login";
    }
}



