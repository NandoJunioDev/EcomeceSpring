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
import ecomece.ecomece.Service.Service_Autenticacao;

    @Controller
    
    public class Autenticaemail_Controler {
        private  Service_Autenticacao service_Autenticacao;

        @Autowired
        public  void AutenticaEmailController(Service_Autenticacao service_Autenticacao) {
            this.service_Autenticacao = service_Autenticacao;
        }
    
        @PostMapping("/signup")
        public ResponseEntity<String> cadastrar(@RequestBody Cadastros cadastros) {
            String response = service_Autenticacao.vericacaoemail(cadastros);
            if ("Email cadastrado".equals(response)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
}
