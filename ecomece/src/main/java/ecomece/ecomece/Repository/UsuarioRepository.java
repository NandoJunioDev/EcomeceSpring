package ecomece.ecomece.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecomece.ecomece.Cadastro.Cadastros;


@Repository

public interface UsuarioRepository  extends  JpaRepository  <Cadastros, Long> {
        Optional <Cadastros>  findByEmail(String email);  // busca p usuario pelo email
        boolean existsByEmail(String email); //verifica de email ja existe
        
}

    

