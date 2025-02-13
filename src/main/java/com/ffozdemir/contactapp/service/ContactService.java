package com.ffozdemir.contactapp.service;

import com.ffozdemir.contactapp.entity.ContactMessage;
import com.ffozdemir.contactapp.exceptions.ResourceNotFoundException;
import com.ffozdemir.contactapp.payload.mapper.ContactMapper;
import com.ffozdemir.contactapp.payload.messages.ErrorMessages;
import com.ffozdemir.contactapp.payload.messages.SuccessMessages;
import com.ffozdemir.contactapp.payload.request.ContactRequest;
import com.ffozdemir.contactapp.payload.response.ContactResponse;
import com.ffozdemir.contactapp.payload.response.ResponseMessage;
import com.ffozdemir.contactapp.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactService {

	private final ContactRepository contactRepository;
	private final ContactMapper contactMapper;

	public ResponseMessage<ContactResponse> saveMessage(
				@Valid ContactRequest contactRequest) {

		ContactMessage savedMessage = contactMapper.mapToEntity(contactRequest);

		contactRepository.save(savedMessage);
		return ResponseMessage.<ContactResponse>builder()
					       .message(SuccessMessages.MESSAGE_CREATE)
					       .returnBody(contactMapper.mapToResponse(savedMessage))
					       .httpStatus(HttpStatus.CREATED)
					       .build();
	}


	public ResponseMessage<List<ContactResponse>> getAllMessages() {
		List<ContactMessage> allMessages = contactRepository.findAll();
		if (allMessages.isEmpty()) {
			throw new ResourceNotFoundException(ErrorMessages.NO_MESSAGES_FOUND);
		}
		return ResponseMessage.<List<ContactResponse>>builder()
					       .message(SuccessMessages.ALL_MESSAGES_FETCHED)
					       .returnBody(contactMapper.mapToResponseList(allMessages))
					       .httpStatus(HttpStatus.OK)
					       .build();
	}
}
