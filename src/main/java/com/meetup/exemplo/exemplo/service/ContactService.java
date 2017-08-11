package com.meetup.exemplo.exemplo.service;

import com.meetup.exemplo.exemplo.domain.Contact;
import com.meetup.exemplo.exemplo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;


    @GetMapping
    public Page<Contact> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
