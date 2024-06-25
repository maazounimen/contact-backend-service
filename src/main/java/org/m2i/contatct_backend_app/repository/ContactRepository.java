package org.m2i.contatct_backend_app.repository;

import org.m2i.contatct_backend_app.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
