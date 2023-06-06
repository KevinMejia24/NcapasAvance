package com.erickvasquez.documentos.models.dtos.playlists;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SavePlayListDTO {

	@NotBlank(message = "Error! Title is required")
	private String title;
	
	@NotBlank(message = "Error! Description is required")
	private String description;
	
	@NotBlank(message = "Error! User code is required")
	private String userCode;
}
