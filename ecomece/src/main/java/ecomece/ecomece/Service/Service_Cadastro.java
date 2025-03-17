package ecomece.ecomece.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecomece.ecomece.Cadastro.Cadastros;
import ecomece.ecomece.Repositorio.UsuarioRepository;



@Service
public class Service_Cadastro {



@Autowired
private ecomece.ecomece.Repository.UsuarioRepository usuarioRepository;

public Cadastros cadastrar (Cadastros cadastros){
    return usuarioRepository.save(cadastros);
    
}

}