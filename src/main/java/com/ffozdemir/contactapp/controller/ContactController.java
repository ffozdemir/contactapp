package com.ffozdemir.contactapp.controller;

import com.ffozdemir.contactapp.payload.request.ContactRequest;
import com.ffozdemir.contactapp.payload.response.ContactResponse;
import com.ffozdemir.contactapp.payload.response.ResponseMessage;
import com.ffozdemir.contactapp.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/contact")
public class ContactController {

	private final ContactService contactService;

	@PostMapping("/save")
	public ResponseEntity<ResponseMessage<ContactResponse>> saveMessage(
				@RequestBody @Valid ContactRequest contactRequest) {
		return ResponseEntity.ok(contactService.saveMessage(contactRequest));
	}

	@GetMapping("/getAllMessages")
	public ResponseEntity<ResponseMessage<List<ContactResponse>>> getAllMessages() {
		return ResponseEntity.ok(contactService.getAllMessages());
	}

}
