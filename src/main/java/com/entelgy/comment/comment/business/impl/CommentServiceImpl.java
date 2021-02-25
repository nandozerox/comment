package com.entelgy.comment.comment.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entelgy.comment.comment.Model.entity.Data;
import com.entelgy.comment.comment.business.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Value("${external.service.comment.url}")
	private String urlComment;

	@Override
	public List<Data> getListComments() {

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Data>> responseEntity = restTemplate.exchange(urlComment, HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Data>>() {
				});

		return responseEntity.getBody();

	}

}
