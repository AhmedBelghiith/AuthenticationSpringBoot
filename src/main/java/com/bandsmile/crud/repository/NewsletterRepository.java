package com.bandsmile.crud.repository;

import com.bandsmile.crud.model.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterRepository extends JpaRepository<Newsletter,Long> {
}
