package com.entelgy.comment.expose.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.comment.comment.Model.entity.Data;
import com.entelgy.comment.comment.business.CommentService;

@RestController
@RequestMapping("/channel/v1")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@PostMapping("/comment")
	public List<Data> getComments() {
		return commentService.getListComments();
	}

}
