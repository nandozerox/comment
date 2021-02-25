package com.entelgy.comment.serviceTest.comment.business.impl;

import com.entelgy.comment.comment.Model.entity.Data;
import com.entelgy.comment.comment.business.CommentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CommentServiceImplTest {

    @InjectMocks
    CommentService service;

    @Mock
    String urlComment;

    @Mock
    RestTemplate restTemplate;

    @Test
    public  void getComment(){

        Mockito.when(urlComment).thenReturn(Mockito.anyString());
        Mockito.when(restTemplate).thenReturn(null);

        List<Data> listData = service.getListComments();

        Assert.assertEquals(listData,null);
    }
}
