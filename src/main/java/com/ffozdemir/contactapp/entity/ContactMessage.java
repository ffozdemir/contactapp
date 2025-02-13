package com.ffozdemir.contactapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@javax.persistence.Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactMessage {

	@Id
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String subject;

	@Column(nullable = false)
	private String message;

	@Column(nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "US")
	private LocalDateTime createdAt;

	@PrePersist
	public void setCreatedAt() {
		this.createdAt = LocalDateTime.now();
	}
}
