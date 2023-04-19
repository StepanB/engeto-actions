package com.engeto.githubactions.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/books")
	public @ResponseBody String getAllBooks() {
		return "";
	}
}
