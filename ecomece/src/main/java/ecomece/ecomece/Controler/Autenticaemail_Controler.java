package ecomece.ecomece.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecomece.ecomece.Cadastro.Cadastros;
import ecomece.ecomece.Repository.UsuarioRepository;
import ecomece.ecomece.Service.Service_Autenticacao;

    @Controller
    
    public class Autenticaemail_Controler {
        private  UsuarioRepository service_Autenticacao;

        @Autowired
        public void  AutenticaEmailController(UsuarioRepository Autenticacao) {
            this.service_Autenticacao = Autenticacao;
        }
    
        @PostMapping("/signup")
        public ResponseEntity<String> cadastrar(@RequestBody Cadastros cadastros) {
            if (service_Autenticacao.(cadastros.getEmail())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email já cadastrado");
            }
    
            service_Autenticacao.salvarUsuario(cadastros);
            return ResponseEntity.status(HttpStatus.CREATED).body("Cadastro realizado com sucesso");
        }
}
