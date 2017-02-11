package com.jfsaaved.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfsaaved.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping("/home")
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/posts")
	public String getPosts(){
		return postService.getAllPosts().toString();
	}

}
