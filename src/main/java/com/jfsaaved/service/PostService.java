package com.jfsaaved.service;

import  com.jfsaaved.domain.Post;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostService {

	private List<Post> posts = Arrays.asList(new Post(0, "Post1", "Message from post 1"),
			new Post(1,"Post2", "Message from post 2"));
	
	public List<Post> getAllPosts(){
		return posts;
	}
	
}
