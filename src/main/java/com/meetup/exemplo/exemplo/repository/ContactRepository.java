package com.meetup.exemplo.exemplo.repository;

import com.meetup.exemplo.exemplo.domain.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    Page<Contact> findByName(String name, Pageable pageable);

}
