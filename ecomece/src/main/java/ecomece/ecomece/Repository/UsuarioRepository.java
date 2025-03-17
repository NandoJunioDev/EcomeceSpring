package ecomece.ecomece.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecomece.ecomece.Cadastro.Cadastros;

@Repository

public interface UsuarioRepository  extends  JpaRepository<Cadastros,Long> {

}

    

