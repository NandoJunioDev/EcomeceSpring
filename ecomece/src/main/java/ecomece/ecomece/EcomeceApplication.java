package ecomece.ecomece;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ecomece.ecomece.Cadastro") 
@EnableJpaRepositories(basePackages = "ecomece.ecomece.Repository")
public class EcomeceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomeceApplication.class, args);
	}

}
