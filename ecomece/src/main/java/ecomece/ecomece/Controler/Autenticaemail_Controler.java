package ecomece.ecomece.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ecomece.ecomece.Cadastro.Cadastros;
import ecomece.ecomece.Service.Service_Autenticacao;

@Controller
public class Autenticaemail_Controler {

    @Autowired 
    Service_Autenticacao service_Autenticacao;

    @RequestMapping("/singup")
     public ResponseEntity <String> cadastrar (@RequestBody Cadastros cadastros){
        
            
        
        String response = service_Autenticacao.vericacaoemail(cadastros);
         if (response.equals("Email cadastrado")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
         }
         return ResponseEntity.status(HttpStatus.CREATED).body(response );
     } 
}
