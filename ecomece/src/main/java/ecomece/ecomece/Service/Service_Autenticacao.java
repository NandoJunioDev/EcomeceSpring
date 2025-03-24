package ecomece.ecomece.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecomece.ecomece.Cadastro.Cadastros;
import ecomece.ecomece.Repository.UsuarioRepository;

@Service
public class Service_Autenticacao {
@Autowired 
UsuarioRepository usuarioRepository;


public String vericacaoemail (Cadastros cadastros){
    Optional<Cadastros> usuario = usuarioRepository.findByEmail(cadastros.getEmail());
    if (usuario.isPresent()) {
         return "Ja existe o usuario com esse email";
    }
     usuarioRepository.save(cadastros);
     return "usuario cadastrado";
}






}
