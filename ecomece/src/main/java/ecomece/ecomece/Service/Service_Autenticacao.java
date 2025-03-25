package ecomece.ecomece.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecomece.ecomece.Cadastro.Cadastros;
import ecomece.ecomece.Repository.UsuarioRepository;

@Service
public class Service_Autenticacao {
     private final UsuarioRepository usuarioRepository;
     @Autowired
     public Service_Autenticacao(UsuarioRepository cadastroRepository) {
          this.usuarioRepository = cadastroRepository;
     }
 
     public  boolean emailJaCadastrado(String email) {
         return usuarioRepository.findByEmail(email).isPresent();
     }
 
     public void salvarUsuario(Cadastros cadastros) {
         usuarioRepository.save(cadastros);
     }
}







