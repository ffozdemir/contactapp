package com.ffozdemir.contactapp.controller;

import com.ffozdemir.contactapp.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/contact")
public class ContactController {

	private final ContactService contactService;

}
