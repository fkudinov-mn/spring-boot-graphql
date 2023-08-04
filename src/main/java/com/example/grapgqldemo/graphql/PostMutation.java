package com.example.grapgqldemo.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.grapgqldemo.model.Post;
import com.example.grapgqldemo.service.PostService;

@Component
public class PostMutation implements GraphQLMutationResolver {

	@Autowired
	private PostService service;

	public Post createPost(String title, String author, String type) {
		return service.createPost(title, author, type);
	}
}
