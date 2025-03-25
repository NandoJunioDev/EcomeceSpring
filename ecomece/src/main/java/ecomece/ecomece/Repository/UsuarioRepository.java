package ecomece.ecomece.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecomece.ecomece.Cadastro.Cadastros;
import java.util.List;


@Repository

public interface UsuarioRepository  extends  JpaRepository  <Cadastros, Long> {
        Optional <Cadastros>  findByEmail(String email);
        boolean existsByEmail(String email);
        
}

    

