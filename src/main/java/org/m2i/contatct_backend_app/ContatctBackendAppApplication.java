package org.m2i.contatct_backend_app;

import org.m2i.contatct_backend_app.entities.Contact;
import org.m2i.contatct_backend_app.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class ContatctBackendAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatctBackendAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ContactRepository contactRepository )
	{
		return args ->
		{
			//Insérer trois clients de test dans la BD
			contactRepository.save(new Contact((Integer) null,"Imen","imen@gmail.com", 123456L));

			//Afficher les clients existants dans la BD
			for (Contact client : contactRepository.findAll())
			{
				System.out.println(client.toString());
			}
		};
	}

}
