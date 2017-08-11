package com.meetup.exemplo.exemplo.domain;

import com.meetup.exemplo.exemplo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService service;

    @RequestMapping(method = RequestMethod.GET)
    public Page<Contact> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
}
