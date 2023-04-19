package com.engeto.githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

	@GetMapping("/authors")
	public @ResponseBody String getAllAuthors() {
		return "Hello, Authors";
	}
}
