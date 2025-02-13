package com.ffozdemir.contactapp.payload.mapper;

import com.ffozdemir.contactapp.entity.ContactMessage;
import com.ffozdemir.contactapp.payload.request.ContactRequest;
import com.ffozdemir.contactapp.payload.response.ContactResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ContactMapper {

	public ContactResponse mapToResponse(
				ContactMessage contactMessage) {

		return ContactResponse.builder()
					       .name(contactMessage.getName())
					       .email(contactMessage.getEmail())
					       .subject(contactMessage.getSubject())
					       .message(contactMessage.getMessage())
					       .createdAt(contactMessage.getCreatedAt())
					       .build();
	}

	public ContactMessage mapToEntity(
				ContactRequest contactRequest) {

		return ContactMessage.builder()
					       .name(contactRequest.getName())
					       .email(contactRequest.getEmail())
					       .subject(contactRequest.getSubject())
					       .message(contactRequest.getMessage())
					       .build();
	}

	public List<ContactResponse> mapToResponseList(
				List<ContactMessage> allMessages) {
		return allMessages.stream()
					       .map(this::mapToResponse)
					       .toList();
	}
}
