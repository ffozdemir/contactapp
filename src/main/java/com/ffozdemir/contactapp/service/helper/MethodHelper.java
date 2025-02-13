package com.ffozdemir.contactapp.service.helper;

import com.ffozdemir.contactapp.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MethodHelper {

	private final ContactRepository contactRepository;

}
