package ecomece.ecomece.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecomece.ecomece.Cadastro.Cadastros;
import ecomece.ecomece.Repository.UsuarioRepository;

@Service
public class Service_Usuario {
    
@Autowired

private UsuarioRepository usuarioRepository;

public   boolean autenciarusuario (String email, String senha){

    Optional <Cadastros> usuarioOptional = usuarioRepository.findByEmail(email);
        if (usuarioOptional.isPresent()){
            Cadastros usuario = usuarioOptional.get();


            return usuario.getSenha().equals(senha);
        }
        

        return false;
        

}


}
