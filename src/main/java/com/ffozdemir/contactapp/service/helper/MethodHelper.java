package com.ffozdemir.contactapp.service.helper;

import com.ffozdemir.contactapp.entity.ContactMessage;
import com.ffozdemir.contactapp.exceptions.ResourceNotFoundException;
import com.ffozdemir.contactapp.payload.messages.ErrorMessages;
import com.ffozdemir.contactapp.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MethodHelper {

	private final ContactRepository contactRepository;

	public ContactMessage checkMessageExistById(
				Long id) {
		return contactRepository.findById(id)
					       .orElseThrow(()->new ResourceNotFoundException(String.format(ErrorMessages.NOT_FOUND_MESSAGE, id)));
	}

	public List<ContactMessage> checkMessageExistBySubject(
				String subject) {
		List<ContactMessage> contactMessages = contactRepository.findBySubjectContainsIgnoreCase(subject);
		if (contactMessages.isEmpty()) {
			throw new ResourceNotFoundException(String.format(ErrorMessages.NOT_FOUND_MESSAGE_BY_SUBJECT, subject));
		}
		return contactMessages;
	}
}
