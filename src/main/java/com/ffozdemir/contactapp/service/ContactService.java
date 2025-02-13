package com.ffozdemir.contactapp.service;

import com.ffozdemir.contactapp.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactService {

	private final ContactRepository contactRepository;

}
