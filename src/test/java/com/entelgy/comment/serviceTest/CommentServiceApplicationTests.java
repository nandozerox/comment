package com.entelgy.comment.serviceTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entelgy.comment.comment.business.CommentService;

@SpringBootTest
class CommentServiceApplicationTests {
	
	
	@Autowired
	CommentService commentService;
	
	private Integer size = 500;

	@Test
	void whenGetCommentsFromServiceInterace_thenShowListSize() {
		Assertions.assertThat(commentService.getListComments().size()).isEqualTo(size);
	}

}
