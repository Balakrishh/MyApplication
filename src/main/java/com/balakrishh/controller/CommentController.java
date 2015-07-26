package com.balakrishh.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.balakrishh.model.Comment;
import com.balakrishh.model.MyURIConstants;

public class CommentController {
	final static Logger logger = Logger.getLogger(CommentController.class);
    
    //Map to store employees, ideally we should use database
    Map<Integer, Comment> cmntData = new HashMap<Integer, Comment>();
     
    @RequestMapping(value = MyURIConstants.DUMMY_CMNT, method = RequestMethod.GET)
    public @ResponseBody Comment getDummyEmployee() {
        logger.info("Start getDummyEmployee");
        Comment cmnt = new Comment();
        cmnt.setName("Dummy");
        cmnt.setBody("This is my first comment");
        cmntData.put(9999, cmnt);
        return cmnt;
    }

}
