package com.bandsmile.crud.repository;

import com.bandsmile.crud.model.Contact;
import com.bandsmile.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    Contact findByName(String name);
}
